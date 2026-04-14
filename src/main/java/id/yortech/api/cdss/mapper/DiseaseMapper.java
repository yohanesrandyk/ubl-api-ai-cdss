package id.yortech.api.cdss.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import id.yortech.api.cdss.dto.DiseaseDTO;
import id.yortech.api.cdss.entity.Disease;

@Component
public class DiseaseMapper extends BaseMapper {

	public Disease toEntity(DiseaseDTO dto) {
		if (dto == null) {
			return null;
		}

		Disease entity = new Disease();
		map(dto, entity);
		return entity;
	}

	public DiseaseDTO toDto(Disease entity) {
		if (entity == null) {
			return null;
		}

		DiseaseDTO dto = new DiseaseDTO();
		map(entity, dto);
		return dto;
	}
}