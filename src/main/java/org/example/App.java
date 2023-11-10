package org.example;
public class App {
    public static void main(String[] args) {

        TecladoPS2 tecladoPS2 = new TecladoPS2();


        AdaptadorPS2ParaUSB adaptador = new AdaptadorPS2ParaUSB(tecladoPS2);


        GabineteUSB gabinete = new GabineteUSB();
        gabinete.conectarUSB();
    }
}