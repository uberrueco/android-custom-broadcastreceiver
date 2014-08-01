package com.uberrueco.mybroadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver{
	
	public static final String ACTION = "com.uberrueco.mybroadcastreceiver.receivers";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("MyBroadCastReceiver", "received");
		Toast.makeText(context,"Received", Toast.LENGTH_LONG).show();	
	}
}