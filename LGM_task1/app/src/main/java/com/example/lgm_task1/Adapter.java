package com.example.lgm_task1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<Model> {
        private Context context;
        private List<Model> modelList;

        public Adapter(Context context, List<Model> modelList) {
            super(context, R.layout.testing, modelList);

            this.context = context;
            this.modelList = modelList;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.testing, null,true);

            // In this step we connect the XML with Java File
            TextView state = v.findViewById(R.id.cityname);
            TextView active = v.findViewById(R.id.active);
            TextView confirmed = v.findViewById(R.id.confirm);
            TextView migratedother = v.findViewById(R.id.other);
            TextView deceased = v.findViewById(R.id.deceased);
            TextView recovered = v.findViewById(R.id.recovered);

            TextView dconfirmed = v.findViewById(R.id.dconfirm);
            TextView ddeceased = v.findViewById(R.id.ddeceased);
            TextView drecovered = v.findViewById(R.id.drecovered);

            // Adding Data to modellist
            state.setText(modelList.get(position).getName());
            active.setText(modelList.get(position).getActive());
            confirmed.setText(modelList.get(position).getConfirmed());
            migratedother.setText(modelList.get(position).getMigratedother());
            deceased.setText(modelList.get(position).getDeceased());
            recovered.setText(modelList.get(position).getRecovered());

            dconfirmed.setText(modelList.get(position).getDconfirmed());
            ddeceased.setText(modelList.get(position).getDdeceased());
            drecovered.setText(modelList.get(position).getDrecovered());

            return v;
        }
    }