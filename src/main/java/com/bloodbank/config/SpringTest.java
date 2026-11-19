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
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        BloodBankService service =
                context.getBean(BloodBankService.class);

        service.displayMessage();

        context.close();
    }
}
