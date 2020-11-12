/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofit2;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * @author FP Mañana A
 */
public interface ServicioContaminacion {
    @GET("municipios/localidad_28079.xml")
    Call<Raiz> pedirClima();
}
