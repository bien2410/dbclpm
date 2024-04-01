package com.example.dbclpm.model;

import java.util.Objects;

public class HocKy implements Comparable<HocKy>{
	private int id;
	private String tenHocKy;
	private String tenNamHoc;
	public HocKy() {
		super();
	}
	public HocKy(int id, String tenHocKy, String tenNamHoc) {
		super();
		this.id = id;
		this.tenHocKy = tenHocKy;
		this.tenNamHoc = tenNamHoc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenHocKy() {
		return tenHocKy;
	}
	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}
	public String getTenNamHoc() {
		return tenNamHoc;
	}
	public void setTenNamHoc(String tenNamHoc) {
		this.tenNamHoc = tenNamHoc;
	}
	@Override
	public String toString() {
		return "\n HocKy [id=" + id + ", tenHocKy=" + tenHocKy + ", tenNamHoc=" + tenNamHoc + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HocKy other = (HocKy) obj;
		return id == other.id;
	}
	@Override
	public int compareTo(HocKy o) {
		// TODO Auto-generated method stub
		if(this.id < o.id) return -1;
		if(this.id > o.id) return 1;
		return 0;
	}
	
}
