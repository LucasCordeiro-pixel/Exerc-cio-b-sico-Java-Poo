import java.sql.SQLOutput;

public class Funcionario {

        public String nome;
        public int idade;
        public double [] salarios;

        public void status (){
            System.out.println("Nome: " + this.nome);
            System.out.println ("Idade: " + this.idade);
            for (double salario: salarios){
                System.out.print(salario + ", ");
            }
        }
        public void imprimirMediaSalario (){ //calculo da média dos salarios e imprimir o resultado
            double media = 0;
            for (double salario: salarios){
                media += salario;
            }
            media = media / salarios.length;
            System.out.println("Media salarial " + media);
        }
    }


