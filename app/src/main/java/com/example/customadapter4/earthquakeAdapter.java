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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        magnitude.setText(qke.getMagnitude());

        TextView location = convertView.findViewById(R.id.location);
        location.setText(qke.getLocation());


        // create a new data object from time in milliseconds of the quake
        Date dateObject = new Date(qke.getTimeInMilliseconds());
        //find the textview
        TextView dateInMilliseconds = convertView.findViewById(R.id.date);
        String formattedDate = formatDate(dateObject);
        dateInMilliseconds.setText(formattedDate);

        // find TV with time
        TextView timeView = convertView.findViewById(R.id.time);
        String formattedTime = formatTime(dateObject);
        timeView.setText(formattedTime);


        return convertView;

    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}
