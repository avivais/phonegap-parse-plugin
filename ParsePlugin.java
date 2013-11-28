package org.apache.cordova.core;

import java.util.Set;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import com.parse.ParseInstallation;
import com.parse.PushService;

public class ParsePlugin extends CordovaPlugin {
	public static final String ACTION_GET_INSTALLATION_ID = "getInstallationId";
	public static final String ACTION_GET_INSTALLATION_OBJECT_ID = "getInstallationObjectId";
	//public static final String ACTION_GET_SUBSCRIPTIONS = "getSubscriptions";
	//public static final String ACTION_SUBSCRIBE = "subscribe";
	//public static final String ACTION_UNSUBSCRIBE = "unsubscribe";
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals(ACTION_GET_INSTALLATION_ID)) {
			this.getInstallationId(callbackContext);
			return true;
		}

		if (action.equals(ACTION_GET_INSTALLATION_OBJECT_ID)) {
			this.getInstallationObjectId(callbackContext);
			return true;
		}
		//if (action.equals(ACTION_GET_SUBSCRIPTIONS)) {
			//this.getSubscriptions(callbackContext);
			//return true;
		//}
		//if (action.equals(ACTION_SUBSCRIBE)) {
			//this.subscribe(args.getString(0), callbackContext);
			//return true;
		//}
		//if (action.equals(ACTION_UNSUBSCRIBE)) {
			//this.unsubscribe(args.getString(0), callbackContext);
			//return true;
		//}
		return false;
	}
	
	private void getInstallationId(final CallbackContext callbackContext) {
		cordova.getThreadPool().execute(new Runnable() {
		    public void run() {
				String installationId = ParseInstallation.getCurrentInstallation().getInstallationId();
				callbackContext.success(installationId);
		    }
		});
	}

	private void getInstallationObjectId(final CallbackContext callbackContext) {
		cordova.getThreadPool().execute(new Runnable() {
		    public void run() {
				String objectId = ParseInstallation.getCurrentInstallation().getObjectId();
				callbackContext.success(objectId);
		    }
		});
	}
	
	//private void getSubscriptions(final CallbackContext callbackContext) {
		//cordova.getThreadPool().execute(new Runnable() {
			//public void run() {
				 //Set<String> subscriptions = PushService.getSubscriptions(MainApplication.getContext());
				 //callbackContext.success(subscriptions.toString());
			//}
		//});		
	//}
	
	//private void subscribe(final String channel, final CallbackContext callbackContext) {
		//cordova.getThreadPool().execute(new Runnable() {
			//public void run() {
				//PushService.subscribe(MainApplication.getContext(), channel, MainActivity.class);
				//callbackContext.success();
			//}
		//});
	//}
	
	//private void unsubscribe(final String channel, final CallbackContext callbackContext) {
		//cordova.getThreadPool().execute(new Runnable() {
			//public void run() {
				//PushService.unsubscribe(MainApplication.getContext(), channel);
				//callbackContext.success();
			//}
		//});
	//}

}

