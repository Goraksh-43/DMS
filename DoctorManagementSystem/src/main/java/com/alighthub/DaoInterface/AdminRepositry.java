package com.alighthub.DaoInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alighthub.Model.Admin;



@Repository
public interface AdminRepositry  extends JpaRepository<Admin, Integer>{

	
}

