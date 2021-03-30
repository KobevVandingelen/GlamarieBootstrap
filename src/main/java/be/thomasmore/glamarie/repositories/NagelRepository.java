package be.thomasmore.glamarie.repositories;

import be.thomasmore.glamarie.model.Color;
import be.thomasmore.glamarie.model.Nagel;
import be.thomasmore.glamarie.model.Portfolio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface NagelRepository extends CrudRepository<Nagel, Integer> {
    Iterable<Nagel> findByPortfolioId(int portfolioId);
    @Query("select n from Nagel n WHERE " + " n.portfolio = :portfolio AND" + " n.color = :color")
    Iterable<Nagel> findNagelByPortfolio(@Param("portfolio") Portfolio portfolio,  @Param("color") Color color);
    Iterable<Nagel> findNagelByPortfolio(Portfolio portfolio);

    List<Nagel> findAllByOrderByIdDesc();



}
