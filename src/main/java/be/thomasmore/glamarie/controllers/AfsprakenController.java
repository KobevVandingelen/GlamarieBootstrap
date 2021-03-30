package be.thomasmore.glamarie.controllers;


import be.thomasmore.glamarie.model.Afspraak;
import be.thomasmore.glamarie.model.User;
import be.thomasmore.glamarie.repositories.AfspraakRepository;
import be.thomasmore.glamarie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class AfsprakenController {


    @Autowired
    private AfspraakRepository afspraakRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/Afsprakenplanner")
    public String afsprakenList(Model model){
        List<Afspraak> afspraken = (List<Afspraak>) afspraakRepository.findAfspraakByUserIsNull();


        model.addAttribute("afspraken", afspraken);
        model.addAttribute("aantalafspraken", afspraken.size());
        return "Afsprakenplanner";
    }


    @GetMapping("/afsprakenbekijken")
    public String afsprakenEigenList(Model model, @AuthenticationPrincipal UserDetails currentUser){


        User user =  userRepository.findUserByUsername(currentUser.getUsername());
        Iterable<Afspraak> afspraken = afspraakRepository.findAfspraakByUser(user);

        model.addAttribute("afspraken", afspraken);
        return "afsprakenbekijken";
    }

    @PostMapping("/Afsprakenplanner/{id}")
    public String afsprakenListPost(Model model,
                                    @PathVariable int id,
                                    @ModelAttribute("afspraak") Afspraak afspraak,
                                    @AuthenticationPrincipal UserDetails currentUser){
        User user =  userRepository.findUserByUsername(currentUser.getUsername());
        Optional<Afspraak> optionalAfspraak = afspraakRepository.findById(id);
        if (optionalAfspraak.isPresent()){
            Afspraak afspraakedit = optionalAfspraak.get();
            afspraakedit.setBehandeling(afspraak.getBehandeling());
            afspraakedit.setUser(user);
            afspraakRepository.save(afspraakedit);
        }
        return "redirect:/afsprakenbekijken";
    }


    @PostMapping("/afsprakenbekijken/{id}")
    public String afsprakenEigenListPost(Model model,
                                         @PathVariable int id){

        Optional<Afspraak> optionalAfspraak = afspraakRepository.findById(id);
        if (optionalAfspraak.isPresent()) {
            Afspraak afspraak = optionalAfspraak.get();
            afspraak.setBehandeling(null);
            afspraak.setUser(null);
            afspraakRepository.save(afspraak);
        }
        return "redirect:/afsprakenbekijken";

    }






}
