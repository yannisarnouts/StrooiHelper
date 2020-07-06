package com.example.strooihelper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.strooihelper.adapter.DetailAdapter;
import com.example.strooihelper.model.Detail;

public class DetailActivity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        listView = findViewById(R.id.lstDetail);
        Bundle bundle = getIntent().getExtras();
        DetailAdapter detailAdapter;
        if(bundle.getString("item").equals("Instructies")){
            detailAdapter = new DetailAdapter(this, Detail.details);
            listView.setAdapter(detailAdapter);
        } else if(bundle.getString("item").equals("Fouten")){
            detailAdapter = new DetailAdapter(this, Detail.fouten);
            listView.setAdapter(detailAdapter);
            onItemClick();
        }else if(bundle.getString("item").equals("FOUT 1")){
            detailAdapter = new DetailAdapter(this, Detail.fout1);
            listView.setAdapter(detailAdapter);
        } else if(bundle.getString("item").equals("FOUT 2")){
            detailAdapter = new DetailAdapter(this, Detail.fout2);
            listView.setAdapter(detailAdapter);
        } else if(bundle.getString("item").equals("FOUT 3")){
            detailAdapter = new DetailAdapter(this, Detail.fout3);
            listView.setAdapter(detailAdapter);
        }else if(bundle.getString("item").equals("Dosering")){
            detailAdapter = new DetailAdapter(this, Detail.dosering);
            listView.setAdapter(detailAdapter);
        }else if(bundle.getString("item").equals("Veld beëindigen")){
            detailAdapter = new DetailAdapter(this, Detail.beindigen);
            listView.setAdapter(detailAdapter);
        }
        else {
            detailAdapter = null;
            listView.setAdapter(detailAdapter);
        }
    }
    public void onItemClick(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                String item = (String) listView.getItemAtPosition(i).toString();
                if(item.equals("FOUT 1")){
                    intent = new Intent(DetailActivity.this, DetailActivity.class);
                    intent.putExtra("item", item);
                    startActivity(intent);
                }else if(item.equals("FOUT 2")){
                    intent = new Intent(DetailActivity.this, DetailActivity.class);
                    intent.putExtra("item", item);
                    startActivity(intent);
                } else if(item.equals("FOUT 3")){
                    intent = new Intent(DetailActivity.this, DetailActivity.class);
                    intent.putExtra("item", item);
                    startActivity(intent);
                }
            }
        });
    }
}
