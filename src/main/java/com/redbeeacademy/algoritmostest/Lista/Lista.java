package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.*;

public class Lista {

    public static List<Integer> guardarEnLista(Integer numero){
        List<Integer> listaNums = new ArrayList<Integer>();
        if(numero != null) {
            listaNums.add(numero);
        } else {
            listaNums.add(0);
        }

        return listaNums;


    }

    public static List<Integer> intercambiar(List<Integer> lista){
        lista = new ArrayList(lista);
        lista.removeIf(Objects::isNull);
        Collections.swap(lista, 2, 4);
        return lista;
    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero){
        lista = new ArrayList<>(lista);
        lista.removeIf(Objects::isNull);
        lista.add(0, numero);
        return lista;
    }

    public static Double promedioLista(List<Integer> lista){
        lista = new ArrayList<>(lista);
        lista.removeIf(Objects::isNull);
        Double sum = 0.0;
        Double prom = 0.0;
        for(int i = 0; i < lista.size(); i++) {
            sum += lista.get(i);
        }
        prom = sum/lista.size();
        return prom;
    }

    public static List<Integer> eliminarMaximo(List<Integer> lista){
        lista = new ArrayList<>(lista);
        lista.removeIf(Objects::isNull);
        Integer max = Collections.max(lista);
        lista.remove(max);
        return lista;
    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b){
        a = new ArrayList<>(a);
        b = new ArrayList<>(b);
        a.removeIf(Objects::isNull);
        b.removeIf(Objects::isNull);
        ArrayList<Integer> repeated = new ArrayList<>();
        for(Integer i = 0; i < a.size(); i++){
            for(Integer j = 0; j < b.size(); j++) {
                if(a.get(i) == b.get(j)){
                    repeated.add(a.get(i));
                }
            }
        }
        return repeated;
    }



}
