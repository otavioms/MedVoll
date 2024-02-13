package otavioms.med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import otavioms.med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
