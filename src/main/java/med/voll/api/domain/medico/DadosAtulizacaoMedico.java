package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadoEndereco;

public record DadosAtulizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadoEndereco endereco) {
}
