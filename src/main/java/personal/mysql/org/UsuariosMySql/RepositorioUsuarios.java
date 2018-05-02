package personal.mysql.org.UsuariosMySql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuarios extends JpaRepository<Usuario, Integer> {
}
