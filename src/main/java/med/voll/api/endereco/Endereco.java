package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String cep;
    private String logradouro;
    private String bairro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadoEndereco dados) {
        this.cep = dados.cep();
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.uf = dados.uf();
    }
}
