/*Crie um programa em Java para ajudar uma pessoa a controlar seus gastos da semana. O programa deve pedir ao usuário a quantidade de dias que deseja registrar. Depois, para cada dia, deve solicitar:
- o nome do dia;
- o valor gasto com transporte;
- o valor gasto com alimentação;
- o valor gasto com lazer.

Ao final, o programa deve calcular e exibir:
- o gasto total da semana;
- a média de gasto por dia;
- o dia com maior gasto total;
- o valor total gasto em cada categoria: transporte; alimentação; lazer.

O programa deve:
- usar a classe Scanner para entrada de dados;
- usar estrutura de repetição para registrar os dias;
- usar cálculos aritméticos para somas e médias;
- exibir os resultados de forma clara no terminal;

Regras adicionais:
- Considere que todos os valores informados serão positivos.
- O gasto total de cada dia será a soma de transporte, alimentação e lazer.
- A média deve ser calculada com base na quantidade de dias informada pelo usuário.*/

import java.util.Scanner;

public class atividadeaula180326 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String dia;
        double vt = 0;
        double vr = 0;
        double lazer = 0;
        double soma = 0;
        double media = 0;
        double cont = 0;
        int qtd = 0;
        double gastodia = 0;
        double maiorgasto = 0;
        String nomemaiordia = "";
        double gastolazer = 0;
        double gastovr = 0;
        double gastovt = 0;

            System.out.println("Quantos dias você deseja registrar: ");
            qtd = scanner.nextInt();


            for (int i = 0; i < qtd; i++){ //O programa deve pedir ao usuário a quantidade de dias que deseja registrar

            System.out.println("Digite o nome do dia: ");
            dia = scanner.next();

            System.out.println("Digite o valor gasto com transporte: ");
            vt = scanner.nextDouble();
            gastovt = gastovt+vt;
            if(gastovt<0){
                System.out.println("Valor inválido, digite um valor positivo: ");
                vt = scanner.nextDouble();
            }
            
            System.out.println("Digite o valor gasto com alimentação: ");
            vr = scanner.nextDouble();
            gastovr = gastovr +vr ;
            if(gastovr<0){
                System.out.println("Valor inválido, digite um valor positivo: ");
                vr = scanner.nextDouble();
            }


            System.out.println("Digite o valor gasto com lazer: ");
            lazer = scanner.nextDouble();
            gastolazer = gastolazer+lazer;
            if(gastolazer<0){
                System.out.println("Valor inválido, digite um valor positivo: ");
                gastolazer = scanner.nextDouble();
            }

            gastodia = vt + vr + lazer;
            soma = soma+ gastodia; //Soma do valor total
            cont++;

            if(soma > maiorgasto);
                maiorgasto = soma;
                nomemaiordia = dia;
        }
            media = soma/cont;  
        
            if(media<50){
                System.out.println("------------------------------------");
                System.out.println("Gastos controlados");
            }else{
                System.out.println("------------------------------------");
                System.out.println("Atenção aos gastos");
            }

            System.out.println("------------------------------------");
            System.out.println("O gasto total da semana é: " + soma);
            System.out.println("A média de gastos por dia é: " + media);
            System.out.println("O dia com maior gasto é: " + nomemaiordia);
            System.out.println("O total gasto com transporte: " + gastovt);
            System.out.println("O total gasto com alimentação:" + gastovr);
            System.out.println("O total gasto com lazer" + gastolazer);
        }
    }