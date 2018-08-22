package com.apps.afis.crismasantuario.Main;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.apps.afis.crismasantuario.Cadastro.CadastroCatequistaActivity;
import com.apps.afis.crismasantuario.R;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    ImageView btCadastrar, btLogar, btTurmas ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCadastrar = findViewById(R.id.btCadastrar);
        btLogar = findViewById(R.id.btLogar);
        btTurmas = findViewById(R.id.btTurmas);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CadastroCatequistaActivity.class));
            }
        });

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = MainActivity.this.getLayoutInflater();

                //Define a view do Alert Dialog de acordo com o que é retornado pelo método inflate
                //O método inflate recebe como parametros o layout a ser inflado na view, e null pois o mesmo será inflado dentro de uma Dialog;
                builder.setView(inflater.inflate(R.layout.modelo_login_dialog, null));
                builder.setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                   
                            }
                       });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                       });
                builder.create();
                builder.show();
            }
        });

        btTurmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = MainActivity.this.getLayoutInflater();

                //Define a view do Alert Dialog de acordo com o que é retornado pelo método inflate
                //O método inflate recebe como parametros o layout a ser inflado na view, e null pois o mesmo será inflado dentro de uma Dialog;
                builder.setView(inflater.inflate(R.layout.modelo_turmas_dialog, null));
                builder.setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
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
