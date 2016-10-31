package com.AWS_Strip.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francisatore on 10/31/16.
 */

@Controller
public class IndexController {

        @RequestMapping("/")
        public String home() {
            return "index";
        }
}
