package com.example.dbclpm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.dbclpm.model.Diem;

public class DiemDAO extends DAO{
	public ArrayList<Diem> layDsDiem(int idSv_Mh){
		ArrayList<Diem> dsDiem = new ArrayList<>();
		String sql = "SELECT * FROM tbldiem WHERE idSinhVien_MonHoc = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idSv_Mh);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Diem diem = new Diem();
				diem.setId(rs.getInt("id"));
				diem.setSoDiem(rs.getFloat("soDiem"));
				int idDtp = rs.getInt("idDiemThanhPhan");
				diem.setDiemThanhPhan(SinhVienDAO.dsDiemThanhPhan.get(idDtp - 1));
				dsDiem.add(diem);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsDiem;
	}
}
