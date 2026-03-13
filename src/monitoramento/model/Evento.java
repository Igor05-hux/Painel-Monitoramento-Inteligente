package src.monitoramento.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String origem;

    @Column(nullable = false)
    private String localEvento;

    @Column(nullable = false)
    private LocalDateTime horario;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false, length = 1000)
    private String descricao;

    public Evento() {}

    public Evento(String tipo, String origem, String localEvento, LocalDateTime horario, String status, String descricao) {
        this.tipo = tipo;
        this.origem = origem;
        this.localEvento = localEvento;
        this.horario = horario;
        this.status = status;
        this.descricao = descricao;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
    public String getLocalEvento() { return localEvento; }
    public void setLocalEvento(String localEvento) { this.localEvento = localEvento; }
    public LocalDateTime getHorario() { return horario; }
    public void setHorario(LocalDateTime horario) { this.horario = horario; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}