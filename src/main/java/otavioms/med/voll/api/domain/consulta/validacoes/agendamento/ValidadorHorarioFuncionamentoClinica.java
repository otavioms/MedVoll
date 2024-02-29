package otavioms.med.voll.api.domain.consulta.validacoes.agendamento;

import org.springframework.stereotype.Component;
import otavioms.med.voll.api.domain.ValidacaoException;
import otavioms.med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoDaClinica = dataConsulta.getHour() > 18;

        if (domingo || antesDaAberturaDaClinica || depoisDoEncerramentoDaClinica) {
            throw new ValidacaoException("Clínica não está em funcionamento neste dia/horário.");
        }
    }

}
