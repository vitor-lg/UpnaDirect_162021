package upna_direct_codificacion;

public interface Vista1 {
    Integer consultarAñoNacimiento();
    Integer consultarSalario();
    String consultarTipoBien();
    Integer consultarValorBien();
    void mostrarErrorCliente();
    void mostrarErrorBien();
    void mostrarDestacado(String linea);
}
