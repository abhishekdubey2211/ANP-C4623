package bloodbank.main;
import bloodbank.dao.*;
import bloodbank.model.*;

public class App {

	public static void main(String[] args) 
	{
		bloodbankDao dao = new bloodbankDao();	    
	    // Create a new bloodbank entity
	    Bloodbank bloodbank = new Bloodbank();
	    bloodbank.setName("pradeep");
	    bloodbank.setBldgroup("A+");;
	    bloodbank.setContact(54788652);
	    dao.save(bloodbank);
	    
	    bloodbank.setName("Sandeeep");
	    dao.update(bloodbank);
	    
	    dao.delete(2);

	}

}
