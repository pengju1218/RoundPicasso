package com.csdn.picasso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/26.
 */

public class Test extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t);

        Intent intent = getIntent();

        String okse = intent.getStringExtra("ok");

        int oks = intent.getIntExtra("intel", 0);

        Toast.makeText(Test.this, okse + "-----" + oks, Toast.LENGTH_SHORT).show();

    }
}
