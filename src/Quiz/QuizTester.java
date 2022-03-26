package Quiz;

import java.util.Scanner;

public class QuizTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data studentsData = new Data();
        String choice = "0";
        do{
        System.out.println("Enter a score: ");
        int score = in.nextInt();
        System.out.println("Enter a letter grade: ");
        String grade = in.next();
        System.out.println("Press 1 to end or anything else to continue entering grades");
        choice = in.next();
        Quiz quizzes = new Quiz(score,grade);
        studentsData.add((Measurable) quizzes);
        } while(!choice.toString().equals("1"));
        Measurable max = studentsData.getHighestScore();
        System.out.println("The highest grade/score is: " + studentsData.getHighestScore().getMeasure());
        System.out.println("The average is: " + studentsData.getAverage());
    }

}
//Implement a class Quiz that implements the Measurable interface.
// A quiz has a score and a letter grade (such as B+).
// Use the Data class we worked on in class to process an array of quizzes.
// Display the average score and the quiz with the highest score (both letter grade and score).
// Create a tester which allows a user to enter grades.
// All I/O should happen in the tester class.
//Include a UML diagram, javadoc, a junit test.  All diagrams need to be in your project.
