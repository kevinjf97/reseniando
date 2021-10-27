package com.reseniando.grupo4.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Perfil {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nickname;
    private String bio;
    private String foto;
    @OneToMany
    private List<Resenia> resenias;
    @OneToOne
    private Favorito favoritos;
    @OneToOne
    private Leido leidos;

    public Perfil() {
    }

    public Perfil(String nickname, String bio, String foto, List<Resenia> resenias, Favorito favoritos, Leido leidos) {
        this.nickname = nickname;
        this.bio = bio;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(List<Resenia> resenias) {
        this.resenias = resenias;
    }

    public Favorito getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Favorito favoritos) {
        this.favoritos = favoritos;
    }

    public Leido getLeidos() {
        return leidos;
    }

    public void setLeidos(Leido leidos) {
        this.leidos = leidos;
    }
}