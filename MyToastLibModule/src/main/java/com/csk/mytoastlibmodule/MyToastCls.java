package com.csk.mytoastlibmodule;

import android.content.Context;
import android.widget.Toast;

public class MyToastCls {
    public static void s(Context c, String message){

        Toast.makeText(c,message+"-MyToastLibrary",Toast.LENGTH_SHORT).show();

    }
}
