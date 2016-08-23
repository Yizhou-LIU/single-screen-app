package example.businessappdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llPhone = (LinearLayout)findViewById(R.id.ll_phone);
        llPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvPhone = (TextView)findViewById(R.id.tv_phonenum);
                String phone = tvPhone.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }


}
