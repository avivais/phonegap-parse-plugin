#import <Cordova/CDV.h>

@interface CDVParsePlugin: CDVPlugin

- (void)initialize: (CDVInvokedUrlCommand*)command;
- (void)getInstallationId: (CDVInvokedUrlCommand*)command;
- (void)getInstallationObjectId: (CDVInvokedUrlCommand*)command;

@end
