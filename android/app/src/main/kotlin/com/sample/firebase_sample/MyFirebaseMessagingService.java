package com.sample.firebase_sample;

import com.clevertap.android.sdk.pushnotification.fcm.CTFcmMessageHandler;
import com.google.firebase.messaging.RemoteMessage;

import org.jetbrains.annotations.NotNull;

import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingService;


public class MyFirebaseMessagingService extends FlutterFirebaseMessagingService {

    @Override
    public void onMessageReceived(@NotNull RemoteMessage message) {
        new CTFcmMessageHandler()
                .createNotification(getApplicationContext(), message);
    }

    @Override
    public void onNewToken(@NotNull String token) {
        //Log.d(TAG, "Refreshed token: " + token);

        //String token = FirebaseInstanceId.getInstance().getToken();
//        CleverTapAPI.getDefaultInstance(this).pushFcmRegistrationId(token, true);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(token);
    }
}