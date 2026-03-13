package src.monitoramento.controller;

import com.igor.monitoramento.dto.EventoRequest;
import com.igor.monitoramento.model.Evento;
import com.igor.monitoramento.service.EventoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
@CrossOrigin(origins = "*")
public class EventoController {

    private final EventoService service;

    public EventoController(EventoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Evento> listar() {
        return service.listar();
    }

    @PostMapping
    public Evento salvar(@RequestBody @Valid EventoRequest request) {
        return service.salvar(request);
    }
}