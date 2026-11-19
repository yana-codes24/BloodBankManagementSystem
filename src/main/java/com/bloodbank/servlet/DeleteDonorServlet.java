/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bloodbank.servlet;

/**
 *
 * @author Yana Pandey
 */

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

@WebServlet("/delete-donor")
public class DeleteDonorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int donorId = Integer.parseInt(
                request.getParameter("donor_id"));

        String sql = "DELETE FROM donor WHERE donor_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, donorId);
            ps.executeUpdate();

            response.sendRedirect(
                    request.getContextPath() + "/donors");

        } catch (SQLException e) {
            throw new ServletException("Unable to delete donor", e);
        }
    }
}

