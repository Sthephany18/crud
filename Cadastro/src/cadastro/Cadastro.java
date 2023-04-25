package cadastro;

public class Cadastro {

    public static void main(String[] args) {
        Aluno c1 = new Aluno();
        c1.setNome("Jessica");
        c1.setMatricula(000000000);
        c1.setTurma("3Atec");
        c1.setMatriculada("sim");
        c1.cadastro();
        c1.alterar();
        
        Aluno c2 = new Aluno();
        System.out.println("-------------------------------");
        c2.setNome("Sthephany");
        c2.setMatricula(0013400000);
        c2.setTurma("3Atec");
        c2.setMatriculada("sim");
        c2.cadastro();
        c2.alterar();
    }
    
}
   