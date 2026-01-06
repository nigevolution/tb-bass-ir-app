package com.tbbass.ir;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IRListActivity extends Activity {

    String[] irs = {
            "BASS MODS",
            "FENDER ULTRA",
            "MAYONES JARBA 5",
            "MUSIC MAN",
            "SADOWSKY M5",
            "SADOWSKY METROLINE",
            "SMITH BASS",
            "WARWICK PROSERIES"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView list = new ListView(this);
        setContentView(list);

        list.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, irs));

        list.setOnItemClickListener((a, b, i, l) -> {
            String ir = irs[i];

            // ABRE O M-EFFECTS COM O IR
            Intent open = new Intent(Intent.ACTION_VIEW);
            open.setData(Uri.parse("mfx://import/" + ir.replace(" ", "_")));
            startActivity(open);
        });
    }
}
