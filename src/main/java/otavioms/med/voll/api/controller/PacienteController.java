package otavioms.med.voll.api.controller;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import otavioms.med.voll.api.paciente.DadosCadastroPaciente;
import otavioms.med.voll.api.paciente.DadosListagemPaciente;
import otavioms.med.voll.api.paciente.Paciente;
import otavioms.med.voll.api.paciente.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"nome"})Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }
}
