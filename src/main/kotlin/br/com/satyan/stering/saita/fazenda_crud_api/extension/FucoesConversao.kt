package br.com.satyan.stering.saita.fazenda_crud_api.extension

import br.com.satyan.stering.saita.fazenda_crud_api.controller.request.GadoPutRequest
import br.com.satyan.stering.saita.fazenda_crud_api.controller.request.GadoRequest
import br.com.satyan.stering.saita.fazenda_crud_api.model.GadoModel

fun GadoRequest.toModel(): GadoModel{
    return GadoModel(raca = this.raca, status= this.status)
}

fun GadoPutRequest.toModel(gadoSalvo: GadoModel): GadoModel{
    return GadoModel(id = this.id, status = this.status, raca = this.raca)
}