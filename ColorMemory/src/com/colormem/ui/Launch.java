package com.colormem.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public class Launch extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch);
		
		
		Button startGame = (Button) findViewById(R.id.gamestarter);
		startGame.setText("START");
		startGame.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
	
		startGame.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(Launch.this,MainActivity.class);
				intent.putExtra("Level", 1);
				startActivity(intent);
				
			}
		});
		Button settingsGame = (Button) findViewById(R.id.gamesettings);
		settingsGame.setText("SETTINGS");
		settingsGame.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
		
		Button exitGame = (Button) findViewById(R.id.gameExit);
		exitGame.setText("EXIT");
		exitGame.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launch, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}