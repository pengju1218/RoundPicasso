package com.csdn.picasso;

import android.view.View;
import android.widget.ImageView;

import com.csdn.picasso.base.BaseActivity;
import com.csdn.picasso.trans.CircleTransform;
import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2016/11/23.
 */

public class MainAcitity extends BaseActivity {
    private android.widget.ImageView loadroundimg;
    private String img_url = "http://d.hiphotos.baidu.com/image/pic/item/2e2eb9389b504fc2065e2bd2e1dde71191ef6de0.jpg";

    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        this.loadroundimg = (ImageView) findViewById(R.id.load_round_img);
        Picasso.with(MainAcitity.this).load(img_url)
                .transform(new CircleTransform(MainAcitity.this)).into(loadroundimg);


    }

    @Override
    public void widgetClick(View v) {

    }
}
