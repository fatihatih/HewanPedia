package com.example.middle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton tmblBurung,tmblIkan,tmblSerangga;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        tmblBurung = findViewById(R.id.kumpulan_burung);
        tmblIkan = findViewById(R.id.kumpulan_ikan);
        tmblSerangga = findViewById(R.id.kumpulan_serangga);
        tmblBurung.setOnClickListener(view -> bukaGaleri("Burung"));
        tmblIkan.setOnClickListener(view -> bukaGaleri("Ikan"));
        tmblSerangga.setOnClickListener(view -> bukaGaleri("Serangga"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity Burung");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
        startActivity(intent);
    }
}
