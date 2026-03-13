package src.monitoramento.controller;

import com.igor.monitoramento.model.Alerta;
import com.igor.monitoramento.service.AlertaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")
@CrossOrigin(origins = "*")
public class AlertaController {

    private final AlertaService service;

    public AlertaController(AlertaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Alerta> listar() {
        return service.listar();
    }

    @PostMapping
    public Alerta salvar(@RequestBody @Valid AlertaRequest request) {
        return service.salvar(request);
    }

    @PatchMapping("/{id}/concluir")
    public Alerta concluir(@PathVariable Long id) {
        return service.concluir(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}