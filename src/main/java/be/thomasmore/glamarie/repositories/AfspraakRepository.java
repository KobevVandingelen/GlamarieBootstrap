package be.thomasmore.glamarie.repositories;

import be.thomasmore.glamarie.model.Afspraak;
import be.thomasmore.glamarie.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AfspraakRepository extends CrudRepository<Afspraak, Integer> {

    Iterable<Afspraak> findAfspraakByUserIsNull();
    @Query("select a from Afspraak a WHERE a.user = :user")
    Iterable<Afspraak> findAfspraakByUser(@Param("user") User user );
}
