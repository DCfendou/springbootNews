package com.yangkun.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = BaseEntity.TABLE_NAME_PREFIX + "category" ) //表名:yk_category
public class Category extends BaseEntity{

	private static final long serialVersionUID = -385686695830057631L;
	
	/**分类名称**/
	@Column(nullable = false)
	private String name;
	
	/**父分类**/
	private Integer parentid;
	
	/**排序**/
	private Integer sort;

	/**文章(一对多可不配,文章增长很快,每次查询分类时,不必将文章查出)**/
	//@OneToMany(cascade = {CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "category")
	//private List<Article> articles;
	
	//---------------------------------------------------------
	public Category() {
		super();
	}

	public Category(Integer id) {
		super();
		this.id = id;
	}
	
	//---------------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", parentid=" + parentid + ", sort="
				+ sort + "]";
	}
	
	
	
}
