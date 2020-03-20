package com.example.mathquiz.model;

import java.util.List;
import  java.util.ArrayList;

public class QuestaoRepositorio {
    public List<Questao> getListaQuestoes(){
        return new ArrayList<Questao>() {
            {
                add(new Questao("In a clothing Store, 1500 clothes are sold daily for 7 days. How many days will 200 clothes be sold?", 1, 3));
                add(new Questao("In a Charrascaria, 5 pigs are roasted, out of total of 10. If necessary to roast 3 pieces for 50 people, how many pigs will need to roast for 250 people?", 15, 20));
                add(new Questao("In a padaria I want to buy 500 cheese bread, how many people is needed to eat everything?", 1, 3));
                add(new Questao("In Android Studio class if a student bother the teacher about the question, how much will be his final grade?", 0, 100));
            }
        };
    }
}
