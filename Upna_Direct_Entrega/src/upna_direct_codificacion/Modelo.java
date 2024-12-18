package upna_direct_codificacion;

public class Modelo {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Presentador presentador = new Presentador(vista);
        presentador.admitirCliente();
        presentador.mostrarOfertaVentajosa();
    }
}
