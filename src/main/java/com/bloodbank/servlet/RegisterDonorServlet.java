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

@WebServlet("/register-donor")
public class RegisterDonorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String sql = "INSERT INTO donor "
                + "(full_name, age, gender, blood_group_id, phone, "
                + "email, address, last_donation_date) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, request.getParameter("full_name"));
            ps.setInt(2, Integer.parseInt(request.getParameter("age")));
            ps.setString(3, request.getParameter("gender"));
            ps.setInt(4, Integer.parseInt(request.getParameter("blood_group_id")));
            ps.setString(5, request.getParameter("phone"));

            String email = request.getParameter("email");
            ps.setString(6, email == null || email.trim().isEmpty()
                    ? null : email.trim());

            String address = request.getParameter("address");
            ps.setString(7, address == null || address.trim().isEmpty()
                    ? null : address.trim());

            String donationDate = request.getParameter("last_donation_date");

            if (donationDate == null || donationDate.isEmpty()) {
                ps.setNull(8, java.sql.Types.DATE);
            } else {
                ps.setDate(8, java.sql.Date.valueOf(donationDate));
            }

            ps.executeUpdate();

            response.sendRedirect(request.getContextPath() + "/donors");

        } catch (SQLException | IllegalArgumentException e) {
            throw new ServletException("Unable to register donor", e);
        }
    }
}

