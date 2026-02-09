import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E11EliminarPares  {
    public static void main(String[] args) {
        List<Integer> numero = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numero.add(i);
        }
        System.out.println("LISTA COMPLETA");
        for(int numeros : numero){
            System.out.print(numeros + " ");
        }

        /**
         * Se crea el iterator después de llenar el List
         */
        Iterator<Integer> iterator = numero.iterator();

        /**
         * hasNext --> mientras haya más en la lista
         */
        while (iterator.hasNext()) {
            int num = iterator.next(); // almacena en num el siguiente numero
            //Compara y si coincide borra
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println("LISTA SIN PARES");
        for(int numeros : numero){
            System.out.print(numeros + " ");
        }
    }
}