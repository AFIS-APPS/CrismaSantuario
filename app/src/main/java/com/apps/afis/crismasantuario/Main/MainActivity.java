package com.apps.afis.crismasantuario.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.apps.afis.crismasantuario.Cadastro.CadastroCatequistaActivity;
import com.apps.afis.crismasantuario.R;

public class MainActivity extends AppCompatActivity {

    ImageView btCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCadastrar = findViewById(R.id.btCadastrar);
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, CadastroCatequistaActivity.class));
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    LayoutInflater inflater = getActivity().getLayoutInflater();

    //Define a view do Alert Dialog de acordo com o que é retornado pelo método inflate
    //O método inflate recebe como parametros o layout a ser inflado na view, e null pois o mesmo será inflado dentro de uma Dialog; 
    builder.setView(inflater.inflate(R.layout.modelo_LoginDialog, null))
           .setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int id) {
                   
               }
           })
           .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int id) {
                   dialog.dismiss();
               }
           });
     builder.create();
     builder.show();
            }
        });
    }
}
