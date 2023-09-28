package med.voll.api.paciente;

import med.voll.api.medico.DadosListagemMedico;

public record DadosListagemPaciente(Long id, String nome, String telefone, String cpf, String email) {

    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getTelefone(), paciente.getCpf(), paciente.getEmail());

    }
}
