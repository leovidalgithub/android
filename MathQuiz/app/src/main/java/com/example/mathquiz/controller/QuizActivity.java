package com.example.mathquiz.controller;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mathquiz.R;
import com.example.mathquiz.model.AnalisadorQuestao;
import com.example.mathquiz.model.Questao;
import com.example.mathquiz.model.QuestaoRepositorio;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private QuestaoRepositorio repositorio = new QuestaoRepositorio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final Questao questao = repositorio.getListaQuestoes().get(0);

        TextView textViewTextoPregunta = findViewById(R.id.txtPregunta);
        textViewTextoPregunta.setText(questao.getTexto());

        Button botaoReposta1 = findViewById(R.id.btnReposta1);
        botaoReposta1.setText(String.valueOf(questao.getRespostaCorreta()));

        View.OnClickListener listenerResposta1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                final int min = 0;
//                final int max = repositorio.getListaQuestoes().size();
//                final int random = new Random().nextInt((max - min) + 1) + min;
//                Toast.makeText(QuizActivity.this, String.valueOf(random),Toast.LENGTH_SHORT).show();


                final String resposta = ((Button)v).getText().toString();
                AnalisadorQuestao analisadorQuestao = new AnalisadorQuestao();
                Questao questao = repositorio.getListaQuestoes().get(0);
                final String mensagem;

                if (analisadorQuestao.isRespostaCorreta(questao, Double.valueOf(resposta) )) {
                    mensagem = "Congrats! Correct Answer!";
                } else {
                    mensagem = "OMG! return to school!";
                }
                Toast.makeText(QuizActivity.this, mensagem,Toast.LENGTH_SHORT).show();
            }
        };
        botaoReposta1.setOnClickListener(listenerResposta1);

        Button botaoReposta2 = findViewById(R.id.btnReposta2);
        botaoReposta2.setText(String.valueOf(questao.getRespostaIncorreta()));
        botaoReposta2.setOnClickListener(listenerResposta1);

        Button botaoProximaPreginta = findViewById(R.id.btnNext);
        botaoProximaPreginta.setText("Next Question");

    }
}
