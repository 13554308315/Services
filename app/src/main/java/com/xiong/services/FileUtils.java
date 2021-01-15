package com.xiong.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
  private static final String TAG = "FileUtils";
  
  public static boolean CopySdcardFile(String paramString1, String paramString2) {
    try {
      FileInputStream fileInputStream = new FileInputStream(paramString1);
      FileOutputStream fileOutputStream = new FileOutputStream(paramString2);
      byte[] arrayOfByte = new byte[1024];
      while (true) {
        int i = fileInputStream.read(arrayOfByte);
        if (i > 0) {
          fileOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        fileInputStream.close();
        fileOutputStream.close();
        return true;
      } 
    } catch (Exception exception) {
      return false;
    } 
  }
  
//  public static boolean copy(String paramString1, String paramString2) {
//    File file1 = new File(paramString1);
//    boolean bool = file1.exists();
//    int i = 0;
//    if (!bool)
//      return i;
//    File[] arrayOfFile = file1.listFiles();
//    File file2 = new File(paramString2);
//    if (!file2.exists())
//      file2.mkdirs();
//    while (i < arrayOfFile.length) {
//      if (arrayOfFile[i].isDirectory()) {
//        StringBuilder stringBuilder1 = new StringBuilder();
//        stringBuilder1.append(arrayOfFile[i].getPath());
//        stringBuilder1.append("/");
//        String str = stringBuilder1.toString();
//        StringBuilder stringBuilder2 = new StringBuilder();
//        stringBuilder2.append(paramString2);
//        stringBuilder2.append(arrayOfFile[i].getName());
//        stringBuilder2.append("/");
//        copy(str, stringBuilder2.toString());
//      } else {
//        String str = arrayOfFile[i].getPath();
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(paramString2);
//        stringBuilder.append(arrayOfFile[i].getName());
//        CopySdcardFile(str, stringBuilder.toString());
//      }
//      i++;
//    }
//    return true;
//  }
  
  public static boolean createFile(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(paramString2);
    String str = stringBuilder.toString();
    File file1 = new File(paramString1);
    if (!file1.exists())
      file1.mkdirs(); 
    File file2 = new File(str);
    if (!file2.exists())
      try {
        return file2.createNewFile();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        return false;
      }  
    return true;
  }
  
  public static boolean deleteFiles(String paramString) {
    List<File> list = getFile(new File(paramString));
    if (list.size() != 0)
      for (byte b = 0; b < list.size(); b++) {
        File file = list.get(b);
        if (file.isFile())
          file.delete(); 
      }  
    return true;
  }
  
  public static List<File> getFile(File paramFile) {
    ArrayList<File> arrayList = new ArrayList();
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null)
      return null; 
    int i = arrayOfFile.length;
    for (byte b = 0; b < i; b++) {
      File file = arrayOfFile[b];
      if (file.isFile()) {
        arrayList.add(0, file);
      } else {
        getFile(file);
      } 
    } 
    return arrayList;
  }
  
  public static String getString(String paramString) {
    InputStream inputStream;
    Reader reader;
    try {
      inputStream = new FileInputStream(new File(paramString));
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
      inputStream = null;
    } 
    try {
      reader = new InputStreamReader(inputStream, "UTF-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      unsupportedEncodingException.printStackTrace();
      reader = null;
    } 
    BufferedReader bufferedReader = new BufferedReader(reader);
    StringBuffer stringBuffer = new StringBuffer("");
    try {
      while (true) {
        String str = bufferedReader.readLine();
        if (str != null) {
          stringBuffer.append(str);
          stringBuffer.append("\n");
          continue;
        } 
        break;
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    return stringBuffer.toString();
  }
  
  public static void modifyFile(String paramString1, String paramString2, boolean paramBoolean) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(paramString1, paramBoolean));
      bufferedWriter.append(paramString2);
      bufferedWriter.flush();
      bufferedWriter.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public static void renameFile(String paramString1, String paramString2) {
    (new File(paramString1)).renameTo(new File(paramString2));
  }
  
  public static void writeToFile(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString2);
    stringBuilder.append(paramString3);
    File file = new File(stringBuilder.toString());
    try {
      RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
      randomAccessFile.seek(file.length());
      randomAccessFile.write(paramString1.getBytes());
      randomAccessFile.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\28556\Desktop\app-release(43寸)\dex\classes_dex2jar.jar!\com\xiong\smartlegalservices\FileUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */