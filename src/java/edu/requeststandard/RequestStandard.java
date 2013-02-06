/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.requeststandard;

import java.security.Principal;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Основной
 */
@Controller
public class RequestStandard {
    
    @RequestMapping(value="reqargum")
    public @ResponseBody String reqArgum(HttpServletRequest httpServReq, Principal principal, Locale local){
        return "Hello, this is a request with the following arguments:<br>"
                + "HttpServletRequest: "  + httpServReq + "<br>"
                + "Principal: " + principal + "<br>"
                + "Locale: " + local;
    }
    
}
