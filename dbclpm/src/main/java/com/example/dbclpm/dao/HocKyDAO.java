package com.example.dbclpm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.dbclpm.model.HocKy;

public class HocKyDAO extends DAO{
	public ArrayList<HocKy> layDsHocKy(){
		ArrayList<HocKy> dsHocKy = new ArrayList<>();
		String sql = "SELECT * FROM tblhocky";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				HocKy hocKy = new HocKy();
				hocKy.setId(rs.getInt("id"));
				hocKy.setTenHocKy(rs.getString("tenHocKy"));
				hocKy.setTenNamHoc(rs.getString("tenNamHoc"));
				dsHocKy.add(hocKy);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsHocKy;
	}
}
