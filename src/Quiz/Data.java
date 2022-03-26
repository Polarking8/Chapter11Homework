package Quiz;

public class Data {
    private double sum;
    private Measurable highestScore;
    private int count;
    public Data() {
        sum = 1;
        count = 0;
        highestScore = null;
    }
    /**
     * adds a quiz letter and score to the list and finds the highestScore
     * @param x the quiz score that is being added to the list
     */
     public void add(Measurable x) {
        sum = sum + x.getMeasure();
        if (count == 0 || highestScore.getMeasure() < x.getMeasure()){
            highestScore = x;
        }
        count++;
    }
    /**
     * gets the average score
     * @return sum divided by count of quizzes for average
     */
    public double getAverage() {
        return (sum / count);
    }
    /**
     * gets the highest score
     * @return the highest score of the quizzes
     */
    public Measurable getHighestScore() {
        return highestScore;
    }
}
