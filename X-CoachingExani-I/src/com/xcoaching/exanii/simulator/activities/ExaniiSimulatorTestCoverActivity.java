package com.xcoaching.exanii.simulator.activities;

import com.xcoaching.exanii.simulator.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class ExaniiSimulatorTestCoverActivity extends ActionBarActivity {
	 
	public final static String APPLICANT_NAME = "com.xcoaching.exanii.simulator.APPLICANT_NAME";
	public final static String APPLICANT_ID = "com.xcoaching.exanii.simulator.APPLICANT_ID";
	public final static String USR = "com.xcoaching.exanii.simulator.USR";
	public final static String PWD = "com.xcoaching.exanii.simulator.PWD";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xcoaching_exanii_simulator_test_cover);
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
		
	}
	
	public void displayTestActivity(View view) {
	 	   
		 	Intent intent = new Intent(this, ExaniiSimulatorTestActivity.class);
		    EditText applicantName = (EditText) findViewById(R.id.exanii_simulator_test_cover_applicant_name_input);
		    EditText applicantId = (EditText) findViewById(R.id.exanii_simulator_test_cover_applicant_id_input);
		    EditText usr = (EditText) findViewById(R.id.exanii_simulator_test_cover_applicant_user_input);
		    EditText pwd = (EditText) findViewById(R.id.exanii_simulator_test_cover_applicant_pwd_input);
		    
		    intent.putExtra(APPLICANT_NAME, applicantName.getText().toString());
		    intent.putExtra(APPLICANT_ID, applicantId.getText().toString());
		    intent.putExtra(USR, usr.getText().toString());
		    intent.putExtra(PWD, pwd.getText().toString());
		    
		    startActivity(intent);	   
	}
	


	public static class PlaceholderFragment extends Fragment {

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_xcoaching_exanii_simulator_test_cover, container, false);
			return rootView;
		}
	}

}
