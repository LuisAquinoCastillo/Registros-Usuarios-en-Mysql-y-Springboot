package personal.mysql.org.UsuariosMySql;

public class Estatus {

    boolean accion;
    String respuesta;

    public Estatus(boolean accion, String respuesta) {
        this.accion = accion;
        this.respuesta = respuesta;
    }

    public boolean isAccion() {
        return accion;
    }

    public void setAccion(boolean accion) {
        this.accion = accion;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
