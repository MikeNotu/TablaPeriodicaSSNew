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

        Button sc = this.findViewById(R.id.e021);
        final MediaPlayer mp021 = MediaPlayer.create(this, R.raw.escandio);
        sc.setOnClickListener(v021 -> mp021.start());

        Button ti = this.findViewById(R.id.e022);
        final MediaPlayer mp022 = MediaPlayer.create(this, R.raw.titanio);
        ti.setOnClickListener(v022 -> mp022.start());

        Button v = this.findViewById(R.id.e023);
        final MediaPlayer mp023 = MediaPlayer.create(this, R.raw.vanadio);
        v.setOnClickListener(v023 -> mp023.start());

        Button cr = this.findViewById(R.id.e024);
        final MediaPlayer mp024 = MediaPlayer.create(this, R.raw.cromo);
        cr.setOnClickListener(v024 -> mp024.start());

        Button mn = this.findViewById(R.id.e025);
        final MediaPlayer mp025 = MediaPlayer.create(this, R.raw.manganeso);
        mn.setOnClickListener(v025 -> mp025.start());

        Button fe = this.findViewById(R.id.e026);
        final MediaPlayer mp026 = MediaPlayer.create(this, R.raw.hierro);
        fe.setOnClickListener(v026 -> mp026.start());

        Button co = this.findViewById(R.id.e027);
        final MediaPlayer mp027 = MediaPlayer.create(this, R.raw.cobalto);
        co.setOnClickListener(v027 -> mp027.start());

        Button ni = this.findViewById(R.id.e028);
        final MediaPlayer mp028 = MediaPlayer.create(this, R.raw.niquel);
        ni.setOnClickListener(v028 -> mp028.start());

        Button cu = this.findViewById(R.id.e029);
        final MediaPlayer mp029 = MediaPlayer.create(this, R.raw.cobre);
        cu.setOnClickListener(v029 -> mp029.start());

        Button zn = this.findViewById(R.id.e030);
        final MediaPlayer mp030 = MediaPlayer.create(this, R.raw.zinc);
        zn.setOnClickListener(v030 -> mp030.start());

        Button ga = this.findViewById(R.id.e031);
        final MediaPlayer mp031 = MediaPlayer.create(this, R.raw.galio);
        ga.setOnClickListener(v031 -> mp031.start());

        Button ge = this.findViewById(R.id.e032);
        final MediaPlayer mp032 = MediaPlayer.create(this, R.raw.germanio);
        ge.setOnClickListener(v032 -> mp032.start());

        Button as = this.findViewById(R.id.e033);
        final MediaPlayer mp033 = MediaPlayer.create(this, R.raw.arsenico);
        as.setOnClickListener(v033 -> mp033.start());

        Button se = this.findViewById(R.id.e034);
        final MediaPlayer mp034 = MediaPlayer.create(this, R.raw.selenio);
        se.setOnClickListener(v034 -> mp034.start());

        Button br = this.findViewById(R.id.e035);
        final MediaPlayer mp035 = MediaPlayer.create(this, R.raw.bromo);
        br.setOnClickListener(v035 -> mp035.start());

        Button kr = this.findViewById(R.id.e036);
        final MediaPlayer mp036 = MediaPlayer.create(this, R.raw.kripton);
        kr.setOnClickListener(v036 -> mp036.start());

        Button rb = this.findViewById(R.id.e037);
        final MediaPlayer mp037 = MediaPlayer.create(this, R.raw.rubidio);
        rb.setOnClickListener(v037 -> mp037.start());

        Button sr = this.findViewById(R.id.e038);
        final MediaPlayer mp038 = MediaPlayer.create(this, R.raw.estroncio);
        sr.setOnClickListener(v038 -> mp038.start());

        Button y = this.findViewById(R.id.e039);
        final MediaPlayer mp039 = MediaPlayer.create(this, R.raw.itrio);
        y.setOnClickListener(v039 -> mp039.start());

        Button zr = this.findViewById(R.id.e040);
        final MediaPlayer mp040 = MediaPlayer.create(this, R.raw.circonio);
        zr.setOnClickListener(v040 -> mp040.start());

        Button nb = this.findViewById(R.id.e041);
        final MediaPlayer mp041 = MediaPlayer.create(this, R.raw.niobio);
        nb.setOnClickListener(v041 -> mp041.start());

        Button mo = this.findViewById(R.id.e042);
        final MediaPlayer mp042 = MediaPlayer.create(this, R.raw.molibdeno);
        mo.setOnClickListener(v042 -> mp042.start());

        Button tc = this.findViewById(R.id.e043);
        final MediaPlayer mp043 = MediaPlayer.create(this, R.raw.tecnecio);
        tc.setOnClickListener(v043 -> mp043.start());

        Button ru = this.findViewById(R.id.e044);
        final MediaPlayer mp044 = MediaPlayer.create(this, R.raw.rutenio);
        ru.setOnClickListener(v044 -> mp044.start());

        Button rh = this.findViewById(R.id.e045);
        final MediaPlayer mp045 = MediaPlayer.create(this, R.raw.rodio);
        rh.setOnClickListener(v045 -> mp045.start());

        Button pd = this.findViewById(R.id.e046);
        final MediaPlayer mp046 = MediaPlayer.create(this, R.raw.paladio);
        pd.setOnClickListener(v046 -> mp046.start());

        Button ag = this.findViewById(R.id.e047);
        final MediaPlayer mp047 = MediaPlayer.create(this, R.raw.plata);
        ag.setOnClickListener(v047 -> mp047.start());

        Button cd = this.findViewById(R.id.e048);
        final MediaPlayer mp048 = MediaPlayer.create(this, R.raw.cadmio);
        cd.setOnClickListener(v048 -> mp048.start());

        Button in = this.findViewById(R.id.e049);
        final MediaPlayer mp049 = MediaPlayer.create(this, R.raw.indio);
        in.setOnClickListener(v049 -> mp049.start());

        Button sn = this.findViewById(R.id.e050);
        final MediaPlayer mp050 = MediaPlayer.create(this, R.raw.estano);
        sn.setOnClickListener(v050 -> mp050.start());
    }
    //https://stackoverflow.com/questions/5706942/possibility-to-add-parameters-in-button-xml
    /*<ImageButton (...) android:onClick="goToPage" android:tag="25"/>

    public void goToPage(View v) {
        String pageNumber = v.getTag().toString();
    }*/
    //https://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    // buscar una forma de enviar el
}