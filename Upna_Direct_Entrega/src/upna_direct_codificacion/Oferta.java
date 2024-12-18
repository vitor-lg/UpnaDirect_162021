package upna_direct_codificacion;

public class Oferta {
    private final Integer importe;
    private final Integer comision;

    public Oferta(Integer importeOferta, Integer comisionOferta) {
        this.importe = importeOferta;
        this.comision = comisionOferta;
    }

    public Integer obtenerImporteOferta() {
        return importe;
    }

    public Integer obtenerComisionOferta() {
        return comision;
    }
}
