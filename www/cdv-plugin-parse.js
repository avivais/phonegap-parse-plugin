var parsePlugin = {
	initialize: function(appId, appKey, successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'ParsePlugin',
			'initialize',
			[appId, clientKey]
		);
	},

	getInstallationId: function(successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'ParsePlugin',
			'getInstallationId',
			[]
		);
	},

	getInstallationObjectId: function(successCallback, errorCallback) {
		cordova.exec(
			successCallback,
			errorCallback,
			'ParsePlugin',
			'getInstallationObjectId',
			[]
		);
	}

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
};
module.exports = parsePlugin;
