package com.example.dbclpm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dao.MonHocDAO;
import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.model.MonHoc;

public class TestMonHocDAO {
	private MonHocDAO monHocDAO = new MonHocDAO();
	
	public TestMonHocDAO() {
		super();
		SinhVienDAO.khoiTao();
	}

	@Test
	public void layMonHoc_testChuan1() {
		// mon hoc co tinh GPA da ton tai
		int idMonHoc = 2;
		MonHoc monHoc = monHocDAO.layMonHoc(idMonHoc);
		Assertions.assertNotNull(monHoc);
		Assertions.assertEquals(idMonHoc, monHoc.getId());
		Assertions.assertTrue(monHoc.isTinhGPA());
	}
	@Test
	public void layMonHoc_testChuan2() {
		// mon hoc khong tinh GPA da ton tai
		int idMonHoc = 1;
		MonHoc monHoc = monHocDAO.layMonHoc(idMonHoc);
		Assertions.assertNotNull(monHoc);
		Assertions.assertEquals(idMonHoc, monHoc.getId());
		Assertions.assertFalse(monHoc.isTinhGPA());
	}
	@Test
	public void layMonHoc_testNgoaiLe1() {
		// mon hoc khong ton tai
		int idMonHoc = 0;
		MonHoc monHoc = monHocDAO.layMonHoc(idMonHoc);
		Assertions.assertNull(monHoc);
	}
}
