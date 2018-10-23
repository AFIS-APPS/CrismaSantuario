package com.apps.afis.crismasantuario.Cadastro;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.apps.afis.crismasantuario.R;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

/**
 * A simple {@link Fragment} subclass.
 */
public class CadBasicoFragment extends Fragment {

    EditText nome, endereco, cep, telefone;

    public CadBasicoFragment() {
        // Required empty public constructor
    }

    public String getNome() {
        return nome.getText().toString();
    }

    public void setNome(String nome) {
        this.nome.setText(nome);
    }

    public String getEndereco() {
        return endereco.getText().toString();
    }

    public void setEndereco(String endereco) {
        this.endereco.setText(endereco);
    }

    public String getCep() {
        return cep.getText().toString();
    }

    public void setCep(String cep) {
        this.cep.setText(cep);
    }

    public String getTelefone() {
        return telefone.getText().toString();
    }

    public void setTelefone(String telefone) {
        this.telefone.setText(telefone);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_cad_basico, container, false);

        nome = view.findViewById(R.id.nomeCatequista);
        endereco = view.findViewById(R.id.enderecoCatequista);
        cep = view.findViewById(R.id.cepCatequista);
        telefone = view.findViewById(R.id.telefoneCatequista);

        SimpleMaskFormatter telefoneMask = new SimpleMaskFormatter("(NN) NNNNN-NNNN");
        SimpleMaskFormatter cepMask = new SimpleMaskFormatter("NNNNN-NNN");

        MaskTextWatcher telefoneWatcher = new MaskTextWatcher(telefone, telefoneMask);
        MaskTextWatcher cepWatcher = new MaskTextWatcher(cep, cepMask);

        telefone.addTextChangedListener(telefoneWatcher);
        cep.addTextChangedListener(cepWatcher);


        return view;
    }

}
