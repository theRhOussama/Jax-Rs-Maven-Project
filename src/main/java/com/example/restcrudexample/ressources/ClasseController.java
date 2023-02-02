package com.example.restcrudexample.ressources;

import com.example.restcrudexample.connect.SingletonConnection;
import com.example.restcrudexample.entities.Classe;
import com.example.restcrudexample.serviceImpl.ClasseServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.sql.SQLException;

@Path("/classe")
public class ClasseController {

    @Inject
    ClasseServiceImpl classeService;
    @POST
    @Path("/addClasse")
    @Produces(MediaType.APPLICATION_XML)
    public  String addClasse() throws SQLException {
        Classe classe = new Classe("B2");
        int a = classeService.addClasse(classe);
        System.out.println(a);
        return classe.toString();
    }

    @Path("/{idClasse}")
    @Produces(MediaType.APPLICATION_JSON)
    public Classe findClass(@PathParam("idClasse") int idClasse) throws SQLException {
        return classeService.searchClasse(idClasse);
    }

}
