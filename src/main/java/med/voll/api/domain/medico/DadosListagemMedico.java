package med.voll.api.domain.medico;

public record DadosListagemMedico(Long id,String nome, String emial, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());

    }
}
