package trabalhoTP;

import java.util.Date;
public class Aluno extends Pessoa {
    public Aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public String matriculaDoAluno;
    public double fazerCopias(int quantidade) {
        return 0.10 * (double) quantidade;
    }
}
