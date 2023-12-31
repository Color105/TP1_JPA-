package com.utn.ejer01.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name= "domicilio")
public class Domicilio extends BaseEntidad{
    private String calle;
    private String numero;
    private String localidad;
}
