package Cliente;
import lombok.Data;


@Data
public class Cliente {

    private String nome;
    private int telefone;

    public Cliente(String nome) {
        this.nome = nome;
    }
}
