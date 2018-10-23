package com.apps.afis.crismasantuario.Cadastro;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.apps.afis.crismasantuario.Main.MainActivity;
import com.apps.afis.crismasantuario.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CadastroCatequistaActivity extends AppCompatActivity {

    ImageButton avancar, retornar, confirmar;
    Boolean status;
    final CadLoginFragment cadLoginFragment = new CadLoginFragment();
    final CadBasicoFragment cadBasicoFragment = new CadBasicoFragment();
//    Cadastro Básico
    private String nome, endereco, cep, telefone;
//    Cadastro Login
    private String email, senha, confirmaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_catequista);

//        Inicializando botões
        avancar = findViewById(R.id.btAvancarCadastro);
        retornar = findViewById(R.id.btRetornarCadastro);
        confirmar = findViewById(R.id.btConfirmarCadastro);

//        Inicializando Fragments
        final FragmentManager fragmentManager = getFragmentManager(); // Inicializa gerenciador de Fragments
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, cadLoginFragment);
        fragmentTransaction.commit();

//        Ações
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validaCadastroLogin()) {

                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, cadBasicoFragment);
                    fragmentTransaction.commit();

                    avancar.setVisibility(View.INVISIBLE);
                    retornar.setVisibility(View.VISIBLE);
                    confirmar.setVisibility(View.VISIBLE);

                }
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
                if(validaCadastroBasico()) {
                    FirebaseAuth.getInstance().addAuthStateListener(new FirebaseAuth.AuthStateListener() {
                        @Override
                        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                            firebaseAuth.createUserWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                    }
                                }
                            });
                        }
                    });

                }

            }
        });

    }

    private Boolean validaCadastroLogin(){


        email = cadLoginFragment.getEmail().trim();
        senha = cadLoginFragment.getSenha().trim();
        confirmaSenha = cadLoginFragment.getConfirmaSenha().trim();

        if(!email.equals("") || senha.equals("") || confirmaSenha.equals("")) {
            if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                    +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*"
                                    + "(\\.[A-Za-z]{2,})$")){

                if (senha.length() < 3) {
                    Toast.makeText(this, "Para sua segurança, por favor digite uma senha com mais de 3 digitos!", Toast.LENGTH_LONG).show();
                    return false;
                }

                if(!senha.equals(confirmaSenha)){
                    Toast.makeText(this, "Senhas incompatíveis. Verifique se as senhas informadas são iguais!", Toast.LENGTH_LONG).show();
                    return false;
                }

                return true;

            }else{
                Toast.makeText(this, "E-mail inválido!", Toast.LENGTH_SHORT).show();
                return false;
            }

        }else{
            Toast.makeText(this, "Preencha todas as informações para continuar!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private Boolean validaCadastroBasico(){

        nome = cadBasicoFragment.getNome();
        endereco = cadBasicoFragment.getEndereco();
        cep = cadBasicoFragment.getCep().trim();
        telefone = cadBasicoFragment.getTelefone().trim();

        if(nome.matches("[0-9 *]+$")){
            Toast.makeText(this, "O campo nome nao permite números ou caracteres especiais!", Toast.LENGTH_LONG).show();
            return false;
        }

        if(!endereco.matches("^([A-Za-z0-9 .-])+(, )+(.[0-9]+)$")){
            Toast.makeText(this, "Endereço inserido inválido!", Toast.LENGTH_LONG).show();
            return false;
        }

        if(!cep.matches("^([0-9]){5}-([0-9]){3}")){
            Toast.makeText(this, "CEP inserido inválido!", Toast.LENGTH_LONG).show();
            return false;
        }
        if(!telefone.matches("^(\\(([1-9]){2}\\))([0-9]){4,5}-(([0-9]){4})$")){
            Toast.makeText(this, "Telefone inserido inválido!", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }
}
