package com.example.dbclpm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.dbclpm.model.DiemThanhPhan;
import com.example.dbclpm.model.HocKy;
import com.example.dbclpm.model.SinhVien;
import com.example.dbclpm.model.SinhVien_MonHoc;

@Repository
public class SinhVienDAO extends DAO{
	public static ArrayList<HocKy> dsHocKy;
	public static ArrayList<DiemThanhPhan> dsDiemThanhPhan;
	public boolean kiemTraDangNhap(SinhVien sv) {
		boolean result = false;
		String sql = "SELECT * FROM tblsinhvien WHERE taiKhoan = ? and matKhau = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sv.getTaiKhoan());
			ps.setString(2, sv.getMatKhau());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int idSinhVien = rs.getInt("id");
				sv.setId(idSinhVien);
				sv.setHoTen(rs.getString("hoTen"));
				sv.setMaSinhVien(rs.getString("maSinhVien"));
				sv.setNgaySinh(rs.getDate("ngaySinh"));
				sv.setEmail(rs.getString("email"));
				khoiTao();
				sv.setDsSinhVien_MonHoc(new SinhVien_MonHocDAO().layDsSinhVien_MonHoc(idSinhVien));
				result = true;
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public static void khoiTao() {
		dsHocKy = new HocKyDAO().layDsHocKy();
		dsDiemThanhPhan  = new DiemThanhPhanDAO().layDsDiemThanhPhan();
	}
}
