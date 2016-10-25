package com.example.lenovo.earthquake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by LENOVO on 25/10/2016.
 */

public class EarthquakeAdapter extends ArrayAdapter<QuakeObject> {


    public EarthquakeAdapter(Context context ,List<QuakeObject> eark){
        super(context,0,eark);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View listItemView= convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.layout,parent,false);
        }
        QuakeObject currnetObject = getItem(position);

        TextView textViewMagnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        textViewMagnitude.setText(currnetObject.getmMagnitude());

        TextView textViewLocation = (TextView) listItemView.findViewById(R.id.location);
        textViewLocation.setText(currnetObject.getmLocation());

        TextView textViewDate = (TextView) listItemView.findViewById(R.id.date);
        textViewDate.setText(currnetObject.getmDate());



        return listItemView;
    }
}
