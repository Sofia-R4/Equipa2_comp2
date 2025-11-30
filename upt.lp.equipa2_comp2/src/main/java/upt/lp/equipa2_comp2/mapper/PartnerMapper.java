package upt.lp.equipa2_comp2.mapper;

import upt.lp.equipa2_comp2.dto.PartnerDTO;
import upt.lp.equipa2_comp2.entity.Partner;

public class PartnerMapper {
	
	// ENTITY -> DTO
	public static PartnerDTO toDTO(Partner p) {
		PartnerDTO  dto = new PartnerDTO();
		dto.setId(p.getId());
		dto.setPartner(p.getPartner());
		return dto;
	}
	
	// DTO -> ENTITY
	public static Partner toEntity(PartnerDTO pDTO) {
		Partner p = new Partner();
		p.setId(pDTO.getId());
		p.setPartner(pDTO.getPartner());
		return p;
	}

}
