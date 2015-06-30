package as.leap.demo.support;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import as.leap.LASHelpCenter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(android.R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LASHelpCenter.openFaqs(MainActivity.this);
            }
        });

    }


}
