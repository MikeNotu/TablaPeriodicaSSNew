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

        Button sb = this.findViewById(R.id.e051);
        final MediaPlayer mp051 = MediaPlayer.create(this, R.raw.hidrogeno);
        sb.setOnClickListener(v051 -> mp051.start());

        Button te = this.findViewById(R.id.e052);
        final MediaPlayer mp052 = MediaPlayer.create(this, R.raw.helio);
        te.setOnClickListener(v052 -> mp052.start());

        Button i = this.findViewById(R.id.e053);
        final MediaPlayer mp053 = MediaPlayer.create(this, R.raw.litio);
        i.setOnClickListener(v053 -> mp053.start());

        Button xe = this.findViewById(R.id.e054);
        final MediaPlayer mp054 = MediaPlayer.create(this, R.raw.berilio);
        xe.setOnClickListener(v054 -> mp054.start());

        Button cs = this.findViewById(R.id.e055);
        final MediaPlayer mp055 = MediaPlayer.create(this, R.raw.boro);
        cs.setOnClickListener(v055 -> mp055.start());

        Button ba = this.findViewById(R.id.e056);
        final MediaPlayer mp056 = MediaPlayer.create(this, R.raw.carbono);
        ba.setOnClickListener(v056 -> mp056.start());

        Button la = this.findViewById(R.id.e057);
        final MediaPlayer mp057 = MediaPlayer.create(this, R.raw.nitrogeno);
        la.setOnClickListener(v057 -> mp057.start());

        Button ce = this.findViewById(R.id.e058);
        final MediaPlayer mp058 = MediaPlayer.create(this, R.raw.oxigeno);
        ce.setOnClickListener(v058 -> mp058.start());

        Button pr = this.findViewById(R.id.e059);
        final MediaPlayer mp059 = MediaPlayer.create(this, R.raw.fluor);
        pr.setOnClickListener(v059 -> mp059.start());

        Button nd = this.findViewById(R.id.e060);
        final MediaPlayer mp060 = MediaPlayer.create(this, R.raw.neon);
        nd.setOnClickListener(v060 -> mp060.start());

        Button pm = this.findViewById(R.id.e061);
        final MediaPlayer mp061 = MediaPlayer.create(this, R.raw.sodio);
        pm.setOnClickListener(v061 -> mp061.start());

        Button sm = this.findViewById(R.id.e062);
        final MediaPlayer mp062 = MediaPlayer.create(this, R.raw.magnesio);
        sm.setOnClickListener(v062 -> mp062.start());

        Button eu = this.findViewById(R.id.e063);
        final MediaPlayer mp063 = MediaPlayer.create(this, R.raw.aluminio);
        eu.setOnClickListener(v063 -> mp063.start());

        Button gd = this.findViewById(R.id.e064);
        final MediaPlayer mp064 = MediaPlayer.create(this, R.raw.silicio);
        gd.setOnClickListener(v064 -> mp064.start());

        Button tb = this.findViewById(R.id.e065);
        final MediaPlayer mp065 = MediaPlayer.create(this, R.raw.fosforo);
        tb.setOnClickListener(v065 -> mp065.start());

        Button dy = this.findViewById(R.id.e066);
        final MediaPlayer mp066 = MediaPlayer.create(this, R.raw.azufre);
        dy.setOnClickListener(v066 -> mp066.start());

        Button ho = this.findViewById(R.id.e067);
        final MediaPlayer mp067 = MediaPlayer.create(this, R.raw.cloro);
        ho.setOnClickListener(v067 -> mp067.start());

        Button er = this.findViewById(R.id.e068);
        final MediaPlayer mp068 = MediaPlayer.create(this, R.raw.argon);
        er.setOnClickListener(v068 -> mp068.start());

        Button tm = this.findViewById(R.id.e069);
        final MediaPlayer mp069 = MediaPlayer.create(this, R.raw.potasio);
        tm.setOnClickListener(v069 -> mp069.start());

        Button yb = this.findViewById(R.id.e070);
        final MediaPlayer mp070 = MediaPlayer.create(this, R.raw.calcio);
        yb.setOnClickListener(v070 -> mp070.start());

        Button lu = this.findViewById(R.id.e071);
        final MediaPlayer mp071 = MediaPlayer.create(this, R.raw.escandio);
        lu.setOnClickListener(v071 -> mp071.start());

        Button hf = this.findViewById(R.id.e072);
        final MediaPlayer mp072 = MediaPlayer.create(this, R.raw.titanio);
        hf.setOnClickListener(v072 -> mp072.start());

        Button ta = this.findViewById(R.id.e073);
        final MediaPlayer mp073 = MediaPlayer.create(this, R.raw.vanadio);
        ta.setOnClickListener(v073 -> mp073.start());

        Button w = this.findViewById(R.id.e074);
        final MediaPlayer mp074 = MediaPlayer.create(this, R.raw.cromo);
        w.setOnClickListener(v074 -> mp074.start());

        Button re = this.findViewById(R.id.e075);
        final MediaPlayer mp075 = MediaPlayer.create(this, R.raw.manganeso);
        re.setOnClickListener(v075 -> mp075.start());

        Button os = this.findViewById(R.id.e076);
        final MediaPlayer mp076 = MediaPlayer.create(this, R.raw.hierro);
        os.setOnClickListener(v076 -> mp076.start());

        Button ir = this.findViewById(R.id.e077);
        final MediaPlayer mp077 = MediaPlayer.create(this, R.raw.cobalto);
        ir.setOnClickListener(v077 -> mp077.start());

        Button pt = this.findViewById(R.id.e078);
        final MediaPlayer mp078 = MediaPlayer.create(this, R.raw.niquel);
        pt.setOnClickListener(v078 -> mp078.start());

        Button au = this.findViewById(R.id.e079);
        final MediaPlayer mp079 = MediaPlayer.create(this, R.raw.cobre);
        au.setOnClickListener(v079 -> mp079.start());

        Button hg = this.findViewById(R.id.e080);
        final MediaPlayer mp080 = MediaPlayer.create(this, R.raw.zinc);
        hg.setOnClickListener(v080 -> mp080.start());

        Button ti = this.findViewById(R.id.e081);
        final MediaPlayer mp081 = MediaPlayer.create(this, R.raw.galio);
        ti.setOnClickListener(v081 -> mp081.start());

        Button pb = this.findViewById(R.id.e082);
        final MediaPlayer mp082 = MediaPlayer.create(this, R.raw.germanio);
        pb.setOnClickListener(v082 -> mp082.start());

        Button bi = this.findViewById(R.id.e083);
        final MediaPlayer mp083 = MediaPlayer.create(this, R.raw.arsenico);
        bi.setOnClickListener(v083 -> mp083.start());

        Button po = this.findViewById(R.id.e084);
        final MediaPlayer mp084 = MediaPlayer.create(this, R.raw.selenio);
        po.setOnClickListener(v084 -> mp084.start());

        Button at = this.findViewById(R.id.e085);
        final MediaPlayer mp085 = MediaPlayer.create(this, R.raw.bromo);
        at.setOnClickListener(v085 -> mp085.start());

        Button rn = this.findViewById(R.id.e086);
        final MediaPlayer mp086 = MediaPlayer.create(this, R.raw.kripton);
        rn.setOnClickListener(v086 -> mp086.start());

        Button fr = this.findViewById(R.id.e087);
        final MediaPlayer mp087 = MediaPlayer.create(this, R.raw.rubidio);
        fr.setOnClickListener(v087 -> mp087.start());

        Button ra = this.findViewById(R.id.e088);
        final MediaPlayer mp088 = MediaPlayer.create(this, R.raw.estroncio);
        ra.setOnClickListener(v088 -> mp088.start());

        Button ac = this.findViewById(R.id.e089);
        final MediaPlayer mp089 = MediaPlayer.create(this, R.raw.itrio);
        ac.setOnClickListener(v089 -> mp089.start());

        Button th = this.findViewById(R.id.e090);
        final MediaPlayer mp090 = MediaPlayer.create(this, R.raw.circonio);
        th.setOnClickListener(v090 -> mp090.start());

        Button pa = this.findViewById(R.id.e091);
        final MediaPlayer mp091 = MediaPlayer.create(this, R.raw.niobio);
        pa.setOnClickListener(v091 -> mp091.start());

        Button u = this.findViewById(R.id.e092);
        final MediaPlayer mp092 = MediaPlayer.create(this, R.raw.molibdeno);
        u.setOnClickListener(v092 -> mp092.start());

        Button np = this.findViewById(R.id.e093);
        final MediaPlayer mp093 = MediaPlayer.create(this, R.raw.tecnecio);
        np.setOnClickListener(v093 -> mp093.start());

        Button pu = this.findViewById(R.id.e094);
        final MediaPlayer mp094 = MediaPlayer.create(this, R.raw.rutenio);
        pu.setOnClickListener(v094 -> mp094.start());

        Button am = this.findViewById(R.id.e095);
        final MediaPlayer mp095 = MediaPlayer.create(this, R.raw.rodio);
        am.setOnClickListener(v095 -> mp095.start());

        Button cm = this.findViewById(R.id.e096);
        final MediaPlayer mp096 = MediaPlayer.create(this, R.raw.paladio);
        cm.setOnClickListener(v096 -> mp096.start());

        Button bk = this.findViewById(R.id.e097);
        final MediaPlayer mp097 = MediaPlayer.create(this, R.raw.plata);
        bk.setOnClickListener(v097 -> mp097.start());

        Button cf = this.findViewById(R.id.e098);
        final MediaPlayer mp098 = MediaPlayer.create(this, R.raw.cadmio);
        cf.setOnClickListener(v098 -> mp098.start());

        Button es = this.findViewById(R.id.e099);
        final MediaPlayer mp099 = MediaPlayer.create(this, R.raw.indio);
        es.setOnClickListener(v099 -> mp099.start());

        Button fm = this.findViewById(R.id.e100);
        final MediaPlayer mp100 = MediaPlayer.create(this, R.raw.estano);
        fm.setOnClickListener(v100 -> mp100.start());

        Button md = this.findViewById(R.id.e101);
        final MediaPlayer mp101 = MediaPlayer.create(this, R.raw.hidrogeno);
        md.setOnClickListener(v101 -> mp101.start());

        Button no = this.findViewById(R.id.e102);
        final MediaPlayer mp102 = MediaPlayer.create(this, R.raw.helio);
        no.setOnClickListener(v102 -> mp102.start());

        Button lr = this.findViewById(R.id.e103);
        final MediaPlayer mp103 = MediaPlayer.create(this, R.raw.litio);
        lr.setOnClickListener(v103 -> mp103.start());

        Button rf = this.findViewById(R.id.e104);
        final MediaPlayer mp104 = MediaPlayer.create(this, R.raw.berilio);
        rf.setOnClickListener(v104 -> mp104.start());

        Button db = this.findViewById(R.id.e105);
        final MediaPlayer mp105 = MediaPlayer.create(this, R.raw.boro);
        db.setOnClickListener(v105 -> mp105.start());

        Button sg = this.findViewById(R.id.e106);
        final MediaPlayer mp106 = MediaPlayer.create(this, R.raw.carbono);
        sg.setOnClickListener(v106 -> mp106.start());

        Button bh = this.findViewById(R.id.e107);
        final MediaPlayer mp107 = MediaPlayer.create(this, R.raw.nitrogeno);
        bh.setOnClickListener(v107 -> mp107.start());

        Button hs = this.findViewById(R.id.e108);
        final MediaPlayer mp108 = MediaPlayer.create(this, R.raw.oxigeno);
        hs.setOnClickListener(v108 -> mp108.start());

        Button mt = this.findViewById(R.id.e109);
        final MediaPlayer mp109 = MediaPlayer.create(this, R.raw.fluor);
        mt.setOnClickListener(v109 -> mp109.start());

        Button ds = this.findViewById(R.id.e110);
        final MediaPlayer mp110 = MediaPlayer.create(this, R.raw.neon);
        ds.setOnClickListener(v110 -> mp110.start());

        Button rg = this.findViewById(R.id.e111);
        final MediaPlayer mp111 = MediaPlayer.create(this, R.raw.sodio);
        rg.setOnClickListener(v111 -> mp111.start());

        Button cn = this.findViewById(R.id.e112);
        final MediaPlayer mp112 = MediaPlayer.create(this, R.raw.magnesio);
        cn.setOnClickListener(v112 -> mp112.start());

        Button nh = this.findViewById(R.id.e113);
        final MediaPlayer mp113 = MediaPlayer.create(this, R.raw.aluminio);
        nh.setOnClickListener(v113 -> mp113.start());

        Button fl = this.findViewById(R.id.e114);
        final MediaPlayer mp114 = MediaPlayer.create(this, R.raw.silicio);
        fl.setOnClickListener(v114 -> mp114.start());

        Button mc = this.findViewById(R.id.e115);
        final MediaPlayer mp115 = MediaPlayer.create(this, R.raw.fosforo);
        mc.setOnClickListener(v115 -> mp115.start());

        Button lv = this.findViewById(R.id.e116);
        final MediaPlayer mp116 = MediaPlayer.create(this, R.raw.azufre);
        lv.setOnClickListener(v116 -> mp116.start());

        Button ts = this.findViewById(R.id.e117);
        final MediaPlayer mp117 = MediaPlayer.create(this, R.raw.cloro);
        ts.setOnClickListener(v117 -> mp117.start());

        Button og = this.findViewById(R.id.e118);
        final MediaPlayer mp118 = MediaPlayer.create(this, R.raw.argon);
        og.setOnClickListener(v118 -> mp118.start());
    }
    //https://stackoverflow.com/questions/5706942/possibility-to-add-parameters-in-button-xml
    /*<ImageButton (...) android:onClick="goToPage" android:tag="25"/>

    public void goToPage(View v) {
        String pageNumber = v.getTag().toString();
    }*/
    //https://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    // buscar una forma de enviar el
}