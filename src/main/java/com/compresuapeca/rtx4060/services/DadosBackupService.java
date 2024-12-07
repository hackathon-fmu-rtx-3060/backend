package com.compresuapeca.rtx4060.services;

import com.compresuapeca.rtx4060.entities.DadosBackup;
import com.compresuapeca.rtx4060.repositories.DadosBackupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosBackupService {

    private final DadosBackupRepository dadosBackupRepository;

    @Autowired
    public DadosBackupService(DadosBackupRepository dadosBackupRepository) {
        this.dadosBackupRepository = dadosBackupRepository;
    }

    public List<DadosBackup> getAllDadosBackup() {
        return dadosBackupRepository.findAll();
    }

    // Método para buscar dados por marca ou codigoCofap
    public List<DadosBackup> buscarPorMarcaOuCodigoCofap(String marca, String codigoCofap) {
        if (marca != null && codigoCofap != null) {
            return dadosBackupRepository.findByMarcaContainingOrCodigoCofapContaining(marca, codigoCofap);
        } else if (marca != null) {
            return dadosBackupRepository.findByMarcaContaining(marca);
        } else if (codigoCofap != null) {
            return dadosBackupRepository.findByCodigoCofapContaining(codigoCofap);
        } else {
            return getAllDadosBackup();  // Retorna todos os dados caso nada seja filtrado
        }

    }
}
