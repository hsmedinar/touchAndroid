package com.example.clase_camara;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class dibujo extends View {
	
	Paint pintura = new Paint();
	Path trazo = new Path();

	public dibujo(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		
		pintura.setAntiAlias(true);
		pintura.setStrokeWidth(6f);
		pintura.setColor(Color.BLACK);
		pintura.setStyle(Paint.Style.STROKE);
		pintura.setStrokeJoin(Paint.Join.ROUND);
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		canvas.drawPath(trazo, pintura);
		
	}
	
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		float valor_x = event.getX();
		float valor_y = event.getY();
				
		switch(event.getAction()){
			case MotionEvent.ACTION_DOWN:
				Log.i("down", "llego");
				trazo.moveTo(valor_x, valor_y);
				//trazo.addCircle(valor_x, valor_y, 50, Path.Direction.CW);		
				return true;
			case MotionEvent.ACTION_MOVE:
				Log.i("move", "llego");
				trazo.lineTo(valor_x, valor_y);						
				break;
			case MotionEvent.ACTION_UP:
				Log.i("up", "llego");
				trazo.reset();
				break;
			default:
				return false;
		}
		
		Log.i("inavlidate", "llego");
		invalidate();
		
		return true;
	}

}
