package com.compresuapeca.rtx4060.controllers;

import com.compresuapeca.rtx4060.entities.DadosBackup;
import com.compresuapeca.rtx4060.services.DadosBackupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pecas/")
public class DadosBackupController {

    private final DadosBackupService dadosBackupService;

    @Autowired
    public DadosBackupController(DadosBackupService dadosBackupService) {
        this.dadosBackupService = dadosBackupService;
    }

    // Endpoint para obter todos os dados ou filtrar por marca ou codigoCofap
    @GetMapping
    public List<DadosBackup> getAllDadosBackup(
            @RequestParam(required = false) String marca,
            @RequestParam(required = false) String codigoCofap) {

        // Se marca e codigoCofap estiverem vazios, retorna todos os dados
        if (marca == null && codigoCofap == null) {
            return dadosBackupService.getAllDadosBackup();
        }

        // Caso contrário, retorna os dados filtrados
        return dadosBackupService.buscarPorMarcaOuCodigoCofap(marca, codigoCofap);
    }
}