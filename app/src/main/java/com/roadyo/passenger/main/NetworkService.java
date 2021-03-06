package com.roadyo.passenger.main;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class NetworkService {
	
	public static int TYPE_WIFI = 1;
	public static int TYPE_MOBILE = 2;
	public static int TYPE_NOT_CONNECTED = 0;
	
	
	public static int getConnectivityStatus(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);

		NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
		if (null != activeNetwork) {
			if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
				return TYPE_WIFI;
			
			if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
				return TYPE_MOBILE;
		} 
		return TYPE_NOT_CONNECTED;
	}
	
	public static String getConnectivityStatusString(Context context) {
		int conn = NetworkService.getConnectivityStatus(context);
		String status = null;
		if(conn == NetworkService.TYPE_WIFI) {
			status = "Wifi enabled,1";
		} 
		else if (conn == NetworkService.TYPE_MOBILE){
			status = "Mobile data enabled,1";
		} 
		else if (conn == NetworkService.TYPE_NOT_CONNECTED)
		{
			status = "Not connected to Internet,0";
		}
		else 
		{
			status = "Not connected to Internet,0";
		}
		return status;
	}
}
