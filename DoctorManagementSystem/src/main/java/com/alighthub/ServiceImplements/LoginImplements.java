package com.alighthub.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.DaoInterface.LoginRepositry;
import com.alighthub.Model.Employee;
import com.alighthub.Model.Login;
import com.alighthub.ServiceInterface.LoginInterf;

@Service
public class LoginImplements implements LoginInterf {

	
	@Override
	public Login loginCheck() {
		
		System.out.println("helooo----");
		return null;
	}

	@Override
	public void addData(Employee e) {
		// TODO Auto-generated method stub
		
	}


}
