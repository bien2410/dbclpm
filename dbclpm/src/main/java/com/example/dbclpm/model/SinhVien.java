package com.example.dbclpm.model;

import java.util.ArrayList;
import java.util.Date;

public class SinhVien {
	private int id;
	private String taiKhoan;
	private String matKhau;
	private String hoTen;
	private String maSinhVien;
	private Date ngaySinh;
	private String email;
	private ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc;
	public SinhVien() {
		super();
	}

	public SinhVien(int id, String taiKhoan, String matKhau, String hoTen, String maSinhVien, Date ngaySinh,
			String email, ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc) {
		super();
		this.id = id;
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.maSinhVien = maSinhVien;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.dsSinhVien_MonHoc = dsSinhVien_MonHoc;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<SinhVien_MonHoc> getDsSinhVien_MonHoc() {
		return dsSinhVien_MonHoc;
	}

	public void setDsSinhVien_MonHoc(ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc) {
		this.dsSinhVien_MonHoc = dsSinhVien_MonHoc;
	}

	@Override
	public String toString() {
		return "\n SinhVien [id=" + id + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", hoTen=" + hoTen
				+ ", maSinhVien=" + maSinhVien + ", ngaySinh=" + ngaySinh + ", email=" + email + ", dsSinhVien_MonHoc="
				+ dsSinhVien_MonHoc + "]";
	}
	
}
