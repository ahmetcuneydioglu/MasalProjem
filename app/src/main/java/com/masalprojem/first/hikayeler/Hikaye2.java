package com.masalprojem.first.hikayeler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.masalprojem.first.MainActivity;
import com.masalprojem.first.R;

/**
 * Created by mersin on 01.04.2015.
 */
public class Hikaye2 extends Activity {

    Button btnAnasayfa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hikaye2);

        btnAnasayfa= (Button) findViewById(R.id.btnAnasayfa);

        btnAnasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Hikaye2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
