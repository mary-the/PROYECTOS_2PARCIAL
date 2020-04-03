/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Maryt
 */
public class Dinero {
    private Double Peso = 0.05;
    private Double Dolar = 20.00;
   
    private Double Conversion;
    public Double convertir(Double cantidad,int eleccion){
        if(eleccion==1){
        return cantidad*Peso; //Esta convirtiendo a Peso
        }
        return cantidad*Dolar; //Esta convirtiendo a dolar
    }
}
