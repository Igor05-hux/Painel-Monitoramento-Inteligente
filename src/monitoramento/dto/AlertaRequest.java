package src.monitoramento.dto;

import jakarta.validation.constraints.NotBlank;

public class AlertaRequest {

    @NotBlank
    private String titulo;

    @NotBlank
    private String local;

    @NotBlank
    private String criticidade;

    @NotBlank
    private String responsavel;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public String getCriticidade() { return criticidade; }
    public void setCriticidade(String criticidade) { this.criticidade = criticidade; }
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}