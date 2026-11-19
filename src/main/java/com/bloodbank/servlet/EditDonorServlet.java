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
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit-donor")
public class EditDonorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        String sql = "SELECT * FROM donor WHERE donor_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    Map<String, Object> donor = new HashMap<>();

                    donor.put("id", rs.getInt("donor_id"));
                    donor.put("name", rs.getString("full_name"));
                    donor.put("age", rs.getInt("age"));
                    donor.put("gender", rs.getString("gender"));
                    donor.put("phone", rs.getString("phone"));
                    donor.put("email", rs.getString("email"));

                    request.setAttribute("donor", donor);

                    request.getRequestDispatcher("/edit-donor.jsp")
                           .forward(request, response);
                } else {
                    response.sendRedirect(request.getContextPath() + "/donors");
                }
            }

        } catch (Exception e) {
            throw new ServletException("Unable to fetch donor details", e);
        }
    }
}
