package com.apps.afis.crismasantuario.Administrador.Supervisor;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.apps.afis.crismasantuario.Models.Crismando;
import com.apps.afis.crismasantuario.R;

import java.util.ArrayList;
import java.util.Date;

public class AdicionaTurmasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiciona_turmas);

        String msg = validarTurma(null, null, null,null,null,null,null);

//        Verificar se o usuário está inserindo ou editando


        if(msg.equals("")){
//          insere


        }else{
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, GerenciaTurmasActivity.class));
        }
    }

    public String validarTurma(String idTurma, String descricaoTurma, Date dataCriacao, Date dataFechamento,
                               ArrayList<Crismando> crismandos, ArrayList<String> catequistas, Boolean inserindo){

        if(descricaoTurma == null){
            return "É necessário definir um nome para a turma!";
        }

        if(crismandos == null){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Aviso!");
            builder.setMessage("A turma encontra-se vazia. Deseja continuar?");
            builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {

                }
            });
            builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                }
            });
            builder.show();
        }

        if(catequistas == null){
            return "É necessário definir ao menos um catequista para ser responsável pela turma!";
        }else{
            if(catequistas.size() != 0){

            }
        }

        if( inserindo ){

            if(idTurma == null){
                return "É necessário definir um código para a turma!";
            }

            if(dataCriacao == null){
                return "Erro ao definir a data de criação da turma! Por favor, tente novamente mais tarde " +
                        "ou entre em contato com o administrador do sistema caso persista!";
            }

            if(catequistas.size() == 0){
                return "É necessário definir ao menos um catequista para ser responsável pela turma!";
            }else{

            }
        }else{

            if(descricaoTurma.equals("")){
                return "É necessário definir um nome para a turma!";
            }

            if(dataFechamento != null){

            }

        }

        return "";
    }

}
