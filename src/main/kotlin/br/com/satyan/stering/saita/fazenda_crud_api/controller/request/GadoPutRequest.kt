package br.com.satyan.stering.saita.fazenda_crud_api.controller.request

data class GadoPutRequest(

    var id : Int,

    //todo mudar para ENUM
    var raca : String,

    var status: String
)
