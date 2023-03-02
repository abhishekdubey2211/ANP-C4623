package corejava;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object of class Student
		Student a = new Student();
		//student() ia an constructor
		// object is used to access methods of a class
		a.setId(1	);
		a.setName("Abhishek");
		a.setAge(14);
		System.out.println("Student Id:"+a.getId()+"\n"+"Student Name:"+a.getName()+"\n"+"Student Age :"+a.getAge());
	}

}
