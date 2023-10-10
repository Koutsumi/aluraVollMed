package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadoEndereco;

public record DadosCadastroMedico(

        @NotBlank (message = "{nome.obrigatorio}")
        String nome,
        @NotBlank (message = "{email.obrigatorio}")
        @Email
        String email,

        @NotBlank (message = "{telefone.obrigatorio}")
        @Pattern(regexp = "\\d{8,9}", message = "{telefone.invalido}")
        String telefone,
        @NotBlank (message = "{crm.obrigatorio}")
        @Pattern(regexp = "\\d{4,6}", message = "{crm.invalido}")
        String crm,
        @NotNull (message = "{especialidade.obrigatorio}")
        Especialidade especialidade,
        @NotNull (message = "{endereco.obrigatorio}")
        @Valid // valida os dados do objeto
        DadoEndereco endereco) {
}
