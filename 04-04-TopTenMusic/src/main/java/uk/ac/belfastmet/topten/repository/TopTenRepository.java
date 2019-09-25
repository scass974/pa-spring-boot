package uk.ac.belfastmet.topten.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.topten.domain.TopTen;
/**
 * Task repository for connecting to database
 * @author CAS16117645
 *
 */
@Repository
public interface TopTenRepository extends CrudRepository<TopTen, Long>{
}
