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
import com.example.sony.masalprojem.Sesli.Sesli10;
import com.example.sony.masalprojem.Sesli.Sesli2;
import com.example.sony.masalprojem.Sesli.Sesli3;
import com.example.sony.masalprojem.Sesli.Sesli4;
import com.example.sony.masalprojem.Sesli.Sesli5;
import com.example.sony.masalprojem.Sesli.Sesli6;
import com.example.sony.masalprojem.Sesli.Sesli7;
import com.example.sony.masalprojem.Sesli.Sesli8;
import com.example.sony.masalprojem.Sesli.Sesli9;
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
    Button sesli3;
    Button sesli4;
    Button sesli5;
    Button sesli6;
    Button sesli7;
    Button sesli8;
    Button sesli9;
    Button sesli10;



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
        sesli3= (Button) getActivity().findViewById(R.id.sesli3);
        sesli4= (Button) getActivity().findViewById(R.id.sesli4);
        sesli5= (Button) getActivity().findViewById(R.id.sesli5);
        sesli6= (Button) getActivity().findViewById(R.id.sesli6);
        sesli7= (Button) getActivity().findViewById(R.id.sesli7);
        sesli8= (Button) getActivity().findViewById(R.id.sesli8);
        sesli9= (Button) getActivity().findViewById(R.id.sesli9);
        sesli10= (Button) getActivity().findViewById(R.id.sesli10);

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

        sesli3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli3.class);
                startActivity(intent);
            }
        });

        sesli4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli4.class);
                startActivity(intent);
            }
        });

        sesli5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli5.class);
                startActivity(intent);
            }
        });

        sesli6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli6.class);
                startActivity(intent);
            }
        });

        sesli7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli7.class);
                startActivity(intent);
            }
        });

        sesli8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli8.class);
                startActivity(intent);
            }
        });

        sesli9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Sesli9.class);
                startActivity(intent);
            }
        });

        sesli10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Sesli10.class);
                startActivity(intent);
            }
        });


    }
}