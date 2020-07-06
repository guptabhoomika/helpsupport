package com.example.helpsupport
import io.flutter.app.FlutterApplication
import com.instabug.instabugflutter.InstabugFlutterPlugin
import java.util.ArrayList
public class CustomFlutterApplication:FlutterApplication() {
  override fun onCreate() {
    super.onCreate()
    val invocation_events = ArrayList<String>()
    invocation_events.add(InstabugFlutterPlugin.INVOCATION_EVENT_SHAKE)
    val instabug = InstabugFlutterPlugin()
    instabug.start(this@CustomFlutterApplication, "343601753229b3ec95c4650e810ef6ae", invocation_events)
    instabug.setWelcomeMessageMode("WelcomeMessageMode.disabled")
  }
}