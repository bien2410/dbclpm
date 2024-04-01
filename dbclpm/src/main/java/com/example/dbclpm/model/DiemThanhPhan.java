package com.example.dbclpm.model;

import java.util.Objects;

public class DiemThanhPhan implements Comparable<DiemThanhPhan>{
	private int id;
	private String ten;
	private int trongSo;
	public DiemThanhPhan() {
		super();
	}
	public DiemThanhPhan(int id, String ten, int trongSo) {
		super();
		this.id = id;
		this.ten = ten;
		this.trongSo = trongSo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTrongSo() {
		return trongSo;
	}
	public void setTrongSo(int trongSo) {
		this.trongSo = trongSo;
	}
	@Override
	public String toString() {
		return "\n DiemThanhPhan [id=" + id + ", ten=" + ten + ", trongSo=" + trongSo + "]";
	}
	@Override
	public int compareTo(DiemThanhPhan o) {
		if(this.id < o.id) return -1;
		if(this.id > o.id) return 1;
		return 0;
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
		DiemThanhPhan other = (DiemThanhPhan) obj;
		return id == other.id;
	}
	
}
