package com.xiong.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

import com.bumptech.glide.Glide;

import java.io.File;

public class MainActivity extends Activity implements View.OnClickListener {
    private static String[] PERMISSIONS_STORAGE;

    private static int REQUEST_PERMISSION_CODE = 1;

    String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();

    ImageView iv_1;

    ImageView iv_10;

    ImageView iv_11;

    ImageView iv_12;

    ImageView iv_2;

    ImageView iv_3;

    ImageView iv_4;

    ImageView iv_5;

    ImageView iv_6;

    ImageView iv_7;

    ImageView iv_8;

    ImageView iv_9;

    ImageView iv_A;

    ImageView iv_C;

    ImageView iv_D;

    ImageView iv_E;

    LinearLayout ll_1;

    LinearLayout ll_10;

    LinearLayout ll_11;

    LinearLayout ll_12;

    LinearLayout ll_2;

    LinearLayout ll_3;

    LinearLayout ll_4;

    LinearLayout ll_5;

    LinearLayout ll_6;

    LinearLayout ll_7;

    LinearLayout ll_8;

    LinearLayout ll_9;

    LinearLayout ll_B;

    LinearLayout ll_C;

    LinearLayout ll_D;

    LinearLayout ll_E;

    TextView tv_1;

    TextView tv_10;

    TextView tv_11;

    TextView tv_12;

    TextView tv_2;

    TextView tv_3;

    TextView tv_4;

    TextView tv_5;

    TextView tv_6;

    TextView tv_7;

    TextView tv_8;

    TextView tv_9;

    TextView tv_A;

    ImageView tv_B;

    TextView tv_C;

    TextView tv_D;

    TextView tv_E;

    String txt1;

    String txt10;

    String txt11;

    String txt12;

    String txt2;

    String txt3;

    String txt4;

    String txt5;

    String txt6;

    String txt7;

    String txt8;

    String txt9;

    String txtA;

    String txtB;

    String txtC;

    String txtD;

    String txtE;

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        setContentView(R.layout.activity_main);
        initView();
        if (Build.VERSION.SDK_INT > 21) {
            if (ActivityCompat.checkSelfPermission((Context) this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                ActivityCompat.requestPermissions(this, PERMISSIONS_STORAGE, REQUEST_PERMISSION_CODE);
            } else {
                Log.e("else", "已授权");
                initData();
                initData2();
                initData3();
                initData4();
                initData5();
                initData6();
                initData7();
                initData8();
                initData9();
                initData10();
                initData11();
                initData12();
                initDataA();
                initDataC();
                initDataD();
                initDataE();
            }
        } else {
            initData();
            initData2();
            initData3();
            initData4();
            initData5();
            initData6();
            initData7();
            initData8();
            initData9();
            initData10();
            initData11();
            initData12();
            initDataA();
            initDataC();
            initDataD();
            initDataE();
        }
    }

    public void onRequestPermissionsResult(int paramInt, @NonNull String[] paramArrayOfString, @NonNull int[] paramArrayOfint) {
        super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint);
        if (paramInt == REQUEST_PERMISSION_CODE) {
            for (byte b = 0; b < paramArrayOfString.length; b++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("申请的权限为：");
                stringBuilder.append(paramArrayOfString[b]);
                stringBuilder.append(",申请结果：");
                stringBuilder.append(paramArrayOfint[b]);
                Log.e("MainActivity", stringBuilder.toString());
                if (paramArrayOfint[b] != 0)
                    finish();
            }
            initData();
            initData2();
            initData3();
            initData4();
            initData5();
            initData6();
            initData7();
            initData8();
            initData9();
            initData10();
            initData11();
            initData12();
            initDataA();
            initDataC();
            initDataD();
            initDataE();
        }
    }

    protected void onResume() {
        super.onResume();
        mersure3(tv_B);
        mersure(iv_A);
        mersure2(iv_C);
        mersure2(iv_D);
        mersure_E(iv_E);
        mersure2(iv_1);
        mersure2(iv_2);
        mersure2(iv_3);
        mersure2(iv_4);
        mersure2(iv_5);
        mersure2(iv_6);
        mersure2(iv_7);
        mersure2(iv_8);
        mersure2(iv_9);
        mersure2(iv_10);
        mersure2(iv_11);
        mersure2(iv_12);
    }

    public void onWindowFocusChanged(boolean paramBoolean) {
        super.onWindowFocusChanged(paramBoolean);
        mersure3(tv_B);
        mersure(iv_A);
        mersure2(iv_C);
        mersure2(iv_D);
        mersure_E(iv_E);
        mersure2(iv_1);
        mersure2(iv_2);
        mersure2(iv_3);
        mersure2(iv_4);
        mersure2(iv_5);
        mersure2(iv_6);
        mersure2(iv_7);
        mersure2(iv_8);
        mersure2(iv_9);
        mersure2(iv_10);
        mersure2(iv_11);
        mersure2(iv_12);
    }

    static {
        String[] arrayOfString = new String[2];
        arrayOfString[0] = "android.permission.READ_EXTERNAL_STORAGE";
        arrayOfString[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
        PERMISSIONS_STORAGE = arrayOfString;
    }

    private void initData() {
        absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(absolutePath);
            stringBuilder1.append("/智慧法律服务/1");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(absolutePath);
            stringBuilder2.append("/智慧法律服务/1");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Log.e("图片", str1);
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_1);
                tv_1.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt1 = FileUtils.getString(str1);
            }
        }
    }

    private void initData10() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/10");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/10");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_10);
                tv_10.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt10 = FileUtils.getString(str1);
            }
        }
    }

    private void initData11() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/11");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/11");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_11);
                tv_11.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt11 = FileUtils.getString(str1);
            }
        }
    }

    private void initData12() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/12");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/12");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_12);
                tv_12.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt12 = FileUtils.getString(str1);
            }
        }
    }

    private void initData2() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/2");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/2");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_2);
                tv_2.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt2 = FileUtils.getString(str1);
            }
        }
    }

    private void initData3() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/3");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/3");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_3);
                tv_3.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt3 = FileUtils.getString(str1);
            }
        }
    }

    private void initData4() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/4");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/4");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_4);
                tv_4.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt4 = FileUtils.getString(str1);
            }
        }
    }

    private void initData5() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/5");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/5");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_5);
                tv_5.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt5 = FileUtils.getString(str1);
            }
        }
    }

    private void initData6() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/6");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/6");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_6);
                tv_6.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt6 = FileUtils.getString(str1);
            }
        }
    }

    private void initData7() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/7");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/7");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_7);
                tv_7.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt7 = FileUtils.getString(str1);
            }
        }
    }

    private void initData8() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/8");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/8");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_8);
                tv_8.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt8 = FileUtils.getString(str1);
            }
        }
    }

    private void initData9() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/9");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/9");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_9);
                tv_9.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txt9 = FileUtils.getString(str1);
            }
        }
    }

    private void initDataA() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/A");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/A");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_A);
                tv_A.setText(str2.substring(0, str2.indexOf(".")));
            } else {
                str1.contains(".txt");
            }
        }
    }

    private void initDataC() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/C");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/C");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_C);
                tv_C.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txtC = FileUtils.getString(str1);
            }
        }
    }

    private void initDataD() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/D");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/D");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_D);
                tv_D.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txtD = FileUtils.getString(str1);
            }
        }
    }

    private void initDataE() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        for (byte b = 0; b < 2; b++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append("/智慧法律服务/E");
            String str1 = ((File) FileUtils.getFile(new File(stringBuilder1.toString())).get(b)).getPath();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("/智慧法律服务/E");
            String str2 = ((File) FileUtils.getFile(new File(stringBuilder2.toString())).get(b)).getName();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str1);
            stringBuilder3.append("---");
            stringBuilder3.append(str2);
            Log.e("TAG", stringBuilder3.toString());
            if (str1.contains(".png") || str1.contains("jpeg")) {
                Glide.with(this).load(str1).override(-2147483648, -2147483648).into(iv_E);
                tv_E.setText(str2.substring(0, str2.indexOf(".")));
            } else if (str1.contains(".txt")) {
                txtE = FileUtils.getString(str1);
            }
        }
    }

    private void initView() {
        tv_B = (ImageView) findViewById(R.id.tv_B);
        iv_1 = (ImageView) findViewById(R.id.iv_1);
        iv_2 = (ImageView) findViewById(R.id.iv_2);
        iv_3 = (ImageView) findViewById(R.id.iv_3);
        iv_4 = (ImageView) findViewById(R.id.iv_4);
        iv_5 = (ImageView) findViewById(R.id.iv_5);
        iv_6 = (ImageView) findViewById(R.id.iv_6);
        iv_7 = (ImageView) findViewById(R.id.iv_7);
        iv_8 = (ImageView) findViewById(R.id.iv_8);
        iv_9 = (ImageView) findViewById(R.id.iv_9);
        iv_10 = (ImageView) findViewById(R.id.iv_10);
        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_A = (ImageView) findViewById(R.id.iv_A);
        iv_C = (ImageView) findViewById(R.id.iv_C);
        iv_D = (ImageView) findViewById(R.id.iv_D);
        iv_E = (ImageView) findViewById(R.id.iv_E);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        tv_5 = (TextView) findViewById(R.id.tv_5);
        tv_6 = (TextView) findViewById(R.id.tv_6);
        tv_7 = (TextView) findViewById(R.id.tv_7);
        tv_8 = (TextView) findViewById(R.id.tv_8);
        tv_9 = (TextView) findViewById(R.id.tv_9);
        tv_10 = (TextView) findViewById(R.id.tv_10);
        tv_11 = (TextView) findViewById(R.id.tv_11);
        tv_12 = (TextView) findViewById(R.id.tv_12);
        tv_A = (TextView) findViewById(R.id.tv_A);
        tv_C = (TextView) findViewById(R.id.tv_C);
        tv_D = (TextView) findViewById(R.id.tv_D);
        tv_E = (TextView) findViewById(R.id.tv_E);
        ll_1 = (LinearLayout) findViewById(R.id.ll_1);
        ll_2 = (LinearLayout) findViewById(R.id.ll_2);
        ll_3 = (LinearLayout) findViewById(R.id.ll_3);
        ll_4 = (LinearLayout) findViewById(R.id.ll_4);
        ll_5 = (LinearLayout) findViewById(R.id.ll_5);
        ll_6 = (LinearLayout) findViewById(R.id.ll_6);
        ll_7 = (LinearLayout) findViewById(R.id.ll_7);
        ll_8 = (LinearLayout) findViewById(R.id.ll_8);
        ll_9 = (LinearLayout) findViewById(R.id.ll_9);
        ll_10 = (LinearLayout) findViewById(R.id.ll_10);
        ll_11 = (LinearLayout) findViewById(R.id.ll_11);
        ll_12 = (LinearLayout) findViewById(R.id.ll_12);
        ll_B = (LinearLayout) findViewById(R.id.ll_B);
        ll_C = (LinearLayout) findViewById(R.id.ll_C);
        ll_D = (LinearLayout) findViewById(R.id.ll_D);
        ll_E = (LinearLayout) findViewById(R.id.ll_E);
        ll_1.setOnClickListener(this);
        ll_2.setOnClickListener(this);
        ll_3.setOnClickListener(this);
        ll_4.setOnClickListener(this);
        ll_5.setOnClickListener(this);
        ll_6.setOnClickListener(this);
        ll_7.setOnClickListener(this);
        ll_8.setOnClickListener(this);
        ll_9.setOnClickListener(this);
        ll_10.setOnClickListener(this);
        ll_11.setOnClickListener(this);
        ll_12.setOnClickListener(this);
        ll_C.setOnClickListener(this);
        ll_D.setOnClickListener(this);
        ll_E.setOnClickListener(this);
    }

    private void intent(String paramString, TextView paramTextView) {
        startActivity((new Intent((Context) this, WebActivity.class)).putExtra("url", paramString).putExtra("title", paramTextView.getText().toString()));
    }

    private void mersure(ImageView paramImageView) {
        ViewGroup.LayoutParams layoutParams = paramImageView.getLayoutParams();
        layoutParams.width = MesureUtils.width((Context) this) / 15;
        layoutParams.height = MesureUtils.width((Context) this) / 15;
        paramImageView.setLayoutParams(layoutParams);
    }

    private void mersure2(ImageView paramImageView) {
        ViewGroup.LayoutParams layoutParams = paramImageView.getLayoutParams();
        layoutParams.width = MesureUtils.width((Context) this) / 20;
        layoutParams.height = MesureUtils.width((Context) this) / 20;
        paramImageView.setLayoutParams(layoutParams);
    }

    private void mersure3(ImageView paramImageView) {
        ViewGroup.LayoutParams layoutParams = paramImageView.getLayoutParams();
        layoutParams.width = MesureUtils.width((Context) this) / 8;
        layoutParams.height = MesureUtils.width((Context) this) / 8;
        paramImageView.setLayoutParams(layoutParams);
    }

    private void mersure_E(ImageView paramImageView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) paramImageView.getLayoutParams();
        layoutParams.width = MesureUtils.width((Context) this) / 20;
        layoutParams.height = MesureUtils.width((Context) this) / 20;
        layoutParams.leftMargin = iv_C.getLeft();
        paramImageView.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
    }

    public void onClick(View paramView) {
        switch (paramView.getId()) {
            case R.id.ll_E:
                intent(txtE, tv_E);
                break;
            case R.id.ll_D:
                intent(txtD, tv_D);
                break;
            case R.id.ll_C:
                intent(txtC, tv_C);
                break;
            case R.id.ll_9:
                intent(txt9, tv_9);
                break;
            case R.id.ll_8:
                intent(txt8, tv_8);
                break;
            case R.id.ll_7:
                intent(txt7, tv_7);
                break;
            case R.id.ll_6:
                intent(txt6, tv_6);
                break;
            case R.id.ll_5:
                intent(txt5, tv_5);
                break;
            case R.id.ll_4:
                intent(txt4, tv_4);
                break;
            case R.id.ll_3:
                intent(txt3, tv_3);
                break;
            case R.id.ll_2:
                intent(txt2, tv_2);
                break;
            case R.id.ll_12:
                intent(txt12, tv_12);
                break;
            case R.id.ll_11:
                intent(txt11, tv_11);
                break;
            case R.id.ll_10:
                intent(txt10, tv_10);
                break;
            case R.id.ll_1:
                intent(txt1, tv_1);
                break;
            default:
                return;
        }

    }


}


/* Location:              C:\Users\28556\Desktop\app-release(43寸)\dex\classes_dex2jar.jar!\com\xiong\smartlegalservices\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */