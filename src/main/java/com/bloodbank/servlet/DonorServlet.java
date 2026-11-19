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
import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/donors")
public class DonorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("adminId") == null) {
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return;
        }
        List<Map<String, Object>> donors = new ArrayList<>();

        String sql = "SELECT d.donor_id, d.full_name, d.age, d.gender, " +
             "d.phone, d.email, b.blood_group " +
             "FROM donor d " +
             "JOIN blood_group b ON d.blood_group_id = b.blood_group_id";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Map<String, Object> donor = new HashMap<>();

                donor.put("id", rs.getInt("donor_id"));
                donor.put("name", rs.getString("full_name"));
                donor.put("age", rs.getInt("age"));
                donor.put("gender", rs.getString("gender"));
                donor.put("blood_group", rs.getString("blood_group"));
                donor.put("phone", rs.getString("phone"));
                donor.put("email", rs.getString("email"));

                donors.add(donor);
            }

            request.setAttribute("donors", donors);

            request.getRequestDispatcher("/donors.jsp")
                   .forward(request, response);

        } catch (SQLException e) {
            throw new ServletException("Unable to retrieve donors", e);
        }
    }
}

