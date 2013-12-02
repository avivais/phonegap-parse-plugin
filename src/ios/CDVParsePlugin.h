#import <Cordova/CDV.h>

@interface CDVParsePlugin: CDVPlugin

- (void)getInstallationId: (CDVInvokedUrlCommand*)command;
- (void)getInstallationObjectId: (CDVInvokedUrlCommand*)command;

@end
