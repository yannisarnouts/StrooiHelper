package com.example.strooihelper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.strooihelper.adapter.OptionAdapter;
import com.example.strooihelper.model.Option;

public class MestOptionActivity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        listView = findViewById(R.id.lstOption);
        OptionAdapter optionAdapter = new OptionAdapter(this, Option.mestOptions);
        listView.setAdapter(optionAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                String item = (String) listView.getItemAtPosition(i).toString();
                if (item.equals("Van de kantstrooien")) {
                    intent = new Intent(MestOptionActivity.this, DetailActivity.class);
                    intent.putExtra("item", item);
                    startActivity(intent);
                } else if (item.equals("Snel lossen/leegmaken")) {
                    intent = new Intent(MestOptionActivity.this, DetailActivity.class);
                    intent.putExtra("item", item);
                    startActivity(intent);
                } else if(item.equals("Dosering")){
                    intent = new Intent(MestOptionActivity.this, DetailActivity.class);
                    intent.putExtra("item", "mest" + item);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "nog niet beschikbaar", Toast.LENGTH_LONG).show();
                }
//                    if(item.equals("Meststof keuze + Werbreedte")){
//                    intent = new Intent(MestOptionActivity.this, DetailActivity.class);
//                    intent.putExtra("item", item);
//                    startActivity(intent);
//            }
//                    else if(item.equals("Naar de kantstrooien")){
//                    intent = new Intent(MestOptionActivity.this, DetailActivity.class);
//                    intent.putExtra("item", item);
//                    startActivity(intent);
//                }
//                else if(item.equals("Restant nog te strooien")){
//                    intent = new Intent(MestOptionActivity.this, DetailActivity.class);
//                    intent.putExtra("item", item);
//                    startActivity(intent);
//                }
            }
        });
    }
}
