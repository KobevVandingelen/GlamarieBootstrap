package be.thomasmore.glamarie.controllers;


import be.thomasmore.glamarie.model.Portfolio;
import be.thomasmore.glamarie.model.User;
import be.thomasmore.glamarie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @ModelAttribute("user")
    public User findUser(@PathVariable(required = false) Integer id) {

        if (id != null) {
            Optional<User> optionalUser = userRepository.findById(id);
            if (optionalUser.isPresent()) {
                return optionalUser.get();
            }
        }
        return new User();
    }


    @GetMapping("/registratie")
    public String registratiePage(Model model,
                                  @ModelAttribute("user") User user){

        return "registratie";
    }

    @PostMapping("/registratie")
    public String registratiePagePost(Model model,
                                  @RequestParam String paswoord1,
                                  @RequestParam String paswoord2,
                                  @Valid @ModelAttribute("user") User user){
        String role = "USER";
        if (paswoord1.equals("") || paswoord2.equals("")){
            return "registratie";
        }
        if (paswoord1.equals(paswoord2)){
            user.setRole(role);
            String encode = passwordEncoder.encode(paswoord1);
            user.setPassword(encode);
            userRepository.save(user);
            return "redirect:/home";
        }
        return "registratie";

    }


}
