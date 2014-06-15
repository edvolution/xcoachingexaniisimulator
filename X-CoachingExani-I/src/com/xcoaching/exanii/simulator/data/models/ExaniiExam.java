package com.xcoaching.exanii.simulator.data.models;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ExaniiExam {
	
	public ExaniiExamSubjectType examSubject = null;
	public Question[] questions;
	protected static String QUESTIONS_POOL_FILE_EXTENSION = ".txt";
	
	public ExaniiExam(ExaniiExamSubjectType examSubject, int numberOfQuestions){
		this.examSubject = examSubject;	    
		this.questions = new Question[numberOfQuestions];
	}
	
	public void generateQuestionsArray(){		
		ClassLoader currentClassLoader = this.getClass().getClassLoader();
		InputStream questionsPoolFile = currentClassLoader.getResourceAsStream("questionsPool/" + examSubject + QUESTIONS_POOL_FILE_EXTENSION);
		Scanner scannerForQuestionsPoolFile = new Scanner(questionsPoolFile);
		scannerForQuestionsPoolFile.useDelimiter(System.getProperty("line.separator"));		
		int index = 1;
		while (scannerForQuestionsPoolFile.hasNext()) {
			questions[index] = parseQuestionPoolFileCSVLine(scannerForQuestionsPoolFile.next());
			index++;
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
        boolean isQuestionImage = scannerForCSVLine.nextBoolean();
        boolean isQuestionText = scannerForCSVLine.nextBoolean();
        boolean isAnswerImage = scannerForCSVLine.nextBoolean();
        String correctAnswer = scannerForCSVLine.next();  
        scannerForCSVLine.close();       
        return new Question(questionNumber, this.examSubject.name(), isQuestionImage, isQuestionText, isAnswerImage, correctAnswer.charAt(0));
   }
	
}
