package com.example.dbclpm.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbclpm.dao.SinhVienDAO;
import com.example.dbclpm.model.SinhVien;

@Service
public class SinhVienServiceImpl implements SinhVienService{
	@Autowired
	private SinhVienDAO sinhVienDAO;

	@Override
	public boolean kiemTraDangNhap(SinhVien sv) {
		// TODO Auto-generated method stub
		return sinhVienDAO.kiemTraDangNhap(sv);
	}
	
	

}
