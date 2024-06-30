package br.com.satyan.stering.saita.fazenda_crud_api.service

import br.com.satyan.stering.saita.fazenda_crud_api.model.GadoModel
import br.com.satyan.stering.saita.fazenda_crud_api.repository.GadoRepository
import org.springframework.stereotype.Service

@Service
class GadoCRUDService (

    val gadoRepository: GadoRepository

){

    fun buscarTodosGados(): List<GadoModel>{
        return gadoRepository.findAll();
    }

    fun salvarGado(gadoModel: GadoModel){
        gadoRepository.save(gadoModel);
    }

    fun buscarGado(id: Int): GadoModel {
        return gadoRepository.findById(id).orElseThrow();
    }

    fun attGado(gadoModel: GadoModel) {
        gadoRepository.save(gadoModel);
    }

    fun deletaGado(id: Int) {
        var gadoSalvo: GadoModel = gadoRepository.findById(id).orElseThrow();
        gadoSalvo.status = "DELETADO";
        gadoRepository.save(gadoSalvo);
    }

}