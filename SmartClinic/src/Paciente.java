public class Paciente extends Pessoa {

private boolean planoDeSaude;
private String endereco;

public Paciente(String nome, String cpf, String email){
    super(nome,cpf,email);
    this.planoDeSaude = planoDeSaude;
    this.endereco = endereco;
}

    public boolean isPlanoDeSaude() {
        return planoDeSaude;

    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public void exibirinfo() {
        System.out.println("Paciente:"+ getNome() + "CPF:"+ getCpf() + "Email:"+ getEmail() + "Telefone:"+ getTelefone()+  "Plano de Saúde:" + (planoDeSaude ? "Sim" : "Não"));
    }
}