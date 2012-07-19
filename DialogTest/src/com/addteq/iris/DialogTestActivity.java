package com.addteq.iris;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DialogTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button openDialog = (Button)findViewById(R.id.button1);
        
		openDialog.setOnClickListener(odListener);
    }
    
    OnClickListener odListener = new OnClickListener() {

		public void onClick(View v) {
			//First Dialog
			final Dialog fdialog = new Dialog(DialogTestActivity.this);
			fdialog.setContentView(R.layout.fdialog);
			
			Button dpicker = (Button)fdialog.findViewById(R.id.dpicker);
			Button dismiss = (Button)fdialog.findViewById(R.id.dismiss);
			
			dismiss.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {
					fdialog.dismiss();
					
				}
				
			});
			
			dpicker.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {
					fdialog.dismiss();
					//Second Dialog
					final Dialog ddialog = new Dialog(DialogTestActivity.this);
					ddialog.setContentView(R.layout.datepicker);
					Button okb = (Button)ddialog.findViewById(R.id.ok);
					okb.setOnClickListener(new OnClickListener() {

						public void onClick(View arg0) {
							ddialog.dismiss();
							
						}
						
					});
					ddialog.show();
				}
				
			});
			fdialog.show();
		}
    	
    };
    
}