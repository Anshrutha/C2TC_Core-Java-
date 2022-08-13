package com.cg.jpacrud.dao;
import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
public interface StudentDao {
public abstract Student getStudentById(int id);
public abstract void addStudent(Student student);
public abstract void removeStudent(Student student);
public abstract void updateStudent(Student student);
public abstract void commitTransaction();
public abstract void beginTransaction();
}