package secrex.app.com.myapplication;

import android.content.Context;
import com.samsung.android.sdk.cup.*;

public class GearFitSDKSample extends ScupDialog {
MyActivity activity;
    public GearFitSDKSample(Context context) {
        super(context);
        activity = (MyActivity) context;

// TODO Auto-generated constructor stub
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        final ScupLabel label = new ScupLabel(this);
        label.setWidth(ScupLabel.FILL_DIALOG);
        label.setHeight(ScupLabel.FILL_DIALOG);
        label.setText("Hello XDA Developers!");
        label.show();

        setBackPressedListener(new BackPressedListener() {
            @Override
            public void onBackPressed(ScupDialog arg0) {
                finish();
            }
        });
    }

    public Integer x = 50;
    public Integer signo = 1;
}
