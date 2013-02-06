/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.requestdata;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Основной
 */
@Controller
public class RequestData {
    
    @RequestMapping("reqparam")
    public @ResponseBody String reqParam(@RequestParam String parameter) {
        return "Hello, this is a request with a parameter and its value is " + parameter;
    }
    
    @RequestMapping("groupparam")
    public @ResponseBody String reqParam(GroupParam groupparam) {
        return "Hello, this is a request with a group of parameters and they are: " + groupparam.getParam1() + " and " + groupparam.getParam2() + " and " + groupparam.getParam3();
    }

    @RequestMapping(value="pathvar/{var}")
    public @ResponseBody String pathVar(@PathVariable String var) {
        return "Hello, this is a request to a path: " + var;
    }

    @RequestMapping(value="head")
    public @ResponseBody String head(@RequestHeader("User-Agent") String userAgent) {
        return "Hello, this is a request with a header: " + userAgent;
    }
    
    @RequestMapping(value="entity")
    public @ResponseBody String body(HttpEntity<String> entity) {
        return "Hello, this is a request entity: " + entity.getBody() + entity.getHeaders();
    }
}
