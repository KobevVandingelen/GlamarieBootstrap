package be.thomasmore.glamarie.repositories;

import be.thomasmore.glamarie.model.NagelDetail;
import org.springframework.data.repository.CrudRepository;

public interface NagelDetailRepository extends CrudRepository<NagelDetail, Integer> {

        NagelDetail findNagelDetailById(int nagelDetail);
}
