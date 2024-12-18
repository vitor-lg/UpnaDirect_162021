package upna_direct_codificacion;

public class Aseguradora {
    private final String nombre;
    private final Oferta oferta;
    private final Agente[] agentes;

    public Aseguradora(String nombreAseguradora, Oferta ofertaDisponible) {
        nombre = nombreAseguradora;
        oferta = ofertaDisponible;
        agentes = new Agente[10];
    }

    public String obtenerNombreAseguradora() {
        return nombre;
    }

    public Oferta obtenerOfertaDisponible() {
        return oferta;
    }
}

