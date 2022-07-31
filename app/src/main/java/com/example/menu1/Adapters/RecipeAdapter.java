package com.example.menu1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu1.Models.RecipeModel;
import com.example.menu1.R;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {
    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    ArrayList<RecipeModel>list;
    Context context;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview ,parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
      RecipeModel model= list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.nametext.setText(model.getNametext());
        holder.pricetag.setText(model.getPricetag());
        holder.pricetext.setText(model.getPricetext());
        holder.ratingtext.setText(model.getRating());
        holder.ratingstar.setImageResource(model.getStarpic());


    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView nametext;
        TextView pricetag;
        TextView pricetext;
        TextView ratingtext;
        ImageView ratingstar;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView= itemView.findViewById(R.id.imageView);
            nametext= itemView.findViewById(R.id.textname);
            pricetag=itemView.findViewById(R.id.textprice);
            pricetext=itemView.findViewById(R.id.textPrice);
            ratingtext= itemView.findViewById(R.id.ratingtext);
            ratingstar= itemView.findViewById(R.id.starimage);



        }
    }
}
