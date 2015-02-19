package org.apache.cordova.core;

import android.app.Application;
import android.content.Context;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

import <%=app.id%>.MainActivity;

public class ParseApplication extends Application 
{
	private static ParseApplication instance = new ParseApplication();

	public ParseApplication() {
		instance = this;
	}

	public static Context getContext() {
		return instance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		// register device for parse
		Parse.initialize(this, "<%=app.parse.app_id%>", "<%=app.parse.client_key%>");
		PushService.setDefaultPushCallback(this, MainActivity.class);
		ParseInstallation.getCurrentInstallation().saveInBackground();
	}
}
