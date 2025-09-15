public  class Recepcionista extends Pessoa {
    private String turno;

    public Recepcionista(String nome, String cpf, String telefone, String turno) {
        super(nome, cpf, telefone);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public void exibirinfo() {
        System.out.println("Recepcionista:"+getNome()+ "CPF:"+ getCpf()+"Telefone:"+ getTelefone()+ "Turno:");
    }




}
