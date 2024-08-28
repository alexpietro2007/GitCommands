import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Carro car1 = new Carro();
        Carro car2 = new Carro();
        Moto mt1 = new Moto();
        Moto mt2 = new Moto();

        Carro[] carros = {car1, car2};
        Moto[] motos = {mt1, mt2};

        for(int i = 1; i < 2; i++){
            System.out.println("Qual o Modelo do "+(i)+"° carro: ");
            carros[i].setModelo(in.next());
            System.out.println("Qual o Valor de Tabela do "+(i)+"° carro:");
            carros[i].setValorTabela(in.nextDouble());
            System.out.println("Qual a cor do "+(i)+"° carro:");
            carros[i].setCor(in.next());
            System.out.println("Qual o Combustivel que o "+(i)+"° Carro roda:");
            carros[i].setCombustivel(in.next());
        }
        for(int i = 1; i < 2; i++){
            System.out.println("Qual o Modelo do "+(i)+"° carro: ");
            carros[i].setModelo(in.next());
            System.out.println("Qual o Valor de Tabela do "+(i)+"° carro:");
            carros[i].setValorTabela(in.nextDouble());
            System.out.println("Qual a cor do "+(i)+"° carro:");
            carros[i].setCor(in.next());
            System.out.println("Qual o Combustivel que o "+(i)+"° Carro roda:");
            carros[i].setCombustivel(in.next());
        }
    }
}
