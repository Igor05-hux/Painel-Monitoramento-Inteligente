package src.monitoramento.dto;

import jakarta.validation.constraints.NotBlank;

public class EventoRequest {

    @NotBlank
    private String tipo;

    @NotBlank
    private String origem;

    @NotBlank
    private String localEvento;

    @NotBlank
    private String status;

    @NotBlank
    private String descricao;

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
    public String getLocalEvento() { return localEvento; }
    public void setLocalEvento(String localEvento) { this.localEvento = localEvento; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}