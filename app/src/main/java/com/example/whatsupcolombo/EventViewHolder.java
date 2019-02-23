package com.example.whatsupcolombo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class EventViewHolder extends RecyclerView.ViewHolder {

    View EventView;
    private TextView Title;
    private ImageView ImageIcon;
    private TextView Ddescription;

    public EventViewHolder(@NonNull View itemView) {
        super(itemView);

        EventView = itemView;
    }

    //set details to recyclerview row
    public void setDetails(Context context, String TitleText, String DescriptionText, String Image) {
        //Views
        setupUI();
        //set data to views
        Title.setText(TitleText);
        Ddescription.setText(DescriptionText);
        Picasso.get().load(Image).into(ImageIcon);

        EventDisplayModel ev = new EventDisplayModel();
        ev.setTitle(TitleText);
        ev.setDescription(DescriptionText);


    }

    private void setupUI() {
        Title=EventView.findViewById(R.id.tv_title);
        ImageIcon=EventView.findViewById(R.id.img_eventphoto);
        Ddescription=EventView.findViewById(R.id.tv_description);
    }
}
