/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

/**
 *
 * @author aluno
 */
public class Reta {
    private Ponto p1;
    private Ponto p2;

public Double getTamanho() {
    return this.p1.getDistancia(this.p2);    
}

public Reta (Ponto p1, Ponto p2) {
    this.p1=p1;
    this.p2=p2;
}

}