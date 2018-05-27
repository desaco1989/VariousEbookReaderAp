package com.github.barteksc.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;


/**
 * Created by desaco on 2018/5/26.
 *
 * pdf阅读器- https://github.com/barteksc/AndroidPdfViewer
 * txt小说阅读器- https://github.com/PeachBlossom/treader
 *
 * android电子书翻页效果的github开源项目 https://github.com/harism/android_page_curl
 * FBReader AS版本地址：https://github.com/adolfAn/FBReader_AS
 *
 */

public class IndexActivity extends Activity implements View.OnClickListener {
    //
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        //

        initViewData();
        //com.zijie.treader.IndexActivity
    }

    private void initViewData() {
        Button txtReaderBt = (Button) findViewById(R.id.txt_reader);
        txtReaderBt.setOnClickListener(this);
        Button pdfReaderBt = (Button) findViewById(R.id.pdf_reader);
        pdfReaderBt.setOnClickListener(this);
        //
        Button ebookReaderBt = (Button) findViewById(R.id.ebook_flip_effect);
        ebookReaderBt.setOnClickListener(this);
        //
        Button fbReaderBt = (Button) findViewById(R.id.fb_reader);
        fbReaderBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_reader:
                //MainActivity
//                jump(MainActivity.class);
                break;

            case R.id.pdf_reader:
                //PDFViewActivity
                jump(PDFViewActivity_.class);//TODO
                break;

            case R.id.ebook_flip_effect://电子书翻页效果
//                jump(CurlActivity.class);
                break;
            case R.id.fb_reader:
//                jump(OpenDictionaryActivity.class);
                break;
            default:
                break;
        }
    }

    private void jump(Class<?> clazz) {
        Intent intent = new Intent();
        intent.setClass(this, clazz);
        startActivity(intent);
    }
}
