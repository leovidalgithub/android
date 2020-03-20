package com.example.mathquiz.model;

public class AnalisadorQuestao {
    public boolean isRespostaCorreta(Questao _questao, double _resposta) {
      return _questao.getRespostaCorreta() == _resposta;
    }
}
