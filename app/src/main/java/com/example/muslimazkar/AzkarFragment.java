package com.example.muslimazkar;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class AzkarFragment extends Fragment implements AdapterView.OnItemSelectedListener{
    View v ;
    ArrayList<String> azkarlist2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_azkar,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<String> azkartypes = new ArrayList<>();
        azkarlist2 = new ArrayList<String>();
        /*azkartypes.addAll(Arrays.asList("أذكار الصباح","أذكار المساء","أذكار الصلاة","أذكار النوم","دعاء الركوب",
                "دعاء الإستخاره",
                "دعاء السفر"));
        */
        for (groupAzkar i:dataBase.getazkarlist()) {
            azkartypes.add(i.name);
        }

        
        //drop down menu............................
        Spinner spinner = v.findViewById(R.id.spinner_azkar);
        ArrayAdapter abdo = new ArrayAdapter(getContext(),R.layout.editespinner,azkartypes);
        abdo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //color shm
        spinner.getBackground().setColorFilter(Color.rgb(0,0,0), PorterDuff.Mode.SRC_ATOP);
        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter(abdo);
        //end drop down..................................


        ListBuilder();

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        groupAzkar g = dataBase.getazkarlist().get(i);
        azkarlist2.clear();
        azkarlist2 .addAll(g.listAzkar) ;
        ListBuilder();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void ListBuilder(){
        BaseAdapter baseAdapter = new BaseAdapter2(azkarlist2,getContext(),getActivity());
        ListView listView = v.findViewById(R.id.AzkarListView);
        listView.setAdapter(baseAdapter);
    }
}