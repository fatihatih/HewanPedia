package com.example.middle;

import android.content.Context;

import com.example.middle.model.Burung;
import com.example.middle.model.Hewan;
import com.example.middle.model.Ikan;
import com.example.middle.model.Serangga;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Burung> DataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Kenari Yorkshire", "INGGRIS",
                "Kenari Yorkshire merupakan jenis burung kicau bersuara merdu yang berasal dari Inggris. ", R.drawable.kenari));
        burungs.add(new Burung("Murai Batu", "INDONESIA",
                "Jenis burung yang satu ini dikenal juga dengan sebutan kurica hutan. Di Indonesia sendiri, burung jenis ini banyak ditemui di daerah Pulau Sumatera. ", R.drawable.murai));
        burungs.add(new Burung("Love Bird", "INDONESIA",
                " Love Birds merupakan jenis burung kicau yang satu ini memiliki suara kicauan yang keras, lantang, dan merdu.", R.drawable.lovebird));
        burungs.add(new Burung("Cucak Rowo", "INDONESIA",
                "Cucak Rowo merupakan jenis burung kicau yang mumpuni. Di mana burung ini dapat mengeluarkan suara kicauan yang keras, jernih, dan menggema. ", R.drawable.cucak_rowo));
        burungs.add(new Burung("Jalak Bali", "INDONESIA",
                "Jalak Bali (Leucopsar rothschildi) adalah sejenis burung pengicau berukuran sedang, dengan panjang lebih kurang 25cm,[1] dari suku Sturnidae. ", R.drawable.jalak_bali));
        return burungs;
    }

    private static List<Ikan> DataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Ikan Cupang", "INDONESIA",
                "Cupang, ikan laga, atau ikan adu siam adalah ikan air tawar yang habitat asalnya adalah beberapa negara di Asia Tenggara, antara lain Indonesia, Thailand, Malaysia, Brunei Darussalam, Singapura,dan Vietnam. ", R.drawable.ikan_cupang));
        ikans.add(new Ikan("Ikan Hiu", "Lautan Dunia",
                " Merupakan salah satu Predator yang sangat mematikan yang ada di laut.", R.drawable.ikan_hiu));
        ikans.add(new Ikan("Ikan Guppy", "AMERIKA SELATAN",
                "Ikan Guppy memiliki bentuk tubuh seperti wanita yang mengenakan rok. Bentuknya juga menarik karena ikan ini memiliki ukuran yaitu kurang dari 2,5 cm jika diukur dari kepala ke ekor.", R.drawable.guppy));
        ikans.add(new Ikan(" Ikan Molly", "INDONESIA",
                "Ikan Molly sering juga disebut dengan ikan balon karena kebanyakan ikan molly memiliki perut yang buncit dan tubuh yang bundar. ", R.drawable.molly));
        ikans.add(new Ikan("Ikan Mas Koki", "INDONESIA",
                "Ikan ini memiliki karakteristik perut buncit dan warna yang cerah dan cantik yang membuat banyak orang menyukainya.", R.drawable.koki));
        return ikans;
    }

    private static List<Serangga> DataSerangga(Context ctx) {
        List<Serangga> seranggas = new ArrayList<>();
        seranggas.add(new Serangga("Kepik Pembajak", "INDONESIA",
                " serangga ini merupakan serangga yang mengonsumsi berbagai jenis telur dari hama pengganggu yang menempel pada daun di tanaman.", R.drawable.kepik));
        seranggas.add(new Serangga("Lebah Madu", "ASIA",
                "Lebah merupakan serangga yang membantu bunga dan tanaman lain dalam proses penyerbukan agar tanaman bisa tumbuh dan berkembang dengan mudahnya.", R.drawable.lebah));
        seranggas.add(new Serangga("Laba-Laba", "SELURUH DUNIA",
                "Laba-laba merupakan salah satu serangga yang ampuh untuk membasmi berbagai serangga yang mengganggu lainnya. ", R.drawable.laba_laba));
        seranggas.add(new Serangga("Kepik Ladygup", "INDONESIA.",
                " Kepik jenis ini akan menjadi predator dan memakan berbagai jenis serangga berbeda yang mengganggu tanaman di rumah.", R.drawable.ladybug));
        seranggas.add(new Serangga("Lacewings", "INDONESIA.",
                "Lacewings atau singa kutu merupakan sebuah serangga yang tubuhnya memiliki warna kehijauan dan seolah tampak transparan.", R.drawable.lacewings));
        return seranggas;
    }

    private static void AllHewans(Context ctx) {
        hewans.addAll(DataBurung(ctx));
        hewans.addAll(DataIkan(ctx));
        hewans.addAll(DataSerangga(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            AllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            AllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

