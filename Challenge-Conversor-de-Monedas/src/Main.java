import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int eleccion = 0;
        while (eleccion != 7) {
            System.out.println("*********************************\n" +
                    "Bienvenido al challenge conversor de monedas\n\n" +
                    "Por favor, ingrese la conversión que desea realizar:\n\n" +
                    "1. Dólar a Peso Argentino\n" +
                    "2. Peso Argentino a Dólar\n" +
                    "3. Dólar a Real Brasilero\n" +
                    "4. Real Brasilero a Dólar\n" +
                    "5. Dólar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dólar\n" +
                    "7. Salir\n");
            eleccion = lectura.nextInt();
            lectura.nextLine();

            switch (eleccion) {
                case 1:
                    Conversion.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    Conversion.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    Conversion.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    Conversion.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    Conversion.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    Conversion.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Usted salió exitosamente!");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}