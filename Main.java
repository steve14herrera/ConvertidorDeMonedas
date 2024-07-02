import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Consultas consulta = new Consultas();

        int opcion=0;
        while (opcion !=7){
            System.out.println("**************************\n" +
                    "Bienvenido al convertidor de moneda\n" +
                    "Ingrese una opción\n" +
                    "1. Dolar a peso Argentino\n" +
                    "2. Peso Argentino a Dolar\n" +
                    "3. Dolar a Real brasilero\n" +
                    "4. Real brasilero a Dolar\n" +
                    "5. Dolar a peso Colombiano\n" +
                    "6. Peso Colombiano a Dolar\n" +
                    "7. Salir");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertidorMone.convertidor("Usd" , "Ars" ,consulta, lectura);
                    break;
                case 2:
                    ConvertidorMone.convertidor("Ars" , "Usd" ,consulta, lectura);
                    break;
                case 3:
                    ConvertidorMone.convertidor("Usd" , "Brl" ,consulta, lectura);
                    break;
                case 4:
                    ConvertidorMone.convertidor("Brl" , "Usd" ,consulta, lectura);
                    break;
                case 5:
                    ConvertidorMone.convertidor("Usd" , "Cop" ,consulta, lectura);
                    break;
                case 6:
                    ConvertidorMone.convertidor("Cop" , "Usd" ,consulta, lectura);
                    break;
                case 7:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("repita una opcion del 1 a 7");

            }



        }
    }
}