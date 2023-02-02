package com.example.restcrudexample.service;

import com.example.restcrudexample.entities.Classe;

import java.sql.SQLException;


public interface ClasseService {

    int addClasse(Classe classe) throws SQLException;
    String deleteClasse(int idClassse) throws  SQLException;
    Classe updateCLasse(int idClasse) throws SQLException;
    Classe searchClasse(int idClasse) throws  SQLException;


}
