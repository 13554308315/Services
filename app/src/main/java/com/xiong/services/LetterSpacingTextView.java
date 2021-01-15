package com.xiong.services;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class LetterSpacingTextView extends TextView {
  private CharSequence originalText = "";
  
  private float spacing = 0.0F;
  
  public LetterSpacingTextView(Context paramContext) {
    super(paramContext);
  }
  
  public LetterSpacingTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public LetterSpacingTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void applySpacing() {
    if (this.originalText == null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    byte b1 = 0;
    while (b1 < this.originalText.length()) {
      stringBuilder.append(this.originalText.charAt(b1));
      if (++b1 < this.originalText.length())
        stringBuilder.append(" "); 
    } 
    SpannableString spannableString = new SpannableString(stringBuilder.toString());
    int i = stringBuilder.toString().length();
    byte b2 = 1;
    if (i > b2)
      while (b2 < stringBuilder.toString().length()) {
        spannableString.setSpan(new ScaleXSpan((1.0F + this.spacing) / 10.0F), b2, b2 + 1, 33);
        b2 += 2;
      }  
    super.setText((CharSequence)spannableString, BufferType.SPANNABLE);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.LetterSpacingTextView);
    this.originalText = typedArray.getString(0);
    setSpacing(typedArray.getFloat(1, 0.0F));
    typedArray.recycle();
  }
  
  public float getSpacing() {
    return this.spacing;
  }
  
  public CharSequence getText() {
    return this.originalText;
  }
  
  public void setSpacing(float paramFloat) {
    this.spacing = paramFloat;
    applySpacing();
  }
  
  public void setText(CharSequence paramCharSequence, BufferType paramBufferType) {
    this.originalText = paramCharSequence;
    applySpacing();
  }
  

}


/* Location:              C:\Users\28556\Desktop\app-release(43寸)\dex\classes_dex2jar.jar!\com\xiong\smartlegalservices\LetterSpacingTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */