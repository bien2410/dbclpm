package com.example.dbclpm.dto;

import java.util.ArrayList;

public class DiemTKDTO {
	private float diemTK10;
	private float diemTK4;
	private String diemTKC;
	private boolean ketQua;
	public DiemTKDTO(ArrayList<DiemDTO> dsDiem) {
		ketQua = true;
		diemTK10 = 0;
		for(DiemDTO d: dsDiem) {
			diemTK10 += d.getTrongSo() * d.getSoDiem();
			if(d.getSoDiem() <= 0) {
				ketQua = false;
			}
		}
		diemTK10 = Math.round(diemTK10 / 10) / 10f;
		chuyenDiem();
	}
	private void chuyenDiem() {
		if(diemTK10 < 4.0) {
			ketQua = false;
			diemTK4 = 0;
			diemTKC = "F";
		}
		else if(diemTK10 < 5) {
			diemTK4 = 1;
			diemTKC = "D";
		}
		else if(diemTK10 < 5.5) {
			diemTK4 = 1.5f;
			diemTKC = "D+";
		}
		else if(diemTK10 < 6.5) {
			diemTK4 = 2;
			diemTKC = "C";
		}
		else if(diemTK10 < 7) {
			diemTK4 = 2.5f;
			diemTKC = "C+";
		}
		else if(diemTK10 < 8) {
			diemTK4 = 3;
			diemTKC = "B";
		}
		else if(diemTK10 < 8.5) {
			diemTK4 = 3.5f;
			diemTKC = "B+";
		}
		else if(diemTK10 < 9) {
			diemTK4 = 3.7f;
			diemTKC = "A";
		}
		else{
			diemTK4 = 4;
			diemTKC = "A+";
		}
	}
	
	public float getDiemTK10() {
		return diemTK10;
	}
	public float getDiemTK4() {
		return diemTK4;
	}
	public String getDiemTKC() {
		return diemTKC;
	}
	public boolean isKetQua() {
		return ketQua;
	}
	
}
