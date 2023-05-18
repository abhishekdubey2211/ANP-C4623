package example.model;
import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int qid;
	
	@Column(name="question")
	private String question;
	
	@OneToOne   (cascade = CascadeType.ALL)
	@JoinColumn(name="ANS_id")
	private Answer answer;
}
