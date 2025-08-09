import java.util.HashMap;
import java.util.Map;

public class AgendaContatoss {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatoss() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatoss agendaContatoss = new AgendaContatoss();

        agendaContatoss.adicionarContato("Camila", 123456);
        agendaContatoss.adicionarContato("Camila", 5665);
        agendaContatoss.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatoss.adicionarContato("Camila DIO", 654987);
        agendaContatoss.adicionarContato("Maria Silva", 1111111);
        agendaContatoss.adicionarContato("Camila", 44444);

        agendaContatoss.exibirContato();

        agendaContatoss.removerContato("Maria Silva");
        agendaContatoss.exibirContato();

        System.out.println("O número é: " + agendaContatoss.pesquisarPorNome("Camila DIO"));
    }
}
