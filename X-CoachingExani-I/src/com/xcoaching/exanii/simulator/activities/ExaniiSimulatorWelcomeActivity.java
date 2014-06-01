package com.xcoaching.exanii.simulator.activities;

import com.xcoaching.exanii.simulator.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ExaniiSimulatorWelcomeActivity extends ActionBarActivity {
		

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xcoaching_exanii_simulator_launcher);			
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.container, new WelcomeFragment()).commit();
		}				
	}
	
	public void displayInstructions(View view) {
	    Intent intent = new Intent(this, ExaniiSimulatorInstructionsActivity.class);	    	    	    
	    startActivity(intent);
	}

	public static class WelcomeFragment extends Fragment {
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
			View welcomeView = inflater.inflate(R.layout.fragment_xcoaching_exanii_simulator, container, false);			
			return welcomeView;
		}		
	}	

}
