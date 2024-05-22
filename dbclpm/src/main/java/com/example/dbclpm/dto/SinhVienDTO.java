package com.example.dbclpm.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.example.dbclpm.model.HocKy;
import com.example.dbclpm.model.MonHoc;
import com.example.dbclpm.model.SinhVien;
import com.example.dbclpm.model.SinhVien_MonHoc;

public class SinhVienDTO {
	private String hoTen;
	private String maSinhVien;
	private ArrayList<HocKyDTO> dsHocKy;
	public SinhVienDTO(SinhVien sv) {
		this.hoTen = sv.getHoTen();
		this.maSinhVien = sv.getMaSinhVien();
		dsHocKy = new ArrayList<>();
		ArrayList<SinhVien_MonHoc> dsSv_Mh = sv.getDsSinhVien_MonHoc();
		Collections.sort(dsSv_Mh);
		if(dsSv_Mh.size() <= 0) return;
		HocKy hocKy = dsSv_Mh.get(0).getHocKy();
		ArrayList<SinhVien_MonHoc> dsTmp = new ArrayList<>();
		float dtbtl10 = 0;
		float dtbtl4 = 0;
		int stctl = 0;
		Map<String, MonHocDTO> dsDiem = new HashMap<>();
		for(SinhVien_MonHoc sv_mh : dsSv_Mh) {
			if(sv_mh.getHocKy().equals(hocKy)) {
				dsTmp.add(sv_mh);
			}
			else {
				HocKyDTO hkDTO = new HocKyDTO(hocKy, dsTmp);
				for(MonHocDTO mhDTO : hkDTO.getDsMonHoc()) {
					if(dsDiem.containsKey(mhDTO.getMaMonHoc())) {
						if(dsDiem.get(mhDTO.getMaMonHoc()).getDiemTK10() < mhDTO.getDiemTK10()) {
							dsDiem.replace(mhDTO.getMaMonHoc(), mhDTO);							
						}
					}
					else {
						if(mhDTO.isKetQua() && mhDTO.isTinhGPA()) {
							stctl += mhDTO.getSoTinChi();
							dsDiem.put(mhDTO.getMaMonHoc(), mhDTO);							
						}
					}
				}
				dtbtl10 = 0;
				dtbtl4 = 0;
				for(String s : dsDiem.keySet()) {
					MonHocDTO tmp = dsDiem.get(s);
					dtbtl10 += tmp.getDiemTK10() * tmp.getSoTinChi();
					dtbtl4 += tmp.getDiemTK4() * tmp.getSoTinChi();
				}
				dtbtl10 /= stctl;
				dtbtl4 /= stctl;
				dtbtl10 = Math.round(dtbtl10 * 100) / 100f;
				dtbtl4 = Math.round(dtbtl4 * 100) / 100f;
				hkDTO.setDtbtl10(dtbtl10);
				hkDTO.setDtbtl4(dtbtl4);
				hkDTO.setStctl(stctl);
				dsHocKy.add(hkDTO);
				dsTmp.clear();
				hocKy = sv_mh.getHocKy();
				dsTmp.add(sv_mh);
			}
		}
		HocKyDTO hkDTO = new HocKyDTO(hocKy, dsTmp);
		for(MonHocDTO mhDTO : hkDTO.getDsMonHoc()) {
			if(dsDiem.containsKey(mhDTO.getMaMonHoc())) {
				if(dsDiem.get(mhDTO.getMaMonHoc()).getDiemTK10() < mhDTO.getDiemTK10()) {
					dsDiem.replace(mhDTO.getMaMonHoc(), mhDTO);							
				}
			}
			else {
				if(mhDTO.isKetQua() && mhDTO.isTinhGPA()) {
					stctl += mhDTO.getSoTinChi();
					dsDiem.put(mhDTO.getMaMonHoc(), mhDTO);							
				}
			}
		}
		dtbtl10 = 0;
		dtbtl4 = 0;
		for(String s : dsDiem.keySet()) {
			MonHocDTO tmp = dsDiem.get(s);
			dtbtl10 += tmp.getDiemTK10() * tmp.getSoTinChi();
			dtbtl4 += tmp.getDiemTK4() * tmp.getSoTinChi();
		}
		dtbtl10 /= stctl;
		dtbtl4 /= stctl;
		dtbtl10 = Math.round(dtbtl10 * 100) / 100f;
		dtbtl4 = Math.round(dtbtl4 * 100) / 100f;
		hkDTO.setDtbtl10(dtbtl10);
		hkDTO.setDtbtl4(dtbtl4);
		hkDTO.setStctl(stctl);
		dsHocKy.add(hkDTO);
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public ArrayList<HocKyDTO> getDsHocKy() {
		return dsHocKy;
	}
	@Override
	public String toString() {
		return hoTen + " " + maSinhVien + " " + dsHocKy;
	}
}
