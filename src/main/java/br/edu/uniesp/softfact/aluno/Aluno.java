package br.edu.uniesp.softfact.aluno;

import br.edu.uniesp.softfact.aluno.enums.Curso;
import br.edu.uniesp.softfact.aluno.enums.Periodo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Stack;

@Data
@Entity
@Table(name = "tb_softfact_aluno")
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Email
    private String email;

    private String telefone;

    private Curso curso;

    private List<Stack> stacks;

    @OneToMany
    private List<Certificado> certificados;

    private Periodo periodo;

}
