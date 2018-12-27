package com.senon.module_two;

import com.alibaba.android.arouter.launcher.ARouter;
import com.senon.lib_common.base.BaseApplication;
import com.senon.lib_common.utils.ConstantUtils;

/**
 * two debug  Application
 */
public class App_Two extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        initARouter();
    }

    private void initARouter() {
        if (ConstantUtils.isAppDebug()) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
