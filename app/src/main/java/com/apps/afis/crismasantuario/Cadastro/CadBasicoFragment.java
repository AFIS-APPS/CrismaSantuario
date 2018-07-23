package com.apps.afis.crismasantuario.Cadastro;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.afis.crismasantuario.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CadBasicoFragment extends Fragment {


    public CadBasicoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cad_basico, container, false);
    }

}
