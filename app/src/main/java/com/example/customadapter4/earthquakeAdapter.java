package com.example.customadapter4;

import android.app.DownloadManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class earthquakeAdapter extends ArrayAdapter <quake> {
    public earthquakeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<quake> objects) {
        super(context, resource, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        quake qke = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.model, parent, false);
        }

        TextView magnitude = convertView.findViewById(R.id.magnitude);
        TextView location = convertView.findViewById(R.id.location);
        TextView date = convertView.findViewById(R.id.date);

        magnitude.setText(qke.getMagnitude());
        location.setText(qke.getLocation());
        date.setText(qke.getDate());

        return convertView;

    }
}
