package example;
import example.model.*;
import example.dao.*;
public class App {
	public static void main(String[] args) {
		Question q1 = new Question();
		Question q2 = new Question();

		Answer a1 = new Answer();
		Answer a2 = new Answer();

		q1.setQuestion("What is Your Name?");
		a1.setAmswer("My name is Abhishek");
		
		q2.setQuestion("what is your age");
		a2.setAmswer("my age 22");
		q1.setAnswer(a1);
		q2.setAnswer(a2);
		
		QuestionDao q1dao = new QuestionDao();
		AnswerDao a1dao = new AnswerDao();
		q1dao.save(q1);
		q1dao.save(q2);

//		a1dao.save(a1);
	}
}
