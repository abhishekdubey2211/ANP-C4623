package bloodbank.model;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="bloodbank")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloodbank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name="Blood_Doner_Name")   //dont give spaces use _ 
	private String name;
	
	@Column(name="Blood_Group")
	private String bldgroup;
	
	@Column(name="Doner_Contact")
	private long contact;

	
}
