package persistenciadatos;

import java.io.IOException;
import java.util.*;
import static persistenciadatos.ManejoArchivos.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //crearArchivo("archivo\\Hola.txt");
        
        //escribirArchivo("archivo\\Hola.txt","Hola desde Java");
        
        //leerArchivo("archivo\\Hola.text");
        
        //eliminarArchivo("archivo\\Hola.text");

        /* List lista1 = new ArrayList();
        
        lista1.add(1);
        lista1.add("Renzo");
        lista1.add(32);
        lista1.add(true);
        
        for (Object dato : lista1){
            System.out.println(dato);
        }
        

        
        
        System.out.println(lista1.get(3));
        
        lista1.remove(0);
        
        lista1.forEach(dato -> {System.out.println(dato);});
        
        lista1.set(0,"Joaquin");
        
        lista1.forEach(dato -> {System.out.println(dato);});
        
        lista1.clear();
        
        System.out.println(lista1);
         */
//       //Conjunto -> devulve aleatorio
//       HashSet dias = new HashSet();
//       
//       dias.add("Lunes");
//       dias.add("Martes");
//       dias.add("Miercoles");
//       dias.add("Jueves");
//       dias.add("Viernes");
//       
//       for(Object dia : dias){
//           System.out.println(dia);
//       }
//       
//       //Para eliminar se debe elminar por nombre, no se puede por indice
//       
//        dias.remove("Lunes");
//        System.out.println(dias);
//        
//        dias.clear();
//        System.out.println(dias);
        Map numeros = new HashMap();

        numeros.put(1, "uno");
        numeros.put(2, "dos");
        numeros.put(3, "tres");
        numeros.put(4, "cuatro");
        numeros.put(5, "cinco");
        numeros.put(6, "seis");

        System.out.println(numeros);
        System.out.println(numeros.get(1));
        
        for (Object clave : numeros.values()){
            System.out.println(clave + " " + numeros.get(clave));
        }
        
        numeros.remove(5);
        System.out.println(numeros);

    }

}
