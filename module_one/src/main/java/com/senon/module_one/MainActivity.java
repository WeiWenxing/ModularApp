package com.senon.module_one;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.senon.lib_common.ConstantLoginArouter;
import com.senon.lib_common.bean.Login;
import com.senon.lib_common.utils.ComUtil;
import com.senon.lib_common.utils.StatusBarUtils;

/**
 * one 模块主页面
 */
@Route(path = ConstantLoginArouter.PATH_ONE_MAINACTIVITY)
public class MainActivity extends AppCompatActivity {

    @Autowired
    Login data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.with(this).init();//沉浸式
        setContentView(R.layout.one_activity_main);
        ComUtil.changeStatusBarTextColor(this,true);

        ARouter.getInstance().inject(this);

        if(data == null){
            ((TextView)findViewById(R.id.main_tv)).setText("这是one模块 主页面MainActivity"+"\n没有携带参数: ");
        }else{
            ((TextView)findViewById(R.id.main_tv)).setText("这是one模块 主页面MainActivity"+"\n携带参数: "+data.toString());
        }
    }
}
