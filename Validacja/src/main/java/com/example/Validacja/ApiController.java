package com.example.Validacja;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class ApiController {
    @RequestMapping("/checkType/{text}")
    @ResponseBody
    public Object checkType(@PathVariable("text") StringBuilder string) {
        return new CheckType(string).checkType();
    }
}
