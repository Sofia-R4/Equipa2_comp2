/**
 * 
 */
package upt.lp.equipa2_comp2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upt.lp.equipa2_comp2.entity.Type;
/**
 * 
 */
@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {

}
