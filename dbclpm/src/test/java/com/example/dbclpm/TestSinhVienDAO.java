package com.example.dbclpm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.model.SinhVien;

public class TestSinhVienDAO {
	private SinhVienDAO sinhVienDAO = new SinhVienDAO();
	@Test
	public void kiemTraDangNhap_testChuan1() {
		// sinh vien dang nhap dung tai khoan va mat khau
		int id = 1;
		String taiKhoan = "bien";
		String matKhau = "bien";
		SinhVien sinhVien = new SinhVien();
		sinhVien.setTaiKhoan(taiKhoan);
		sinhVien.setMatKhau(matKhau);
		boolean result = sinhVienDAO.kiemTraDangNhap(sinhVien);
		Assertions.assertTrue(result);
		Assertions.assertEquals(id, sinhVien.getId());
	}
	@Test
	public void kiemTraDangNhap_testNgoaiLe1() {
		// sinh vien dang nhap dung tai khoan, sai mat khau
		String taiKhoan = "bien";
		String matKhau = "matKhauSai";
		SinhVien sinhVien = new SinhVien();
		sinhVien.setTaiKhoan(taiKhoan);
		sinhVien.setMatKhau(matKhau);
		boolean result = sinhVienDAO.kiemTraDangNhap(sinhVien);
		Assertions.assertFalse(result);
	}
	@Test
	public void kiemTraDangNhap_testNgoaiLe2() {
		// sinh vien dang nhap tai khoan khong ton tai
		String taiKhoan = "taiKhoanKhongTonTai";
		String matKhau = "bien";
		SinhVien sinhVien = new SinhVien();
		sinhVien.setTaiKhoan(taiKhoan);
		sinhVien.setMatKhau(matKhau);
		boolean result = sinhVienDAO.kiemTraDangNhap(sinhVien);
		Assertions.assertFalse(result);
	}
}
