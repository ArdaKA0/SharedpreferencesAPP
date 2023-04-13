package com.example.sharedprefencesauyg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sharedprefencesauyg.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    String kullanici,parola,gelenkullanici,gelenparola;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btngrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici = binding.et1k.getText().toString();
                parola = binding.et2p.getText().toString();
                sharedPreferences = getApplicationContext().getSharedPreferences("biglieler", Context.MODE_PRIVATE);
                gelenkullanici = sharedPreferences.getString("kullanici","değer yok");
                gelenparola = sharedPreferences.getString("parola","değer yok");
                if (kullanici.equals(gelenkullanici) && parola.equals(gelenparola)){
                    Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Yanlıs", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.btnkayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}