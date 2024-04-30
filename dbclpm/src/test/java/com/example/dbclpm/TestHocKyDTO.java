package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dto.HocKyDTO;
import com.example.dbclpm.model.Diem;
import com.example.dbclpm.model.DiemThanhPhan;
import com.example.dbclpm.model.HocKy;
import com.example.dbclpm.model.MonHoc;
import com.example.dbclpm.model.MonHoc_DiemThanhPhan;
import com.example.dbclpm.model.SinhVien_MonHoc;

public class TestHocKyDTO {
	private HocKyDTO hocKyDTO;
	private SinhVien_MonHoc initMonTheChat() {
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
		monHoc.setTinhGPA(false);
		monHoc.setSoTinChi(2);
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
		SinhVien_MonHoc sinhVien_MonHoc = new SinhVien_MonHoc();
		sinhVien_MonHoc.setMonHoc(monHoc);
		sinhVien_MonHoc.setDsDiem(dsDiem);
		return sinhVien_MonHoc;
	}
	private SinhVien_MonHoc initMonKhongDat() {
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
		mh_dtp1.setId(7);
		mh_dtp1.setDiemThanhPhan(dtp1);
		MonHoc_DiemThanhPhan mh_dtp2 = new MonHoc_DiemThanhPhan();
		mh_dtp2.setId(8);
		mh_dtp2.setDiemThanhPhan(dtp2);
		MonHoc_DiemThanhPhan mh_dtp3 = new MonHoc_DiemThanhPhan();
		mh_dtp3.setId(9);
		mh_dtp3.setDiemThanhPhan(dtp3);
		MonHoc_DiemThanhPhan mh_dtp4 = new MonHoc_DiemThanhPhan();
		mh_dtp4.setId(10);
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
		Diem diem1 = new Diem();
		diem1.setSoDiem(10);
		diem1.setDiemThanhPhan(dtp1);
		Diem diem2 = new Diem();
		diem2.setSoDiem(9.5f);
		diem2.setDiemThanhPhan(dtp2);
		Diem diem3 = new Diem();
		diem3.setSoDiem(8.5f);
		diem3.setDiemThanhPhan(dtp3);
		Diem diem4 = new Diem();
		diem4.setSoDiem(0);
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
	private SinhVien_MonHoc initMonDat1() {
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
	private SinhVien_MonHoc initMonDat2() {
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
		return sinhVien_MonHoc;
	}
	@Test
	public void HocKyDTO_testChuan1() {
		// hoc ky khong co mon hoc khong dat va 
		// khong co mon hoc khong tinh diem GPA(mon the chat, ky nang) 
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		dsSinhVien_MonHoc.add(initMonDat1());
		dsSinhVien_MonHoc.add(initMonDat2());
		hocKyDTO = new HocKyDTO(new HocKy(), dsSinhVien_MonHoc);
		Assertions.assertEquals(7.6f, hocKyDTO.getDtbhk10());
		Assertions.assertEquals(3.2f, hocKyDTO.getDtbhk4());
		Assertions.assertEquals(5, hocKyDTO.getStcdhk());
	}
	@Test
	public void HocKyDTO_testChuan2() {
		// hoc ky khong co mon hoc khong dat va 
		// co mon hoc khong tinh diem GPA(mon the chat, ky nang) 
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		dsSinhVien_MonHoc.add(initMonDat1());
		dsSinhVien_MonHoc.add(initMonDat2());
		dsSinhVien_MonHoc.add(initMonTheChat());
		hocKyDTO = new HocKyDTO(new HocKy(), dsSinhVien_MonHoc);
		Assertions.assertEquals(7.6f, hocKyDTO.getDtbhk10());
		Assertions.assertEquals(3.2f, hocKyDTO.getDtbhk4());
		Assertions.assertEquals(5, hocKyDTO.getStcdhk());
	}
	@Test
	public void HocKyDTO_testChuan3() {
		// hoc ky co mon hoc khong dat va 
		// khong co mon hoc khong tinh diem GPA(mon the chat, ky nang) 
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		dsSinhVien_MonHoc.add(initMonDat1());
		dsSinhVien_MonHoc.add(initMonDat2());
		dsSinhVien_MonHoc.add(initMonKhongDat());
		hocKyDTO = new HocKyDTO(new HocKy(), dsSinhVien_MonHoc);
		Assertions.assertEquals(7.6f, hocKyDTO.getDtbhk10());
		Assertions.assertEquals(3.2f, hocKyDTO.getDtbhk4());
		Assertions.assertEquals(5, hocKyDTO.getStcdhk());
	}
	@Test
	public void HocKyDTO_testChuan4() {
		// hoc ky co mon hoc khong dat va 
		// co mon hoc khong tinh diem GPA(mon the chat, ky nang) 
		ArrayList<SinhVien_MonHoc> dsSinhVien_MonHoc = new ArrayList<>();
		dsSinhVien_MonHoc.add(initMonDat1());
		dsSinhVien_MonHoc.add(initMonDat2());
		dsSinhVien_MonHoc.add(initMonKhongDat());
		dsSinhVien_MonHoc.add(initMonTheChat());
		hocKyDTO = new HocKyDTO(new HocKy(), dsSinhVien_MonHoc);
		Assertions.assertEquals(7.6f, hocKyDTO.getDtbhk10());
		Assertions.assertEquals(3.2f, hocKyDTO.getDtbhk4());
		Assertions.assertEquals(5, hocKyDTO.getStcdhk());
	}
}
