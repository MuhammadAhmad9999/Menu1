package com.example.menu1.Models;

public class CategoryModel {
    int catpic;
    String cattext;

    public CategoryModel(int catpic, String cattext) {
        this.catpic = catpic;
        this.cattext = cattext;
    }

    public int getCatpic() {
        return catpic;
    }

    public void setCatpic(int catpic) {
        this.catpic = catpic;
    }

    public String getCattext() {
        return cattext;
    }

    public void setCattext(String cattext) {
        this.cattext = cattext;
    }
}
