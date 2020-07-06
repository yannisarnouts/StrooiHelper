package com.example.strooihelper.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.strooihelper.R;
import com.example.strooihelper.model.Soort;

public class SoortAdapter extends ArrayAdapter<Soort> {
    public SoortAdapter(Context context, Soort[] option) {
        super(context, -1, option);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        Soort soort = getItem(position);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_optionsbegindetail, parent, false);
        }

        TextView txtSoortnaam = view.findViewById(R.id.txtOptieBegin);
        txtSoortnaam.setText(soort.getOption());
        TextView txtSoortUitleg = view.findViewById(R.id.txtUitlegOptieBegin);
        txtSoortUitleg.setText(soort.getUitleg());
        ImageView imgSoort = view.findViewById(R.id.imgOptieBegin);
        imgSoort.setImageResource(soort.getImg());
        return view;
    }
}
