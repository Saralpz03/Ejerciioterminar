/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofit2;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 *
 * @author FP Mañana A
 */
public class main {
    public static void main(String[] args) {
        
        PeticionXML.pedirClimaAEMET();
        
        
        /*Retrofit retrofit = new Retrofit.Builder()
                //http://www.aemet.es/xml/municipios/localidad_28079.xml
        .baseUrl("http://www.aemet.es/xml/").addConverterFactory(GsonConverterFactory.create())
        .build();
        
        ServicioContaminacion service = retrofit.create(ServicioContaminacion.class);
        Call<Raiz> datos=service.pedirClima();
        datos.enqueue(new Callback<Raiz>() {
            @Override
            public void onResponse(Call<Raiz> call, Response<Raiz> rspns) {
                Raiz r=rspns.body();
                
                System.out.println("Datos: "+r);
                
                
            }

            @Override
            public void onFailure(Call<Raiz> call, Throwable thrwbl) {
                System.out.println("Huo un problema: "+thrwbl.getMessage());
            }
        });*/
        

    
        
    }
    public static void imprimirDatos(Raiz r){
        System.out.println("Datos: "+r);
    }
}
