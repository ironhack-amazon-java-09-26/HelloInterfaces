package exceptions;

import java.util.Scanner;

public class Main {
    static void main()  {
        String[] array = new String[]{"Hola", "Hello", "Ciao"};

Scanner scanner = new Scanner(System.in);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
//            System.out.println(array[8]);
            int x = scanner.nextInt();
            if (x == 42){
                throw new IronhackException();
            }
            System.out.println(x);
            System.out.println(array[x]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Algo ha ido mal has intentado acceder a un index que no es posible");
        } catch (NegativeArraySizeException e) {
            System.out.println("Algo ha ido mal quizas el array size es negativo");
        } catch (Exception e) {
            System.out.println("Algo ha ido mal: hace falta investigarlo bien");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

        System.out.println("El programa sigue");
    }
}
