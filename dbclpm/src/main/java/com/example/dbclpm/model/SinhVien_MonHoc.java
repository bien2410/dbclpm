package com.example.dbclpm.model;

import java.util.ArrayList;
import java.util.Collections;

public class SinhVien_MonHoc implements Comparable<SinhVien_MonHoc>{
	private int id;
	private MonHoc monHoc;
	private HocKy hocKy;
	private ArrayList<Diem> dsDiem;
	public SinhVien_MonHoc() {
		super();
	}
	public SinhVien_MonHoc(int id, MonHoc monHoc, HocKy hocKy, ArrayList<Diem> dsDiem) {
		super();
		this.id = id;
		this.monHoc = monHoc;
		this.hocKy = hocKy;
		this.dsDiem = dsDiem;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MonHoc getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	public HocKy getHocKy() {
		return hocKy;
	}
	public void setHocKy(HocKy hocKy) {
		this.hocKy = hocKy;
	}
	public ArrayList<Diem> getDsDiem() {
		return dsDiem;
	}
	public void setDsDiem(ArrayList<Diem> dsDiem) {
		this.dsDiem = dsDiem;
	}
	@Override
	public String toString() {
		return "\n SinhVien_MonHoc [id=" + id + ", monHoc=" + monHoc + ", hocKy=" + hocKy + ", dsDiem=" + dsDiem + "]";
	}
	public boolean check() {		
		ArrayList<DiemThanhPhan> dsDtp1 = new ArrayList<>();
		int tongTrongSo = 0;
		for(Diem d : this.dsDiem) {
			DiemThanhPhan dtp = d.getDiemThanhPhan();
			dsDtp1.add(dtp);
			tongTrongSo += dtp.getTrongSo();
			if(d.getSoDiem() < 0 || d.getSoDiem() > 10) {
				System.err.println(monHoc.getTenMonHoc());
				System.err.println("Diem thanh phan: " + d.getDiemThanhPhan().getTen() + " = " + d.getSoDiem() + " khong hop le");
				return false;
			}
		}
		if(tongTrongSo != 100) {
			System.err.println(monHoc.getTenMonHoc());
			System.err.println("Tong trong so = " + tongTrongSo + " (khac 100)");
			for(DiemThanhPhan i : dsDtp1) {
				System.err.println(i.getTen() + " " + i.getTrongSo());
			}
			return false;
		}
		Collections.sort(dsDtp1);
		ArrayList<DiemThanhPhan> dsDtp2 = new ArrayList<>();
		for(MonHoc_DiemThanhPhan mh_dtp : monHoc.getDsMonHoc_DiemThanhPhan()) {
			dsDtp2.add(mh_dtp.getDiemThanhPhan());			
		}
		Collections.sort(dsDtp2);
		if(!dsDtp1.equals(dsDtp2)) {
			System.err.println(monHoc.getTenMonHoc());
			System.err.println("Khong trung diem thanh phan: ");
			for(DiemThanhPhan i : dsDtp1) {
				System.err.println(i.getTen() + " " + i.getTrongSo());
			}
			for(DiemThanhPhan i : dsDtp2) {
				System.err.println(i.getTen() + " " + i.getTrongSo());
			}
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(SinhVien_MonHoc o) {
		// TODO Auto-generated method stub
		return this.hocKy.compareTo(o.hocKy);
	}
}
