package com.example.dbclpm.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.dto.DangNhapDTO;
import com.example.dbclpm.dto.SinhVienDTO;
import com.example.dbclpm.model.SinhVien;

@Controller
@RequestMapping("/sinhVien")
public class SinhVienController {
	@Autowired
	private SinhVienDAO sinhVienDAO;
	
//	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping()
	public ResponseEntity<SinhVienDTO> getSinhVien(@RequestBody DangNhapDTO dangNhapDTO){
		SinhVien sv = new SinhVien();
		sv.setTaiKhoan(dangNhapDTO.getTaiKhoan());
		sv.setMatKhau(dangNhapDTO.getMatKhau());
		if(sinhVienDAO.kiemTraDangNhap(sv)) {
			return new ResponseEntity<>(new SinhVienDTO(sv), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
	}
}
