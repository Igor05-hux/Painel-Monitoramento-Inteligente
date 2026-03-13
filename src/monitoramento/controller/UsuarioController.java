package src.monitoramento.controller;

import com.igor.monitoramento.dto.UsuarioRequest;
import com.igor.monitoramento.model.Usuario;
import com.igor.monitoramento.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @PostMapping
    public Usuario salvar(@RequestBody @Valid UsuarioRequest request) {
        return service.salvar(request);
    }

    @PatchMapping("/{id}/status")
    public Usuario alternarStatus(@PathVariable Long id) {
        return service.alternarStatus(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}