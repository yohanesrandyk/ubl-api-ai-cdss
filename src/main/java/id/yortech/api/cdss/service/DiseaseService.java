package id.yortech.api.cdss.service;

import id.yortech.api.cdss.dto.DiseaseDTO;
import id.yortech.api.cdss.entity.Disease;
import id.yortech.api.cdss.mapper.DiseaseMapper;
import id.yortech.api.cdss.repository.DiseaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DiseaseService implements BaseService<DiseaseDTO, Long> {

	private final DiseaseRepository diseaseRepository;
	private final DiseaseMapper diseaseMapper;

	public DiseaseService(DiseaseRepository diseaseRepository, DiseaseMapper diseaseMapper) {
		this.diseaseRepository = diseaseRepository;
		this.diseaseMapper = diseaseMapper;
	}

	@Override
	public DiseaseDTO findById(Long id) {
		return diseaseMapper.toDto(diseaseRepository.findById(id).get());
	}

	@Override
	public List<DiseaseDTO> findAll() {
		return null;
	}

	@Override
	public DiseaseDTO save(DiseaseDTO dto) {
		return diseaseMapper.toDto(diseaseRepository.save(diseaseMapper.toEntity(dto)));
	}

	@Override
	public DiseaseDTO update(Long id, DiseaseDTO dto) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}
}