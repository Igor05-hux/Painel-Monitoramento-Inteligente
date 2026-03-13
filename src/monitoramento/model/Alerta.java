package src.monitoramento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alertas")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String local;

    @Column(nullable = false)
    private String criticidade;

    @Column(nullable = false)
    private String responsavel;

    @Column(nullable = false)
    private String status;

    public Alerta() {}

    public Alerta(String titulo, String local, String criticidade, String responsavel, String status) {
        this.titulo = titulo;
        this.local = local;
        this.criticidade = criticidade;
        this.responsavel = responsavel;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public String getCriticidade() { return criticidade; }
    public void setCriticidade(String criticidade) { this.criticidade = criticidade; }
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}