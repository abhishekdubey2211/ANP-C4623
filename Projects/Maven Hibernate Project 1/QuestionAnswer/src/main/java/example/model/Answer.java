package example.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="answer")
public class Answer {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int aid;
	
	@Column(name="answer")
	private String amswer;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="answer")
	@JoinColumn(name="Question_id")
	private Question question;
}
