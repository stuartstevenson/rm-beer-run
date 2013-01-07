package org.stu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Tamsin
 * Date: 05/01/13
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHello() {
        return "hello";
    }
}
