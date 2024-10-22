package fr.efrei.pokemon.dto;

public class CreateArena {

    private String name;

    private String lieu;

    private int niveauMin;

    private String trainerPrincipal;

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

    public String getTrainerPrincipal() {
        return trainerPrincipal;
    }

    public void setTrainerPrincipal(String trainerPrincipal) {
        this.trainerPrincipal = trainerPrincipal;
    }
}
