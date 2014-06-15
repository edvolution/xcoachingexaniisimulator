package com.xcoaching.exanii.simulator.data.models;

public class ExaniiExamFactory {
	
	private final static int HV_AND_HM_NUMBER_OF_QUESTIONS = 16;
	private final static int OTHER_SUBJECTS_NUMBER_OF_QUESTIONS = 12;
			
	public static ExaniiExam buildExam(ExaniiExamSubjectType subject){
		
		ExaniiExam exaniiExam = null;
		
		switch (subject) {
		case HV:
			return new ExaniiExam(ExaniiExamSubjectType.HV, HV_AND_HM_NUMBER_OF_QUESTIONS);
		case ESP:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.ESP, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		case HIS:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.HIS, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		case GEO:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.GEO, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		case FCE:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.FCE, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		case HM:			
			return new ExaniiExam(ExaniiExamSubjectType.HM, HV_AND_HM_NUMBER_OF_QUESTIONS);
		case MAT:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.MAT, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		case FIS:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.FIS, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		case QUI:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.QUI, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		case BIO:			
			return exaniiExam = new ExaniiExam(ExaniiExamSubjectType.BIO, OTHER_SUBJECTS_NUMBER_OF_QUESTIONS);
		}
		return exaniiExam;
	}

}
