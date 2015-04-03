package com.example.sony.masalprojem.hikayeler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sony.masalprojem.MainActivity;
import com.example.sony.masalprojem.R;

/**
 * Created by mersin on 03.04.2015.
 */
public class Hikaye7 extends Activity {

    Button btnAnasayfa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hikaye7);

        btnAnasayfa= (Button) findViewById(R.id.btnAnasayfa);

        btnAnasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Hikaye7.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
