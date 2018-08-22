package com.apps.afis.crismasantuario.Main;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.apps.afis.crismasantuario.Cadastro.CadastroCatequistaActivity;
import com.apps.afis.crismasantuario.R;

import java.util.Random;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        Configurando o que será exibido na tela
//        TextView frase = findViewById(R.id.teste);
//        frase.setText(fraseAleatoria());

//        Adicionando delay de 3seg há Splash Screen
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();


            }
        }, 3000);
    }


//    public String fraseAleatoria() {
//        String[] frases = {"'Eu sou o caminho, e a verdade, e a vida. Ninguém vem ao Pai, senão por mim.'",
//                "'Amai ao próximo como a ti mesmo, fazei pelos outros o que gostaríamos que os outros fizessem por nós.'",
//                "'Não diga a Deus que você tem um grande problema, diga ao teu problema que você tem um grande Deus'",
//                "'Quando você passar por momentos difíceis e se perguntar onde estará Deus, lembre-se que durante uma prova, o professor está em silêncio.'",
//                "'Seja qual for o seu problema fale com Deus, ele vai ajudar você.'",
//                "'Após a dor vem a alegria, pois Deus é amor e não te deixará sofrer'",
//                "'O mundo pode até fazer você chorar mas Deus te quer sorrindo.'",
//                "'Se permanecerdes em mim e minhas palavras permanecerem em vós, pedireis tudo o que quiserdes e vos será dado. ( João 15, 7)'",
//                "'Basta que sejam jovens para que eu vos ame (S. João Bosco)'",
//                "'Meu filho, não esqueças os meus ensinamentos e guarda no coração os meus preceitos (Pr 3, 1)'",
//                "'Mais felizes são os que ouvem a palavra de Deus e a põem em prática (Lc 11, 28)'",
//                "'No presente permanecem estas três coisas: fé, esperança e amor; mas a maior delas é o amor' (1Cor 13, 13)"};
//
//        Random random = new Random();
//        int value = random.nextInt(12);
//
//        return  frases[value];
//    }
}
