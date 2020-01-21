/*
* Stefanie Elling
* CSCI 221, HW 1 
*
* I certify that this is my individual work.
*
* This program has the user input a student's grades and calculates
* the student's semester score along with his or her letter grade.
* */

import java.util.Scanner;
public class HW1 {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int zyBooks, labs, programs, quizzes,
                test1, test2, test3, finalExam;
        double assignments;
        double testsAndQuizzes;
        double finalExamGrade;
        double semesterScore;
        System.out.println("This program calculates a student's grades and final score. " +
                "Please follow the prompts below and only enter whole numbers ranging from 0 to 100. ");
        System.out.println("Enter the student's Zybooks score: ");
        zyBooks = scnr.nextInt();
        System.out.println("Enter the student's Lab score: ");
        labs = scnr.nextInt();
        System.out.println("Enter the student's Programming assignments score: ");
        programs = scnr.nextInt();
        System.out.println("Enter the student's Quiz score: ");
        quizzes = scnr.nextInt();
        System.out.println("Enter the student's Test 1 score: ");
        test1 = scnr.nextInt();
        System.out.println("Enter the student's Test 2 score: ");
        test2 = scnr.nextInt();
        System.out.println("Enter the student's Test 3 score: ");
        test3 = scnr.nextInt();
        System.out.println("Enter the student's Final Exam score: ");
        finalExam = scnr.nextInt();

        if (test1 < test2 && test1 < test3 && test1 < finalExam) {
            test1 = finalExam;
            System.out.println(test1);
        }

        else if (test2 < test1 && test2 < test3 && test2 < finalExam) {
            test2 = finalExam;
            System.out.println(test2);
        }

        else {
            test3 = finalExam;
            System.out.println(test3);

        }
        System.out.println("After replacing the lowest test score with the final grade, your test scores are" + " " + test1 + " " +  test2 + " " + test3 + " " + finalExam);

        assignments = ((zyBooks + labs + programs) / 3) * 0.25;
        //System.out.println(assignments);

        testsAndQuizzes = ((quizzes + test1 + test2 + test3) / 4) * 0.50;
        //System.out.println(testsAndQuizzes);

        finalExamGrade = finalExam * 0.25;
        //System.out.println(finalExamGrade);

        semesterScore = assignments + testsAndQuizzes + finalExamGrade;
        if (semesterScore < 65) {
            System.out.print("Your semester score is " + semesterScore + " so you earned an F.");
        }
        else if (semesterScore >= 65 && semesterScore <= 69) {
            System.out.print("Your semester score is " + semesterScore + " so you earned a D.");
        }
        else if (semesterScore >= 70 && semesterScore <= 79) {
            System.out.print("Your semester score is " + semesterScore + " so you earned a C.");
        }
        else if (semesterScore >= 80 && semesterScore <= 89) {
            System.out.print("Your semester score is " + semesterScore + " so you earned B.");
        }
        else {
            System.out.print("Your semester score is " + semesterScore + " so you earned A. Congrats!");
        }
    }
}
