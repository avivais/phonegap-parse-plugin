var parsePlugin = {
	getInstallationId: function(successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'org.apache.cordova.core.ParsePlugin',
			'getInstallationId',
			[]
		);
	},
	
	getSubscriptions: function(successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'org.apache.cordova.core.ParsePlugin',
			'getSubscriptions',
			[]
		);
	},
	
	subscribe: function(channel, successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'org.apache.cordova.core.ParsePlugin',
			'subscribe',
			[ channel ]
		);
	},
	
	unsubscribe: function(channel, successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'org.apache.cordova.core.ParsePlugin',
			'unsubscribe',
			[ channel ]
		);
	}
}
