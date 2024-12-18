package upna_direct_codificacion;

public class Bien {
    public String tipo;
    public Integer valor;

    public Bien() {
        this.tipo = "";
        this.valor = 0;
    }

    public Bien(String tipoBien, Integer valorBien) {
        this.tipo = tipoBien;
        this.valor = valorBien;
    }

    public boolean verificarDatosBien() {
        return ("Vehiculo".equals(this.tipo) && (this.valor >= 0 && this.valor <= 50000)) 
                || ("Vivienda".equals(this.tipo) && this.valor >= 50000);
    }
}

