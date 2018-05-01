/**
 * 
 */
package com.yangkun.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author dc-fd
 *
 */
@Entity
@Table(name = BaseEntity.TABLE_NAME_PREFIX + "article" ) //表名:yk_article
public class Article extends BaseEntity{

	private static final long serialVersionUID = -3580651098900631001L;

	/**标题**/
	@Column(length = 32, nullable = false)
	private String title;
	
	/**副标题**/
	@Column(length = 32, nullable = false)
	private String subtitle;
	
	/**文章来源**/
	@Column(length = 32, nullable = false)
	private String article_source;
	
	/**作者**/
	@Column(length = 32, nullable = false)
	private String author;
	
	/**分类(对象)**/
	@ManyToOne(cascade = {CascadeType.REFRESH,}, fetch = FetchType.EAGER)
	@JoinColumn(name = "category")
	private Category category;
	
	/**正文(对象)**/
	@OneToOne(cascade = {CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "article")
	private Text text;
	
	/**点击量**/
	private Integer clicks;
	
	/**是否隐藏**/
	private Integer hidden;
	
	/**创建时间**/
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	/**文章评论**/
	//@OneToMany(cascade = {CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "article")
	//private List<Comments> comments;

	//---------------------------------------------------------
	public Article() {
		super();
	}

	public Article(Integer id) {
		super();
		this.id = id;
	}

	
	//---------------------------------------------------------
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getArticle_source() {
		return article_source;
	}

	public void setArticle_source(String article_source) {
		this.article_source = article_source;
	}

	/*public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}*/

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public Integer getClicks() {
		return clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Integer getHidden() {
		return hidden;
	}

	public void setHidden(Integer hidden) {
		this.hidden = hidden;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	//---------------------------------------------------------
	@Override
	public String toString() {
		return "Article [title=" + title + ", subtitle=" + subtitle
				+ ", article_source=" + article_source + ", author=" + author
				+ ", category=" + category + ","
						+ " text=" + text + ", clicks="
				+ clicks + ", hidden=" + hidden + ", created=" + created +"]";
	}
	
	
}
