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

        Button h = this.findViewById(R.id.e001);
        final MediaPlayer mp001 = MediaPlayer.create(this, R.raw.hidrogeno);
        h.setOnClickListener(v001 -> mp001.start());

        Button he = this.findViewById(R.id.e002);
        final MediaPlayer mp002 = MediaPlayer.create(this, R.raw.helio);
        he.setOnClickListener(v002 -> mp002.start());

        Button li = this.findViewById(R.id.e003);
        final MediaPlayer mp003 = MediaPlayer.create(this, R.raw.litio);
        li.setOnClickListener(v003 -> mp003.start());

        Button be = this.findViewById(R.id.e004);
        final MediaPlayer mp004 = MediaPlayer.create(this, R.raw.berilio);
        be.setOnClickListener(v004 -> mp004.start());

        Button b = this.findViewById(R.id.e005);
        final MediaPlayer mp005 = MediaPlayer.create(this, R.raw.boro);
        b.setOnClickListener(v005 -> mp005.start());

        Button c = this.findViewById(R.id.e006);
        final MediaPlayer mp006 = MediaPlayer.create(this, R.raw.carbono);
        c.setOnClickListener(v006 -> mp006.start());

        Button n = this.findViewById(R.id.e007);
        final MediaPlayer mp007 = MediaPlayer.create(this, R.raw.nitrogeno);
        n.setOnClickListener(v007 -> mp007.start());

        Button o = this.findViewById(R.id.e008);
        final MediaPlayer mp008 = MediaPlayer.create(this, R.raw.oxigeno);
        o.setOnClickListener(v008 -> mp008.start());

        Button f = this.findViewById(R.id.e009);
        final MediaPlayer mp009 = MediaPlayer.create(this, R.raw.fluor);
        f.setOnClickListener(v009 -> mp009.start());

        Button ne = this.findViewById(R.id.e010);
        final MediaPlayer mp010 = MediaPlayer.create(this, R.raw.neon);
        ne.setOnClickListener(v010 -> mp010.start());

        Button na = this.findViewById(R.id.e011);
        final MediaPlayer mp011 = MediaPlayer.create(this, R.raw.sodio);
        na.setOnClickListener(v011 -> mp011.start());

        Button mg = this.findViewById(R.id.e012);
        final MediaPlayer mp012 = MediaPlayer.create(this, R.raw.magnesio);
        mg.setOnClickListener(v012 -> mp012.start());

        Button al = this.findViewById(R.id.e013);
        final MediaPlayer mp013 = MediaPlayer.create(this, R.raw.aluminio);
        al.setOnClickListener(v013 -> mp013.start());

        Button si = this.findViewById(R.id.e014);
        final MediaPlayer mp014 = MediaPlayer.create(this, R.raw.silicio);
        si.setOnClickListener(v014 -> mp014.start());

        Button p = this.findViewById(R.id.e015);
        final MediaPlayer mp015 = MediaPlayer.create(this, R.raw.fosforo);
        p.setOnClickListener(v015 -> mp015.start());

        Button s = this.findViewById(R.id.e016);
        final MediaPlayer mp016 = MediaPlayer.create(this, R.raw.azufre);
        s.setOnClickListener(v016 -> mp016.start());

        Button cl = this.findViewById(R.id.e017);
        final MediaPlayer mp017 = MediaPlayer.create(this, R.raw.cloro);
        cl.setOnClickListener(v017 -> mp017.start());

        Button ar = this.findViewById(R.id.e018);
        final MediaPlayer mp018 = MediaPlayer.create(this, R.raw.argon);
        ar.setOnClickListener(v018 -> mp018.start());

        Button k = this.findViewById(R.id.e019);
        final MediaPlayer mp019 = MediaPlayer.create(this, R.raw.potasio);
        k.setOnClickListener(v019 -> mp019.start());

        Button ca = this.findViewById(R.id.e020);
        final MediaPlayer mp020 = MediaPlayer.create(this, R.raw.calcio);
        ca.setOnClickListener(v020 -> mp020.start());
    }
    //https://stackoverflow.com/questions/5706942/possibility-to-add-parameters-in-button-xml
    /*<ImageButton (...) android:onClick="goToPage" android:tag="25"/>

    public void goToPage(View v) {
        String pageNumber = v.getTag().toString();
    }*/
    //https://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    // buscar una forma de enviar el
}