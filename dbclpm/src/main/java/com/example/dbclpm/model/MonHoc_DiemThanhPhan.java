package com.example.dbclpm.model;

public class MonHoc_DiemThanhPhan {
	private int id;
	private DiemThanhPhan diemThanhPhan;
	public MonHoc_DiemThanhPhan() {
		super();
	}
	public MonHoc_DiemThanhPhan(int id, DiemThanhPhan diemThanhPhan) {
		super();
		this.id = id;
		this.diemThanhPhan = diemThanhPhan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DiemThanhPhan getDiemThanhPhan() {
		return diemThanhPhan;
	}
	public void setDiemThanhPhan(DiemThanhPhan diemThanhPhan) {
		this.diemThanhPhan = diemThanhPhan;
	}
	@Override
	public String toString() {
		return "\n MonHoc_DiemThanhPhan [id=" + id + ", diemThanhPhan=" + diemThanhPhan + "]";
	}
	
}
