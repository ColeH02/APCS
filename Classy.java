package com.company;

import java.util.ArrayList;

public class Classy {
    ArrayList<Field> fieldlist;
    public Classy(ArrayList<Field> fieldlist){
        this.fieldlist = fieldlist;
    }
    public Object getFieldValue(String parameter){
        if(parameter.equals("age")){
            return "Integer";
        }
        else if(parameter.equals("favoriteColor")){
            return "String";
        }
        return null;
    }
    public Object getFieldName(Object age){
        if(age instanceof java.lang.String){
            return "favoriteColor";
        }
        else if(age instanceof java.lang.Integer){
            return "age";
        }
        return null;
    }
}
