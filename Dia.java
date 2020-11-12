/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofit2;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(strict=false)
public class Dia {
    @Attribute
    private String fecha;
    @Element
    Temperatura temperatura;
    //private String temperatura;

    /*public Dia(String fecha, String temperatura) {
        this.fecha = fecha;
        this.temperatura = temperatura;
    }*/

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /*public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    */

    @Override
    public String toString() {
        return "Dia{" + "fecha=" + fecha + ", temperatura=" + temperatura + '}';
    }
    

    
    
}
