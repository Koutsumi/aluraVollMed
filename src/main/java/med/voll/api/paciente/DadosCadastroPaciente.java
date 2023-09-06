package med.voll.api.paciente;

import med.voll.api.endereco.DadoEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadoEndereco endereco) {
}
