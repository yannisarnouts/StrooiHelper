package com.example.strooihelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.strooihelper.adapter.SoortAdapter;
import com.example.strooihelper.model.Soort;

public class SoortActivity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionssoort);
        listView = findViewById(R.id.lstOptions);
        SoortAdapter soortAdapter = new SoortAdapter(this, Soort.opts);
        listView.setAdapter(soortAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                String item = (String) listView.getItemAtPosition(i).toString();
                if(item.equals("Kalk")){
                    intent = new Intent(SoortActivity.this, KalkOptionActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "klik op kalk", Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), item, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
