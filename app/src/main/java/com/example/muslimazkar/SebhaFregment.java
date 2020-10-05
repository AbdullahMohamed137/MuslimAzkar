package com.example.muslimazkar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Arrays;

public class SebhaFregment extends Fragment implements AdapterView.OnItemSelectedListener {
    View v ;
    Vibrator vibrator ;
    ProgressBar progressBar ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         v = inflater.inflate(R.layout.fragment_sebha,container,false);
         return  v ;
    }

    @SuppressLint("ResourceType")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<String> sebhatypes = new ArrayList<>();
        sebhatypes.addAll(Arrays.asList("سبحان الله","الحمدلله","الله أكبر","لا إله إلا الله","سبحان الله و بحمده سبحان الله العظيم"));

        //drop down menu....................................
        Spinner spinner = v.findViewById(R.id.spinner);
        ArrayAdapter gom3aa= new ArrayAdapter(getContext(),R.layout.editespinner,sebhatypes);
        gom3aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //color shm
        spinner.getBackground().setColorFilter(Color.rgb(0,0,0), PorterDuff.Mode.SRC_ATOP);
        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter(gom3aa);
        //end drop down..................................

        final TextView T = v.findViewById(R.id.sh2awa);
        Button tasbe7 = v.findViewById(R.id.tasbe7);
        progressBar = v.findViewById(R.id.progressBar);
        progressBar.setProgress(0);
        T.setText("0");


        //object  vibrator.......................(getActivity first علشان مش فى ال MAinACtivity)
        vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

        tasbe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String text = T.getText().toString();
                //int k = textToNumber(text)+1;
                //T.setText(numberToText(k));

                progressBar.setProgress(progressBar.getProgress()+1);
                T.setText(String.valueOf(progressBar.getProgress()));
                vibrator.vibrate(50);
            }
        });

        CardView reset = v.findViewById(R.id.cardView);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T.setText("0");
                progressBar.setProgress(0);
                vibrator.vibrate(100);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView number = v.findViewById(R.id.sh2awa);
        number.setText("0");
        progressBar.setProgress(0);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private String numberToText(int number){
        return String.valueOf(number);
    }

    private int textToNumber(String text){
        return Integer.valueOf(text);
    }
}
