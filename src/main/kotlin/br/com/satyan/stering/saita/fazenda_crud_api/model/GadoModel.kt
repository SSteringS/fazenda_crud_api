package br.com.satyan.stering.saita.fazenda_crud_api.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "gado")
data class GadoModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Int? = 0,

    //todo mudar para ENUM
    @Column(name="raca")
    var raca : String,

    @Column(name = "status")
    var status: String




    //todo adicionar pesagem como objeto

)
