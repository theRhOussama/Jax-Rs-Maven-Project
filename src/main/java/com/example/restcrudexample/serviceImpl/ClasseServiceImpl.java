package com.example.restcrudexample.serviceImpl;

import com.example.restcrudexample.connect.SingletonConnection;
import com.example.restcrudexample.entities.Classe;
import com.example.restcrudexample.service.ClasseService;
import jakarta.enterprise.inject.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Model
public class ClasseServiceImpl implements ClasseService {

    Connection conToUse = SingletonConnection.getConnection();
    @Override
    public int addClasse(Classe classe) throws SQLException {
        String sqlQuery ="INSERT INTO classe(nomclasse) values(?)";
        PreparedStatement addClasseStatement= conToUse.prepareStatement(sqlQuery);
         addClasseStatement.setString(1,classe.getClasseName());
         return  addClasseStatement.executeUpdate();
    }
    @Override
    public String deleteClasse(int idClassse) throws  SQLException {
        return null;
    }
    @Override
    public Classe updateCLasse(int idClasse) throws  SQLException {
        return null;
    }
    @Override
    public Classe searchClasse(int idClasse) throws SQLException {
        String sqlQuery="SELECT * FROM classe WHERE id=? ";
        PreparedStatement searchClasse = conToUse.prepareStatement(sqlQuery);
        ResultSet resultSet = searchClasse.executeQuery();
        Classe classeFound = new Classe();
        while (resultSet.next()){
            classeFound.setClasseName(resultSet.getString("nomclasse"));
        }
        return classeFound;
    }
}
