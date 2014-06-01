package com.xcoaching.exanii.simulator.data.datasources;

import com.xcoaching.exanii.simulator.data.contracts.ExaniSimulatorUserContract.ExanniSimulatorUser;
import com.xcoaching.exanii.simulator.data.helpers.ExaniiSimulatorDBOpenHelper;
import com.xcoaching.exanii.simulator.data.models.User;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class UserDataSource {
	
	// Database fields
	  private SQLiteDatabase database;
	  private ExaniiSimulatorDBOpenHelper exaniiSimulatorDBOpenHelper;
	  private String[] allUserColumns = { ExanniSimulatorUser.COLUMN_NAME_USER_ID, ExanniSimulatorUser.COLUMN_NAME_USER_NAME, ExanniSimulatorUser.COLUMN_NAME_PASSWORD};
	  
	  public UserDataSource(Context context) {
		  exaniiSimulatorDBOpenHelper = new ExaniiSimulatorDBOpenHelper(context);
	  }

	  public void open() throws SQLException {
	    database = exaniiSimulatorDBOpenHelper.getWritableDatabase();
	  }

	  public void close() {
		  exaniiSimulatorDBOpenHelper.close();
	  }

	  public User createUser(String userName, String password) {
	    /*ContentValues values = new ContentValues();
	    values.put(MySQLiteHelper.COLUMN_COMMENT, comment);
	    long insertId = database.insert(MySQLiteHelper.TABLE_COMMENTS, null,
	        values);
	    Cursor cursor = database.query(MySQLiteHelper.TABLE_COMMENTS,
	        allColumns, MySQLiteHelper.COLUMN_ID + " = " + insertId, null,
	        null, null, null);
	    cursor.moveToFirst();
	    Comment newComment = cursorToComment(cursor);
	    cursor.close();
	    return newComment;*/
		  return null;
	  }


	  public User getUsers(String userName) {
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

	  private User cursorToUser(Cursor cursor) {
		User user = new User();
	    user.setUserId(cursor.getLong(0));
	    user.setUserName(cursor.getString(1));
	    user.setPassword(cursor.getString(1));
	    return user;
	  }

}
