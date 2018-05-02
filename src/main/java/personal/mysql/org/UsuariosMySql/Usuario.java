package personal.mysql.org.UsuariosMySql;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Registros")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidoPat")
    private String apellidoPat;
    @Column(name = "apellidoMat")
    private String apellidoMat;
    @Column(name = "fechaNac")
    private Date fechaNac;
    @Column(name = "curp")
    private String curp;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numeroCasa")
    private String numeroCasa;
    @Column(name = "colonia")
    private String colonia;
    @Column(name = "delegacion")
    private String delegacion;
    @Column(name = "estado")
    private String estado;
    @Column(name = "tipoPermiso")
    private String tipoPermiso;
    @Column(name = "estatus")
    private boolean estatus;
    @Column(name = "telCasa")
    private String telCasa;
    @Column(name = "telCel")
    private String telCel;

    public Usuario(){}

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String nombre, String apellidoPat, String apellidoMat, Date fechaNac, String curp, String calle, String numeroCasa, String colonia, String delegacion, String estado, String tipoPermiso, boolean estatus, String telCasa, String telCel) {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.fechaNac = fechaNac;
        this.curp = curp;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.estado = estado;
        this.tipoPermiso = tipoPermiso;
        this.estatus = estatus;
        this.telCasa = telCasa;
        this.telCel = telCel;
    }

    public Usuario(Integer idUsuario, String nombre, String apellidoPat, String apellidoMat, Date fechaNac, String curp, String calle, String numeroCasa, String colonia, String delegacion, String estado, String tipoPermiso, boolean estatus, String telCasa, String telCel) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.fechaNac = fechaNac;
        this.curp = curp;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.estado = estado;
        this.tipoPermiso = tipoPermiso;
        this.estatus = estatus;
        this.telCasa = telCasa;
        this.telCel = telCel;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }
}
