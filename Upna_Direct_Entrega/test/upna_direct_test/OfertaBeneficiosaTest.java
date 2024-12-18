package upna_direct_test;
 
import upna_direct_codificacion.Presentador;
import upna_direct_codificacion.VistaFalsa;
import org.junit.Test;
import upna_direct_codificacion.Presentador;
import upna_direct_codificacion.Presentador;
import upna_direct_codificacion.VistaFalsa;
import upna_direct_codificacion.VistaFalsa;
import static org.junit.Assert.*;

public class OfertaBeneficiosaTest
{
    public OfertaBeneficiosaTest() {}
    @Test
    public void Un_cliente_nacido_en_1990_salario_18000_bien_de_tipo_vivienda_de_valor_250000_no_contrata_Mafro()
    {
        //Cliente nacido en 1990 con salario de 18.000€ & posee una vivienda cuyo valor es de 250.000€.
        VistaFalsa vista = new VistaFalsa(1990,18000,"Vivienda",250000);
        Presentador presentador = new Presentador(vista);
        presentador.admitirCliente();
        presentador.mostrarOfertaVentajosa();
        //Comprobar si es valido. Debe devolver falso.
        assertEquals("Adasles | 5000 | 250",vista.lineaDestacada);
        //Mafro y Adasles generan 5.000€ de importe, pero Mafro genera 150€ comision y Adasles genera 250€ comision.
    }
    @Test
    public void Un_cliente_nacido_en_2005_salario_15000_bien_de_tipo_vehiculo_de_valor_30000_contrata_Linea_Indirecta()
    {
        //Cliente nacido en 2005 con salario de 15.000€ & posee un vehiculo cuyo valor es de 30.000€.
        VistaFalsa vista = new VistaFalsa(2005,15000,"Vehiculo",30000);
        Presentador presentador = new Presentador(vista);
        presentador.admitirCliente();
        presentador.mostrarOfertaVentajosa();
        //Comprobar si es valido. Debe devolver verdadero.
        assertEquals("Linea Indirecta | 900 | 9",vista.lineaDestacada);
    }
    @Test
    public void Un_cliente_nacido_en_1970_salario_35000_bien_de_tipo_vivienda_de_valor_120000_contrata_Adasles()
    {
        //Cliente nacido en 1970 con salario de 35.000€ & posee una vivienda cuyo valor es de 120.000€.
        VistaFalsa vista = new VistaFalsa(1970,35000,"Vivienda",120000);
        Presentador presentador = new Presentador(vista);
        presentador.admitirCliente();
        presentador.mostrarOfertaVentajosa();
        //Comprobar si es valido. Debe devolver verdadero.
        assertEquals("Adasles | 2400 | 120",vista.lineaDestacada);
    }
}
