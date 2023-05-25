package com.StudentManagement.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagement.entity.Student;

@Repository
public interface StudentRepos extends JpaRepository<Student,Long>
{

}
