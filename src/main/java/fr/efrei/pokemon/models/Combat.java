package fr.efrei.pokemon.models;

import jakarta.persistence.*;

@Entity
public class Combat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pokemon1_id")
    private Pokemon pokemon1;

    @ManyToOne
    @JoinColumn(name = "pokemon2_id")
    private Pokemon pokemon2;

    @ManyToOne
    @JoinColumn(name = "arena_id")
    private Arena arena;

    private Long vainqueur_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }

    public void setPokemon2(Pokemon pokemon2) {
        this.pokemon2 = pokemon2;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public Long getVainqueur_id() {
        return vainqueur_id;
    }

    public void setVainqueur_id(Long vainqueur_id) {
        this.vainqueur_id = vainqueur_id;
    }
}
