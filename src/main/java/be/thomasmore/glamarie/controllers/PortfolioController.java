package be.thomasmore.glamarie.controllers;

import be.thomasmore.glamarie.model.Color;
import be.thomasmore.glamarie.model.Nagel;
import be.thomasmore.glamarie.model.Portfolio;
import be.thomasmore.glamarie.repositories.ColorRepository;
import be.thomasmore.glamarie.repositories.NagelRepository;
import be.thomasmore.glamarie.repositories.PortfolioRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Controller
public class PortfolioController {
    @Autowired
    private PortfolioRepository portfolioRepository;
    @Autowired
    private NagelRepository nagelRepository;

    @Autowired
    private ColorRepository colorRepository;



    private Logger logger = LoggerFactory.getLogger(PortfolioController.class);


    @GetMapping("/Portfoliolist")
    public String portfolioList(Model model, @RequestParam(required = false) String search) {
        logger.info(String.format("portfolioListWithFilter -- key=%S", search ));
        Iterable<Portfolio> Portfolios = portfolioRepository.findByPortfolioNameContainsIgnoreCase(search);
        model.addAttribute("portfolios", Portfolios);
        return "Portfoliolist";
    }

    @GetMapping({"/portfoliopage", "/portfoliopage/{id}"})
    public String portfolioPage(Model model, @PathVariable(required = false) Integer id, @RequestParam(required = false) Integer colorid) {
        logger.info(String.format("portfolioListWithFilter -- colorid%d",colorid ));
        if(colorid == null || colorid == 0) {
            if (id != null && id >= 0 && id <= portfolioRepository.count()) {
                Optional<Portfolio> optionalPortfolio = portfolioRepository.findById(id);
                Iterable<Color> colors = colorRepository.findAll();

                if (optionalPortfolio.isPresent()) {
                    model.addAttribute("portfolio", optionalPortfolio.get());
                    Iterable<Nagel> Nagels = nagelRepository.findNagelByPortfolio(optionalPortfolio.get());
                    Iterable<Color> nagelsColor = colorRepository.findColorsByPortfolio(optionalPortfolio.get());
                    model.addAttribute("Nagels", Nagels);
                    model.addAttribute("Colors", colors);
                    model.addAttribute("NagelsColors", nagelsColor);
                }
            }
        }else {
            if (id != null && id >= 0 && id <= portfolioRepository.count()) {
                Optional<Portfolio> optionalPortfolio = portfolioRepository.findById(id);
                Optional<Color> optionalColor = colorRepository.findById(colorid);
                Iterable<Color> colors = colorRepository.findAll();

                if (optionalPortfolio.isPresent()) {
                    model.addAttribute("portfolio", optionalPortfolio.get());
                    Iterable<Nagel> Nagels = nagelRepository.findNagelByPortfolio(optionalPortfolio.get(), optionalColor.get());
                    Iterable<Color> nagelsColor = colorRepository.findColorsByPortfolio(optionalPortfolio.get());
                    model.addAttribute("Nagels", Nagels);
                    model.addAttribute("Colors", colors);
                    model.addAttribute("NagelsColors", nagelsColor);
                }

            }
        }
        model.addAttribute("portfolioPrev", id != null ? ( id > 1 ? id - 1 : portfolioRepository.count()) : 1);
        model.addAttribute("portfolioNext", id != null ? ( id < portfolioRepository.count() ? id + 1 : 1) : 1);
        return "portfoliopage";
    }
}
