/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiravaliacao;

import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class segundaimplementacao extends Primeiravaliacao {

    double Resultado;
    private final int limpanumero1 = 0;
    private final int limpanumero2 = 0;
    private final int limparesultado = 0;

    void limpa() {
        JOptionPane.showMessageDialog(null, "Resultado da subtracao limpo!!");
    }

    void entrarprograma() {
        JOptionPane.showMessageDialog(null, "Voce esta subtraindo!!");
    }

    int getlimpa1() {
        return limpanumero1;
    }

    void setlimpa1(int limpa) {
        limpa = limpanumero1;
    }

    int getlimpa2() {
        return limpanumero2;
    }

    void setlimpa2(int limpa) {
        limpa = limpanumero2;
    }

    int getlimpa() {
        return limparesultado;
    }

    void setlimpa(int limpa) {
        limpa = limparesultado;
    }

    @Override
    public double calcular(double x, double y) {
        try {
            return Resultado = x - y;
        } catch (Exception e) {
            return 0;
        }
    }
}
