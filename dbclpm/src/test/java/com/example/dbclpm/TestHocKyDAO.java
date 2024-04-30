package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dao.HocKyDAO;
import com.example.dbclpm.model.HocKy;

public class TestHocKyDAO {
	private HocKyDAO hocKyDAO = new HocKyDAO();
	@Test
	public void layDsHocKy_testChuan1() {
		//lay du lieu hoc ky trong co so du lieu
		int soLuongHocKy = 8;
		ArrayList<HocKy> dsHocKy = hocKyDAO.layDsHocKy();
		Assertions.assertNotNull(dsHocKy);
		Assertions.assertEquals(soLuongHocKy, dsHocKy.size());
		int idHocKy = 1;
		for(HocKy hocKy : dsHocKy) {
			Assertions.assertEquals(idHocKy, hocKy.getId());
			idHocKy++;
		}
	}
}
