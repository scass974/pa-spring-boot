package uk.ac.belfastmet.dwarfs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
/**
 * Task repository for connecting to database
 * @author CAS16117645
 *
 */
@Repository
public interface DwarfRepository extends CrudRepository<Dwarf, Long>{
}
