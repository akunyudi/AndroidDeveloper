package com.example.latihanstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.CollationElementIterator;

import id.ac.poliban.mi.maskah.latihanstorage.R;

public class InternalStrorage extends AppCompatActivity {

    private static final String FILENAME : ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_strorage);

        if (getSupportActionBar()! = null)
            getSupportActionBar().setTitle("internal storage");

        View tvContent = findViewById(R.id.tv_content_internal);
        Button btShowPath = findViewById(R.id.bt_show_path_internal);
        Button btBuatFile = findViewById(R.id.bt_buat_file_internal);
        Button btUbahFile = findViewById(R.id.bt_ubah_file_internal);
        Button btBacaFile = findViewById(R.id.bt_baca_file_internal);
        Button btHapusFile = findViewById(R.id.bt_hapus_file_internal);

        btShowPath.setOnClickListener(this::showPath);
        btBuatFile.setOnClickListener(this::buatFile);
        btUbahFile.setOnClickListener(this::ubahFile);
        btBacaFile.setOnClickListener(this::bacaFile);
        btHapusFile.setOnClickListener(this::hapusFile);
    }

    private void hapusFile(View view) {
        if(deleteFile(FILENAME))
            Toast.makeText(this, "File berhasil dihapus", Toast.LENGTH_SHORT).show();
            View Content.setText("");
    }

    private void setText(String s) {
    }

    private void bacaFile(View view) {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = openFileInput(FILENAME);
            int read;
            while ((read= fis.read())!)= -1)
            sb.append((char) read);
        }
    }

    private void ubahFile(View view) {
        try {
            FileOutputStream fos = openFileOutput(FILENAME,MODE_APPEND);
            fos.write("Bagian ini telah ditambahkan!\n".getBytes());
            fos.flush();
            fos.close();

            View tvContent.setText("");
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showPath(View view) {
    }

    private void buatFile(View view) {
        try {
            FileOutputStream fos = openFileOutput(FILENAME,MODE_PRIVATE);
            fos.write("Hello Internal Strorage\nMudah bukan?\n".getBytes());
            fos.flush();
            fos.close();

             View tvContent
                    catch (IOException e;
            e) {
                e.printStackTrace();
            }

        }


    }
}