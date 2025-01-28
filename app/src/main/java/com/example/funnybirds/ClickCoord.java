package com.example.funnybirds;

import android.graphics.Bitmap;

public class ClickCoord {

    private Bitmap bitmap;// картинка с роботом
    private int x;// координата X
    private int y;// координата Y

    public ClickCoord (Bitmap bitmap, int x, int y){
        this.bitmap= bitmap;
        this.x= x;
        this.y= y;
    }

    public Bitmap getBitmap(){
        return bitmap;
    }
    public void setBitmap(Bitmap bitmap){
        this.bitmap= bitmap;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x= x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y= y;
    }
}
