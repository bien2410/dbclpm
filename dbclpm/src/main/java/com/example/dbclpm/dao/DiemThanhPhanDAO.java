package com.example.dbclpm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.dbclpm.model.DiemThanhPhan;
import com.example.dbclpm.model.HocKy;

public class DiemThanhPhanDAO extends DAO{
	public ArrayList<DiemThanhPhan> layDsDiemThanhPhan(){
		ArrayList<DiemThanhPhan> dsDiemThanhPhan = new ArrayList<>();
		String sql = "SELECT * FROM tbldiemthanhphan";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				DiemThanhPhan dtp = new DiemThanhPhan();
				dtp.setId(rs.getInt("id"));
				dtp.setTen(rs.getString("ten"));
				dtp.setTrongSo(rs.getInt("trongSo"));
				dsDiemThanhPhan.add(dtp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsDiemThanhPhan;
	}
}
