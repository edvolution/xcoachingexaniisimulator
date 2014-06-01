package com.xcoaching.exanii.simulator.data.contracts;

import android.provider.BaseColumns;



public class ExaniSimulatorUserContract {

	public ExaniSimulatorUserContract() {
		
	}
    public static abstract class ExanniSimulatorUser implements BaseColumns {
    	public static final String TABLE_NAME = "user";
        public static final String COLUMN_NAME_USER_ID = "userId";
        public static final String COLUMN_NAME_USER_NAME = "userName";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }


}
