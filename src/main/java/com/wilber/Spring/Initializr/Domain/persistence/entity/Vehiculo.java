package com.wilber.Spring.Initializr.Domain.persistence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private String id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "America/Lima")
    private Date fecha;

}
