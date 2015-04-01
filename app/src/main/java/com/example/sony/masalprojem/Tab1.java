package com.example.sony.masalprojem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sony.masalprojem.hikayeler.Hikaye1;
import com.example.sony.masalprojem.hikayeler.Hikaye2;
import com.example.sony.masalprojem.hikayeler.Hikaye3;
import com.example.sony.masalprojem.hikayeler.Hikaye4;
import com.example.sony.masalprojem.hikayeler.Hikaye5;
import com.example.sony.masalprojem.hikayeler.Hikaye6;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab1 extends Fragment{


    Button hikaye1;
    Button hikaye2;
    Button hikaye3;
    Button hikaye4;
    Button hikaye5;
    Button hikaye6;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_1, container, false);
        return v;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        hikaye1= (Button) getActivity().findViewById(R.id.button);
        hikaye2= (Button) getActivity().findViewById(R.id.button2);
        hikaye3= (Button) getActivity().findViewById(R.id.button3);
        hikaye4= (Button) getActivity().findViewById(R.id.button4);
        hikaye5= (Button) getActivity().findViewById(R.id.button5);
        hikaye6= (Button) getActivity().findViewById(R.id.button6);

        hikaye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Hikaye1.class);
                startActivity(intent);
            }
        });


        hikaye2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Hikaye2.class);
                startActivity(intent);
            }
        });

        hikaye3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Hikaye3.class);
                startActivity(intent);
            }
        });

        hikaye4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Hikaye4.class);
                startActivity(intent);
            }
        });

        hikaye5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Hikaye5.class);
                startActivity(intent);
            }
        });

        hikaye6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Hikaye6.class);
                startActivity(intent);
            }
        });
    }
}