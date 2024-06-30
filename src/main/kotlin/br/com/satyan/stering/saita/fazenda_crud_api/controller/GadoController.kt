package br.com.satyan.stering.saita.fazenda_crud_api.controller

import br.com.satyan.stering.saita.fazenda_crud_api.controller.request.GadoPutRequest
import br.com.satyan.stering.saita.fazenda_crud_api.controller.request.GadoRequest
import br.com.satyan.stering.saita.fazenda_crud_api.extension.toModel
import br.com.satyan.stering.saita.fazenda_crud_api.model.GadoModel
import br.com.satyan.stering.saita.fazenda_crud_api.service.GadoCRUDService
import jakarta.websocket.server.PathParam
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class GadoController (

    val gadoCRUDService: GadoCRUDService

){

    @GetMapping("gados")
    fun buscarTodosGados(): List<GadoModel>{
        return gadoCRUDService.buscarTodosGados();
    }

    @GetMapping("gados/{id}")
    fun buscarGado(@PathVariable id: Int): GadoModel{
        return gadoCRUDService.buscarGado(id);
    }

    @PostMapping("gados")
    @ResponseStatus(HttpStatus.CREATED)
    fun salvarGado(@RequestBody gadoRequest: GadoRequest) {
        gadoCRUDService.salvarGado(gadoRequest.toModel());
    }

    @PutMapping("gados")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun attGado(@RequestBody gadoPutRequest: GadoPutRequest) {
        var gadoSalvo = gadoCRUDService.buscarGado(gadoPutRequest.id)
        gadoCRUDService.attGado(gadoPutRequest.toModel(gadoSalvo));
    }

    @DeleteMapping("gados/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletaGadoLogico(@PathVariable id : Int){
        gadoCRUDService.deletaGado(id = id);
    }


}