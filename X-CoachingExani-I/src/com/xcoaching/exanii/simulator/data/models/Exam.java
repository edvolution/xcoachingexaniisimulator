package com.xcoaching.exanii.simulator.data.models;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public abstract class Exam {
		
	protected Question[] questions;
	protected final String QUESTIONS_POOL_FILE_EXTENSION = ".txt";	
	
	public void generateQuestionsArray(String questionsPoolFileWithPath, int numberOfQuestions){		
		questions = new Question[numberOfQuestions];
		ClassLoader currentClassLoader = this.getClass().getClassLoader();
		InputStream questionsPoolFile = currentClassLoader.getResourceAsStream(questionsPoolFileWithPath + QUESTIONS_POOL_FILE_EXTENSION);
		Scanner scannerForQuestionsPoolFile = new Scanner(questionsPoolFile);
		scannerForQuestionsPoolFile.useDelimiter(System.getProperty("line.separator"));		
		int index = 1;
		while (scannerForQuestionsPoolFile.hasNext()) {
			if(index <= numberOfQuestions - 1){
				questions[index] = parseQuestionPoolFileCSVLine(scannerForQuestionsPoolFile.next());
				index++;	
			} else {
				break;
			}			
		}	
		try {
			questionsPoolFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scannerForQuestionsPoolFile.close();
		}					
	}
	
	protected Question parseQuestionPoolFileCSVLine(String line) {
        Scanner scannerForCSVLine = new Scanner(line);
        scannerForCSVLine.useDelimiter("\\s*,\\s*");        
        int questionNumber = scannerForCSVLine.nextInt(); 
        String questionSubject = scannerForCSVLine.next();
        boolean isQuestionImage = scannerForCSVLine.nextBoolean();
        boolean isQuestionText = scannerForCSVLine.nextBoolean();
        boolean isAnswerImage = scannerForCSVLine.nextBoolean();
        String correctAnswer = scannerForCSVLine.next();  
        scannerForCSVLine.close();       
        return new Question(questionNumber, questionSubject, isQuestionImage, isQuestionText, isAnswerImage, correctAnswer.charAt(0));
   }

}
