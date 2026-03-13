package src.monitoramento.controller;

import com.igor.monitoramento.dto.DispositivoRequest;
import com.igor.monitoramento.model.Dispositivo;
import com.igor.monitoramento.service.DispositivoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispositivos")
@CrossOrigin(origins = "*")
public class DispositivoController {

    private final DispositivoService service;

    public DispositivoController(DispositivoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Dispositivo> listar() {
        return service.listar();
    }

    @PostMapping
    public Dispositivo salvar(@RequestBody @Valid DispositivoRequest request) {
        return service.salvar(request);
    }

    @PatchMapping("/{id}/status")
    public Dispositivo alternarStatus(@PathVariable Long id) {
        return service.alternarStatus(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}