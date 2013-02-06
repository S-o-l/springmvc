/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.requestmap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Основной
 */
@Controller
public class RequestMap {
    
    @RequestMapping("mapbypath")
    public @ResponseBody String getByPath() {
        return "Hello, this is request to /mvc/requestmap/mapbypath path";
    }
    
    @RequestMapping(value="mapbymeth", method=RequestMethod.GET)
    public @ResponseBody String getByMethGet() {
        return "Hello, this is GET request to /mvc/requestmap/mapbymeth path";
    }
    
    @RequestMapping(value="mapbymeth", method=RequestMethod.POST)
    public @ResponseBody String getByMethPost() {
        return "Hello, this is POST request to /mvc/requestmap/mapbymeth path";
    }
    
    @RequestMapping(value="mapbypresparam", params="goodparam")
    public @ResponseBody String getByPresParam() {
        return "Hello, this is request with presence of 'goodparam' parameter";
    }

    @RequestMapping(value="mapbyabsparam", params="!foo")
    public @ResponseBody String getByAbsParam() {
        return "Hello, this is request with absence of 'foo' parameter";
    }
    
    @RequestMapping(value="mapbypreshead", headers="Goodheader")
    public @ResponseBody String getByPresHead() {
        return "Hello, this is request with presence of Goodheader!";
    }
    
    @RequestMapping(value="mapbyabshead", headers="!Badheader")
    public @ResponseBody String getByAbsHead() {
        return "Hello, this is request without presence of Badheader!";
    }

    @RequestMapping(value="mapbyregexp/**")
    public @ResponseBody String getByRegexp() {
        return "Hello, this is request to mapbyregexp/*!";
    }
}
