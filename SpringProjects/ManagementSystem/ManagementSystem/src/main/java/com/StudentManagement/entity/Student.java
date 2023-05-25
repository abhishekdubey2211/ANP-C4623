package com.StudentManagement.entity;

import javax.persistence.*;

//import com.StudentManagement.Repos.StudentRequest;


import lombok.*;



@Entity
@Table(name="tbstudent")
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="rollno")
	private int rollno;
	
	@OneToOne(targetEntity =Studentdetail.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Studentdetail studentdetail;
	
	
	
}

