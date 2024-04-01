package com.example.dbclpm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.dbclpm.model.MonHoc_DiemThanhPhan;

public class MonHoc_DiemThanhPhanDAO extends DAO{
	public ArrayList<MonHoc_DiemThanhPhan> layDsMonHoc_DiemThanhPhan(int idMonHoc){
		String sql = "SELECT * FROM tblmonhoc_diemthanhphan WHERE idMonHoc = ?";
		ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idMonHoc);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				MonHoc_DiemThanhPhan mh_dtp = new MonHoc_DiemThanhPhan();
				mh_dtp.setId(rs.getInt("id"));
				int idDtp = rs.getInt("idDiemThanhPhan");
				mh_dtp.setDiemThanhPhan(SinhVienDAO.dsDiemThanhPhan.get(idDtp - 1));
				dsMonHoc_DiemThanhPhan.add(mh_dtp);
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsMonHoc_DiemThanhPhan; 
	}
}
