package personal.mysql.org.UsuariosMySql;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/rest/Usuarios"})
public class ControlUsuario {

    @Autowired RepositorioUsuarios repoUsuario;

    @CrossOrigin
    @GetMapping(value = {"/todos"})
    public  ArrayList<Usuario> todosResgistros(){
        return (ArrayList<Usuario>)repoUsuario.findAll();
    }

    @CrossOrigin
    @PostMapping(value = {"/guardar"})
    public Estatus guardarJSON(@RequestBody String json){
        try {
            ObjectMapper mapper=new ObjectMapper();
            EquipoString e=mapper.readValue(json,EquipoString.class);
            //Transformacion de string a fecha
            SimpleDateFormat formato=new SimpleDateFormat("yyyy-mm-dd");
            Date fechaNac=formato.parse(e.getFechaNac());
            //Transformacion de string a boolean
            boolean estatus=Boolean.parseBoolean(e.getEstatus());
            //Configuracion de la clase
            Usuario usuario=new Usuario();
            usuario.setNombre(e.getNombre());
            usuario.setApellidoPat(e.getApellidoPat());
            usuario.setApellidoMat(e.getApellidoMat());
            usuario.setFechaNac(fechaNac);
            usuario.setCurp(e.getCurp());
            usuario.setCalle(e.getCalle());
            usuario.setNumeroCasa(e.getNumeroCasa());
            usuario.setColonia(e.getColonia());
            usuario.setDelegacion(e.getDelegacion());
            usuario.setEstado(e.getEstado());
            usuario.setTipoPermiso(e.getTipoPermiso());
            usuario.setEstatus(estatus);
            usuario.setTelCasa(e.getTelCasa());
            usuario.setTelCel(e.getTelCel());
            repoUsuario.save(usuario);
        }catch (Exception e){
            return new Estatus(false,"Error al guardar: "+e);
        }
        return new Estatus(true,"Guardado con exito");
    }

}
/*
    @CrossOrigin
    @GetMapping(value = {"/todos"},headers = {"Accept=application/json"})
    public  ArrayList<Usuario> todosResgistros(){
        return (ArrayList<Usuario>)repoUsuario.findAll();
    }

    @CrossOrigin
    @GetMapping(value = {"/{id}"})
    public Optional<Usuario> buscarId(@PathVariable String id){
        Integer idUsuario=Integer.parseInt(id);
        return repoUsuario.findById(idUsuario);
    }

    @CrossOrigin
    @GetMapping(value = {"/{nombre}/{apellidoPat}/{apellidoMat}/{fNac}/{curp}/{calle}/{numeroCasa}/{colonia}/{delegacion}/{estado}/{tipoPermiso}/{est}/{telefonoCasa}/{telefonoCel}"})
    public Estatus guardar(@PathVariable String nombre,@PathVariable String apellidoPat,@PathVariable String apellidoMat,
    @PathVariable String fNac,@PathVariable String curp,@PathVariable String calle,@PathVariable String numeroCasa,
    @PathVariable String colonia,@PathVariable String delegacion,@PathVariable String estado,@PathVariable String tipoPermiso,
    @PathVariable String est,@PathVariable String telefonoCasa,@PathVariable String telefonoCel){
        try{
            //Transformacion de String a formato fecha
            SimpleDateFormat formatoFecha= new SimpleDateFormat("yyyy-mm-dd");
            Date fechaNac=formatoFecha.parse(fNac);
            //Transformacion de String a boolean
            boolean estatus=Boolean.parseBoolean(est);
            repoUsuario.save(new Usuario(nombre,apellidoPat,apellidoMat,fechaNac,curp,calle,numeroCasa,colonia,delegacion,estado,tipoPermiso,
                    estatus,telefonoCasa,telefonoCel));
        }catch (Exception ex){
            return new Estatus(false,"Error: "+ex);
        }
        return new Estatus(true,"guardado con exito");
    }

    @CrossOrigin
    @GetMapping(value = {"/{idUsuario}/borrar"})
    public Estatus borrar(@PathVariable String idUsuario){
        Integer id=Integer.parseInt(idUsuario);
        Usuario u=new Usuario();
        u.setIdUsuario(id);
        repoUsuario.findById(u.getIdUsuario());
        repoUsuario.deleteById(u.getIdUsuario());
        return new Estatus (true,"eliminado con exito");
    }

    @CrossOrigin
    @GetMapping(value = {"/{id}/{nombre}/{apellidoPat}/{apellidoMat}/{fNac}/{curp}/{calle}/{numeroCasa}/{colonia}/{delegacion}/{estado}/{tipoPermiso}/{est}/{telefonoCasa}/{telefonoCel}"})
    public Estatus actualizar(@PathVariable String id,@PathVariable String nombre,@PathVariable String apellidoPat,@PathVariable String apellidoMat,
                           @PathVariable String fNac,@PathVariable String curp,@PathVariable String calle,@PathVariable String numeroCasa,
                           @PathVariable String colonia,@PathVariable String delegacion,@PathVariable String estado,@PathVariable String tipoPermiso,
                           @PathVariable String est,@PathVariable String telefonoCasa,@PathVariable String telefonoCel){
        try{
            Integer idUsuario=Integer.parseInt(id);
            //Transformacion de String a formato fecha
            SimpleDateFormat formatoFecha= new SimpleDateFormat("yyyy-mm-dd");
            Date fechaNac=formatoFecha.parse(fNac);
            //Transformacion de String a boolean
            boolean estatus=Boolean.parseBoolean(est);
            repoUsuario.save(new Usuario(idUsuario,nombre,apellidoPat,apellidoMat,fechaNac,curp,calle,numeroCasa,colonia,delegacion,estado,tipoPermiso,
                    estatus,telefonoCasa,telefonoCel));
        }catch (Exception ex){
            return new Estatus(false,"Error: "+ex);
        }
        return new Estatus(true,"Actualizado con exito");
    }*/
