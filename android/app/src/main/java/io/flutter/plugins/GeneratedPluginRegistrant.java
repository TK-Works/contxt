package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.cloudfirestore.CloudFirestorePlugin;
import flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin;
import io.flutter.plugins.firebase.core.FirebaseCorePlugin;
import io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin;
import com.babariviere.sms.SmsPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    CloudFirestorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.cloudfirestore.CloudFirestorePlugin"));
    ContactsServicePlugin.registerWith(registry.registrarFor("flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin"));
    FirebaseCorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.core.FirebaseCorePlugin"));
    FluttertoastPlugin.registerWith(registry.registrarFor("io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin"));
    SmsPlugin.registerWith(registry.registrarFor("com.babariviere.sms.SmsPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
