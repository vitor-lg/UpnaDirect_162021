package upna_direct_codificacion;

import java.time.Year;
import java.util.Scanner;

public class Vista implements Vista1 {
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RESET = "\u001B[0m";
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Integer consultarAñoNacimiento() {
        System.out.print(ANSI_BLUE + "//Año nacimiento del cliente (1900-" + Year.now().getValue() + ")> " + ANSI_RESET);
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public Integer consultarSalario() {
        System.out.print(ANSI_BLUE + "//Salario del cliente> " + ANSI_RESET);
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String consultarTipoBien() {
        System.out.print(ANSI_BLUE + "//Tipo de bien del cliente (Vehiculo/Vivienda)> " + ANSI_RESET);
        return scanner.nextLine();
    }

    @Override
    public Integer consultarValorBien() {
        System.out.print(ANSI_BLUE + "//Valor del bien del cliente (0<Vehiculo<=50.000<=Casa)> " + ANSI_RESET);
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void mostrarErrorCliente() {
        System.out.println(ANSI_BLUE + "//Por favor, introduzca los datos del cliente correctamente." + ANSI_RESET);
    }

    @Override
    public void mostrarErrorBien() {
        System.out.println(ANSI_BLUE + "//Por favor, introduzca los datos del bien correctamente." + ANSI_RESET);
    }

    @Override
    public void mostrarDestacado(String linea) {
        System.out.println(ANSI_PURPLE + "* " + linea + ANSI_RESET);
    }
}
