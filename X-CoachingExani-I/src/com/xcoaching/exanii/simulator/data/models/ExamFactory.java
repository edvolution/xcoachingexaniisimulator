package com.xcoaching.exanii.simulator.data.models;

public class ExamFactory {
	

			
	public static Exam buildExam(ExamType examType){
		
		Exam exam = null;
		
		switch (examType) {
		case EXANI_I:
				return new ExaniiExam();
		default:
				return exam;	
		}
	}

}
