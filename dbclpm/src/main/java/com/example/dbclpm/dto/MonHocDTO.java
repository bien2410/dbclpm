package com.example.dbclpm.dto;

import java.util.ArrayList;

import com.example.dbclpm.model.Diem;
import com.example.dbclpm.model.MonHoc;

public class MonHocDTO {
	private String maMonHoc;
	private String tenMonHoc;
	private int soTinChi;
	private float diemThi;
	private float diemTK10;
	private float diemTK4;
	private String diemTKC;
	private boolean ketQua;
	private boolean tinhGPA;
	private ArrayList<DiemThanhPhanDTO> dsDiemThanhPhan;
	public MonHocDTO(MonHoc mh, ArrayList<Diem> dsDiem) {
		this.maMonHoc = mh.getMaMonHoc();
		this.tenMonHoc = mh.getTenMonHoc();
		this.soTinChi = mh.getSoTinChi();
		dsDiemThanhPhan = new ArrayList<>();
		ArrayList<DiemDTO> dsDiemDTO = new ArrayList<>();
		for(Diem d : dsDiem) {
			dsDiemThanhPhan.add(new DiemThanhPhanDTO(d));
			dsDiemDTO.add(new DiemDTO(d.getDiemThanhPhan().getTrongSo(), d.getSoDiem()));
			if(d.getDiemThanhPhan().getTen().equalsIgnoreCase("Diem thi")) {
				this.diemThi = d.getSoDiem();
			}
		}
		DiemTKDTO diemtkDTO = new DiemTKDTO(dsDiemDTO);
		this.diemTK10 = diemtkDTO.getDiemTK10();
		this.diemTK4 = diemtkDTO.getDiemTK4();
		this.diemTKC = diemtkDTO.getDiemTKC();
		this.ketQua = diemtkDTO.isKetQua();
		this.tinhGPA = mh.isTinhGPA();
	}
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public ArrayList<DiemThanhPhanDTO> getDsDiemThanhPhan() {
		return dsDiemThanhPhan;
	}
	public float getDiemThi() {
		return diemThi;
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
	
	public boolean isTinhGPA() {
		return tinhGPA;
	}
	@Override
	public String toString() {
		return "\n" + maMonHoc + " " + tenMonHoc + " So TC: " + soTinChi + " DsDiem: " + dsDiemThanhPhan;
	}
}
