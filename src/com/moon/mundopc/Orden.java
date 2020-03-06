package com.moon.mundopc;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("ha superado el numero maximo de computadoras");
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            if (computadoras[i] != null) {
                System.out.println(computadoras[i]);
            }
        }
    }
}
