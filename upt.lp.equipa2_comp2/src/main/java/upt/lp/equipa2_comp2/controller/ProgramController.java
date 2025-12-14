/**
 * 
 */
package upt.lp.equipa2_comp2.controller;
import upt.lp.equipa2_comp2.entity.Program;
import upt.lp.equipa2_comp2.service.ProgramService;
import upt.lp.equipa2_comp2.dto.ProgramDTO;
import java.util.List;
import upt.lp.equipa2_comp2.mapper.ProgramMapper;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
/**
 * 
 */
@RestController    //recebe requisições HTTP
@RequestMapping ("/voluntariado/programs")
public class ProgramController {
	
	private final ProgramService programService;  //não pode ser alterada depois de iniciada

	/**
	 * @param programService
	 */
	public ProgramController(ProgramService programService) {  //permite ao controller usar um service
		super();
		this.programService = programService;
	}
	@GetMapping
	public List<ProgramDTO> getAllPrograms() {
		return programService.getAllPrograms()
				.stream()   //tranforma a list em stream (usar operações como filter)
				.map(ProgramMapper::toDTO)   //transforma objetos da bd em objetos para enviar ao JSON 
				.toList();   //depois converte tudo de volta para lista
	}
	
	 @GetMapping("/by-name/{nomeP}")
	 public ProgramDTO getByName(@PathVariable String nomeP) {   
		 return ProgramMapper.toDTO(programService.getProgramByName(nomeP));  //converte para DTO, pede ao service para procurar
	 }
	 
	 @PostMapping
	 public ProgramDTO createProgram (@Valid @RequestBody ProgramDTO progDTO) {
		 Program prog = ProgramMapper.toEntity(progDTO);  //converte o DTO que vem da API para uma entidade da bd

		 return ProgramMapper.toDTO(programService.createProgram(progDTO)); //chama o service para criar e depois converte para
	 }																		//DTO para devolver ao utilizador
	 

	 @PutMapping("/{id}")
	 public ProgramDTO updateProgram(@PathVariable Long id, @Valid @RequestBody ProgramDTO progDTO) {
	     Program updated = programService.updateProgramById(id, progDTO);
	     return ProgramMapper.toDTO(updated);
	 }

	 
	 @DeleteMapping("{id}")
	 public void delete (@PathVariable Long id) {   //não devolve nada
		 programService.deleteProgram(id);         //apaga da bd

	 } 	 
}

