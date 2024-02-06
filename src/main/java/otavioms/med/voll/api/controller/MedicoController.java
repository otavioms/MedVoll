package otavioms.med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import otavioms.med.voll.api.medico.DadosCadastroMedico;
import otavioms.med.voll.api.medico.Medico;
import otavioms.med.voll.api.medico.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    //Serve para informar que quando chegar uma requisão POST tem que chamar este método
    @PostMapping          //Serve para receber dados do corpo da requisição
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

}
