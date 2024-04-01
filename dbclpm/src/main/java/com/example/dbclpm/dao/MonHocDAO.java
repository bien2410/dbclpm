package com.example.dbclpm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.dbclpm.model.MonHoc;

public class MonHocDAO extends DAO{
	public MonHoc layMonHoc(int id) {
		MonHoc monHoc = new MonHoc();
		String sql = "SELECT * FROM tblmonhoc WHERE id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				monHoc.setId(id);
				monHoc.setMaMonHoc(rs.getString("maMonHoc"));
				monHoc.setTenMonHoc(rs.getString("tenMonHoc"));
				monHoc.setSoTinChi(rs.getInt("soTinChi"));
				if(rs.getInt("tinhGPA") == 1) monHoc.setTinhGPA(true);
				else monHoc.setTinhGPA(false);
				monHoc.setDsMonHoc_DiemThanhPhan(new MonHoc_DiemThanhPhanDAO().layDsMonHoc_DiemThanhPhan(id));
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return monHoc;
	}
}
