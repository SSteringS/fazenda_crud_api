package br.com.satyan.stering.saita.fazenda_crud_api.controller.request

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

data class GadoRequest(

    var gadId : Int? = 0,

    //todo mudar para ENUM
    var raca : String,

    var status: String
)
