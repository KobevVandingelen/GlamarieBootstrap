package be.thomasmore.glamarie.controllers;


import be.thomasmore.glamarie.model.*;
import be.thomasmore.glamarie.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    public static String uploadDirectory = "C:\\Users\\kobev\\Documents\\Thomas more 2020-2021\\Advancede programming\\Project_glamarie\\src\\main\\upload\\img";

    @Autowired
    private AfspraakRepository afspraakRepository;

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private NagelRepository nagelRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private NagelDetailRepository nagelDetailRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/adminpage")
    public String adminPage(Model model) {
        return "admin/adminpage";
    }

    @ModelAttribute("afspraak")
    public Afspraak findAfspraak(@PathVariable(required = false) Integer id) {

        if (id != null) {
            Optional<Afspraak> optionalAfspraak = afspraakRepository.findById(id);
            if (optionalAfspraak.isPresent()) {
                return optionalAfspraak.get();
            }
        }
        return new Afspraak();

    }

    @GetMapping("/afspraaknew")
    public String afspraakNew(Model model,
                              @ModelAttribute("afspraak") Afspraak afspraak) {

        model.addAttribute("afspraken", afspraakRepository.findAll());
        return "admin/afspraaknew";
    }

    @PostMapping("/afspraaknew")
    public String afspraakNewPost(Model model,
                                  @Valid @ModelAttribute("afspraak") Afspraak afspraak,
                                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("afspraken", afspraakRepository.findAll());
            return "admin/afspraaknew";
        }
        afspraakRepository.save(afspraak);
        return "redirect:/admin/afspraaknew";
    }

    @GetMapping("/afspraakedit/{id}")
    public String afspraakEdit(Model model,
                               @PathVariable int id) {
        return "admin/afspraakedit";

    }

    @PostMapping("/afspraakedit/{id}")
    public String afspraakEditPost(Model model,
                                   @PathVariable int id,
                                   @Valid @ModelAttribute("afspraak") Afspraak afspraak,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "admin/afspraakedit";
        }
        afspraakRepository.save(afspraak);
        return "redirect:/admin/afspraaknew/";

    }

    @RequestMapping("/deleteAfspraak/{id}")
    public String deleteAfspraak(Model model,
                                 @PathVariable int id) {
        afspraakRepository.deleteById(id);
        return "redirect:/admin/afspraaknew";
    }

    //NAGEL  MODEL GET POST DELETE //

    @ModelAttribute("nagel")
    public Nagel findNagel(@PathVariable(required = false) Integer id) {

        if (id != null) {
            Optional<Nagel> optionalNagel = nagelRepository.findById(id);
            if (optionalNagel.isPresent()) {
                return optionalNagel.get();
            }
        }
        return new Nagel();
    }

    @GetMapping("/nagelnew")
    public String nagelNew(Model model,
                           @ModelAttribute("nagel") Nagel nagel) {
        model.addAttribute("nagels", nagelRepository.findAllByOrderByIdDesc());
        model.addAttribute("portfolios", portfolioRepository.findAll());
        model.addAttribute("colors", colorRepository.findAll());
        model.addAttribute("nageDetails", nagelDetailRepository.findAll());
        return "admin/nagelnew";
    }

    @PostMapping("/nagelnew")
    public String nagelNewPost(Model model,
                               @Valid @ModelAttribute("nagel") Nagel nagel,
                               @RequestParam int portfolioId,
                               @RequestParam int colorId,
                               @RequestParam int nagelDetailId,
                               @RequestParam("files") MultipartFile file,
                               BindingResult bindingResult) {
        StringBuilder fileName = new StringBuilder();
        Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
        fileName.append(file.getOriginalFilename());
        try {
            Files.write(fileNameAndPath, file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("nagels", nagelRepository.findAllByOrderByIdDesc());
            model.addAttribute("portfolios", portfolioRepository.findAll());
            model.addAttribute("colors", colorRepository.findAll());
            model.addAttribute("nageDetails", nagelDetailRepository.findAll());
            return "admin/nagelnew";
        }
        String hulpstring = "../../upload/img/" + file.getOriginalFilename();
        NagelDetail nagelDetail = nagelDetailRepository.findNagelDetailById(nagelDetailId);
        Color color = colorRepository.findColorById(colorId);
        Portfolio portfolio = portfolioRepository.findPortfolioById(portfolioId);
        nagel.setColor(color);
        nagel.setPortfolio(portfolio);
        nagel.setStringPath(hulpstring);
        nagel.setNagelDetail(nagelDetail);
        nagelRepository.save(nagel);
        return "redirect:/admin/nagelnew";
    }

    @GetMapping("/nageledit/{id}")
    public String nagelEdit(Model model,
                            @PathVariable int id) {
        model.addAttribute("portfolios", portfolioRepository.findAll());
        model.addAttribute("colors", colorRepository.findAll());
        model.addAttribute("nageDetails", nagelDetailRepository.findAll());
        return "admin/nageledit";

    }

    @PostMapping("/nageledit/{id}")
    public String nagelEditPost(Model model,
                                @PathVariable int id,
                                @Valid @ModelAttribute("nagel") Nagel nagel,
                                @RequestParam int portfolioId,
                                @RequestParam int colorId,
                                @RequestParam int nagelDetailId) {
        NagelDetail nagelDetail = nagelDetailRepository.findNagelDetailById(nagelDetailId);
        Color color = colorRepository.findColorById(colorId);
        Portfolio portfolio = portfolioRepository.findPortfolioById(portfolioId);
        nagel.setColor(color);
        nagel.setPortfolio(portfolio);
        nagel.setNagelDetail(nagelDetail);
        nagelRepository.save(nagel);
        return "redirect:/admin/nagelnew/";

    }

    @RequestMapping("/deleteNagel/{id}")
    public String deleteNagel(Model model,
                              @PathVariable int id) {
        nagelRepository.deleteById(id);
        return "redirect:/admin/nagelnew";
    }


    // PORTFOLIO MODEL NEW EDIT //

    @ModelAttribute("portfolio")
    public Portfolio findPortfolio(@PathVariable(required = false) Integer id) {

        if (id != null) {
            Optional<Portfolio> optionalPortfolio = portfolioRepository.findById(id);
            if (optionalPortfolio.isPresent()) {
                return optionalPortfolio.get();
            }
        }
        return new Portfolio();
    }

    @GetMapping("/portfolionew")
    public String portfolioNew(Model model,
                               @ModelAttribute("portfolio") Portfolio portfolio) {
        model.addAttribute("portfolios", portfolioRepository.findAllByOrderByIdDesc());
        return "admin/portfolionew";
    }

    @PostMapping("/portfolionew")
    public String portfolioNewPost(Model model,
                                   @Valid @ModelAttribute("portfolio") Portfolio portfolio,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("portfolios", portfolioRepository.findAllByOrderByIdDesc());
            return "admin/portfolionew";
        }
        portfolioRepository.save(portfolio);
        return "redirect:/admin/portfolionew";
    }

    @GetMapping("/portfolioedit/{id}")
    public String portfolioEdit(Model model,
                                @PathVariable int id) {
        return "admin/portfolioedit";
    }

    @PostMapping("/portfolioedit/{id}")
    public String portfolioEditPost(Model model,
                                    @PathVariable int id,
                                    @Valid @ModelAttribute("portfolio") Portfolio portfolio,
                                    BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "admin/portfolioedit";
        }

        portfolioRepository.save(portfolio);
        return "redirect:/admin/portfolionew";
    }

    // USER EDIT

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

    @GetMapping("/useredit")
    public String updateuser(Model model) {

        model.addAttribute("users", userRepository.findAll());
        return "admin/useredit";
    }

    @PostMapping("/updateuser/{id}")
    public String updateUserPost(Model model,
                                 @RequestParam String userrole,
                                 @Valid @ModelAttribute("user") User user) {
        user.setRole(userrole);
        userRepository.save(user);
        return "redirect:/admin/useredit/";

    }


}
