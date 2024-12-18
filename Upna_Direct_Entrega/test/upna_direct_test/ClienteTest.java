package upna_direct_test;

import upna_direct_codificacion.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest
{
    public ClienteTest() {}
    @Test
    public void Un_cliente_nacido_entre_1900_y_año_actual_y_con_salario_positivo_es_valido()
    {
        //Dado un cliente nacido en 1970 y con salario 35.000€.
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 1970;
        cliente.salario = 35000;
        //Comprobar si es valido.
        Boolean validarDatos = cliente.validarDatosCliente();
        //Debe devolver verdadero.
        assertTrue(validarDatos);
    }
    @Test
    public void Un_cliente_no_nacido_entre_1900_y_año_actual_y_con_salario_positivo_no_es_valido()
    {
        //Dado un cliente nacido en 1899 y con salario 35.000€.
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 1899;
        cliente.salario = 35000;
        //Comprobar si es valido.
        Boolean validarDatos = cliente.validarDatosCliente();
        //Debe devolver falso.
        assertFalse(validarDatos);
    }
    @Test
    public void Un_cliente_nacido_entre_1900_y_año_actual_y_con_salario_erroneo_no_es_valido()
    {
        //Dado un cliente nacido en 1970 y con salario erroneo.
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 1970;
        cliente.salario = -1;
        //Comprobar si es valido.
        Boolean validarDatos = cliente.validarDatosCliente();
        //Debe devolver falso.
        assertFalse(validarDatos);
    }
    @Test
    public void Un_cliente_no_nacido_entre_1900_y_año_actual_y_con_salario_erroneo_no_es_valido()
    {
        //Dado un cliente nacido en 2024 y con salario erroneo.
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2024;
        cliente.salario = -1;
        //Comprobar si es valido.
        Boolean validarDatos = cliente.validarDatosCliente();
        //Debe devolver falso.
        assertFalse(validarDatos);
    }
}