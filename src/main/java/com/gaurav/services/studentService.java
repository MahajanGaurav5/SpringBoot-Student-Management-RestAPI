package com.gaurav.services;

import java.util.List;




import com.gaurav.entities.StudentEntity;

public interface studentService 
{

	public StudentEntity saveStudent(StudentEntity student);

    public void deleteStudent(Integer sid);
    public StudentEntity getStudent(Integer sid);
    public List<StudentEntity> getAllStudents();

	

}
