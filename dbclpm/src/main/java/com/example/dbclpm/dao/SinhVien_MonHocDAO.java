package com.example.dbclpm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.dbclpm.model.SinhVien_MonHoc;

public class SinhVien_MonHocDAO extends DAO{
	public ArrayList<SinhVien_MonHoc> layDsSinhVien_MonHoc(int idSinhVien){
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		String sql = "SELECT * FROM tblsinhvien_monhoc WHERE idSinhVien = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idSinhVien);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SinhVien_MonHoc sv_mh = new SinhVien_MonHoc();
				int idSv_Mh = rs.getInt("id");
				sv_mh.setId(idSv_Mh);
				int idMonHoc = rs.getInt("idMonHoc");
				sv_mh.setMonHoc(new MonHocDAO().layMonHoc(idMonHoc));
				int idHocKy = rs.getInt("idHocKy");
				sv_mh.setHocKy(SinhVienDAO.dsHocKy.get(idHocKy - 1));
				sv_mh.setDsDiem(new DiemDAO().layDsDiem(idSv_Mh));
//				sv_mh.getDsDiem().get(0).setDiemThanhPhan(SinhVienDAO.dsDiemThanhPhan.get(4));
//				sv_mh.getDsDiem().get(0).setSoDiem(11);
				if(sv_mh.check()) dsSinhVien_MonHoc.add(sv_mh);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsSinhVien_MonHoc;
	}
}
