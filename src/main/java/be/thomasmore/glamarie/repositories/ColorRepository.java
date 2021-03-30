package be.thomasmore.glamarie.repositories;

import be.thomasmore.glamarie.model.Color;
import be.thomasmore.glamarie.model.Portfolio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ColorRepository extends CrudRepository<Color, Integer> {
    @Query("select n.color " +
            "from Nagel n " +
            "WHERE n.portfolio = :portfolio" +
            " group by n.color")
    Iterable<Color> findColorsByPortfolio(@Param("portfolio") Portfolio portfolio);

    Color findColorById(int colorId);
}
