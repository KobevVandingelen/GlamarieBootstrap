package be.thomasmore.glamarie.controllers;


import be.thomasmore.glamarie.model.Nagel;
import be.thomasmore.glamarie.model.NagelDetail;
import be.thomasmore.glamarie.repositories.NagelDetailRepository;
import be.thomasmore.glamarie.repositories.NagelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class PortfoliopageController {
    @Autowired
    private NagelRepository nagelRepository;

    @GetMapping({"/Nageldetail", "/Nageldetail/{id}"})
    public String nagelDetails(Model model, @PathVariable(required = false) Integer id) {
        Optional<Nagel> optionalNagel = nagelRepository.findById(id);
        if (optionalNagel.isPresent())
            model.addAttribute("Nagel", optionalNagel.get());
        return "Nageldetail";
    }
}
