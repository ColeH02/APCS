package com.company;

public class Field {
    private String type;
    private String num;
    private String favoriteColor;
    private String color;
    public Field(String type, String num){
        this.type = type;
        this.num = num;
    }
    public Field(String type, String favoriteColor, String color){
        this.type = type;
        this.favoriteColor = favoriteColor;
        this.color = color;
    }
}
