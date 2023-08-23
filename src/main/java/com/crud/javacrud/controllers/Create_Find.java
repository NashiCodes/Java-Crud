package com.crud.javacrud.controllers;

import com.crud.javacrud.dao.ClientDao;
import com.crud.javacrud.model.Client;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "Create_Find", value = "/Create_Find")
public class Create_Find extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Client client = new Client();
            client.setName(request.getParameter("nome"));
            client.setCode(request.getParameter("cpf"));
            client.setBirthDate(request.getParameter("nascimento"));
            client.setSituation(request.getParameter("situacao"));

        ClientDao.create(client);

    }
}