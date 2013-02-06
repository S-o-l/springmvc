/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.configurator;

import edu.requestmap.RequestMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Основной
 */
//@Configuration
public class Configurator {
//    @Bean
    public RequestMap requestMap() {
        return new RequestMap();
    }
}
