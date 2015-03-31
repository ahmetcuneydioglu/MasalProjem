package com.example.sony.masalprojem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sony on 29.03.2015.
 */
public class Hikaye1 extends Activity {

    Button btnAnasayfa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hikaye1);

        btnAnasayfa= (Button) findViewById(R.id.btnAnasayfa);

        btnAnasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Hikaye1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
