package institutes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="teacher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=3, unique = true ,name="Teacher_id")
		private int teacherid;
	
	@Column(nullable = false , name="Teacher_First_name")
		private String Tfname;
	
	@Column(nullable = false , name="Teacher_Last_Name")
		private String Tlname;
	
	 @Column(nullable = false, unique = true, length = 50,name="subject")
	    private String subject;
}
