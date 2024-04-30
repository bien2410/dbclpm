package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dao.DiemThanhPhanDAO;
import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.dao.SinhVien_MonHocDAO;
import com.example.dbclpm.model.SinhVien_MonHoc;

public class TestSinhVien_MonHocDAO {
	private SinhVien_MonHocDAO sinhVien_MonHocDAO = new SinhVien_MonHocDAO();
	
	public TestSinhVien_MonHocDAO() {
		super();
		SinhVienDAO.khoiTao();
	}
	@Test
	public void layDsSinhVien_MonHoc_testChuan1() {
		// sinh vien da hoc dung 1 mon hoc
		int idSinhVien = 2;
		int soLuong = 1;
		int idSinhVien_MocHoc = 45;
		ArrayList<SinhVien_MonHoc> dsSinhVien_MocHoc = sinhVien_MonHocDAO.layDsSinhVien_MonHoc(idSinhVien);
		Assertions.assertNotNull(dsSinhVien_MocHoc);
		Assertions.assertEquals(soLuong, dsSinhVien_MocHoc.size());
		Assertions.assertEquals(idSinhVien_MocHoc, dsSinhVien_MocHoc.get(0).getId());
	}
	@Test
	public void layDsSinhVien_MonHoc_testChuan2() {
		// sinh vien da hoc > 1 mon hoc
		int idSinhVien = 1;
		int soLuong = 44;
		int idSinhVien_MocHoc = 1;
		ArrayList<SinhVien_MonHoc> dsSinhVien_MocHoc = sinhVien_MonHocDAO.layDsSinhVien_MonHoc(idSinhVien);
		Assertions.assertNotNull(dsSinhVien_MocHoc);
		Assertions.assertEquals(soLuong, dsSinhVien_MocHoc.size());
		for(SinhVien_MonHoc sinhVien_MonHoc : dsSinhVien_MocHoc) {
			Assertions.assertEquals(idSinhVien_MocHoc, sinhVien_MonHoc.getId());
			idSinhVien_MocHoc++;
		}
	}
	@Test
	public void layDsSinhVien_MonHoc_testChuan3() {
		// sinh vien chua hoc mon hoc nao
		int idSinhVien = 3;
		int soLuong = 0;
		ArrayList<SinhVien_MonHoc> dsSinhVien_MocHoc = sinhVien_MonHocDAO.layDsSinhVien_MonHoc(idSinhVien);
		Assertions.assertNotNull(dsSinhVien_MocHoc);
		Assertions.assertEquals(soLuong, dsSinhVien_MocHoc.size());
	}
	@Test
	public void layDsSinhVien_MonHoc_testNgoaiLe1() {
		// sinh vien khong ton tai
		int idSinhVien = 4;
		ArrayList<SinhVien_MonHoc> dsSinhVien_MocHoc = sinhVien_MonHocDAO.layDsSinhVien_MonHoc(idSinhVien);
		Assertions.assertNull(dsSinhVien_MocHoc);
	}
}
