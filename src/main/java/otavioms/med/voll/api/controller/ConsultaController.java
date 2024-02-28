package otavioms.med.voll.api.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import otavioms.med.voll.api.domain.consulta.AgendaDeConsultas;
import otavioms.med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import otavioms.med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import otavioms.med.voll.api.domain.consulta.DadosDetalhamentoConsulta;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultas agenda;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        agenda.agendar(dados);
        return ResponseEntity.ok(new DadosDetalhamentoConsulta(null, dados.idMedico(), dados.idPaciente(), dados.data()));
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity inativar(@RequestBody @Valid DadosCancelamentoConsulta dados) {
        agenda.cancelar(dados);
        return ResponseEntity.noContent().build();
    }
}
