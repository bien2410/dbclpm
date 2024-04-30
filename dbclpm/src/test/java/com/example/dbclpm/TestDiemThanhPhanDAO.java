package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dao.DiemThanhPhanDAO;
import com.example.dbclpm.dao.HocKyDAO;
import com.example.dbclpm.model.DiemThanhPhan;
import com.example.dbclpm.model.HocKy;

public class TestDiemThanhPhanDAO {
	private DiemThanhPhanDAO diemThanhPhanDAO = new DiemThanhPhanDAO();
	@Test
	public void layDsDiemThanhPhan_testChuan1() {
		//lay du lieu diem thanh phan trong co so du lieu
		int soLuongDiemThanhPhan = 16;
		ArrayList<DiemThanhPhan> dsDiemThanhPhan = diemThanhPhanDAO.layDsDiemThanhPhan();
		Assertions.assertNotNull(dsDiemThanhPhan);
		Assertions.assertEquals(soLuongDiemThanhPhan, dsDiemThanhPhan.size());
		int idDiemThanhPhan = 1;
		for(DiemThanhPhan diemThanhPhan : dsDiemThanhPhan) {
			Assertions.assertEquals(idDiemThanhPhan, diemThanhPhan.getId());
			idDiemThanhPhan++;
		}
	}
}
