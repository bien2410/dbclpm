package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dao.DiemDAO;
import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.model.Diem;

public class TestDiemDAO {
	private DiemDAO diemDAO = new DiemDAO();

	public TestDiemDAO() {
		super();
		SinhVienDAO.khoiTao();
	}
	@Test
	public void layDsDiem_testChuan1() {
		// mon hoc sinh vien hoc dung 1 lan
		int idSinhVien_MonHoc = 1;
		int soLuongDauDiem = 3;
		int idDiem = 1;
		ArrayList<Diem> dsDiem = diemDAO.layDsDiem(idSinhVien_MonHoc);
		Assertions.assertNotNull(dsDiem);
		Assertions.assertEquals(soLuongDauDiem, dsDiem.size());
		for(Diem diem : dsDiem) {
			Assertions.assertEquals(idDiem, diem.getId());
			idDiem++;
		}
	}
	@Test
	public void layDsDiem_testChuan2() { 
		// mon hoc sinh vien hoc > 1 lan(hoc lai, cai thien)
		int idSinhVien_MonHoc = 3;
		int soLuongDauDiem = 4;
		int idDiem = 7;
		ArrayList<Diem> dsDiem = diemDAO.layDsDiem(idSinhVien_MonHoc);
		Assertions.assertNotNull(dsDiem);
		Assertions.assertEquals(soLuongDauDiem, dsDiem.size());
		for(Diem diem : dsDiem) {
			Assertions.assertEquals(idDiem, diem.getId());
			idDiem++;
		}
		idSinhVien_MonHoc = 42;
		idDiem = 160;
		dsDiem = diemDAO.layDsDiem(idSinhVien_MonHoc);
		Assertions.assertNotNull(dsDiem);
		Assertions.assertEquals(soLuongDauDiem, dsDiem.size());
		for(Diem diem : dsDiem) {
			Assertions.assertEquals(idDiem, diem.getId());
			idDiem++;
		}
	}
	@Test
	public void layDsDiem_testNgoaiLe1() { 
		// mon hoc sinh vien khong ton tai
		int idSinhVien_MonHoc = 0;
		ArrayList<Diem> dsDiem = diemDAO.layDsDiem(idSinhVien_MonHoc);
		Assertions.assertNull(dsDiem);
	}
}
