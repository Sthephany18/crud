package cadastro;

import java.util.Scanner;

public class Crud extends Aluno{
    Scanner teclado = new Scanner(System.in);
    double gerador = Math.random();
    
    public void Status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatriculada());
        System.out.println("Turma " + this.getTurma());
    }
    
    public void create(){
        System.out.println("Digite o nome do aluno");
        setNome(teclado.nextLine());
        System.out.println("Gerando o número da matrícula");
        setMatricula((int) gerador);
        System.out.println(getMatricula());
        System.out.println("Informe a turma");
        setTurma(teclado.nextLine());
                
    }
    
    public void pesquisar(){
        System.out.println("Pesquisar por nome ou matricula");
        System.out.println("Para nome digite 1 , ou para matricula digite 2");
        String pesquisa = teclado.nextLine();
        switch (pesquisa){
            case "1" -> {
                String nome1 = teclado.nextLine();
                if (nome1.equals(getNome())){
                    //System.out.println("assas" + this.Status());                    
                }else{
                    System.out.println("Aluno nao encontrado");
                }
            }
            case "2" -> {
                Double matricula1 = teclado.nextDouble();
                if(matricula1.equals(getMatricula())){
                    // System.out.println("");  
                }else {
                    System.out.println("Aluno nao encontrado");
                }
            }
                
        }
    }
    
    public void Atualizar(){
        System.out.println("Atuaçizar os registros do aluno");
        String nomealuno = teclado.nextLine();
        if(nomealuno.equals(getNome())){
            System.out.println("Desja atualizar nome, matricula ou turma");
            System.out.println("digite 1 para nome, 2 para matricula e 3 para turma");
            int atualizar = teclado.nextInt();
            switch (atualizar){
                case 1 -> setNome(teclado.nextLine());
                case 2 -> setTurma(teclado.nextLine());
                case 3 -> setMatricula((int) teclado.nextDouble());
                
            }
        }
    }
    public void delete(){
        System.out.println("Apagar registro do aluno");
        String nomealuno1 = teclado.nextLine();
        if(nomealuno1.equals(getNome()));
        System.out.println("Apagar nome, turma ou matriucla");
        System.out.println("Para nome digite 1, turma digite 2 e matricula digite 3");
        int apagar = teclado.nextInt();
        switch(apagar){
            case 1 -> System.out.println("apagando nome");
            case 2 -> System.out.println("apagando turma");
            case 3 -> System.out.println("apagando matricula");
        
    }
    }
}
