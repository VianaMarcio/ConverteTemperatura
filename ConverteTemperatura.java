package ConverteTemperatura;

public class ConverteTemperatura {
    public static void main(String[] args) {
        final int DIFERENCA = 32;
        final double DIVISAO =  5/9.0;
        double temperaturaF = 190.0;
        double temperaturaC = (temperaturaF - diferenca) * divisao;
        System.out.print(temperaturaC);
    }
}
