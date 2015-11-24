package com.kg.matheus.guiavd;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar action = getSupportActionBar();
        action.setDisplayUseLogoEnabled(true);
        action.setDisplayShowHomeEnabled(true);
        action.setLogo(R.drawable.logo);
        action.setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));

    }

    public void onClick(View view){
        //Quando clica;
        Intent it = new Intent(MainActivity.this, TelaFeiticos.class);
        startActivity(it);
    }
}
