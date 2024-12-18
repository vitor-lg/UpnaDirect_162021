package upna_direct_test;

import upna_direct_codificacion.Bien;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class BienTest
{    
    public BienTest() {}

    @Test
    public void Un_bien_de_tipo_vehiculo_y_con_un_valor_entre_0_y_50000_es_valido()
    {
        //Dado un bien de tipo vehiculo y con valor de 25.000€.
        Bien bien = new Bien();
        bien.tipo = "Vehiculo";
        bien.valor = 25000;
        //Comprobar si es valido.
        Boolean validarDatos = bien.verificarDatosBien();  // Llamar a validarDatosBien
        //Debe devolver verdadero.
        assertTrue(validarDatos);
    }

    @Test
    public void Un_bien_de_tipo_vivienda_y_con_valor_superior_a_50000_es_valido()
    {
        //Dado un bien de tipo vivienda y con valor de 120.000€.
        Bien bien = new Bien();
        bien.tipo = "Vivienda";
        bien.valor = 120000;
        // Comprobar si es valido.
        Boolean validarDatos = bien.verificarDatosBien();  // Cambié a validarDatosBien
        //Debe devolver verdadero.
        assertTrue(validarDatos);
    }

    @Test
    public void Un_bien_de_tipo_vehiculo_y_con_un_valor_fuera_de_0_y_50000_no_es_valido()
    {
        //Dado un bien de tipo vehiculo y con valor de 75.000€.
        Bien bien = new Bien();
        bien.tipo = "Vehiculo";
        bien.valor = 75000;
        // Comprobar si es valido.
        Boolean validarDatos = bien.verificarDatosBien();  // Cambié a validarDatosBien
        //Debe devolver falso.
        assertFalse(validarDatos);
    }

    @Test
    public void Un_bien_de_tipo_vivienda_y_con_valor_inferior_a_50000_no_es_valido()
    {
        //Dado un bien de tipo vivienda y con valor de 40.000€.
        Bien bien = new Bien();
        bien.tipo = "Vivienda";
        bien.valor = 40000;
        // Comprobar si es valido.
        Boolean validarDatos = bien.verificarDatosBien();  // Cambié a validarDatosBien
        //Debe devolver falso.
        assertFalse(validarDatos);
    }

    @Test
    public void Un_bien_de_tipo_diferente_a_vehiculo_o_vivienda_no_es_valido()
    {
        //Dado un bien de tipo joyeria y con valor de 25.000€.
        Bien bien = new Bien();
        bien.tipo = "Joyeria";
        bien.valor = 25000;
        // Comprobar si es valido.
        Boolean validarDatos = bien.verificarDatosBien();  // Cambié a validarDatosBien
        //Debe devolver falso.
        assertFalse(validarDatos);
    }
}
