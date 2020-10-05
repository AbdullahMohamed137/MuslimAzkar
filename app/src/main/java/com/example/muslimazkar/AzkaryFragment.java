package com.example.muslimazkar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AzkaryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_azkary,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final sql SQL = new sql(getContext());

        BaseAdapter2 baseAdapter = new BaseAdapter2(SQL.read_data(),getContext(),getActivity());
        ListView favorite = view.findViewById(R.id.myfavoriteazkar);
        favorite.setAdapter(baseAdapter);




    }
}
