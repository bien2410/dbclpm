package com.example.dbclpm.model;

public class Diem {
	private int id;
	private float soDiem;
	private DiemThanhPhan diemThanhPhan;
	public Diem() {
		super();
	}
	public Diem(int id, float soDiem, DiemThanhPhan diemThanhPhan) {
		super();
		this.id = id;
		this.soDiem = soDiem;
		this.diemThanhPhan = diemThanhPhan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSoDiem() {
		return soDiem;
	}
	public void setSoDiem(float soDiem) {
		this.soDiem = soDiem;
	}
	public DiemThanhPhan getDiemThanhPhan() {
		return diemThanhPhan;
	}
	public void setDiemThanhPhan(DiemThanhPhan diemThanhPhan) {
		this.diemThanhPhan = diemThanhPhan;
	}
	@Override
	public String toString() {
		return "Diem [id=" + id + ", soDiem=" + soDiem + ", diemThanhPhan=" + diemThanhPhan + "]";
	}
	
	
}
