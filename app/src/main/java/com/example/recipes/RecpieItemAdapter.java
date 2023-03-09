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

public class RecpieItemAdapter extends ArrayAdapter<RecipeItem> {
    public RecpieItemAdapter(@NonNull Context context, int resource, @NonNull RecipeItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      RecipeItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.recipeitem,parent,false);
        TextView title = view.findViewById(R.id.title_txt);
        title.setText(item.name);
        TextView disc = view.findViewById(R.id.disc_txt);
        disc.setText(item.descripation);
        TextView num = view.findViewById(R.id.number_txt);
        num.setText(item.serialNo);
        ImageView imageView = view.findViewById(R.id.poster_iv);
        Picasso.get().load(item.imageUrl).into(imageView);
        return view;
    }
}
