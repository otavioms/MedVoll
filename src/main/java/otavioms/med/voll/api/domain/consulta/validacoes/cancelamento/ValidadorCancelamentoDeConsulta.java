package otavioms.med.voll.api.domain.consulta.validacoes.cancelamento;

import otavioms.med.voll.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {
    void validar(DadosCancelamentoConsulta dados);
}
