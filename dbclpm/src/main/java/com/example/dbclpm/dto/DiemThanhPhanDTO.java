package com.example.dbclpm.dto;

import com.example.dbclpm.model.Diem;

public class DiemThanhPhanDTO {
	private String ten;
	private int trongSo;
	private float soDiem;
	public DiemThanhPhanDTO(Diem diem) {
		this.ten = diem.getDiemThanhPhan().getTen();
		this.trongSo = diem.getDiemThanhPhan().getTrongSo();
		this.soDiem = diem.getSoDiem();
	}
	public String getTen() {
		return ten;
	}
	public int getTrongSo() {
		return trongSo;
	}
	public float getSoDiem() {
		return soDiem;
	}
	@Override
	public String toString() {
		return "\n" + ten + " " + trongSo + "%: " + soDiem + "đ"; 
	}
}
