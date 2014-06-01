package com.xcoaching.exanii.simulator.activities;

import com.xcoaching.exanii.simulator.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExaniiSimulatorInstructionsActivity extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xcoaching_exanii_simulator_instructions);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.container, new InstructionsFragment()).commit();
		}
	}
	
	public void displayTestCover(View view) {
	    Intent intent = new Intent(this, ExaniiSimulatorTestCoverActivity.class);	    	    	    	     	   	    	    	    
	    startActivity(intent);	   
	}

	public static class InstructionsFragment extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_xcoaching_exanii_simulator_instructions, container,
					false);
			return rootView;
		}
	}

}
