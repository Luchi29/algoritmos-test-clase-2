package com.redbeeacademy.algoritmostest.Lista.EjercicioCine;

import java.util.*;

/*
Un cine de un pueblo nos pide que generemos una aplicacion para controlar las personas de una cola.
La edad de las personas de la cola se generan aleatoriamente entre 5 y 60 años (edad minima 5 - maxímo 60).
La capacidad de la sala es de 50 personas.
Deberemos mostrar:

1) la cantidad total recaudada
2) cuantas personas entraron por cada rango de edad
3) promedio de edad por cada estreno

Precios por edad
entre 5 y 10 años ->  $100
entre 11 y 17 años -> $150
de 18 en adelante -> $200

Tenemos la clase Persona, donde vamos a usarla para modelar edad, y las propiedades que crean convenientes
 */



public class Cine {




    public static double cantidadTotalRecaudada(List<Persona> personas){
        double cantidadTotal = 0;
        double entrada1 = 100;
        double entrada2 = 150;
        double entrada3 = 200;
        personas = new ArrayList<>(personas);
        personas.removeIf(Objects::isNull);
        for(Iterator<Persona> it = personas.iterator(); it.hasNext();) {
            Persona persona = it.next();

            if(persona.getEdad() >= 5 && persona.getEdad() <= 10){
                cantidadTotal += entrada1;
            }
            if(persona.getEdad() >= 11 && persona.getEdad() <= 17){
                cantidadTotal += entrada2;
            }
            if(persona.getEdad() >= 18){
                cantidadTotal += entrada3;
            }
        }


        return cantidadTotal;
    }

    public static Integer cantidadPersonas(List<Persona> personas){
        Integer cantidadPersonas = 0;
        personas = new ArrayList<>(personas);
        personas.removeIf(Objects::isNull);
        for(Integer i = 0; i < personas.size(); i++) {
            cantidadPersonas++;
        }

        return cantidadPersonas;
    }

    public static double promedioEdad(List<Persona> personas){
        double promedio = 0;
        double sumEdades = 0;
        personas = new ArrayList<>(personas);
        personas.removeIf(Objects::isNull);
        for(Iterator<Persona> it = personas.iterator(); it.hasNext();) {
            Persona persona = it.next();
            sumEdades += persona.getEdad();



        }
        promedio = sumEdades/personas.size();
        return promedio;
    }
}
