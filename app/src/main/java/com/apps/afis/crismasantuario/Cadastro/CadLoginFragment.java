package com.apps.afis.crismasantuario.Cadastro;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.apps.afis.crismasantuario.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CadLoginFragment extends Fragment {

    public EditText email, senha, confirmaSenha;

    public CadLoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cad_login, container, false);

        email = (EditText) view.findViewById(R.id.emailCatequista);
        senha = (EditText) view.findViewById(R.id.senhaCatequista);
        confirmaSenha = (EditText) view.findViewById(R.id.catequistaConfirmaSenha);

        return view;
    }

    public String getEmail() {
        return email.getText().toString();
    }

    public void setEmail(String email) {
        this.email.setText(email);
    }

    public String getSenha() {
        return senha.getText().toString();
    }

    public void setSenha(String senha) {
        this.senha.setText(senha);
    }

    public String getConfirmaSenha() {
        return confirmaSenha.getText().toString();
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha.setText(confirmaSenha);
    }
}
