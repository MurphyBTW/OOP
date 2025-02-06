class Exam {
	protected String message;
	protected double price;
	protected boolean status;

	public Exam() {
		this.message = "Good luck!";
	}

	public Exam(String period, String level) {
		this.message = "Exam for " + period + " at level " + level;
	}

	public double getPrice() {
		return price;
	}

	public boolean isFinished() {
		return status;
	}
}

class Midterm extends Exam {
	public Midterm() {
		super();
		System.out.println("Midterm exam has started!");
	}
}

class Essay extends Exam {
	public Essay() {
		super("Spring", "Advanced");
		System.out.println("Essay exam details initialized.");
	}
}

class Quiz {
}

class EssayQuiz extends Quiz {
	public EssayQuiz() {
		System.out.println("Essay quiz created.");
	}
}

public class Main {
	public static void main(String[] args) {
		Midterm midterm = new Midterm();
		Essay essay = new Essay();
		EssayQuiz essayQuiz = new EssayQuiz();
	}
}