package com.app.cadeaunoel.controller;

import com.app.cadeaunoel.controller.CadeauDTO;
import com.app.cadeaunoel.model.Cadeau;

public class CadeauMapper {
    public static CadeauDTO convertEntityToDto(Cadeau entity){
        CadeauDTO dto = new CadeauDTO();

        dto.setNomDTO(entity.getNom());
        dto.setDescriptionDTO(entity.getDescription());

        return dto;
    }

    public static Cadeau convertDtoToEntity(CadeauDTO dto) {
        Cadeau entity = new Cadeau();
        entity.setNom(dto.getNomDTO());
        entity.setDescription(dto.getDescriptionDTO());

        return entity;
    }
}
