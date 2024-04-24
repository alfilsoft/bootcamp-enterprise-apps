package maquinacafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cafetera {

    public static void main(String[] args){
        System.out.println("Inicio Cafetera");

        Cafe expreso = new Cafe("Expreso",50,"mediano");
        Cafe americano = new Cafe("Americano", 30, "pequeno");
        Cafe conLeche = new Cafe("Con Leche", 40, "pequeno");

        List<Cafe> listaCafes = Arrays.asList(expreso, americano,conLeche);

        OpcionAzucar poco = new OpcionAzucar("poco",1);
        OpcionAzucar normal = new OpcionAzucar("normal",2);
        OpcionAzucar mucha = new OpcionAzucar("mucha",4);


        List<OpcionAzucar> listaOpciones = Arrays.asList(poco,mucha,normal);

        OpcionLeche pocaLeche = new OpcionLeche("Poca leche",10);
        OpcionLeche normalLeche= new OpcionLeche("Normal leche",25);;
        OpcionLeche muchaLeche = new OpcionLeche("Mucha leche",50);;

        List<OpcionLeche> listaLeche = Arrays.asList(pocaLeche,normalLeche,muchaLeche);

        System.out.println("Opciones cafe");
        for(Cafe cafe: listaCafes){
            System.out.println(cafe);
        }

        System.out.println("Opciones azucar");
        for(OpcionAzucar opcionAzucar: listaOpciones){
            System.out.println(opcionAzucar);
        }

        System.out.println("Lista leche");
        for (OpcionLeche opcionLeche: listaLeche){
            System.out.println(opcionLeche);
        }

    }
    public void preparar(){

    }
}
