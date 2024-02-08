package otavioms.med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import otavioms.med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
