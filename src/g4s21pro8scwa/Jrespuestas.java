/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g4s21pro8scwa;

import java.util.StringTokenizer;

/**
 *
 * @author hp
 */
public class Jrespuestas {
    String[] respuestas = {
      "22 de enero","rojo","20","Aidan Gallagher","25 de diciembre"
    };
    
    String[] radioR = {
        "22 de enero,12 de septiembre,13 de diciembre,22 de mayo",
        "rojo,azul,morado,amarillo",
        "20,25,49,13",
        "Aidan Gallagher,Nadia Gallagher,Aidan Gayager,Aidan Gallager",
        "25 de diciembre,18 de abril,21 de septtiembre,6 de enero"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
}
