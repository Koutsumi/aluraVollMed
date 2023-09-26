package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadoEndereco;

public record DadosAtulizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadoEndereco endereco) {
}
