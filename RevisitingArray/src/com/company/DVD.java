package com.company;

public class DVD{
    DVD[] dvdarray = new DVD[15];
    String name;
    String author;
    int relDate;

    DVD(String name, String author, int relDate){
        this.name = name;
        this.author = author;
        this.relDate = relDate;
    }

    public void toSring(){
        System.out.println(this.name + " of " + this.author + " was released " + this.relDate);
    }

    public static void main(String args[]){
        DVD dv1 = new DVD("Stalker" , "Tarkovsky", 1980);
        dv1.toSring();
    }

}
