package com.alighthub.ServiceImplements;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.alighthub.Model.Admin;
import com.alighthub.ServiceInterface.AdminService;

@Service
public class AdminSerI implements AdminService{

	@Override
	public void insertData(Admin a) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * 
	 * @Autowired private AdminRepositry ar;
	 * 
	 * @Override public void insertData(Admin a) {
	 * 
	 * ar.save(a);
	 * 
	 * }
	 * 
	 */

}
