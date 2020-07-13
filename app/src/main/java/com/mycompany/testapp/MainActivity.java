package com.mycompany.testapp;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	private EditText input;
	private Button send;
	private TextView show;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		input = (EditText)findViewById(R.id.input);
		send = (Button)findViewById(R.id.send);
		show = (TextView)findViewById(R.id.show);
    }

   
}
