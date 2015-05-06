using System;
using System.Collections.Generic;
using Parse;
using WPCordovaClassLib.Cordova;

namespace WPCordovaClassLib.Cordova.Commands
{
    public class ParsePlugin : BaseCommand
    {


        public async void initialize(string args)
        {

            PluginResult result;

            try
            {
                var appId = JSON.JsonHelper.Deserialize<string[]>(args)[0].ToString();
                var clientKey = JSON.JsonHelper.Deserialize<string[]>(args)[1].ToString();

                ParseClient.Initialize(appId, clientKey);

               
                await ParseInstallation.CurrentInstallation.SaveAsync();

             
                DispatchCommandResult( new PluginResult(PluginResult.Status.OK, true));
            }
            catch (Exception e)
            {
                DispatchCommandResult(new PluginResult(PluginResult.Status.ERROR, false));
            }




        }

        public void getInstallationId(string args)
        {

            String installationId = ParseInstallation.CurrentInstallation.InstallationId.ToString();
            var result = new PluginResult(PluginResult.Status.OK, installationId);
            DispatchCommandResult(result);

        }

        public void getInstallationObjectId(string args)
        {

            String objectId = ParseInstallation.CurrentInstallation.ObjectId.ToString();
            var result = new PluginResult(PluginResult.Status.OK, objectId);
            DispatchCommandResult(result);

        }

        public void getSubscriptions(string args)
        {


            var installation = ParseInstallation.CurrentInstallation;
            IEnumerable<string> subscribedChannels = installation.Channels;
            var result = new PluginResult(PluginResult.Status.OK, subscribedChannels);
            DispatchCommandResult(result);

        }

        public void subscribe(string args)
        {
            var topic = JSON.JsonHelper.Deserialize<string[]>(args)[0].ToString();
            ParsePush.SubscribeAsync(topic);

                   DispatchCommandResult( new PluginResult(PluginResult.Status.OK, true));
           
            
        }

        public void unsubscribe(string args)
        {
            var topic = JSON.JsonHelper.Deserialize<string[]>(args)[0].ToString();
            ParsePush.UnsubscribeAsync(topic);

            DispatchCommandResult(new PluginResult(PluginResult.Status.OK, true));
        }



    }
}