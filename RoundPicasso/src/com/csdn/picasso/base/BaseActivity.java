package com.csdn.picasso.base;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.TokenWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/23.
 */

public abstract class BaseActivity extends Activity implements View.OnClickListener {
    private static final int ACTIVITY_START = 0;
    private static final int ACTIVITY_RESUME = 1;
    private static final int ACTIVITY_STOP = 2;
    private static final int ACTIVITY_PAUSE = 3;
    private static final int ACTIVITY_DESTROY = 4;

    public int activityState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(this.getClass().getName(), "---------onCreat ");
        requestWindowFeature(Window.FEATURE_NO_TITLE); // 取消标题
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // 竖屏锁定
        initView();
    }


    public abstract void initView();


    public void showToast(String message) {
        Toast.makeText(BaseActivity.this, message + "", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        widgetClick(v);
    }

    /**
     * 事件的点击
     * @param v
     */
    public abstract void widgetClick(View v);

    @Override
    protected void onStart() {
        super.onStart();
        activityState = ACTIVITY_START;
        Log.i(this.getClass().getName(), "---------onStart ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        activityState = ACTIVITY_RESUME;
        Log.i(this.getClass().getName(), "---------onResume ");
    }

    @Override
    protected void onStop() {
        super.onResume();
        activityState = ACTIVITY_STOP;
        Log.i(this.getClass().getName(), "---------onStop ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        activityState = ACTIVITY_PAUSE;
        Log.i(this.getClass().getName(), "---------onPause ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(this.getClass().getName(), "---------onRestart ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        activityState = ACTIVITY_DESTROY;
        Log.i(this.getClass().getName(), "---------onDestroy ");
        // AppManager.getAppManager().finishActivity(this);
    }
}
