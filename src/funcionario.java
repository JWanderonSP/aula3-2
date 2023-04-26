public class funcionario{

private String nome;
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
private int matricula;
public int getMatricula() {
    return matricula;
}
public void setMatricula(int matricula) {
    this.matricula = matricula;
}
private double salario;
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    this.salario = salario;
}
public funcionario(String nome,int matricula,double salario){
    this.nome=nome;
    this.matricula=matricula;
    this.salario=salario;
}
public funcionario(){}
}