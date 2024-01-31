package com.app.cadeaunoel.controller;

public class CadeauDTO {

    private String nomDTO;
    private String descriptionDTO;
    private String prixDTOAvecSymbole_€;


    public String getNomDTO() {
        return nomDTO;
    }

    public void setNomDTO(String nomDTO) {
        this.nomDTO = nomDTO;
    }

    public String getDescriptionDTO() {
        return descriptionDTO;
    }

    public void setDescriptionDTO(String descriptionDTO) {
        this.descriptionDTO = descriptionDTO;
    }

    public String getPrixDTOAvecSymbole_€() {
        return prixDTOAvecSymbole_€;
    }

    public void setPrixDTOAvecSymbole_€(String prixDTOAvecSymbole_€) {
        this.prixDTOAvecSymbole_€ = prixDTOAvecSymbole_€;
    }

}
