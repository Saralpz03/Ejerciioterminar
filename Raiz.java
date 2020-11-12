/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofit2;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(name="root",strict=false)
public class Raiz {
    @Element(name="root")
    private String nombre;
    @ElementList
    private List<Dia> prediccion;

    public Raiz(String nombre, List<Dia> prediccion) {
        this.nombre = nombre;
        this.prediccion = prediccion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public List<Dia> getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(List<Dia> prediccion) {
        this.prediccion = prediccion;
    }

    @Override
    public String toString() {
        return "Raiz{" + "nombre_municipio=" + nombre + ", prediccion=" + prediccion + '}';
    }

    
    
}
