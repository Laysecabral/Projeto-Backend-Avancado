package br.edu.uniesp.softfact.aluno;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Certificado {

    @ManyToOne
    @JoinColumn()
    private Aluno aluno;
}
