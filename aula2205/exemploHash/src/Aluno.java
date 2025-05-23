public class Aluno implements Comparable<Aluno> {
    private int ra;
    private String nome;
    private String curso;

    public Aluno(){

    }
    public Aluno(int ra, String nome, String curso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    //implantar equals e hashcode

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Aluno) && ((Aluno) obj).ra == this.ra;
    }

    @Override
    public int hashCode() {
        //metodo hashing
        return nome.length();
    }
    @Override
    public String toString() {
        return "Aluno [ra=" + ra + 
            ", nome=" + nome +
             ", curso=" + curso + "]";
    }

    @Override
    public int compareTo(Aluno o) {
        if(this.ra  < o.ra) return -1;
        if(this.ra > o.ra) return 1;
        return 0;
    }
}
