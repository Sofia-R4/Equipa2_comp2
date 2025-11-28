/**
 * 
 */
package upt.lp.equipa2_comp2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upt.lp.equipa2_comp2.entity.Program;
/**
 * 
 */
@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

}
