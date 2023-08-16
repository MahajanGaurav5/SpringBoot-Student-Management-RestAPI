package com.gaurav.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaurav.Repo.studentRepo;
import com.gaurav.entities.StudentEntity;

@Service
public class StudentServiceImp implements studentService 
{
	private studentRepo studentRepo;

	@Override
	public StudentEntity saveStudent(StudentEntity student) {
		StudentEntity se=studentRepo.save(student);
		return se;
	}

	@Override
	public void deleteStudent(Integer sid) {
		studentRepo.deleteById(sid);
		
	}

	@Override
	public StudentEntity getStudent(Integer sid) {
		StudentEntity se1=studentRepo.findById(sid).get();
		return se1;
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		List<StudentEntity> stlist=(List<StudentEntity>) studentRepo.findAll();
		return stlist;
	}

	

}
