package com.example.android.growpet;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
//not completed
class Adaptor extends ArrayAdapter{

    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // Because we do not need this class to create textview(getView method will handle that),
    // hence 0 is used.
    public Adaptor(Activity context, ArrayList<Pet> pets, int colorID){
        super(context, 0, pets);/** called super class constructor: (@link ArrayAdapter)*/
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */



    }

