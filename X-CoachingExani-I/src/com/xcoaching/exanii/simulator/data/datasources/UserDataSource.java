package com.xcoaching.exanii.simulator.data.datasources;

import org.apache.commons.codec.digest.DigestUtils;

import com.xcoaching.exanii.simulator.activities.ExaniiSimulatorTestCoverActivity;
import com.xcoaching.exanii.simulator.data.contracts.ExaniSimulatorUserContract.ExaniiSimulatorUser;
import com.xcoaching.exanii.simulator.data.helpers.ExaniiSimulatorDBOpenHelper;
import com.xcoaching.exanii.simulator.data.models.TestTaker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class UserDataSource {
	
	// Database fields
	  private SQLiteDatabase database;
	  private ExaniiSimulatorDBOpenHelper exaniiSimulatorDBOpenHelper;
	  private String[] allUserColumns = { ExaniiSimulatorUser.COLUMN_NAME_USER_ID, ExaniiSimulatorUser.COLUMN_NAME_USER_NAME, ExaniiSimulatorUser.COLUMN_NAME_PASSWORD};
	  
	  public UserDataSource(Context context) {
		  exaniiSimulatorDBOpenHelper = new ExaniiSimulatorDBOpenHelper(context);
	  }

	  public void open() throws SQLException {
	    database = exaniiSimulatorDBOpenHelper.getWritableDatabase();
	  }

	  public void close() {
		  exaniiSimulatorDBOpenHelper.close();
	  }

	  public long createUser(String userName, String password) {		  		 
		  ContentValues values = new ContentValues();
		  values.put(ExaniiSimulatorUser.COLUMN_NAME_USER_NAME, userName);		  
		  values.put(ExaniiSimulatorUser.COLUMN_NAME_USER_NAME, DigestUtils.md5Hex(password));
		  long newUserPK = database.insert(ExaniiSimulatorUser.TABLE_NAME,  null, values);
		  return newUserPK;
	  }


	  public TestTaker getUsers(String userName) {
	    /*List<Comment> comments = new ArrayList<Comment>();

	    Cursor cursor = database.query(MySQLiteHelper.TABLE_COMMENTS,
	        allColumns, null, null, null, null, null);

	    cursor.moveToFirst();
	    while (!cursor.isAfterLast()) {
	      Comment comment = cursorToComment(cursor);
	      comments.add(comment);
	      cursor.moveToNext();
	    }
	    // make sure to close the cursor
	    cursor.close();
	    return comments;*/
		  return null;
	  }

	  private TestTaker cursorToUser(Cursor cursor) {
		TestTaker user = new TestTaker();
	    user.setUserId(cursor.getLong(0));
	    user.setUserName(cursor.getString(1));
	    user.setPassword(cursor.getString(1));
	    return user;
	  }

}
