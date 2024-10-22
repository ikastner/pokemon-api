package fr.efrei.pokemon.models;

import jakarta.persistence.*;

@Entity
public class Arena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lieu;
    private int niveauMin;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainerPrincipal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getNiveauMin() {
        return niveauMin;
    }

    public void setNiveauMin(int niveauMin) {
        this.niveauMin = niveauMin;
    }

    public Trainer getTrainerPrincipal() {
        return trainerPrincipal;
    }

    public void setTrainerPrincipal(Trainer trainerPrincipal) {
        this.trainerPrincipal = trainerPrincipal;
    }
}
