package com.example.seminar4;

public class Meniu {
    private String nume;
    private float pret;
    private  String ingrediente;

    public Meniu(String nume, float pret, String ingrediente) {
        this.nume = nume;
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Meniu{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", ingrediente='" + ingrediente + '\'' +
                '}';
    }
}
