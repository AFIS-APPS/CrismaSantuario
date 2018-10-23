package com.apps.afis.crismasantuario.Administrador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.apps.afis.crismasantuario.Administrador.Supervisor.GerenciaTurmasActivity;
import com.apps.afis.crismasantuario.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AdicionarCrismandosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_crismandos);

        String msg = validarCrismando(null, null, null,null,null,null,null);

        if(msg.equals("")){
//            insere
        }else{
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, GerenciaTurmasActivity.class));
        }
    }

    public String validarCrismando(String idCrismando, String nomeCrismando, String foneCrismando, Date nascCrismando,
                                   String paiCrismando, String fonePaiCrismando, Boolean inserindo){

        if(idCrismando == null){
            return "Erro ao gerar ID para o Crismando!";
        }

        if(!nomeCrismando.matches("^([A-Z ]+)$")){
            return "Nome do Crismando inválido!";
        }

        if(foneCrismando.matches("^(\\(([1-9]){2}\\))([0-9]){4,5}-(([0-9]){4})$")) {
            return "Telefone inválido!";
        }

        if(nascCrismando != null){
            return "Data de nascimento inserida inválida!";
        }

        if(!paiCrismando.matches("^([A-Z ]+)$")){
            return "Nome do Pai/Responsável inválido!";
        }

        if(fonePaiCrismando.matches("^(\\(([1-9]){2}\\))([0-9]){4,5}-(([0-9]){4})$")){
            return "Telefone Pai/Responsável inválido!";
        }

            return "";
    }
}
