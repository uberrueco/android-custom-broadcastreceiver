package com.uberrueco.mybroadcastreceiver.intentservices;

import com.uberrueco.mybroadcastreceiver.receivers.MyBroadCastReceiver;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService{

	public MyIntentService(){
		super("MyIntentService");
	}
	
	public MyIntentService(String name) {
		super(name);
	}

	@Override
	protected void onHandleIntent(Intent intent) {

		Log.d("MyIntentService", "handling intent...");
		
		//Intent created for broadcasting
		Intent intentBroadCast = new Intent();
		
		//Filter the broadcast to the action desired
		intentBroadCast.setAction(MyBroadCastReceiver.ACTION); 
		
		//Send the broadcast :D
		sendBroadcast(intentBroadCast);
	}
}
