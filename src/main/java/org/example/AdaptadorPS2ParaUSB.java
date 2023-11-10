package org.example;

public class AdaptadorPS2ParaUSB extends ConexãoUSB {
    private TecladoPS2 tecladoPS2;

    public AdaptadorPS2ParaUSB(TecladoPS2 tecladoPS2) {
        this.tecladoPS2 = tecladoPS2;
    }
    @Override
    void conectarUSB() {
        System.out.println("Adaptando conexão PS2 para USB");
        tecladoPS2.conectarPS2();
    }
}