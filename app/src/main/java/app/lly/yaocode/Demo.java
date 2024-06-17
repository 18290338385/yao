package app.lly.yaocode;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import app.lly.testlib.YaoApp;

/**
 * 作者：刘路遥2024/6/18.
 * QQ：443915626
 * 版本：v1.0
 * 此类介绍：暂无
 */
public class Demo extends AppCompatActivity {
     @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.layout);
         YaoApp.INSTANCE.Toast(Demo.this,"sdafsd");

    }
}
