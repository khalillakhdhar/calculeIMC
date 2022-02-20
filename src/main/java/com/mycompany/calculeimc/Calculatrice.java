/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculeimc;

/**
 *
 * @author khali
 */
public class Calculatrice {
    private double taille,poids;

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Calculatrice(double taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }

    public Calculatrice() {
    }
    public int calculeImc()
    {
        return (int) Math.round(poids/Math.pow(taille,2));
    
    
    
    }
    
    
    
}
