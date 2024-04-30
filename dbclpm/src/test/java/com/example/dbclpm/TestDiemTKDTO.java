package com.example.dbclpm;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.dbclpm.dto.DiemDTO;
import com.example.dbclpm.dto.DiemTKDTO;

public class TestDiemTKDTO {
	@Test
	public void DiemTKDTO_testChuan1() {
		// diem tong ket < 4.0
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(5);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(1);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(2.7f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(0, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("F" ,diemTKDTO.getDiemTKC());
		Assertions.assertFalse(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan2() {
		// diem tong ket tu 4.0 - 4.9
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(5);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(3);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(4.1f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(1.0f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("D" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan3() {
		// diem tong ket tu 5.0 - 5.4
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(6);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(4);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(5.0f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(1.5f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("D+" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan4() {
		// diem tong ket tu 5.5 - 6.4
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(6);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(5);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(5.7f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(2.0f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("C" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan5() {
		// diem tong ket tu 6.5 - 6.9
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(7);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(6);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(6.6f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(2.5f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("C+" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan6() {
		// diem tong ket tu 7.0 - 7.9
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(7);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(7);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(7.3f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(3.0f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("B" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan7() {
		// diem tong ket tu 8.0 - 8.4
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(7);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(8);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(8.0f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(3.5f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("B+" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan8() {
		// diem tong ket tu 8.5 - 8.9
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(7);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(9);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(8.7f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(3.7f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("A" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan9() {
		// diem tong ket tu 9.0 - 10
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(10);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(7);
		diem2.setTrongSo(20);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(10);
		diem3.setTrongSo(70);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(9.4f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(4.0f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("A+" ,diemTKDTO.getDiemTKC());
		Assertions.assertTrue(diemTKDTO.isKetQua());
	}
	@Test
	public void DiemTKDTO_testChuan10() {
		// diem tong ket tu 9.0 - 10
		ArrayList<DiemDTO> dsDiem = new ArrayList<>();
		DiemDTO diem1 = new DiemDTO();
		diem1.setSoDiem(10);
		diem1.setTrongSo(20);
		DiemDTO diem2 = new DiemDTO();
		diem2.setSoDiem(7);
		diem2.setTrongSo(30);
		DiemDTO diem3 = new DiemDTO();
		diem3.setSoDiem(0);
		diem3.setTrongSo(50);
		dsDiem.add(diem1);
		dsDiem.add(diem2);
		dsDiem.add(diem3);
		DiemTKDTO diemTKDTO = new DiemTKDTO(dsDiem);
		Assertions.assertEquals(4.1f, diemTKDTO.getDiemTK10());
		Assertions.assertEquals(1.0f, diemTKDTO.getDiemTK4());
		Assertions.assertEquals("D" ,diemTKDTO.getDiemTKC());
		Assertions.assertFalse(diemTKDTO.isKetQua());
	}
}
