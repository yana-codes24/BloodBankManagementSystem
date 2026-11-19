/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yana Pandey
 */

package com.bloodbank.servlet;

import com.bloodbank.util.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update-donor")
public class UpdateDonorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String sql = "UPDATE donor SET full_name=?, age=?, gender=?, "
                   + "phone=?, email=? WHERE donor_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, request.getParameter("full_name"));
            ps.setInt(2, Integer.parseInt(request.getParameter("age")));
            ps.setString(3, request.getParameter("gender"));
            ps.setString(4, request.getParameter("phone"));

            String email = request.getParameter("email");
            ps.setString(5, email == null || email.trim().isEmpty()
                    ? null : email.trim());

            ps.setInt(6, Integer.parseInt(request.getParameter("donor_id")));

            ps.executeUpdate();

            response.sendRedirect(request.getContextPath() + "/donors");

        } catch (SQLException | IllegalArgumentException e) {
            throw new ServletException("Unable to update donor", e);
        }
    }
}

