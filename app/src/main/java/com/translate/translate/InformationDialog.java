package com.translate.translate;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;


/**
 * Created by Ahmed Magdy on 2/26/2018.
 */

public class InformationDialog {
    Activity mActivity;
    TextView textView;
    public void showDialog(final Activity activity, String str){
        final Dialog dialog = new Dialog(activity);
        mActivity = activity;
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.setCanceledOnTouchOutside(true);
        textView = (TextView) dialog.findViewById(R.id.text);
        switch (str){
            case "help":
                textView.setText(R.string.help_info);
                break;
            case "about":
                textView.setText(R.string.about);
                break;
        }




        dialog.show();
    }
}
