package src.monitoramento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dispositivos")
public class Dispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String local;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String ip;

    public Dispositivo() {}

    public Dispositivo(String nome, String tipo, String local, String status, String ip) {
        this.nome = nome;
        this.tipo = tipo;
        this.local = local;
        this.status = status;
        this.ip = ip;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
}