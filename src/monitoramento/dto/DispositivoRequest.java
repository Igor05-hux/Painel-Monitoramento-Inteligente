package src.monitoramento.dto;

import jakarta.validation.constraints.NotBlank;

public class DispositivoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String tipo;

    @NotBlank
    private String local;

    @NotBlank
    private String ip;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
}