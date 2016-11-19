package edu.mum.cs544.Domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Tamrat
 */
@Entity
@Table(name = "phone", catalog = "concise_pos")
public class Phone implements Serializable {

	private static final long serialVersionUID = 1L;

	public Phone(Integer areaCode, Integer prefix, Integer number) {
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.number = number;
	}

	public Phone() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@NotNull(message="{NotNull.validation.message}")
	@Min(value=100, message="{Min.validation.message}")
	@Max(value=999, message="{Max.validation.message}")
	@Column(name = "area_code")
	private Integer areaCode;
	
	@NotNull(message="{NotNull.validation.message}")
	@Min(value=100, message="{Min.validation.message}")
	@Max(value=999, message="{Max.validation.message}")
	@Column(name = "prefix")
	private Integer prefix;
	
	@NotNull(message="{NotNull.validation.message}")
	@Min(value=1000, message="{Min.validation.message}")
	@Max(value=9999, message="{Max.validation.message}")	
	@Column(name = "number")
	private Integer number;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaCode == null) ? 0 : areaCode.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
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
		Phone other = (Phone) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (prefix == null) {
			if (other.prefix != null)
				return false;
		} else if (!prefix.equals(other.prefix))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", areaCode=" + areaCode + ", prefix=" + prefix + ", number=" + number + "]";
	}
}
