package trabalhoTP;
import java.util.Date;

/* @Author Valdeci Santos de Miranda
 * @Author Alan Gustavo antero
 * Este programa exibe os dados de um aluno com base no recurso de herança
 * fazendo com que a classe principal herde as caracteristicas da classe pessoa
 * e da classe aluno.
 */

public class main {
    public static void main(String[] args) {
        Aluno informacao = new Aluno("João carlos da souza pereira", "820.599.270-30", new Date());
        System.out.println("Dados do aluno : " + informacao.nomeDaPessoa);
        System.out.println("CPF: " + informacao.cpfDaPessoa);
        System.out.println("Data de nascimento: " + informacao.data_nascimentoDaPessoa.toString());
    }
}
