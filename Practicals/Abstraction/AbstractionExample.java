package corejava;

public abstract class  AbstractionExample {

	//fields
	private int id;
	private String name;
	private String address;
	//creating parameterized constructor
	public AbstractionExample(int id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//create a method
	public void mailCheck() {
		System.out.println("my name is abhishek");
	}
	
	@Override
	public String toString() {
		return "AbstractionExample [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
		//create getters and setters of Id,name,address 
		public int getId() {
			return id;
		}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}