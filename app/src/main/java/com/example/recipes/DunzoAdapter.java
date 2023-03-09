package com.example.recipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class DunzoAdapter extends ArrayAdapter<DunzoItem> {
    public DunzoAdapter(@NonNull Context context, int resource, @NonNull DunzoItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DunzoItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.dunzoitem,parent,false);
        TextView disc = view.findViewById(R.id.discount_txt);
        disc.setText(item.discount);
        TextView product = view.findViewById(R.id.product1_txt);
        product.setText(item.product);
        ImageView imageView = view.findViewById(R.id.produturl_iv);
        Picasso.get().load(item.imageUrlD).into(imageView);
        return view;
    }
}
