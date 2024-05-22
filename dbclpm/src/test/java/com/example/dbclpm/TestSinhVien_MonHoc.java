package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.model.Diem;
import com.example.dbclpm.model.DiemThanhPhan;
import com.example.dbclpm.model.MonHoc;
import com.example.dbclpm.model.MonHoc_DiemThanhPhan;
import com.example.dbclpm.model.SinhVien_MonHoc;

public class TestSinhVien_MonHoc {
	private SinhVien_MonHoc sinhVien_MonHoc;
	
	public TestSinhVien_MonHoc() {
		super();
		DiemThanhPhan dtp1 = new DiemThanhPhan();
		dtp1.setId(3);
		dtp1.setTen("Chuyen can");
		dtp1.setTrongSo(20);
		DiemThanhPhan dtp2 = new DiemThanhPhan();
		dtp2.setId(10);
		dtp2.setTen("Kiem tra");
		dtp2.setTrongSo(30);
		DiemThanhPhan dtp3 = new DiemThanhPhan();
		dtp3.setId(14);
		dtp3.setTen("Diem thi");
		dtp3.setTrongSo(50);
		MonHoc_DiemThanhPhan mh_dtp1 = new MonHoc_DiemThanhPhan();
		mh_dtp1.setId(1);
		mh_dtp1.setDiemThanhPhan(dtp1);
		MonHoc_DiemThanhPhan mh_dtp2 = new MonHoc_DiemThanhPhan();
		mh_dtp2.setId(2);
		mh_dtp2.setDiemThanhPhan(dtp2);
		MonHoc_DiemThanhPhan mh_dtp3 = new MonHoc_DiemThanhPhan();
		mh_dtp3.setId(3);
		mh_dtp3.setDiemThanhPhan(dtp3);
		ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan = new ArrayList<>();
		dsMonHoc_DiemThanhPhan.add(mh_dtp1);
		dsMonHoc_DiemThanhPhan.add(mh_dtp2);
		dsMonHoc_DiemThanhPhan.add(mh_dtp3);
		MonHoc monHoc = new MonHoc();
		monHoc.setDsMonHoc_DiemThanhPhan(dsMonHoc_DiemThanhPhan);
		Diem diem1 = new Diem();
		diem1.setSoDiem(10);
		diem1.setDiemThanhPhan(dtp1);
		Diem diem2 = new Diem();
		diem2.setSoDiem(6);
		diem2.setDiemThanhPhan(dtp2);
		Diem diem3 = new Diem();
		diem3.setSoDiem(7);
		diem3.setDiemThanhPhan(dtp3);
		ArrayList<Diem> dsDiem = new ArrayList<>();
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		sinhVien_MonHoc = new SinhVien_MonHoc();
		sinhVien_MonHoc.setMonHoc(monHoc);
		sinhVien_MonHoc.setDsDiem(dsDiem);
	}

	@Test
	public void check_testChuan1() {
		// mon hoc co tat ca cac diem thanh phan trong khoang[0,10]
		// tong trong so tat ca cac diem thanh phan = 100%
		// diem thanh phan trung voi diem thanh phan tuong ung cua mon hoc
		Assertions.assertTrue(sinhVien_MonHoc.check());
	}
	@Test
	public void check_testNgoaiLe1() {
		// mon hoc co tat ca cac diem thanh phan trong khoang[0,10]
		sinhVien_MonHoc.getDsDiem().get(0).setSoDiem(11);
		Assertions.assertFalse(sinhVien_MonHoc.check());
	}
	@Test
	public void check_testNgoaiLe2() {
		// mon hoc co tat ca cac diem thanh phan trong khoang[0,10]
		// tong trong so tat ca cac diem thnah phan != 100%
		sinhVien_MonHoc.getDsDiem().get(0).getDiemThanhPhan().setTrongSo(24);
		Assertions.assertFalse(sinhVien_MonHoc.check());
	}
	@Test
	public void check_testNgoaiLe3() {
		// mon hoc co tat ca cac diem thanh phan trong khoang[0,10]
		// tong trong so tat ca cac diem thnah phan = 100%
		// diem thanh phan khong trung voi diem thanh phan tuong ung cua mon hoc
		DiemThanhPhan dtp = new DiemThanhPhan();
		dtp.setId(0);
		dtp.setTen("Diem gi do");
		dtp.setTrongSo(100);
		sinhVien_MonHoc.getMonHoc().getDsMonHoc_DiemThanhPhan().get(0).setDiemThanhPhan(dtp);
		Assertions.assertFalse(sinhVien_MonHoc.check());
	}
}
