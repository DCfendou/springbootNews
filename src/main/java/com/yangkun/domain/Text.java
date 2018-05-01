package com.yangkun.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.yangkun.metas.Type;

@Entity
@Table(name = BaseEntity.TABLE_NAME_PREFIX + "text" ) //表名:yk_text
public class Text extends BaseEntity{

	private static final long serialVersionUID = -4824634437976192944L;

	/**文章(对象)**/
	/**通过外键关联方式一对一配置 */
	@OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "article", unique = true)
	private Article article;
	
	/**类型**/
	@Enumerated(EnumType.ORDINAL)
	private Type type;
	
	/**正文(长度)**/
	@Column(length = 500, nullable = false)
	private String body;
	
	//---------------------------------------------------------
	public Text() {
		super();
	}

	public Text(Integer id) {
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Text [ type=" + type + ", body=" + body
				+ "]";
	}
	
	
}
