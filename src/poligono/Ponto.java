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

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
   
    public Ponto () {
        this.x=0.0;
        this.y=0.0;
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
                            return "Ponto de Origem";
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

    public Double getDistancia(Ponto p) {
       return Math.sqrt (Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
        
    }
}
