package otavioms.med.voll.api.medico;

import otavioms.med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Epecialidade especialidade, DadosEndereco endereco) {
}
