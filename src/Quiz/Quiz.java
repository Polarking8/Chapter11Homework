package Quiz;

public class Quiz implements Measurable{
    private double score;
    private String grade;
    public Quiz(double score, String grade) {
        this.score = score;
        this.grade = grade;
    }

    /**
     * returns the score
     * @return the score of the grade - number
     */
    public double getScore() {
        return score;
    }
    /**
     * gets the letter grade
     * @return the letter grade being returned
     */
    public String getGrade(){
        return grade;
    }
    public double getMeasure() {
        return score;
    }
}

