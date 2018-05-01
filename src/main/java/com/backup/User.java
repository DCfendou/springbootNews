package com.backup;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.yangkun.metas.Gender;

@Entity
@Table(name = BaseEntity.TABLE_NAME_PREFIX + "user", indexes = {  //表名:yk_user
		@Index(name = "idx_user_created", columnList = "created"),
		@Index(name = "idx_user_logins", columnList = "logins")
})
public class User extends BaseEntity {

	private static final long serialVersionUID = 7833988688458951932L;

	/**用户名**/
	@Column(length = 32, nullable = false, columnDefinition="COMMENT '用户名'")
	private String username;
	
	/**密码**/
	@Column(length = 16, nullable = false, columnDefinition="COMMENT '密码'")
	private String password;
	
	/**性别**/
	@Column(columnDefinition="COMMENT '性别'")
	@Enumerated(EnumType.ORDINAL)
	private Gender gender;
	
	/**生日**/
	@Temporal(TemporalType.DATE)
	@Column(columnDefinition="COMMENT '出生日期'")
	private Date birthday;
	
	/**手机号**/
	@Column(length = 11, columnDefinition="COMMENT '手机号'")
	private String phone;
	
	/**邮箱**/
	@Column(length = 32, nullable = false, columnDefinition="COMMENT '电子邮箱'")
	private String email;
	
	/**登录次数**/
	@Column(columnDefinition="COMMENT '登陆次数'")
	private Integer logins;
	
	/**是否锁定**/
	@Column(columnDefinition="COMMENT '是否锁定'")
	private Boolean locked;
	
	/**创建时间**/
	@Column(columnDefinition="COMMENT '创建时间'")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	/**用户评论**/
	@OneToMany(cascade = {CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "user")
	private List<Comments> comments;

	//---------------------------------------------------------
	public User() {
		super();
	}

	public User(Integer id) {
		super();
		this.id = id;
	}

	//---------------------------------------------------------
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getLogins() {
		return logins;
	}

	public void setLogins(Integer logins) {
		this.logins = logins;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
}
