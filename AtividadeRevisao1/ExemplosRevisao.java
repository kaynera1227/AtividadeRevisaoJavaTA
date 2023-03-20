package AtividadeRevisao1;

import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        System.out.println("Informe a primeira nota do aluno");
        int nota1 = sc.nextInt();

        System.out.println("Informe a segunda nota do aluno");
        int nota2 = sc.nextInt();

        double media = (nota1+nota2)/2;

        System.out.println("A media do aulo é" + media);

        System.out.println(" Professor informe o total de aulas dadas");
        int aulasdadas = sc.nextInt();

        System.out.println("Professor, informe o numero de faltas do aluno");
        int nfaltas = sc.nextInt();

        double frequencia = (aulasdadas-nfaltas)*100/aulasdadas;

        System.out.println("O aluno teve"+frequencia+"%");

        if(media>=50 && frequencia>=75){
            System.out.println("Aluno aprovado");

        } else if(media<50 && frequencia>=75){
            System.out.println("Aluno de recuperação");
        } else 
        System.out.println("Aluno reprovado");

        }


    }


