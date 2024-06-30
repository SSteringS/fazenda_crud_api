package br.com.satyan.stering.saita.fazenda_crud_api.repository

import br.com.satyan.stering.saita.fazenda_crud_api.model.GadoModel
import org.springframework.data.jpa.repository.JpaRepository

interface GadoRepository: JpaRepository<GadoModel, Int> {
}