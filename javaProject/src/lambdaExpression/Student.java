package lambdaExpression;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;

	private int score;
	private String sex;

	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public int getScore() {
		return score;
	}

	public String getSex() {
		return sex;
	}
	


}
