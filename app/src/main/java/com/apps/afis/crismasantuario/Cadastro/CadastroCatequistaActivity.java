package com.apps.afis.crismasantuario.Cadastro;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.apps.afis.crismasantuario.R;

public class CadastroCatequistaActivity extends AppCompatActivity {

    ImageButton avancar, retornar, confirmar;
    Boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_catequista);

//        Inicializando botões
        avancar = findViewById(R.id.btAvancarCadastro);
        retornar = findViewById(R.id.btRetornarCadastro);
        confirmar = findViewById(R.id.btConfirmarCadastro);

//        Inicializando Fragments
        final CadLoginFragment cadLoginFragment = new CadLoginFragment();
        final CadBasicoFragment cadBasicoFragment = new CadBasicoFragment();

        final FragmentManager fragmentManager = getFragmentManager(); // Inicializa gerenciador de Fragments
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, cadLoginFragment);
        fragmentTransaction.commit();

//        Ações
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, cadBasicoFragment);
                fragmentTransaction.commit();

                avancar.setVisibility(View.INVISIBLE);
                retornar.setVisibility(View.VISIBLE);
                confirmar.setVisibility(View.VISIBLE);

            }
        });

        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, cadLoginFragment);
                fragmentTransaction.commit();

                retornar.setVisibility(View.INVISIBLE);
                avancar.setVisibility(View.VISIBLE);
                confirmar.setVisibility(View.INVISIBLE);

            }
        });

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
