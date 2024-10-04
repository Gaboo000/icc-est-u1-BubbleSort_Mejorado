import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //MetodoOrdenamiento mO = new MetodoOrdenamiento();
        Scanner scanner = new Scanner(System.in);
        //int[] arr = {-68,198,10,984,89,-954,5};
        //int [] arrOrdenado = mO.sortBubbleAdvance(arr);

        //mO.printArray (arrOrdenado);
        System.out.println("Ingrese el tamanio del arreglo");
        int tamanio = scanner.nextInt();

        int[] array = new int[tamanio];

        if (tamanio <= 0){
            System.out.println("Ingreso invalido, porfavor introduzca un numero mayor a 0");
            return;
        }
        do{
            System.out.println( "Ingrese el tamanio que sea entero positivo");
            while(!scanner.hasNextInt()){
                System.out.println("Por favor ingrese un numero valido");
            }
            tamanio = scanner.nextInt();
            if(tamanio <=0 ){
                System.out.println("El tamanio debe ser entero  positivo");
            }
        }while(tamanio <=0);


        int[] arreglo = new int[tamanio];


        scanner.close();
    }
}
