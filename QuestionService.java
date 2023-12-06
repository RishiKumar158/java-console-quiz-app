import java.util.Scanner;

public class QuestionService {
	
	Question[] questions = new Question[5];
	String[] selections = new String[5];

	public QuestionService() {
		questions[0] = new Question(1, "size of int", new String[] {"2", "4", "6", "8"}, "4");
		questions[1] = new Question(2, "size of double", new String[] {"2", "4", "6", "8"}, "8");
		questions[2] = new Question(3, "size of char", new String[] {"2", "4", "6", "8"}, "2");
		questions[3] = new Question(4, "size of long", new String[] {"2", "4", "6", "8"}, "8");
		questions[4] = new Question(5, "size of boolean", new String[] {"1", "2", "4", "8"}, "1");
	}

	public void playQuiz() {
		int i = 0;
		for(Question question: questions){
			System.out.println(question.getQuestion());
			for(String option: question.getOptions()) {
				System.out.println(option);
			}
			Scanner sc = new Scanner(System.in);
			selections[i++] = sc.nextLine();
		}
		for(String selection: selections) {
			System.out.println(selection);
		}
	}

	public void printScore() {
		int score = 0;

		for(int i = 0; i < questions.length; i++) {
			Question question = questions[i];
			String actualAnswer = question.getAnswer();
			String userSelectedAnswer = selections[i];
			if(actualAnswer.equals(userSelectedAnswer)) {
				score++;
			}
		}
		System.out.println("Your score is "+ score);
	}
} 