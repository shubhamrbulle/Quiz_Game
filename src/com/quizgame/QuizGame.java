package com.quizgame;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
				
		        Scanner scanner = new Scanner(System.in);
		        int score = 0;

		        // Define your questions and answers
		        String[] questions = {
		            "What is the capital of India?",
		            "What is the official language of Maharashtra?",
		            "What was the name of India's first space mission?"
		        };

		        String[] options = {
		            "A) Mumbai B) New Delhi C) Kolkata",
		            "A) Hindi  B) English  C) Marathi",
		            "A) Chandrayaan-1 A) Chandrayaan-2  C) Aryabhata"
		        };

		        char[] answers = {'B', 'C', 'C'};

		        // Display and process each question
		        for (int i = 0; i < questions.length; i++) {
		            System.out.println("Question " + (i + 1) + ": " + questions[i]);
		            System.out.println(options[i]);
		            System.out.print("Your answer: ");
		            char userAnswer = scanner.next().toUpperCase().charAt(0);

		            if (userAnswer == answers[i]) {
		                System.out.println("Correct!\n");
		                score++;
		            } else {
		                System.out.println("Incorrect. The correct answer is " + answers[i] + ".\n");
		            }
		        }

		        // Display the final score
		        System.out.println("Quiz completed! Your score is: " + score + " out of " + questions.length);

		        scanner.close();
		    }
		}


