package com.bateman.tablaperiodica;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    private Button buttonAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Oxigeno 1");
        arrayList.add("Oxigeno 2");
        arrayList.add("Oxigeno 3");
        arrayList.add("Oxigeno 4");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.notification_sound_effect);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.notification_sound_effect2);

        listView.setAdapter((arrayAdapter));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    mediaPlayer.start();
                }
                if (i==2){
                    mediaPlayer2.start();
                }
            }
        });
        buttonAudio = findViewById(R.id.buttonAudio);

        buttonAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
}