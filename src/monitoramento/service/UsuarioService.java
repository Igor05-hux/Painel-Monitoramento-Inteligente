package src.monitoramento.service;

import com.igor.monitoramento.dto.UsuarioRequest;
import com.igor.monitoramento.model.Usuario;
import com.igor.monitoramento.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
    }

    public Usuario salvar(UsuarioRequest request) {
        Usuario usuario = new Usuario(
                request.getNome(),
                request.getEmail(),
                request.getPerfil(),
                "Ativo",
                LocalDateTime.now()
        );
        return repository.save(usuario);
    }

    public Usuario alternarStatus(Long id) {
        Usuario usuario = buscarPorId(id);
        usuario.setStatus(usuario.getStatus().equals("Ativo") ? "Inativo" : "Ativo");
        return repository.save(usuario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}