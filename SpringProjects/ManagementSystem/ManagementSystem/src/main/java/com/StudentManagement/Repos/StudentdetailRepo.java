package com.StudentManagement.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagement.entity.Studentdetail;

@Repository
public interface StudentdetailRepo extends JpaRepository<Studentdetail,Long>
{

}
