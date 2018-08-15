package com.example.adib.test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


/**
 * Created by ADIB on 15/08/2018.
 */

public class AdapterRecyclerViewCalender extends RecyclerView.Adapter<AdapterCardListExerciseSecond.ViewHolder> {


    private LayoutInflater mInflater;

    public AdapterRecyclerViewCalender(Context context) {
        mInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public AdapterCardListExerciseSecond.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCardListExerciseSecond.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
