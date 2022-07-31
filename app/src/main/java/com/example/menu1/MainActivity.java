package com.example.menu1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ListView;

import com.example.menu1.Adapters.CategoryAdapter;
import com.example.menu1.Adapters.RecipeAdapter;
import com.example.menu1.Models.CategoryModel;
import com.example.menu1.Models.RecipeModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView categoryrecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerView);
        ArrayList<RecipeModel> list= new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food7 , "Zinger Burger", "Price:","250","4.2",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food5 , "Pizza", "Price:","900","4.3",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food4 , "Beef Burger", "Price:","550","4.5",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food3 , "Tikka Pizza", "Price:","950","4.2",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food2 , "Veg Pizza", "Price:","850","4.0",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food5 , "B.B.Q Pizza", "Price:","950","4.7",R.drawable.ic_baseline_star_24));
        list.add(new RecipeModel(R.drawable.food6 , "Cheese Fries", "Price:","250","4.2",R.drawable.ic_baseline_star_24));


        categoryrecyclerview=findViewById(R.id.catrecyclervivew);
        ArrayList<CategoryModel> list1 =new ArrayList<>();
        list1.add(new CategoryModel(R.drawable.food7,"Fries"));
        list1.add(new CategoryModel(R.drawable.food2,"Pizza"));
        list1.add(new CategoryModel(R.drawable.food3,"Pizza"));
        list1.add(new CategoryModel(R.drawable.food4,"Pizza"));
        list1.add(new CategoryModel(R.drawable.food5,"Pizza"));
        list1.add(new CategoryModel(R.drawable.food6,"Pizza"));
        list1.add(new CategoryModel(R.drawable.food3,"Pizza"));
        list1.add(new CategoryModel(R.drawable.food2,"Pizza"));


        CategoryAdapter adapter1=new CategoryAdapter(list1,this);
        categoryrecyclerview.setAdapter(adapter1);
        LinearLayoutManager layoutManager1= new LinearLayoutManager( this, LinearLayoutManager.HORIZONTAL,false);
        categoryrecyclerview.setLayoutManager(layoutManager1);

        categoryrecyclerview.setHasFixedSize(true);
        categoryrecyclerview.setNestedScrollingEnabled(false);





        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }




}