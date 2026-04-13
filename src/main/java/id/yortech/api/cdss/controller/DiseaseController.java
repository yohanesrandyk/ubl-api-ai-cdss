package id.yortech.api.cdss.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import id.yortech.api.cdss.dto.DiseaseDTO;
import id.yortech.api.cdss.service.DiseaseService;
import id.yortech.api.cdss.service.BaseService;

import java.util.List;

@RestController
@RequestMapping("/openapi/v1/diseases")
public class DiseaseController extends BaseController<DiseaseDTO, Long> {

	private final DiseaseService diseaseService;

	public DiseaseController(DiseaseService diseaseService) {
		this.diseaseService = diseaseService;
	}

	@Override
	protected BaseService<DiseaseDTO, Long> getService() {
		return diseaseService;
	}
}