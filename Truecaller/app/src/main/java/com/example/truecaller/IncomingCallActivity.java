package com.example.truecaller;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;

public class IncomingCallActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            Log.d("IncomingCallActivity", "flag2");



            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);

            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);

            Log.d("IncomingCallActivity", "flagy");

            setContentView(R.layout.dialog);

            Log.d("IncomingCallActivity", "flagz");

            String number = getIntent().getStringExtra("phone_no");
            TextView text = (TextView) findViewById(R.id.tv_client);
            text.setText("Incoming call from " + number);
        } catch (Exception e) {
            Log.d("Exception", e.toString());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}