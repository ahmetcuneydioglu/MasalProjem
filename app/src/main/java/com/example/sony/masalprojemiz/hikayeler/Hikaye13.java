package com.example.sony.masalprojemiz.hikayeler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sony.masalprojemiz.MainActivity;
import com.example.sony.masalprojemiz.R;

/**
 * Created by sony on 04.04.2015.
 */
public class Hikaye13 extends Activity {

    Button btnAnasayfa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hikaye13);
        btnAnasayfa= (Button) findViewById(R.id.btnAnasayfa);

        btnAnasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Hikaye13.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
