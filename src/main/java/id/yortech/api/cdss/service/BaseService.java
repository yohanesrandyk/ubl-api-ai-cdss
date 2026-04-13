package id.yortech.api.cdss.service;

import java.util.List;

public interface BaseService<DTO, ID> {
	DTO findById(ID id);

	List<DTO> findAll();

	DTO save(DTO dto);

	DTO update(ID id, DTO dto);

	void delete(ID id);
}
