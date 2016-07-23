package jp.co.cyberagent.stf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hugeterry(http://hugeterry.cn)
 * Date: 16/7/23 10:05
 */
public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private Button bt_startService;
    private Button bt_stopService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (intent == null) {
            intent = new Intent(MainActivity.this, Service.class);
        }

        bt_startService = (Button) findViewById(R.id.bt_startService);
        bt_startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });

        bt_stopService = (Button) findViewById(R.id.bt_stopService);
        bt_stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });

    }
}
