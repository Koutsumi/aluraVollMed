package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadoEndereco;

public record DadosAtualizacaoPaciente(@NotNull Long id, String nome, String telefone, DadoEndereco endereco) {
}
