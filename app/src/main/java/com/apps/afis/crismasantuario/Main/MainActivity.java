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
                startActivity(new Intent(MainActivity.this, CadastroCatequistaActivity.class));
            }
        });
    }
}
