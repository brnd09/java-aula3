package com.mycompany.Televisao;

import java.util.Random;

public class Televisao {

    String marca, tipo;
    int tamanho;

    void ligar() {
        Random rd = new Random();
        
        if (rd.nextInt(10) >= 5) {
            InOut.MsgDeAviso("Televisao", "Ligou ok!");
        }
        else
            InOut.MsgDeAviso("Televisao", "Deu ruim!");
    }

    void desligar() {

    }

    void mudarCanal() {

    }

}
