package com.example.bookhouse;

import android.widget.EditText;

public class Upload {

    private String BookName;
    private String WritterName;
    private String Description;
    private String Price;
    private String imageUrl;

    public Upload()
    {

    }

    public Upload(String book_name, String writer_name,String description,String price,  String imageUri)
    {
        this.BookName =book_name;
        this.WritterName=writer_name;
        this.Description=description;
        this.Price=price;
        this.imageUrl =imageUri;
    }

    public String getBookName()
    {
        return BookName;
    }

    public void setBookName(String bookName)
    {
        this.BookName = bookName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getWritterName() {
        return WritterName;
    }

    public void setWritterName(String writterName) {
        WritterName = writterName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
