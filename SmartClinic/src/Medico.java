public  class Medico extends Pessoa{

private String especialidade;
private String crm;

public Medico(String nome,String cpf, String email, String telefone, String especialidade, String crm){
    super(nome,cpf,email);
    this.especialidade = especialidade;
    this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public void exibirinfo() {
        System.out.println("Médico:"+ getNome() + "Especialidade:"+ getEspecialidade()+ "Crm:"+ getCrm());
    }
}

