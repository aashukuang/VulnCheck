package org.ctf.vulncheck.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.util.Base64;

import static org.springframework.web.util.WebUtils.getCookie;

@Controller
public class LoginController {

    @RequestMapping("/spel/vuln1")
    public String spel_vuln1(String value) {
        ExpressionParser parser = new SpelExpressionParser();
        return parser.parseExpression(value).getValue().toString();
    }
}