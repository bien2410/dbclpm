package com.example.dbclpm;

import java.util.ArrayList;
import java.util.Collections;

import com.example.dbclpm.dao.DiemThanhPhanDAO;
import com.example.dbclpm.dao.HocKyDAO;
import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.dto.SinhVienDTO;
import com.example.dbclpm.model.DiemThanhPhan;
import com.example.dbclpm.model.HocKy;
import com.example.dbclpm.model.SinhVien;

public class Test {
	public static void main(String[] args) {
//		SinhVien sv = new SinhVien();
//		sv.setTaiKhoan("bien");
//		sv.setMatKhau("bien");
//		boolean b = new SinhVienDAO().kiemTraDangNhap(sv);
//		SinhVienDTO bien = new SinhVienDTO(sv);
//		System.out.println(bien);
//		ArrayList<DiemThanhPhan> dtp1 = new ArrayList<>();
//		ArrayList<DiemThanhPhan> dtp2 = new ArrayList<>();
//		DiemThanhPhan dtp11 = new DiemThanhPhan(1, "bien", 10);
//		DiemThanhPhan dtp12 = new DiemThanhPhan(2, "bien2", 20);
//		DiemThanhPhan dtp21 = new DiemThanhPhan(1, "bien", 10);
//		DiemThanhPhan dtp22 = new DiemThanhPhan(2, "bien2", 20);
//		dtp1.add(dtp11);
//		dtp1.add(dtp12);
//		dtp2.add(dtp22);
//		dtp2.add(dtp21);
//		Collections.sort(dtp1);
//		Collections.sort(dtp2);
//		System.out.println(dtp1.equals(dtp2));
//		float tmp = (5 * 20 + 5.5f * 20 + 10 * 10 + 8.5f * 50) / 100;
//		tmp -= 0.01;
		double tmp = 3.4200000762939453f;
		tmp = Math.round(tmp * 100) / 100f;
		System.out.println(tmp);
	}
}
