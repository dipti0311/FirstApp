package com.example.android.amulindia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

@Override
    public boolean onCreateOptionsMenu(Menu menu)
{
    MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.menu.main_menu,menu);
return super.onCreateOptionsMenu(menu);

}






}
