package com.alighthub.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alighthub.Model.Employee;
import com.alighthub.Model.Login;

@Repository
public interface LoginRepositry  {
	
	public Login loginCheck();
	
	//public void addData(Employee e);

}
