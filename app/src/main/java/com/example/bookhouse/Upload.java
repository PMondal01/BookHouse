package com.example.bookhouse;

public class Upload {

    private String imageName;
    private String imageUrl;

    public Upload()
    {

    }

    public Upload(String imageName,String imageUri)
    {
        this.imageName=imageName;
        this.imageUrl =imageUri;
    }

    public String getImageName()
    {
        return imageName;
    }

    public void setImageName(String imageName)
    {
        this.imageName=imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
