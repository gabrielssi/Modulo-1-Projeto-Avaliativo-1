package br.com.gabriel.projeto1labBeach.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table
public class Praia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "bairro_id") //
    @NotNull
    private Bairro bairro;
    @NotBlank(message = " O preenchimento deste campo é obrigatório. ")
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Boolean acessibilidade;
    @NotBlank(message = " O preenchimento deste campo é obrigatório. ")
    // @Nonnull
    @Column(nullable = false)    private String status;




}
