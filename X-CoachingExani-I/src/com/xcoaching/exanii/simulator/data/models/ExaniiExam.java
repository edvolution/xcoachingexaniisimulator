package com.xcoaching.exanii.simulator.data.models;

public class ExaniiExam extends Exam{
	
	private final int HV_AND_HM_NUMBER_OF_QUESTIONS = 16;
	private final int OTHER_SUBJECTS_NUMBER_OF_QUESTIONS = 12;
	private final int EXANI_I_NUMBER_OF_QUESTIONS = 128;
	private final String QUESTIONS_POOL_FILE =  "questionsPool/exaniI";
	
	
	public ExaniiExam(){  
		generateQuestionsArray(QUESTIONS_POOL_FILE, EXANI_I_NUMBER_OF_QUESTIONS);		
	}
	
	
}
