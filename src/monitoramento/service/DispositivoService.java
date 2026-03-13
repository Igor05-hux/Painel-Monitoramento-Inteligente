package src.monitoramento.service;

import com.igor.monitoramento.dto.DispositivoRequest;
import com.igor.monitoramento.model.Dispositivo;
import com.igor.monitoramento.repository.DispositivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispositivoService {

    private final DispositivoRepository repository;

    public DispositivoService(DispositivoRepository repository) {
        this.repository = repository;
    }

    public List<Dispositivo> listar() {
        return repository.findAll();
    }

    public Dispositivo buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dispositivo não encontrado."));
    }

    public Dispositivo salvar(DispositivoRequest request) {
        Dispositivo dispositivo = new Dispositivo(
                request.getNome(),
                request.getTipo(),
                request.getLocal(),
                "Online",
                request.getIp()
        );
        return repository.save(dispositivo);
    }

    public Dispositivo alternarStatus(Long id) {
        Dispositivo dispositivo = buscarPorId(id);
        dispositivo.setStatus(dispositivo.getStatus().equals("Online") ? "Offline" : "Online");
        return repository.save(dispositivo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}