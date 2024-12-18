package upna_direct_codificacion;

public class VistaFalsa implements Vista1 {
    private final Integer añoNacimiento;
    private final Integer salario;
    private final String tipoBien;
    private final Integer valorBien;
    public String lineaDestacada;
    
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";

    public VistaFalsa(Integer añoNacimiento, Integer salario, String tipoBien, Integer valorBien) {
        this.añoNacimiento = añoNacimiento;
        this.salario = salario;
        this.tipoBien = tipoBien;
        this.valorBien = valorBien;
        this.lineaDestacada = "";
    }

    @Override
    public Integer consultarAñoNacimiento() {
        return this.añoNacimiento;
    }

    @Override
    public Integer consultarSalario() {
        return this.salario;
    }

    @Override
    public String consultarTipoBien() {
        return this.tipoBien;
    }

    @Override
    public Integer consultarValorBien() {
        return this.valorBien;
    }

    @Override
    public void mostrarErrorCliente() {
        System.out.println(ANSI_BLUE + "//Por favor, introduzca los datos del bien correctamente." + ANSI_RESET);
    }

    @Override
    public void mostrarErrorBien() {
        System.out.println(ANSI_BLUE + "//Por favor, introduzca los datos del bien correctamente." + ANSI_RESET);
    }

    @Override
    public void mostrarDestacado(String linea) {
        this.lineaDestacada = linea;
    }
}
