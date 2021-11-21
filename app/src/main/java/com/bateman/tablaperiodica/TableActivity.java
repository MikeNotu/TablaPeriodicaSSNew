package com.bateman.tablaperiodica;

import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class TableActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Button b1 = (Button) findViewById(R.id.btn_menu2);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        Button b2 = (Button) findViewById(R.id.btn_lista);
        b2.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), ListActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            overridePendingTransition(0,0);
        });

        Button one = this.findViewById(R.id.e1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.actinio);
        one.setOnClickListener(v -> mp.start());

        Button two = this.findViewById(R.id.e2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.hidrogeno);
        two.setOnClickListener(v2 -> mp2.start());

    }
    //https://stackoverflow.com/questions/5706942/possibility-to-add-parameters-in-button-xml
    /*<ImageButton (...) android:onClick="goToPage" android:tag="25"/>

    public void goToPage(View v) {
        String pageNumber = v.getTag().toString();
    }*/
    //https://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    // buscar una forma de enviar el
}