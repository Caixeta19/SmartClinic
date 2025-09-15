import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private String paciente;
    private LocalDateTime dataHora;
    private String local;
    private String medico;
    private String especialidade;

    public Consulta(String paciente, LocalDateTime dataHora, String local, String medico, String especialidade) {
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.local = local;
        this.medico = medico;
        this.especialidade = especialidade;
    }

    public void exibirInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Paciente: " + paciente);
        System.out.println("Data/Hora: " + dataHora.format(formatter));
        System.out.println("Local: " + local);
        System.out.println("Médico: " + medico);
        System.out.println("Especialidade: " + especialidade);
    }
}
