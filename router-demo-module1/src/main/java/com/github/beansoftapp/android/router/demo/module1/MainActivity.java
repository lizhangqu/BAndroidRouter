package com.github.beansoftapp.android.router.demo.module1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.beansoftapp.android.router.annotation.Router;
import com.github.beansoftapp.android.router.util.BundleUtil;

@Router(value = {"client/module1/test"})
// 配置映射路径
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_main);
        Bundle bundle = getIntent().getExtras();

        ((TextView)findViewById(R.id.textView2)).setText(this.getClass() +
                "\n" + BundleUtil.bundle2string(bundle));
    }
}