package com.example.clase_camara;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//dibujo d = new dibujo(this, null);
		//setContentView(d);
		multidibujo md = new multidibujo(this, null);
		setContentView(md);
	}	
}
