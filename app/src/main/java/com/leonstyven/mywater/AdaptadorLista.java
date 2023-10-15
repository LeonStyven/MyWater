package com.leonstyven.mywater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdaptadorLista extends ArrayAdapter<String> {
    public AdaptadorLista(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = li.inflate(R.layout.item_lista,parent,false);

        return super.getView(position, convertView, parent);
    }
}
