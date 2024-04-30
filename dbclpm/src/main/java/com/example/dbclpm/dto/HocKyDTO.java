package com.example.dbclpm.dto;

import java.util.ArrayList;

import com.example.dbclpm.model.HocKy;
import com.example.dbclpm.model.SinhVien_MonHoc;

public class HocKyDTO {
	private String tenHocKy;
	private String tenNamHoc;
	private ArrayList<MonHocDTO> dsMonHoc;
	private float dtbhk4;
	private float dtbhk10;
	private int stcdhk;
	private float dtbtl4;
	private float dtbtl10;
	private int stctl;
	public HocKyDTO(HocKy hocKy, ArrayList<SinhVien_MonHoc> dsSv_Mh) {
		this.tenHocKy = hocKy.getTenHocKy();
		this.tenNamHoc = hocKy.getTenNamHoc();
		dsMonHoc = new ArrayList<>();
		dtbhk4 = 0;
		dtbhk10 = 0;
		stcdhk = 0;
		for(SinhVien_MonHoc sv_mh : dsSv_Mh) {
			MonHocDTO mhDTO = new MonHocDTO(sv_mh.getMonHoc(), sv_mh.getDsDiem());
			dsMonHoc.add(mhDTO);
			if(mhDTO.isKetQua() && mhDTO.isTinhGPA()) {
				dtbhk10 += mhDTO.getDiemTK10() * mhDTO.getSoTinChi();
				dtbhk4 += mhDTO.getDiemTK4() * mhDTO.getSoTinChi();
				stcdhk += mhDTO.getSoTinChi();
			}
		}
		dtbhk10 /= stcdhk;
		dtbhk4 /= stcdhk;
		dtbhk10 = Math.round(dtbhk10 * 100) / 100f;
		dtbhk4 = Math.round(dtbhk4 * 100) / 100f;
	}
	public String getTenHocKy() {
		return tenHocKy;
	}
	public String getTenNamHoc() {
		return tenNamHoc;
	}
	public ArrayList<MonHocDTO> getDsMonHoc() {
		return dsMonHoc;
	}
	public float getDtbtl4() {
		return dtbtl4;
	}
	public void setDtbtl4(float dtbtl4) {
		this.dtbtl4 = dtbtl4;
	}
	public float getDtbtl10() {
		return dtbtl10;
	}
	public void setDtbtl10(float dtbtl10) {
		this.dtbtl10 = dtbtl10;
	}
	public int getStctl() {
		return stctl;
	}
	public void setStctl(int stctl) {
		this.stctl = stctl;
	}
	public float getDtbhk4() {
		return dtbhk4;
	}
	public float getDtbhk10() {
		return dtbhk10;
	}
	public int getStcdhk() {
		return stcdhk;
	}
	@Override
	public String toString() {
		return "HocKyDTO [tenHocKy=" + tenHocKy + ", tenNamHoc=" + tenNamHoc + ", dsMonHoc=" + dsMonHoc + ", dtbhk4="
				+ dtbhk4 + ", dtbhk10=" + dtbhk10 + ", stcdhk=" + stcdhk + ", dtbtl4=" + dtbtl4 + ", dtbtl10=" + dtbtl10
				+ ", stctl=" + stctl + "]";
	}
}
