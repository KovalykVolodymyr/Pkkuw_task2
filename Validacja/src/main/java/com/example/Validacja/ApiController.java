package com.example.Validacja;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/checkType/{text}")
    @ResponseBody
    public String checkType(@PathVariable("text") StringBuilder string) {
        return new CheckType(string).checkType();
    }
}
