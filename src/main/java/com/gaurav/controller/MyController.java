package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.entities.StudentEntity;
import com.gaurav.services.StudentServiceImp;

@RestController
public class MyController 
{
	@Autowired
	private StudentServiceImp service;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentEntity student)
	{
		StudentEntity std= service.saveStudent(student);
        String message = null;
        if(std!=null)
            message = "Student details Successfully saved";
        else
            message ="Student details not saved";
        
        return message;
        
	}
        @GetMapping("/get/{sid}")
	    public StudentEntity getStudent(@PathVariable Integer sid)
	        {
        	StudentEntity se2 = service.getStudent(sid);

	            return  se2;
	        }

	        @DeleteMapping("/delete/{sid}")
	      public void deleteStudent(@PathVariable  Integer sid)
	        {
	                service.deleteStudent(sid);

	        };
	        
	        @GetMapping("/getAll")
	        public  List<StudentEntity> getAll(){
	        	List<StudentEntity> emp3 = service.getAllStudents();
	        			return emp3;
	        }

	}
	
	


