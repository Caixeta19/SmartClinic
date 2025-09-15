import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do paciente: ");
        String paciente = scanner.nextLine();


        System.out.println("\n--- Agendamento ---");
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Mês: ");
        int mes = scanner.nextInt();

        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hora (formato HH:MM): ");
        String horaCompleta = scanner.nextLine();
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(horaCompleta, formatterHora);

        System.out.print("Local: ");
        String local = scanner.nextLine();

        System.out.print("Médico: ");
        String medico = scanner.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        LocalDateTime dataHora = LocalDateTime.of(
                ano, mes, dia, hora.getHour(), hora.getMinute()
        );


        Consulta consulta = new Consulta(paciente, dataHora, local, medico, especialidade);

        System.out.println("\n✅ Consulta agendada com sucesso!");
        consulta.exibirInfo();
        scanner.close();
    }
}
