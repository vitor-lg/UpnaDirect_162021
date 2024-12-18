package upna_direct_codificacion;

import java.util.Objects;

public class Tecnico {
    private final String usuario;
    private final String contraseña;
    private final Aseguradora[] aseguradoras;

    public Tecnico() {
        this.usuario = "";
        this.contraseña = "";
        aseguradoras = new Aseguradora[3];
    }

    public Tecnico(String usuarioTecnico, String contraseñaTecnico) {
        this.usuario = usuarioTecnico;
        this.contraseña = contraseñaTecnico;
        aseguradoras = new Aseguradora[3];
    }

    public void agregarAseguradora(Aseguradora aseguradora, int indice) {
        if (indice >= 0 && indice < 3) {
            aseguradoras[indice] = aseguradora;
        }
    }

    public boolean verificarCredenciales(String usuarioIntroducido, String contraseñaIntroducida) {
        return usuario.equals(usuarioIntroducido) && contraseña.equals(contraseñaIntroducida);
    }

    public Aseguradora calcularAseguradoraVentajosa() {
        Integer importeMinimo = Integer.MAX_VALUE;
        Integer comisionMaxima = 0;
        String nombreAseguradoraVentajosa = "";

        for (Aseguradora aseguradora : aseguradoras) {
            Integer importeActual = aseguradora.obtenerOfertaDisponible().obtenerImporteOferta();
            Integer comisionActual = aseguradora.obtenerOfertaDisponible().obtenerComisionOferta();
            if (importeActual < importeMinimo || (Objects.equals(importeActual, importeMinimo) && comisionActual > comisionMaxima)) {
                importeMinimo = importeActual;
                comisionMaxima = comisionActual;
                nombreAseguradoraVentajosa = aseguradora.obtenerNombreAseguradora();
            }
        }

        Oferta ofertaVentajosa = new Oferta(importeMinimo, comisionMaxima);
        return new Aseguradora(nombreAseguradoraVentajosa, ofertaVentajosa);
    }
}
