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
public class Ponto {

    private Double x;
    private Double y;
    public Ponto (Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public String getlocalizacao() {

        if (x > 0 && y > 0) {
            return "1° Quadrante";
        } else {
            if (x < 0 && y > 0) {
                return "2° Quadrante";
            } else {
                if (x > 0 && y > 0) {
                    return "3° Quadrante";
                } else {
                    if (x > 0 && y < 0) {
                        return "4º Quadrante";
                    } else {
                        if (x == 0 && y == 0) {
                            return "Origem";
                        } else {
                            if (x == 0 && y != 0) {
                                return "Eixo de Y";
                            } else {
                                return "!Eixo de X";
                            }
                        }
                    }

                }
            }

        }
    }
    

}
