package com.xiong.services;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class MesureUtils {
  public static int height(Context paramContext) {
    WindowManager windowManager = (WindowManager)paramContext.getSystemService("window");
    DisplayMetrics displayMetrics = new DisplayMetrics();
    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
    return displayMetrics.heightPixels;
  }
  
  public static int width(Context paramContext) {
    WindowManager windowManager = (WindowManager)paramContext.getSystemService("window");
    DisplayMetrics displayMetrics = new DisplayMetrics();
    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
    return displayMetrics.widthPixels;
  }
}


/* Location:              C:\Users\28556\Desktop\app-release(43寸)\dex\classes_dex2jar.jar!\com\xiong\smartlegalservices\MesureUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */