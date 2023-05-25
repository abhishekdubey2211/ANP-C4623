package com.StudentManagement.entity;

import javax.persistence.*;



import lombok.*;


@Entity
@Table(name="studentdetail")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studentdetail 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="course")
	private String course;
	
	
}
