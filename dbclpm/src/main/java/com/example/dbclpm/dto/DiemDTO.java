package com.example.dbclpm.dto;

public class DiemDTO {
	private int trongSo;
	private double soDiem;
	public DiemDTO() {
		super();
	}
	public DiemDTO(int trongSo, double soDiem) {
		super();
		this.trongSo = trongSo;
		this.soDiem = soDiem;
	}
	public int getTrongSo() {
		return trongSo;
	}
	public void setTrongSo(int trongSo) {
		this.trongSo = trongSo;
	}
	public double getSoDiem() {
		return soDiem;
	}
	public void setSoDiem(double soDiem) {
		this.soDiem = soDiem;
	}
	
}
