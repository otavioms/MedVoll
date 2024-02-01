package otavioms.med.voll.api.controller;

import org.springframework.web.bind.annotation.*;
import otavioms.med.voll.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    //Serve para informar que quando chegar uma requisão POST tem que chamar este método
    @PostMapping          //Serve para receber dados do corpo da requisição
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }

}
