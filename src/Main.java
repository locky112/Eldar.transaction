import Negocio.Marca;
import Negocio.Persona;
import Negocio.Tarjeta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Persona p = new Persona("40545665", "Pepe", "Gomez", "1112345678", "pepe@fakemail.com");
        Tarjeta Tar1= new Tarjeta(Marca.VISA,"1535351331453",p,"02/2025", 500);

        System.out.println("Tarjeta");
        System.out.println(Tar1);

        System.out.println("Esperando...");
        Tarjeta validacion = new Tarjeta(validare);
        System.out.println(validacion);

    }
}