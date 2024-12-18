package upna_direct_codificacion;

public class Agente {
    private final String usuario;
    private final String contraseña;

    public Agente(String usuarioAgente, String contraseñaAgente) {
        this.usuario = usuarioAgente;
        this.contraseña = contraseñaAgente;
    }

    public boolean verificarCredenciales(String usuarioIntroducido, String contraseñaIntroducida) {
        return usuario.equals(usuarioIntroducido) && contraseña.equals(contraseñaIntroducida);
    }
}
