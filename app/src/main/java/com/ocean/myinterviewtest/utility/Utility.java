package com.ocean.myinterviewtest.utility;

import android.content.Context;
import android.widget.Toast;

public class Utility {

    //public static final String BASE_URL = "https://api.themoviedb.org";
    public static final String KEY = "0.012674359197673457";
    //public static final String  IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500";

    public static void showShortToast(Context context, String msg){
        Toast.makeText(context,  msg, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
