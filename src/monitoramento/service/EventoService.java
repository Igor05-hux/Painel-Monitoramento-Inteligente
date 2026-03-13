package src.monitoramento.service;

import com.igor.monitoramento.dto.EventoRequest;
import com.igor.monitoramento.model.Evento;
import com.igor.monitoramento.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public List<Evento> listar() {
        return repository.findAll();
    }

    public Evento salvar(EventoRequest request) {
        Evento evento = new Evento(
                request.getTipo(),
                request.getOrigem(),
                request.getLocalEvento(),
                LocalDateTime.now(),
                request.getStatus(),
                request.getDescricao()
        );
        return repository.save(evento);
    }
}