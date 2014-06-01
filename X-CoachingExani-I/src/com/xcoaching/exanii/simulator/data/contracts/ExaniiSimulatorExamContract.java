package com.xcoaching.exanii.simulator.data.contracts;

import android.provider.BaseColumns;

public class ExaniiSimulatorExamContract {
	
	public ExaniiSimulatorExamContract() {
		
	}
    public static abstract class ExaniiSimulatorExam implements BaseColumns {
    	public static final String TABLE_NAME = "exam";
    	public static final String COLUMN_NAME_EXAM_ID = "examId";
    	public static final String COLUMN_NAME_USER_ID = "userId";
    	public static final String COLUMN_NAME_RESULT_HV = "resultHv";
    	public static final String COLUMN_NAME_RESULT_HM = "resultHm";
    	public static final String COLUMN_NAME_RESULT_ESP = "resulEsp";
    	public static final String COLUMN_NAME_RESULT_HIS = "resulHis";
    	public static final String COLUMN_NAME_RESULT_GEO = "resulGeo";
    	public static final String COLUMN_NAME_RESULT_FCE = "resulFCE";
    	public static final String COLUMN_NAME_RESULT_MAT = "resulMat";
    	public static final String COLUMN_NAME_RESULT_FIS = "resulFis";
    	public static final String COLUMN_NAME_RESULT_QUI = "resulQui";
    	public static final String COLUMN_NAME_RESULT_BIO = "resulBio";
    }

}
