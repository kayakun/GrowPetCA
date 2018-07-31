package com.example.android.growpet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class CreatePetGuide extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acrivity_main_notfound);

    Button addPet = findViewById(R.id.btnAddPet);
    //set a listener on btnAddPet:
       addPet.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),EditPet.class);
               startActivity(i);
           }
       }); //define wat the listener listeins for
        //when click, the user will see the add/edit pet activity

        }
}

