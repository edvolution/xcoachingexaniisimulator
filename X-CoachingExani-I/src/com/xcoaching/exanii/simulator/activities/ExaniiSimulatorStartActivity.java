package com.xcoaching.exanii.simulator.activities;

import org.apache.commons.codec.digest.DigestUtils;

import com.xcoaching.exanii.simulator.R;
import com.xcoaching.exanii.simulator.data.contracts.ExaniSimulatorUserContract;
import com.xcoaching.exanii.simulator.data.contracts.ExaniSimulatorUserContract.ExaniiSimulatorUser;
import com.xcoaching.exanii.simulator.data.helpers.ExaniiSimulatorDBOpenHelper;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExaniiSimulatorStartActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xcoaching_exanii_simulator_start);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.container, new StartScreenFragment()).commit();
		}
		
		
	    Intent intent = getIntent();
	    String userName = intent.getStringExtra(ExaniiSimulatorTestCoverActivity.USR);
	    String hashedPassword = DigestUtils.md5Hex(intent.getStringExtra(ExaniiSimulatorTestCoverActivity.PWD));
	    		
	    ExaniiSimulatorDBOpenHelper exaniiSimulatorDBOpenHelper = new ExaniiSimulatorDBOpenHelper(this);
	    SQLiteDatabase db = exaniiSimulatorDBOpenHelper.getReadableDatabase();	   
	    String[] userProjection = {ExaniiSimulatorUser.COLUMN_NAME_USER_ID, ExaniiSimulatorUser.COLUMN_NAME_USER_NAME, ExaniiSimulatorUser.COLUMN_NAME_PASSWORD};
	    
	    
	}

	public static class StartScreenFragment extends Fragment {

		public StartScreenFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_xcoaching_exanii_simulator_start,container, false);
			return rootView;
		}
	}

}
