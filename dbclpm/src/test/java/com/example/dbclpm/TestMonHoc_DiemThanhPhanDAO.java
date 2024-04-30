package com.example.dbclpm;

import static org.mockito.ArgumentMatchers.intThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dao.MonHoc_DiemThanhPhanDAO;
import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.model.MonHoc_DiemThanhPhan;

public class TestMonHoc_DiemThanhPhanDAO {
	private MonHoc_DiemThanhPhanDAO monHoc_DiemThanhPhanDAO = new MonHoc_DiemThanhPhanDAO();

	public TestMonHoc_DiemThanhPhanDAO() {
		super();
		SinhVienDAO.khoiTao();
	}
	
	@Test
	public void layDsMonHoc_DiemThanhPhan_testChuan1() {
		int idMonHoc = 1;
		int soLuongDauDiem = 3;
		int idMonHoc_DiemThanhPhan = 1;
		ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan = monHoc_DiemThanhPhanDAO.layDsMonHoc_DiemThanhPhan(idMonHoc);
		Assertions.assertNotNull(dsMonHoc_DiemThanhPhan);
		Assertions.assertEquals(soLuongDauDiem, dsMonHoc_DiemThanhPhan.size());;
		for(MonHoc_DiemThanhPhan monHoc_DiemThanhPhan : dsMonHoc_DiemThanhPhan) {
			Assertions.assertEquals(idMonHoc_DiemThanhPhan, monHoc_DiemThanhPhan.getId());
			idMonHoc_DiemThanhPhan++;
		}
	}
	@Test
	public void layDsMonHoc_DiemThanhPhan_testNgoaiLe1() {
		int idMonHoc = 0;
		ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan = monHoc_DiemThanhPhanDAO.layDsMonHoc_DiemThanhPhan(idMonHoc);
		Assertions.assertNull(dsMonHoc_DiemThanhPhan);
	}
}
