package com.alighthub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/emp")
public class HomeController {
	/*
	 * @Autowired private AdminService ad;
	 * 
	 * @PostMapping("/add") public String addData(Admin a) { ad.insertData(a);
	 * return "Data Inserted";
	 * 
	 * }
	 */
}
