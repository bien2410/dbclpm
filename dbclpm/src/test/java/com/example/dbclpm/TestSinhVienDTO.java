package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dto.HocKyDTO;
import com.example.dbclpm.dto.SinhVienDTO;
import com.example.dbclpm.model.Diem;
import com.example.dbclpm.model.DiemThanhPhan;
import com.example.dbclpm.model.HocKy;
import com.example.dbclpm.model.MonHoc;
import com.example.dbclpm.model.MonHoc_DiemThanhPhan;
import com.example.dbclpm.model.SinhVien;
import com.example.dbclpm.model.SinhVien_MonHoc;

public class TestSinhVienDTO {
	private SinhVien sinhVien = new SinhVien();
	private SinhVien_MonHoc initMonBinhThuong() {
		DiemThanhPhan dtp1 = new DiemThanhPhan();
		dtp1.setId(2);
		dtp1.setTen("Chuyen can");
		dtp1.setTrongSo(10);
		DiemThanhPhan dtp2 = new DiemThanhPhan();
		dtp2.setId(4);
		dtp2.setTen("Bai tap");
		dtp2.setTrongSo(10);
		DiemThanhPhan dtp3 = new DiemThanhPhan();
		dtp3.setId(7);
		dtp3.setTen("Kiem tra");
		dtp3.setTrongSo(10);
		DiemThanhPhan dtp4 = new DiemThanhPhan();
		dtp4.setId(16);
		dtp4.setTen("Diem thi");
		dtp4.setTrongSo(70);
		MonHoc_DiemThanhPhan mh_dtp1 = new MonHoc_DiemThanhPhan();
		mh_dtp1.setId(15);
		mh_dtp1.setDiemThanhPhan(dtp1);
		MonHoc_DiemThanhPhan mh_dtp2 = new MonHoc_DiemThanhPhan();
		mh_dtp2.setId(16);
		mh_dtp2.setDiemThanhPhan(dtp2);
		MonHoc_DiemThanhPhan mh_dtp3 = new MonHoc_DiemThanhPhan();
		mh_dtp3.setId(17);
		mh_dtp3.setDiemThanhPhan(dtp3);
		MonHoc_DiemThanhPhan mh_dtp4 = new MonHoc_DiemThanhPhan();
		mh_dtp4.setId(18);
		mh_dtp4.setDiemThanhPhan(dtp4);
		ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan = new ArrayList<>();
		dsMonHoc_DiemThanhPhan.add(mh_dtp1);
		dsMonHoc_DiemThanhPhan.add(mh_dtp2);
		dsMonHoc_DiemThanhPhan.add(mh_dtp3);
		dsMonHoc_DiemThanhPhan.add(mh_dtp4);
		MonHoc monHoc = new MonHoc();
		monHoc.setDsMonHoc_DiemThanhPhan(dsMonHoc_DiemThanhPhan);
		monHoc.setTinhGPA(true);
		monHoc.setSoTinChi(2);
		monHoc.setMaMonHoc("INT1154");
		Diem diem1 = new Diem();
		diem1.setSoDiem(9);
		diem1.setDiemThanhPhan(dtp1);
		Diem diem2 = new Diem();
		diem2.setSoDiem(8);
		diem2.setDiemThanhPhan(dtp2);
		Diem diem3 = new Diem();
		diem3.setSoDiem(9);
		diem3.setDiemThanhPhan(dtp3);
		Diem diem4 = new Diem();
		diem4.setSoDiem(8);
		diem4.setDiemThanhPhan(dtp4);
		ArrayList<Diem> dsDiem = new ArrayList<>();
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		dsDiem.add(diem4);
		SinhVien_MonHoc sinhVien_MonHoc = new SinhVien_MonHoc();
		sinhVien_MonHoc.setMonHoc(monHoc);
		sinhVien_MonHoc.setDsDiem(dsDiem);
		HocKy hocKy = new HocKy();
		hocKy.setId(1);
		hocKy.setTenHocKy("1");
		hocKy.setTenNamHoc("2020-2021");
		sinhVien_MonHoc.setHocKy(hocKy);
		return sinhVien_MonHoc;
	}
	private SinhVien_MonHoc initMonHocCaiThienDiemThap() {
		DiemThanhPhan dtp1 = new DiemThanhPhan();
		dtp1.setId(2);
		dtp1.setTen("Chuyen can");
		dtp1.setTrongSo(10);
		DiemThanhPhan dtp2 = new DiemThanhPhan();
		dtp2.setId(4);
		dtp2.setTen("Bai tap");
		dtp2.setTrongSo(10);
		DiemThanhPhan dtp3 = new DiemThanhPhan();
		dtp3.setId(7);
		dtp3.setTen("Kiem tra");
		dtp3.setTrongSo(10);
		DiemThanhPhan dtp4 = new DiemThanhPhan();
		dtp4.setId(16);
		dtp4.setTen("Diem thi");
		dtp4.setTrongSo(70);
		MonHoc_DiemThanhPhan mh_dtp1 = new MonHoc_DiemThanhPhan();
		mh_dtp1.setId(11);
		mh_dtp1.setDiemThanhPhan(dtp1);
		MonHoc_DiemThanhPhan mh_dtp2 = new MonHoc_DiemThanhPhan();
		mh_dtp2.setId(12);
		mh_dtp2.setDiemThanhPhan(dtp2);
		MonHoc_DiemThanhPhan mh_dtp3 = new MonHoc_DiemThanhPhan();
		mh_dtp3.setId(13);
		mh_dtp3.setDiemThanhPhan(dtp3);
		MonHoc_DiemThanhPhan mh_dtp4 = new MonHoc_DiemThanhPhan();
		mh_dtp4.setId(14);
		mh_dtp4.setDiemThanhPhan(dtp4);
		ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan = new ArrayList<>();
		dsMonHoc_DiemThanhPhan.add(mh_dtp1);
		dsMonHoc_DiemThanhPhan.add(mh_dtp2);
		dsMonHoc_DiemThanhPhan.add(mh_dtp3);
		dsMonHoc_DiemThanhPhan.add(mh_dtp4);
		MonHoc monHoc = new MonHoc();
		monHoc.setDsMonHoc_DiemThanhPhan(dsMonHoc_DiemThanhPhan);
		monHoc.setTinhGPA(true);
		monHoc.setSoTinChi(3);
		monHoc.setMaMonHoc("BAS1203");
		Diem diem1 = new Diem();
		diem1.setSoDiem(5);
		diem1.setDiemThanhPhan(dtp1);
		Diem diem2 = new Diem();
		diem2.setSoDiem(5);
		diem2.setDiemThanhPhan(dtp2);
		Diem diem3 = new Diem();
		diem3.setSoDiem(5);
		diem3.setDiemThanhPhan(dtp3);
		Diem diem4 = new Diem();
		diem4.setSoDiem(5);
		diem4.setDiemThanhPhan(dtp4);
		ArrayList<Diem> dsDiem = new ArrayList<>();
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		dsDiem.add(diem4);
		SinhVien_MonHoc sinhVien_MonHoc = new SinhVien_MonHoc();
		sinhVien_MonHoc.setMonHoc(monHoc);
		sinhVien_MonHoc.setDsDiem(dsDiem);
		return sinhVien_MonHoc;
	}
	private SinhVien_MonHoc initMonHocCaiThienDiemCao() {
		DiemThanhPhan dtp1 = new DiemThanhPhan();
		dtp1.setId(2);
		dtp1.setTen("Chuyen can");
		dtp1.setTrongSo(10);
		DiemThanhPhan dtp2 = new DiemThanhPhan();
		dtp2.setId(4);
		dtp2.setTen("Bai tap");
		dtp2.setTrongSo(10);
		DiemThanhPhan dtp3 = new DiemThanhPhan();
		dtp3.setId(7);
		dtp3.setTen("Kiem tra");
		dtp3.setTrongSo(10);
		DiemThanhPhan dtp4 = new DiemThanhPhan();
		dtp4.setId(16);
		dtp4.setTen("Diem thi");
		dtp4.setTrongSo(70);
		MonHoc_DiemThanhPhan mh_dtp1 = new MonHoc_DiemThanhPhan();
		mh_dtp1.setId(11);
		mh_dtp1.setDiemThanhPhan(dtp1);
		MonHoc_DiemThanhPhan mh_dtp2 = new MonHoc_DiemThanhPhan();
		mh_dtp2.setId(12);
		mh_dtp2.setDiemThanhPhan(dtp2);
		MonHoc_DiemThanhPhan mh_dtp3 = new MonHoc_DiemThanhPhan();
		mh_dtp3.setId(13);
		mh_dtp3.setDiemThanhPhan(dtp3);
		MonHoc_DiemThanhPhan mh_dtp4 = new MonHoc_DiemThanhPhan();
		mh_dtp4.setId(14);
		mh_dtp4.setDiemThanhPhan(dtp4);
		ArrayList<MonHoc_DiemThanhPhan> dsMonHoc_DiemThanhPhan = new ArrayList<>();
		dsMonHoc_DiemThanhPhan.add(mh_dtp1);
		dsMonHoc_DiemThanhPhan.add(mh_dtp2);
		dsMonHoc_DiemThanhPhan.add(mh_dtp3);
		dsMonHoc_DiemThanhPhan.add(mh_dtp4);
		MonHoc monHoc = new MonHoc();
		monHoc.setDsMonHoc_DiemThanhPhan(dsMonHoc_DiemThanhPhan);
		monHoc.setTinhGPA(true);
		monHoc.setSoTinChi(3);
		monHoc.setMaMonHoc("BAS1203");
		Diem diem1 = new Diem();
		diem1.setSoDiem(8);
		diem1.setDiemThanhPhan(dtp1);
		Diem diem2 = new Diem();
		diem2.setSoDiem(8);
		diem2.setDiemThanhPhan(dtp2);
		Diem diem3 = new Diem();
		diem3.setSoDiem(7);
		diem3.setDiemThanhPhan(dtp3);
		Diem diem4 = new Diem();
		diem4.setSoDiem(7);
		diem4.setDiemThanhPhan(dtp4);
		ArrayList<Diem> dsDiem = new ArrayList<>();
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		dsDiem.add(diem4);
		SinhVien_MonHoc sinhVien_MonHoc = new SinhVien_MonHoc();
		sinhVien_MonHoc.setMonHoc(monHoc);
		sinhVien_MonHoc.setDsDiem(dsDiem);
		return sinhVien_MonHoc;
	}
	@Test
	public void SinhVienDTO_testChuan1() {
		// sinh vien khong hoc cai thien mon nao
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		dsSinhVien_MonHoc.add(initMonBinhThuong());
		SinhVien_MonHoc sinhVien_MonHoc = initMonHocCaiThienDiemThap();
		HocKy hocKy = new HocKy();
		hocKy.setId(2);
		hocKy.setTenHocKy("2");
		hocKy.setTenNamHoc("2020-2021");
		sinhVien_MonHoc.setHocKy(hocKy);
		dsSinhVien_MonHoc.add(sinhVien_MonHoc);
		sinhVien.setDsSinhVien_MonHoc(dsSinhVien_MonHoc);
		SinhVienDTO svDTO = new SinhVienDTO(sinhVien);
		for(HocKyDTO hocKyDTO : svDTO.getDsHocKy()) {
			if(hocKyDTO.getTenHocKy().equals("1")) {
				Assertions.assertEquals(8.2f, hocKyDTO.getDtbhk10());
				Assertions.assertEquals(3.5f, hocKyDTO.getDtbhk4());
				Assertions.assertEquals(2, hocKyDTO.getStcdhk());
				Assertions.assertEquals(8.2f, hocKyDTO.getDtbtl10());
				Assertions.assertEquals(3.5f, hocKyDTO.getDtbtl4());
				Assertions.assertEquals(2, hocKyDTO.getStctl());
			}
			else {
				Assertions.assertEquals(5f, hocKyDTO.getDtbhk10());
				Assertions.assertEquals(1.5f, hocKyDTO.getDtbhk4());
				Assertions.assertEquals(3, hocKyDTO.getStcdhk());
				Assertions.assertEquals(6.28f, hocKyDTO.getDtbtl10());
				Assertions.assertEquals(2.3f, hocKyDTO.getDtbtl4());
				Assertions.assertEquals(5, hocKyDTO.getStctl());
			}
		}
	}
	@Test
	public void SinhVienDTO_testChuan2() {
		// sinh vien hoc cai thien it nhat 1 mon va co diem lan sau cao hon lan truoc
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		dsSinhVien_MonHoc.add(initMonBinhThuong());
		SinhVien_MonHoc sinhVien_MonHoc1 = initMonHocCaiThienDiemThap();
		HocKy hocKy1 = new HocKy();
		hocKy1.setId(1);
		hocKy1.setTenHocKy("1");
		hocKy1.setTenNamHoc("2020-2021");
		sinhVien_MonHoc1.setHocKy(hocKy1);
		dsSinhVien_MonHoc.add(sinhVien_MonHoc1);
		SinhVien_MonHoc sinhVien_MonHoc2 = initMonHocCaiThienDiemCao();
		HocKy hocKy2 = new HocKy();
		hocKy2.setId(2);
		hocKy2.setTenHocKy("2");
		hocKy2.setTenNamHoc("2020-2021");
		sinhVien_MonHoc2.setHocKy(hocKy2);
		dsSinhVien_MonHoc.add(sinhVien_MonHoc2);
		sinhVien.setDsSinhVien_MonHoc(dsSinhVien_MonHoc);
		SinhVienDTO svDTO = new SinhVienDTO(sinhVien);
		System.out.println(svDTO);
		for(HocKyDTO hocKyDTO : svDTO.getDsHocKy()) {
			if(hocKyDTO.getTenHocKy().equals("1")) {
				Assertions.assertEquals(6.28f, hocKyDTO.getDtbhk10());
				Assertions.assertEquals(2.3f, hocKyDTO.getDtbhk4());
				Assertions.assertEquals(5, hocKyDTO.getStcdhk());
				Assertions.assertEquals(6.28f, hocKyDTO.getDtbtl10());
				Assertions.assertEquals(2.3f, hocKyDTO.getDtbtl4());
				Assertions.assertEquals(5, hocKyDTO.getStctl());
			}
			else {
				Assertions.assertEquals(7.2f, hocKyDTO.getDtbhk10());
				Assertions.assertEquals(3.0f, hocKyDTO.getDtbhk4());
				Assertions.assertEquals(3, hocKyDTO.getStcdhk());
				Assertions.assertEquals(7.6f, hocKyDTO.getDtbtl10());
				Assertions.assertEquals(3.2f, hocKyDTO.getDtbtl4());
				Assertions.assertEquals(5, hocKyDTO.getStctl());
			}
		}
	}
	@Test
	public void SinhVienDTO_testChuan3() {
		// sinh vien hoc cai thien it nhat 1 mon va co diem lan sau thap hon lan truoc
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		dsSinhVien_MonHoc.add(initMonBinhThuong());
		SinhVien_MonHoc sinhVien_MonHoc1 = initMonHocCaiThienDiemThap();
		HocKy hocKy1 = new HocKy();
		hocKy1.setId(1);
		hocKy1.setTenHocKy("1");
		hocKy1.setTenNamHoc("2020-2021");
		HocKy hocKy2 = new HocKy();
		hocKy2.setId(2);
		hocKy2.setTenHocKy("2");
		hocKy2.setTenNamHoc("2020-2021");
		sinhVien_MonHoc1.setHocKy(hocKy2);
		dsSinhVien_MonHoc.add(sinhVien_MonHoc1);
		SinhVien_MonHoc sinhVien_MonHoc2 = initMonHocCaiThienDiemCao();
		sinhVien_MonHoc2.setHocKy(hocKy1);
		dsSinhVien_MonHoc.add(sinhVien_MonHoc2);
		sinhVien.setDsSinhVien_MonHoc(dsSinhVien_MonHoc);
		SinhVienDTO svDTO = new SinhVienDTO(sinhVien);
		System.out.println(svDTO);
		for(HocKyDTO hocKyDTO : svDTO.getDsHocKy()) {
			if(hocKyDTO.getTenHocKy().equals("1")) {
				Assertions.assertEquals(7.6f, hocKyDTO.getDtbhk10());
				Assertions.assertEquals(3.2f, hocKyDTO.getDtbhk4());
				Assertions.assertEquals(5, hocKyDTO.getStcdhk());
				Assertions.assertEquals(7.6f, hocKyDTO.getDtbtl10());
				Assertions.assertEquals(3.2f, hocKyDTO.getDtbtl4());
				Assertions.assertEquals(5, hocKyDTO.getStctl());
			}
			else {
				Assertions.assertEquals(5f, hocKyDTO.getDtbhk10());
				Assertions.assertEquals(1.5f, hocKyDTO.getDtbhk4());
				Assertions.assertEquals(3, hocKyDTO.getStcdhk());
				Assertions.assertEquals(7.6f, hocKyDTO.getDtbtl10());
				Assertions.assertEquals(3.2f, hocKyDTO.getDtbtl4());
				Assertions.assertEquals(5, hocKyDTO.getStctl());
			}
		}
	}
}
