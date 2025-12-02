package br.edu.uniesp.softfact.infra.aluno;

import br.edu.uniesp.softfact.shared.enums.Periodo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
    boolean existsByEmail(String email);
    boolean existsByMatricula(String matricula);
    Optional<AlunoEntity> findByEmail(String email);

    // Spring Data
    Page<AlunoEntity> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
    Page<AlunoEntity> findByNomeContainingIgnoreCaseAndPeriodoIn(
            String nome, Collection<Periodo> periodos, Pageable pageable);
    Page<AlunoEntity> findDistinctByStacks_NomeInIgnoreCase(Collection<String> nomesStacks, Pageable pageable);


}
