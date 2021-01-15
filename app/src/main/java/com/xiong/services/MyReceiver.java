package com.xiong.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    if (paramIntent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
      Intent intent = new Intent(paramContext, MainActivity.class);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      paramContext.startActivity(intent);
    } 
  }
}


/* Location:              C:\Users\28556\Desktop\app-release(43寸)\dex\classes_dex2jar.jar!\com\xiong\smartlegalservices\MyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */