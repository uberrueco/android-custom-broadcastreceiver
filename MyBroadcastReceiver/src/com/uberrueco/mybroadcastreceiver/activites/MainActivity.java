package com.uberrueco.mybroadcastreceiver.activites;

import com.uberrueco.mybroadcastreceiver.R;
import com.uberrueco.mybroadcastreceiver.intentservices.MyIntentService;
import com.uberrueco.mybroadcastreceiver.receivers.MyBroadCastReceiver;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private MyBroadCastReceiver myRecevier = new MyBroadCastReceiver();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		
		switch (item.getItemId()){
			case R.id.send_broadcast:
				
				Intent intent = new Intent(this, MyIntentService.class);
				startService(intent);
				break;
			default:
				break;
		}
		return super.onMenuItemSelected(featureId, item);
	}
		
	@Override
	protected void onResume() {
		super.onResume();
		//Register the activity to the broadcast receiver
		registerReceiver(myRecevier, new IntentFilter(MyBroadCastReceiver.ACTION));
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		//Unregister the activity from the broadcast receiver. Good practice ;)
		unregisterReceiver(myRecevier);
	}

	
	
}
