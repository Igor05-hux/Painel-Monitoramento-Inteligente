package src.monitoramento.service;

import com.igor.monitoramento.dto.AlertaRequest;
import com.igor.monitoramento.model.Alerta;
import com.igor.monitoramento.repository.AlertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    private final AlertaRepository repository;

    public AlertaService(AlertaRepository repository) {
        this.repository = repository;
    }

    public List<Alerta> listar() {
        return repository.findAll();
    }

    public Alerta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta não encontrado."));
    }

    public Alerta salvar(AlertaRequest request) {
        Alerta alerta = new Alerta(
                request.getTitulo(),
                request.getLocal(),
                request.getCriticidade(),
                request.getResponsavel(),
                "Aberto"
        );
        return repository.save(alerta);
    }

    public Alerta concluir(Long id) {
        Alerta alerta = buscarPorId(id);
        alerta.setStatus("Resolvido");
        return repository.save(alerta);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}