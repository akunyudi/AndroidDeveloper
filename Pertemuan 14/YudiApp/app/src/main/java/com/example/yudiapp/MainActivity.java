package com.example.yudiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.mi_input_control:
                startActivity(new Intent(this, InputControl.class));
                break;
            case R.id.mi_listview_activity:
            startActivity(new Intent(this, ListView.class));
                break;
            case R.id.mi_recycleview_activity:
            startActivity(new Intent(this, RecycleView.class));
                break;
            case R.id.mi_quit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}