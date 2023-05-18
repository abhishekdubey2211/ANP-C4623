package example;
import example.model.*;
import example.dao.*;
public class App {
	public static void main(String[] args) {
		Question q1 = new Question();
		Question q2 = new Question();

		Answer a1 = new Answer();
		Answer a2 = new Answer();

		q1.setQuestion("What is Your fathers Name?");
		a1.setAmswer("My name is dinesh");
		
		q2.setQuestion("what is your qualifies ssc");
		a2.setAmswer("yes");
//		q1.setAnswer(a1);
//		q2.setAnswer(a2);
		
		
		QuestionDao q1dao = new QuestionDao();
		AnswerDao a1dao = new AnswerDao();
		q1dao.save(q1);
		q1dao.save(q2);
		a1dao.save(a2);
		a1dao.save(a1);
		q1dao.getById(2);

//		a1dao.save(a1);
	}
}
