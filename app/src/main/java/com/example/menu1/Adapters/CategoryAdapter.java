package com.example.menu1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu1.Models.CategoryModel;
import com.example.menu1.Models.RecipeModel;
import com.example.menu1.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewHolder> {

    ArrayList<CategoryModel> list;
    Context context;

    public CategoryAdapter(ArrayList<CategoryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_recyclerview ,parent, false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CategoryModel model=list.get(position);
        holder.catpic.setImageResource(model.getCatpic());
        holder.cattext.setText(model.getCattext());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
    ImageView catpic;
    TextView cattext;

    public viewHolder(@NonNull View itemView) {
        super(itemView);

        catpic= itemView.findViewById(R.id.cat_img);
        cattext = itemView.findViewById(R.id.cat_text);
    }
}
}
