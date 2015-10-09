package com.shawn.tools;

import android.content.Context;
import android.view.View;

import com.github.johnpersano.supertoasts.SuperToast;
import com.github.johnpersano.supertoasts.util.Style;

/**
 * @author 邱骁骅
 *         日期: 2015/4/10
 *         时间: 16:43
 */
public class ToastUtils {
    private static class SingletonHolder {
        private static final ToastUtils INSTANCE = new ToastUtils();
    }

    private ToastUtils() {
    }

    public static ToastUtils getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static SuperToast superToast;


    public void showToast(Context context, int stringID) {
        if (superToast == null || !superToast.getText().equals(context.getString(stringID))) {
            superToast = new SuperToast(context);
            superToast.setText(context.getString(stringID));
            superToast.setDuration(SuperToast.Duration.MEDIUM);
            superToast.setAnimations(SuperToast.Animations.FLYIN);
            superToast.setTypefaceStyle(Style.BLACK);
            superToast.setIcon(SuperToast.Icon.Dark.INFO, SuperToast.IconPosition.LEFT);
            superToast.setOnDismissListener(new SuperToast.OnDismissListener() {
                @Override
                public void onDismiss(View view) {
                    superToast = null;
                }
            });
            superToast.show();
        }
    }

    public void showToast(Context context, String text) {
        if (superToast == null || !superToast.getText().equals(text)) {
            superToast = new SuperToast(context);
            superToast.setText(text);
            superToast.setDuration(SuperToast.Duration.MEDIUM);
            superToast.setAnimations(SuperToast.Animations.FLYIN);
            superToast.setTypefaceStyle(Style.BLACK);
            superToast.setIcon(SuperToast.Icon.Dark.INFO, SuperToast.IconPosition.LEFT);
            superToast.setOnDismissListener(new SuperToast.OnDismissListener() {
                @Override
                public void onDismiss(View view) {
                    superToast = null;
                }
            });
            superToast.show();
        }
    }

    public void showToast(Context context, int stringID, int duration) {
        if (superToast == null || !superToast.getText().equals(context.getString(stringID))) {
            superToast = new SuperToast(context);
            superToast.setText(context.getString(stringID));
            superToast.setDuration(duration);
            superToast.setAnimations(SuperToast.Animations.FLYIN);
            superToast.setTypefaceStyle(Style.BLACK);
            superToast.setIcon(SuperToast.Icon.Dark.INFO, SuperToast.IconPosition.LEFT);
            superToast.setOnDismissListener(new SuperToast.OnDismissListener() {
                @Override
                public void onDismiss(View view) {
                    superToast = null;
                }
            });
            superToast.show();
        }
    }

    public void showToast(Context context, String text, int duration) {
        if (superToast == null || !superToast.getText().equals(text)) {
            superToast = new SuperToast(context);
            superToast.setText(text);
            superToast.setDuration(duration);
            superToast.setAnimations(SuperToast.Animations.FLYIN);
            superToast.setTypefaceStyle(Style.BLACK);
            superToast.setIcon(SuperToast.Icon.Dark.INFO, SuperToast.IconPosition.LEFT);
            superToast.setOnDismissListener(new SuperToast.OnDismissListener() {
                @Override
                public void onDismiss(View view) {
                    superToast = null;
                }
            });
            superToast.show();
        }
    }

    public void dismiss() {
        if (superToast != null) {
            superToast.dismiss();
        }
    }

    public void cancelAll() {
        SuperToast.cancelAllSuperToasts();
    }
}
