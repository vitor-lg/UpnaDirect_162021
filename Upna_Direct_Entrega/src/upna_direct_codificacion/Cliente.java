package upna_direct_codificacion;

import java.time.Year;

public class Cliente {
    private final String usuario;
    private final String contraseña;
    public Integer añoNacimiento;
    public Integer salario;
    public Bien bien;

    public Cliente() {
        this.usuario = "";
        this.contraseña = "";
        this.añoNacimiento = 0;
        this.salario = 0;
        this.bien = null;
    }

    public Cliente(String usuarioCliente, String contraseñaCliente, Integer añoNacimientoCliente, Integer salarioCliente, Bien bienCliente) {
        this.usuario = usuarioCliente;
        this.contraseña = contraseñaCliente;
        this.añoNacimiento = añoNacimientoCliente;
        this.salario = salarioCliente;
        this.bien = bienCliente;
    }

    public boolean verificarCredenciales(String usuarioIntroducido, String contraseñaIntroducida) {
        return usuario.equals(usuarioIntroducido) && contraseña.equals(contraseñaIntroducida);
    }

    public boolean validarDatosCliente() {
        return (this.añoNacimiento >= 1900 && this.añoNacimiento <= Year.now().getValue() && this.salario >= 0);
    }
}
