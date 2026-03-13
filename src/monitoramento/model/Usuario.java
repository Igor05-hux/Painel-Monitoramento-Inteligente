package src.monitoramento.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String perfil;

    @Column(nullable = false)
    private String status;

    private LocalDateTime ultimoAcesso;

    public Usuario() {}

    public Usuario(String nome, String email, String perfil, String status, LocalDateTime ultimoAcesso) {
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
        this.status = status;
        this.ultimoAcesso = ultimoAcesso;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getUltimoAcesso() { return ultimoAcesso; }
    public void setUltimoAcesso(LocalDateTime ultimoAcesso) { this.ultimoAcesso = ultimoAcesso; }
}