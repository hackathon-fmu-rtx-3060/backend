package com.compresuapeca.rtx4060.repositories;

import com.compresuapeca.rtx4060.entities.DadosBackup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DadosBackupRepository extends JpaRepository<DadosBackup, Long> {
    // Método para buscar dados por marca
    List<DadosBackup> findByMarcaContaining(String marca);

    // Método para buscar dados por codigoCofap
    List<DadosBackup> findByCodigoCofapContaining(String codigoCofap);

    // Método para buscar dados por marca ou codigoCofap
    List<DadosBackup> findByMarcaContainingOrCodigoCofapContaining(String marca, String codigoCofap);
}
