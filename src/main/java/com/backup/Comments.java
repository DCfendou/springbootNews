package com.backup;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = BaseEntity.TABLE_NAME_PREFIX + "comment" ) //表名:yk_comment
public class Comments extends BaseEntity{

	private static final long serialVersionUID = 7267550649799447202L;

	/**文章(对象)**/
	@ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "article")
	private Article article;
	
	/**评论人**/
	@ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "user")
	private User user;
	
	/**内容**/
	@Column(length = 500, nullable = false,  columnDefinition="COMMENT '评论内容'")
	private String content;
	
	/**评论时间**/
	@Column(columnDefinition="COMMENT '创建时间'")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	//---------------------------------------------------------
	public Comments() {
		super();
	}

	public Comments(Integer id) {
		super();
		this.id = id;
	}

	//---------------------------------------------------------
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	
}
