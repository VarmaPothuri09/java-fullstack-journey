package com.maps;

import java.util.Objects;

public class Pojo {
    private int id;
    private String name;
    private int accNo;
    private String ifsc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public Pojo(int id, String name, int accNo, String ifsc) {
		super();
		this.id = id;
		this.name = name;
		this.accNo = accNo;
		this.ifsc = ifsc;
	}
	public Pojo(){
		
	}
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", name=" + name + ", accNo=" + accNo + ", ifsc=" + ifsc + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accNo, id, ifsc, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pojo other = (Pojo) obj;
		return accNo == other.accNo && id == other.id && Objects.equals(ifsc, other.ifsc)
				&& Objects.equals(name, other.name);
	}
}


