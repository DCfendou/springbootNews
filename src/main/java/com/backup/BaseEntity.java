package com.backup;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static final String TABLE_NAME_PREFIX = "yk_";
	
	/**主键**/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;
	
	/**承载传输数据**/
	@Transient
	protected Map<String, Object> attributes;

	//------------------------------------------------------
	public BaseEntity() {
		super();
	}

	public BaseEntity(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	//------------------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
