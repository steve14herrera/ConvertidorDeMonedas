import java.util.Scanner;

public class ConvertidorMone {
    public static void convertidor(String monedaBase, String monedaconvertida, Consultas consulta, Scanner lectura){
        double valor;
        double valorConvertido;

        Moneda moneda = consulta.buscaMonedas(monedaBase, monedaconvertida);
        System.out.println("la Conversion es de " +monedaBase+ "=" +moneda.conversion_rate()+ " "+ monedaconvertida);
        System.out.println("ingrese cantidad" +monedaBase);
        valor = Double.parseDouble(lectura.nextLine());
        valorConvertido = valor * moneda.conversion_rate();
        System.out.println(valor+" "+monedaBase + "=" +valorConvertido + " " +moneda.target_code());
    }
}
