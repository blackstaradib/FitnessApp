package com.example.adib.test.FragmentExercise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.example.adib.test.AdapterCardListExerciseFirst;
import com.example.adib.test.AdapterRecyclerViewCalender;
import com.example.adib.test.BackEnd.TypeExercise;
import com.example.adib.test.R;

import java.util.LinkedList;

/**
 * Created by ADIB on 04/08/2018.
 */


public class FragmentExerciseFirst extends Fragment {

    private View view=null;

    int index;

    LinkedList<TypeExercise> typeExerciseList = null;

    LinearLayout button =null;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {

        Bundle bundle=getArguments();
        index=bundle.getInt("index");
        view=inflater.inflate(R.layout.fragment_exercise_first,container,false);

        final AppCompatActivity activity= (AppCompatActivity) view.getContext();

        typeExerciseList=new LinkedList<>();
        typeExerciseList.add(new TypeExercise(55,"تمارين الجسم بالكامل"));
        typeExerciseList.add(new TypeExercise(212,"تمارين البطن"));
        typeExerciseList.add(new TypeExercise(545,"تمارين الأرداف"));
        typeExerciseList.add(new TypeExercise(789,"تمارين الذراعين"));
        typeExerciseList.add(new TypeExercise(492,"تمارين الساقين"));
        typeExerciseList.add(new TypeExercise(55,"تمارين الجسم بالكامل"));
        typeExerciseList.add(new TypeExercise(212,"تمارين البطن"));
        typeExerciseList.add(new TypeExercise(545,"تمارين الأرداف"));
        typeExerciseList.add(new TypeExercise(789,"تمارين الذراعين"));
        typeExerciseList.add(new TypeExercise(492,"تمارين الساقين"));

        RecyclerView recyclerView=view.findViewById(R.id.recyclerViewListviewTypeExercise);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        AdapterCardListExerciseFirst adapterCardListExerciseFirst =new AdapterCardListExerciseFirst(typeExerciseList);
        recyclerView.setAdapter(adapterCardListExerciseFirst);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        button=view.findViewById(R.id.button_calender_select_day);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinkedList<Integer> mlist =new LinkedList<>();
                for (int i = 1; i < 30; i++) {
                    mlist.add(i);
                }
//                GridView gridView = new GridView(activity);
//                gridView.setAdapter(new ArrayAdapter(activity,R.layout.dialog_calender));
//                gridView.setNumColumns(6);
//
//                AdapterRecyclerViewCalender adapterRecyclerViewCalender =new AdapterRecyclerViewCalender(activity,mlist);
//                gridView.setAdapter(adapterRecyclerViewCalender);
//
//                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
//                builder.setView(gridView);
//                builder.setTitle("Goto");
//                builder.show();
            }
        });

        return view;

    }


//    @Override
//    public void onDetach() {
//        super.onDetach();
//
//        try {
//            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
//            childFragmentManager.setAccessible(true);
//            childFragmentManager.set(this, null);
//
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//    }


}
