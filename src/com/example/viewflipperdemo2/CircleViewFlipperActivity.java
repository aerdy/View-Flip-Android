package com.example.viewflipperdemo2;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

import adapter.ImageAdapter;
import widget.CircleFlowIndicator;
import widget.ViewFlow;

public class CircleViewFlipperActivity extends Activity {

	private ViewFlow viewFlow;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(R.string.circle_title);
		setContentView(R.layout.circle_layout);

		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
		viewFlow.setAdapter(new ImageAdapter(this), 5);
		CircleFlowIndicator indic = (CircleFlowIndicator) findViewById(R.id.viewflowindic);
		viewFlow.setFlowIndicator(indic);
	
	}

}