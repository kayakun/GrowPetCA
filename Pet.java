package com.example.android.growpet;
//not completed
public class Pet {

    private String gName;
    private int gImageID;//implement later
    private int gDistance;//implement after map feature is available.-->calculate distance based on user's current location and logged location by pet owner
    private String gBreed;
    private int gBirthday;//probably also used in pet birthday reminder feature:)
    private char gGender;
    //create Pet object
    public Pet(String name,int imageID, String breed, int birthday, char gender){
        gImageID=imageID;
        gName=name;
        gBirthday=birthday;
        gBreed=breed;
        gGender=gender;
    }

    //get methods for community activity
    public String getName(){
        return gName;
    }

    public int getImageID(){
        return gImageID;
    }

    public int getDistance(){
        return gDistance;
    }

    public String getBreed(){
       return gBreed;
    }

    public int getBirthday(){
        return gBirthday;
    }

    public char getGender(){
        return gGender;
    }

}
