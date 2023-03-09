package com.example.recipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class WhatsAppAdapter extends BaseAdapter {
   public WhatsappItem[] items;

    public WhatsAppAdapter(WhatsappItem[] whatsappItems){
    items = whatsappItems;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       WhatsappItem item = (WhatsappItem) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.whatsappitem,parent,false);
        TextView title = view.findViewById(R.id.head_txt);
        title.setText(item.heading1);
        TextView disc =view.findViewById(R.id.disc1_txt);
        disc.setText(item.disc);
        TextView time = view.findViewById(R.id.time_txt);
        time.setText(item.timeAndDay);
        TextView unread = view.findViewById(R.id.number1_txt);
        unread.setText(item.unReadMessage);
        ImageView imageView = view.findViewById(R.id.wposter_iv);
        Picasso.get().load(item.imageUrl1).into(imageView);
        return view;

    }
}
