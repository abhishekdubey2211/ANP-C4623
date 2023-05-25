package com.onetoone;
import com.onetoone.entity.*;
import com.onetoone.dao.*;
public class App 
{
    public static void main( String[] args )
    {
    	 Instructor instructor = new Instructor();
    	 instructor.setFirstName("Shiva");
    	 instructor.setLastName("P");
    	 instructor.setEmail("shiva@gmail.com");
    	 
    	 InstructorDao instructorDao = new InstructorDao();
         instructorDao.saveInstructor(instructor);
         
         InstructorDetail instructorDetail = new InstructorDetail();
         instructorDetail.setYoutubeChannel("shivarock.youtube");
         instructorDetail.setHobby("Playing Football");
         instructor.setInstructorDetail(instructorDetail);
         
         InstructorDetailDao instructordetaildao = new InstructorDetailDao();
         instructordetaildao.saveInstructorDetail(instructorDetail);
    
    }
}
