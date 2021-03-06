package com.company.theory;


public class DVD{
    String name;
    String author;
    int relDate;

    DVD(String name, String author, int relDate){
        this.name = name;
        this.author = author;
        this.relDate = relDate;
    }

    public String toSring(){
        return this.name + " of " + this.author + " was released " + this.relDate;
    }

    public static void main(String args[]){
        DVD[] dvdarray = new DVD[2];
        DVD dv1 = new DVD("Stalker" , "Tarkovsky", 1980);
        DVD dv2 = new DVD("LotR","Jeckson", 2001);
        dvdarray[0]=dv2;
        dvdarray[1] = dv1;


        for(int i = 0; i < dvdarray.length; ++i){
            System.out.println(dvdarray[i].toSring());
        }

        dv1.toSring();
    }

}
