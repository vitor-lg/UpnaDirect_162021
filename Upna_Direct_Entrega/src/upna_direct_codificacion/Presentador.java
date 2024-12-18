package upna_direct_codificacion;

import java.time.Year;

public class Presentador {
    private final Vista1 vista;
    private final Cliente cliente;

    public Presentador(Vista1 vistaInterfaz) {
        this.vista = vistaInterfaz;
        this.cliente = new Cliente();
    }

    public void admitirCliente() {
        Integer añoNacimiento = this.vista.consultarAñoNacimiento();
        Integer salario = this.vista.consultarSalario();
        cliente.añoNacimiento = añoNacimiento;
        cliente.salario = salario;

        while (!cliente.validarDatosCliente()) {
            this.vista.mostrarErrorCliente();
            añoNacimiento = this.vista.consultarAñoNacimiento();
            salario = this.vista.consultarSalario();
            cliente.añoNacimiento = añoNacimiento;
            cliente.salario = salario;
        }

        String tipoBien = this.vista.consultarTipoBien();
        Integer valorBien = this.vista.consultarValorBien();
        Bien bien = new Bien();
        bien.tipo = tipoBien;
        bien.valor = valorBien;

        while (!bien.verificarDatosBien()) {
            this.vista.mostrarErrorBien();
            tipoBien = this.vista.consultarTipoBien();
            valorBien = this.vista.consultarValorBien();
            bien.tipo = tipoBien;
            bien.valor = valorBien;
        }

        cliente.bien = bien;
    }

    public void mostrarOfertaVentajosa() {
        Integer edad = Year.now().getValue() - cliente.añoNacimiento;
        Integer salario = cliente.salario;
        Integer valorBien = cliente.bien.valor;
        String tipoBien = cliente.bien.tipo;

        Integer importe1 = (int) (valorBien * 0.03);
        if ("Vehiculo".equals(tipoBien) && edad < 20) {
            importe1 += (int) (valorBien * 0.02);
        }
        if ("Vivienda".equals(tipoBien) && valorBien > 200000 && salario < 20000) {
            importe1 -= (int) (valorBien * 0.01);
        }
        Integer comision1 = (int) Math.floor(importe1 * 0.01);
        if (importe1 > 1000) {
            comision1 = (int) Math.floor(importe1 * 0.03);
        }

        Oferta oferta1 = new Oferta(importe1, comision1);
        Aseguradora aseguradora1 = new Aseguradora("Mafro", oferta1);

        Integer importe2 = (int) (valorBien * 0.03);
        if (("Vehiculo".equals(tipoBien) && valorBien < 20000) || ("Vivienda".equals(tipoBien) && valorBien < 150000)) {
            importe2 += (int) (valorBien * 0.01);
        }
        if ("Vehiculo".equals(tipoBien) && valorBien >= 20000 && edad > 60) {
            importe2 += (int) (valorBien * 0.03);
        }
        Integer comision2 = (int) Math.floor(importe2 * 0.01);
        if (importe2 > 1000) {
            comision2 = (int) Math.floor(importe2 * 0.04);
        }

        Oferta oferta2 = new Oferta(importe2, comision2);
        Aseguradora aseguradora2 = new Aseguradora("Linea Indirecta", oferta2);

        Integer importe3 = (int) (valorBien * 0.02);
        if ("Vehiculo".equals(tipoBien) && (edad < 20 || edad > 60)) {
            importe3 += (int) (valorBien * 0.04);
        }
        Integer comision3 = (int) Math.floor(importe3 * 0.01);
        if (importe3 > 1000) {
            comision3 = (int) Math.floor(importe3 * 0.05);
        }

        Oferta oferta3 = new Oferta(importe3, comision3);
        Aseguradora aseguradora3 = new Aseguradora("Adasles", oferta3);

        Tecnico tecnico = new Tecnico();
        tecnico.agregarAseguradora(aseguradora1, 0);
        tecnico.agregarAseguradora(aseguradora2, 1);
        tecnico.agregarAseguradora(aseguradora3, 2);

        Aseguradora aseguradoraVentajosa = tecnico.calcularAseguradoraVentajosa();
        Oferta ofertaVentajosa = aseguradoraVentajosa.obtenerOfertaDisponible();
        String linea = aseguradoraVentajosa.obtenerNombreAseguradora() + " | " + ofertaVentajosa.obtenerImporteOferta() + " | " + ofertaVentajosa.obtenerComisionOferta();
        this.vista.mostrarDestacado(linea);
    }
}
