package be.thomasmore.glamarie.repositories;

import be.thomasmore.glamarie.model.Nagel;
import be.thomasmore.glamarie.model.Portfolio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PortfolioRepository extends CrudRepository<Portfolio, Integer> {
    @Query ("select p from Portfolio p where ?1 is null or upper(p.portfolioName) like concat('%' , upper(?1), '%' )")
    Iterable<Portfolio> findByPortfolioNameContainsIgnoreCase(String keyword);


    List<Portfolio> findAllByOrderByIdDesc();

    Portfolio findPortfolioById(int portfolioId);

}
