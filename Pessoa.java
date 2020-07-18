package trabalhoTP;

import java.util.Date;

public class Pessoa {
    public String nomeDaPessoa;
    public String cpfDaPessoa;
    public Date data_nascimentoDaPessoa;
    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nomeDaPessoa = _nome;
        this.cpfDaPessoa = _cpf;
        this.data_nascimentoDaPessoa = _data;
    }
    public double tirarCopias(int quantidade) { 
        return 0.10 * (double) quantidade;
    }
}
