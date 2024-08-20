package com.samsung.basicsecurity.controller;

import com.samsung.basicsecurity.configuration.CustomUserDetails;
import com.samsung.basicsecurity.repositories.models.User;
import com.samsung.basicsecurity.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String Login(HttpSession session) {
        //Luu gia tri vao trong session voi key la msg
        //session.setAttribute("msg", "Login message");
        return "Auth/login";
    }

    @GetMapping("/register")
    public String Register(final Model model, HttpSession session) {
        model.addAttribute("newuser", new User());
        String message = (String) session.getAttribute("msg");
        model.addAttribute("msg", message);
        return "Auth/register";
    }

    @PostMapping("/register")
    public String CreateAccount(@ModelAttribute User user, final Model model) {
        User tmpUser = userService.getUserByUserName(user.getUsername());
        if (tmpUser == null) {
            if (user.getPassword().equals(user.getConfirmpassword())) {
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                userService.createUser(user);
                return "redirect:/login";
            } else {
                model.addAttribute("error", "confirm_password_not_matched");
            }
        } else {
            model.addAttribute("error", "username_is_in_used");
        }

        model.addAttribute("newuser", user);
        return "Auth/register";

    }

    @GetMapping("/welcome")
    public String welcome(Principal principal, final Model model) {
        if (principal == null) {
            return "redirect:/login"; // Redirect to login if principal is null
        }
        String name = principal.getName();
        User user = userService.getUserByUserName(name);
        model.addAttribute("authenticatedUser", user);
        return "Auth/welcome";
    }
    @RestController
    public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

        @GetMapping("/error")
        public String handleError() {
            return "An error occurred. Please try again later."; // Trả về thông báo lỗi đơn giản
        }


    }


}
