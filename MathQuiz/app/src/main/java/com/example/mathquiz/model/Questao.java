package com.example.mathquiz.model;

public class Questao {
    private String texto;
    private double respostaCorreta;
    private double respostaIncorreta;

    public Questao(String _texto, double _respostaCorreta, double _respostaIncorreta) {
        this.texto = _texto;
        this.respostaCorreta = _respostaCorreta;
        this.respostaIncorreta = _respostaIncorreta;
    }

    public String getTexto() {
        return this.texto;
    }
    public double getRespostaCorreta() {
        return this.respostaCorreta;
    }
    public double getRespostaIncorreta() {
        return this.respostaIncorreta;
    }
}
