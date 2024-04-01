package com.example.dbclpm.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dbclpm.dto.SinhVienDTO;
import com.example.dbclpm.model.SinhVien;
import com.example.dbclpm.service.SinhVienService;

@Controller
@RequestMapping("/sinhVien")
public class SinhVienController {
	@Autowired
	private SinhVienService sinhVienService;
	
	@GetMapping()
	public ResponseEntity<SinhVienDTO> getSinhVien(@RequestParam(name = "taiKhoan") String taiKhoan,
														   @RequestParam(name = "matKhau") String matKhau){
		SinhVien sv = new SinhVien();
		sv.setTaiKhoan(taiKhoan);
		sv.setMatKhau(matKhau);
		if(sinhVienService.kiemTraDangNhap(sv)) {
			return new ResponseEntity<>(new SinhVienDTO(sv), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
	}
}
