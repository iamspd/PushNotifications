package com.example.pushnotification

import com.google.firebase.messaging.FirebaseMessagingService

class PushNotificationService: FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)

    }
}