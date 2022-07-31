package com.example.menu1.Models;

public class RecipeModel {
    int pic;
    String nametext;
    String pricetag;
    String pricetext;
    String rating;
    int starpic;

    public RecipeModel(int pic, String nametext, String pricetag, String pricetext, String rating, int starpic) {
        this.pic = pic;
        this.nametext = nametext;
        this.pricetag = pricetag;
        this.pricetext = pricetext;
        this.rating = rating;
        this.starpic = starpic;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getNametext() {
        return nametext;
    }

    public void setNametext(String nametext) {
        this.nametext = nametext;
    }

    public String getPricetag() {
        return pricetag;
    }

    public void setPricetag(String pricetag) {
        this.pricetag = pricetag;
    }

    public String getPricetext() {
        return pricetext;
    }

    public void setPricetext(String pricetext) {
        this.pricetext = pricetext;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getStarpic() {
        return starpic;
    }

    public void setStarpic(int starpic) {
        this.starpic = starpic;
    }
}







