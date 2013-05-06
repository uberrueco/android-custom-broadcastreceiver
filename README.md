android-custom-broadcastreceiver
================================

Simple implementation of a custom broadcast receiver in an Android application.

The main activity registers to our custom broadcast receiver. When the BROADCAST button is clicked, the activity starts an
intent service which sends a broadcast intent that is received back in the activity by the broadcast receiver.
