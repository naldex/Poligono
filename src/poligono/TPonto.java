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
public class TPonto {

    public static void main(String args[]) {
        Ponto p1 = new Ponto();
        System.out.println (p1.getlocalizacao());
        Ponto p2 = new Ponto (0.0, 8.3);
        System.out.println(p2.getlocalizacao());
        System.out.println(p1.getDistancia(p2));
    }

}
