package id.yortech.api.cdss.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import id.yortech.api.cdss.dto.DiseaseDTO;
import id.yortech.api.cdss.entity.Disease;

@Mapper(componentModel = "spring")
public interface DiseaseMapper {

	Disease toEntity(DiseaseDTO dto);

	DiseaseDTO toDto(Disease entity);
}