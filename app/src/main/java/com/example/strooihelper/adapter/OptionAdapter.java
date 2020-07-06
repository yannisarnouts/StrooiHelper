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
import com.example.strooihelper.model.Option;

public class OptionAdapter extends ArrayAdapter<Option> {
    public OptionAdapter(Context context, Option[] option) {
        super(context, -1, option);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        Option option = getItem(position);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_optiondetail, parent, false);
        }
        TextView txtOption = view.findViewById(R.id.txtOption);
        txtOption.setText(option.getOption());
        ImageView img = view.findViewById(R.id.imageInstructie);
        img.setImageResource(option.getImg());
        return view;
    }
}
