package fr.efrei.pokemon.models;

import fr.efrei.pokemon.constants.Type;
import jakarta.persistence.*;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // AUTO INCREMENT
    private String id;

    private String name;

    private int level;

    //private int hp;

    @Enumerated(EnumType.STRING)
    private Type type; // SI mon pokemon est type feu -> Type == "FEU"

//    @ManyToOne
//    @JoinColumn(name = "trainer_id")
//    private Trainer trainer;

//    public Trainer getTrainer() {
//        return trainer;
//    }
//
//    public void setTrainer(Trainer trainer) {
//        this.trainer = trainer;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}