package com.mobileappscompany.training.fragment10;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {
TextView tV;

    public F2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_f2, container, false);

        tV = (TextView) v.findViewById(R.id.tV);

        Contact ct = getArguments().getParcelable("K");

        String s = ct.getFName() + " " + ct.getLName();

        tV.setText(s);

        return v;
    }

}
