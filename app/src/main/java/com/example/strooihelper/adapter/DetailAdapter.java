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
import com.example.strooihelper.model.Detail;

public class DetailAdapter extends ArrayAdapter<Detail> {
    public DetailAdapter(Context context, Detail[] instructies) {
        super(context, -1, instructies);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        Detail instructie = getItem(position);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.instructie, parent, false);
        }
        TextView txtUitleg = view.findViewById(R.id.txtUitleg);
        txtUitleg.setText(instructie.getUitleg());
        ImageView img = view.findViewById(R.id.imgUitleg);
        img.setImageResource(instructie.getImg());
        TextView txtStap = view.findViewById(R.id.txtStap);
        txtStap.setText(instructie.getStap());
        return view;
    }
}
