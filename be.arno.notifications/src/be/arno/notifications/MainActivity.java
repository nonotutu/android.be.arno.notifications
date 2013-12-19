package be.arno.notifications;

import java.util.Calendar;

import be.arno.notifications.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	// fonctionne sur le principe des Intent Service
	
		
	// TODO : builder
	NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
	
	Notification notif = new Notification(R.drawable.ic_launcher, "Message", System.currentTimeMillis());
	
	notif.vibrate = new long[]{ 1000, 2000, 1000 };
	
	PendingIntent pi = PendingIntent.getActivity(this, 0, new Intent (this, MainActivity.class), 0);
	//notif.flags |= Notification.FLAG_NO_CLEAR;
	notif.setLatestEventInfo(getApplicationContext(), "titre", "texte", pi);
	nm.notify(200,notif);
	
	
	

	}
}