package com.example.dbclpm.model;

import java.util.ArrayList;

public class MonHoc {
	private int id;
	private String maMonHoc;
	private String tenMonHoc;
	private int soTinChi;
	private boolean tinhGPA;
	private ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan;
	public MonHoc() {
		super();
	}
	
	public MonHoc(int id, String maMonHoc, String tenMonHoc, int soTinChi, boolean tinhGPA,
			ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan) {
		super();
		this.id = id;
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.soTinChi = soTinChi;
		this.tinhGPA = tinhGPA;
		this.dsMonHoc_DiemThanhPhan = dsMonHoc_DiemThanhPhan;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	public boolean isTinhGPA() {
		return tinhGPA;
	}
	public void setTinhGPA(boolean tinhGPA) {
		this.tinhGPA = tinhGPA;
	}

	public ArrayList<MonHoc_DiemThanhPhan> getDsMonHoc_DiemThanhPhan() {
		return dsMonHoc_DiemThanhPhan;
	}

	public void setDsMonHoc_DiemThanhPhan(ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan) {
		this.dsMonHoc_DiemThanhPhan = dsMonHoc_DiemThanhPhan;
	}

	@Override
	public String toString() {
		return "\n MonHoc [id=" + id + ", maMonHoc=" + maMonHoc + ", tenMonHoc=" + tenMonHoc + ", soTinChi=" + soTinChi
				+ ", tinhGPA=" + tinhGPA + ", dsMonHoc_DiemThanhPhan=" + dsMonHoc_DiemThanhPhan + "]";
	}
	
	
}
