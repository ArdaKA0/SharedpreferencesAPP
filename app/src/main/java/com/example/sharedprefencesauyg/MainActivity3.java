package com.example.sharedprefencesauyg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.sharedprefencesauyg.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
        private ActivityMain3Binding binding;
        SharedPreferences sharedPreferences;
        private String gelenkullanici,gelenparola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedPreferences = this.getSharedPreferences("biglieler", Context.MODE_PRIVATE);
        gelenkullanici = sharedPreferences.getString("kullanici","değer yok");
        gelenparola = sharedPreferences.getString("parola","değer yok");
        binding.tv1.setText("Kullanici ="+gelenkullanici);
        binding.tv2.setText("Parola = " + gelenparola);

        binding.btncikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });



    }
}