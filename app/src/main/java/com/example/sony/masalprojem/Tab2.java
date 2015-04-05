package com.example.sony.masalprojem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.sony.masalprojem.Sesli.Sesli1;
import com.example.sony.masalprojem.Sesli.Sesli2;
import com.example.sony.masalprojem.hikayeler.Hikaye1;
import com.example.sony.masalprojem.hikayeler.Hikaye10;
import com.example.sony.masalprojem.hikayeler.Hikaye2;
import com.example.sony.masalprojem.hikayeler.Hikaye3;
import com.example.sony.masalprojem.hikayeler.Hikaye4;
import com.example.sony.masalprojem.hikayeler.Hikaye5;
import com.example.sony.masalprojem.hikayeler.Hikaye6;
import com.example.sony.masalprojem.hikayeler.Hikaye7;
import com.example.sony.masalprojem.hikayeler.Hikaye8;
import com.example.sony.masalprojem.hikayeler.Hikaye9;


/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab2 extends Fragment {


    Button sesli1;
    Button sesli2;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_2,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        sesli1= (Button) getActivity().findViewById(R.id.sesli1);
        sesli2= (Button) getActivity().findViewById(R.id.sesli2);

        sesli1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli1.class);
                startActivity(intent);
            }
        });

        sesli2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli2.class);
                startActivity(intent);
            }
        });
    }
}