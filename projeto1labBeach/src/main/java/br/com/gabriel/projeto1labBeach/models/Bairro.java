package br.com.gabriel.projeto1labBeach.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

// anotations
@Data
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @NotBlank(message = " O preenchimento deste campo é obrigatório ")
    @Column(nullable = false, unique = true)
    private String name;
    private String description;
    private Integer population;


}
