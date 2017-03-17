package com.mobileappscompany.training.fragment10;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
Button b;

    public F1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f1, container, false);

        b = (Button) v.findViewById(R.id.btnSwitch);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IF1 mPA = (IF1) getActivity();
                mPA.switch2F2();
            }
        });

        return  v;
    }

    public interface IF1 {
        public void switch2F2();
    }

}
