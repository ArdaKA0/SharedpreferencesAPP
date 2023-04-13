package com.example.sharedprefencesauyg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sharedprefencesauyg.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
        private ActivityMain2Binding binding;
           private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnkaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kullanici_adi = binding.et1k.getText().toString();
                String parola = binding.et2p.getText().toString();
                //Kayıt

                sharedPreferences = getApplicationContext().getSharedPreferences("biglieler", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("kullanici",kullanici_adi);
                editor.putString("parola",parola);
                editor.apply();
                Toast.makeText(MainActivity2.this, "Kayıt Edildi", Toast.LENGTH_SHORT).show();

            }
        });

        binding.btngirisedn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}