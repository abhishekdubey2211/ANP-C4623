package corejava;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		
		a.setId(7);
		a.setName("Abhishek");
		a.setAge(14);
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName()+"\n"+"Age"+a.getAge());
	}

}
