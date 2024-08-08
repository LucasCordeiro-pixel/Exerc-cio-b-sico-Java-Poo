//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Lucas";
        f1.idade = 19;
        f1.salarios = new double[]{1999.00, 2897.00, 7650.00};
        f1.imprimirMediaSalario();
        f1.status();
    }
}