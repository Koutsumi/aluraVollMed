package med.voll.api.medico;

import med.voll.api.endereco.DadoEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadoEndereco endereco) {
}
