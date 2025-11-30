package upt.lp.equipa2_comp2.mapper;

import upt.lp.equipa2_comp2.dto.TypeDTO;
import upt.lp.equipa2_comp2.entity.Type;

public class TypeMapper {
	
	// ENTITY -> DTO
	public static TypeDTO toDTO(Type t) {
		TypeDTO dto = new TypeDTO();
		dto.setId(t.getId());
		dto.setType(t.getType());
		return dto;
	}
	
	//DTO -> ENTITY
	public static Type toEntity(TypeDTO tDTO) {
		Type t = new Type();
		t.setId(tDTO.getId());
		t.setType(tDTO.getType());
		return t;
	}

}
