package com.xcoaching.exanii.simulator.data.helpers;

import com.xcoaching.exanii.simulator.data.contracts.ExaniSimulatorUserContract.ExanniSimulatorUser;
import com.xcoaching.exanii.simulator.data.contracts.ExaniiSimulatorExamContract.ExaniiSimulatorExam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ExaniiSimulatorDBOpenHelper extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "xcoachingExaniiSimulatorDB.db";
	
	
	private static final String PRIMARY_KEY_AUTOINCREMENT = " PRIMARY KEY AUTOINCREMENT";
	private static final String FOREIGN_KEY = " FOREIGN KEY";
	private static final String TEXT_TYPE = " TEXT";
	private static final String INTEGER_TYPE = " INTEGER";
	private static final String COMMA_SEP = ",";
	


	private static final String SQL_CREATE_USER_TABLE = 
			"CREATE TABLE " + ExanniSimulatorUser.TABLE_NAME + " (" 
            + ExanniSimulatorUser.COLUMN_NAME_USER_ID +  INTEGER_TYPE + PRIMARY_KEY_AUTOINCREMENT + COMMA_SEP 
            + ExanniSimulatorUser.COLUMN_NAME_USER_NAME + TEXT_TYPE + COMMA_SEP
			+ ExanniSimulatorUser.COLUMN_NAME_PASSWORD + TEXT_TYPE + ");";
	
	private static final String SQL_CREATE_EXAM_TABLE = 
			"CREATE TABLE " + ExaniiSimulatorExam.TABLE_NAME + "(" 
			+ ExaniiSimulatorExam.COLUMN_NAME_EXAM_ID    +  INTEGER_TYPE + PRIMARY_KEY_AUTOINCREMENT + COMMA_SEP
			+ ExaniiSimulatorExam.COLUMN_NAME_USER_ID    + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_HV  + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_HM  + INTEGER_TYPE + COMMA_SEP  
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_ESP + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_HIS + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_GEO + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_FCE + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_MAT + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_FIS + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_QUI + INTEGER_TYPE + COMMA_SEP 
			+ ExaniiSimulatorExam.COLUMN_NAME_RESULT_BIO + INTEGER_TYPE + COMMA_SEP  			
			+ FOREIGN_KEY + "(" + ExaniiSimulatorExam.COLUMN_NAME_USER_ID 
			+ ") REFERENCES " + ExanniSimulatorUser.TABLE_NAME + " ( " + ExanniSimulatorUser.COLUMN_NAME_USER_ID + ")"			
		    + ");";					
			
    public ExaniiSimulatorDBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(SQL_CREATE_USER_TABLE);
		db.execSQL(SQL_CREATE_EXAM_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {		
		
	}

}

