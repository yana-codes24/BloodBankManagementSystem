/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bloodbank.config;

/**
 *
 * @author Yana Pandey
 */

import com.bloodbank.service.BloodBankService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public BloodBankService bloodBankService() {
        return new BloodBankService();
    }
}