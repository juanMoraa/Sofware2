  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallersoftware;

/**
 *
 * @author Pc
 */
interface Envio { 
    double calcularcosto();
}

class EnvioEstandar implements Envio{
    private double peso;
    private double distancia;

    @Override
    public double calcularcosto() {
        return peso * 0.5 + distancia * 0.2 ;

    }

    
}

class EnvioExpres implements Envio{
    private double peso;
    private double distancia;

    @Override
    public double calcularcosto() {
        return peso * 0.5 + distancia * 0.2 ;

    }
}