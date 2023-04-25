package cadastro;

public class Aluno {
   private String nome;
   private int matricula;
   public String turma;
   public String matriculada;

    public Aluno() {
    }

    public Aluno(String matriculada) {
        this.matriculada = matriculada;
    }

    public Aluno(String nome, int matricula, String turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatriculada() {
        return matriculada;
    }

    public void setMatriculada(String matriculada) {
        this.matriculada = matriculada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
     
    public void cadastro(){
        System.out.println("Aluno(a) com nome " + this.getNome());
        System.out.println("Numero de matricula " + this.getMatricula());
        System.out.println("A turma e " + this.getTurma());
        System.out.println("foi cadastrado(a) " );
        
    }
    public void alterar(){
         if("sim".equals(this.matriculada)){
             System.out.println("A pessoa esta matriculada");
         }
         else{
             System.out.println("A matricula foi cancelada");
         }   
        }
    
}
