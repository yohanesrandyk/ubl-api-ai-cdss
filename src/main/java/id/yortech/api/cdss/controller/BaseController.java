package id.yortech.api.cdss.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import id.yortech.api.cdss.service.BaseService;

import java.util.List;

import javax.validation.Valid;

public abstract class BaseController<DTO, ID> {

	protected abstract BaseService<DTO, ID> getService();

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("OK-1");
	}

	@GetMapping("/{id}")
	public ResponseEntity<DTO> getById(@PathVariable ID id) {
		return ResponseEntity.ok(getService().findById(id));
	}

	@GetMapping
	public ResponseEntity<List<DTO>> getAll() {
		return ResponseEntity.ok(getService().findAll());
	}

	@PostMapping
	public ResponseEntity<DTO> create(@Valid @RequestBody DTO dto) {
		return ResponseEntity.ok(getService().save(dto));
	}

	@PutMapping("/{id}")
	public ResponseEntity<DTO> update(@PathVariable ID id, @Valid @RequestBody DTO dto) {
		return ResponseEntity.ok(getService().update(id, dto));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ID id) {
		getService().delete(id);
		return ResponseEntity.noContent().build();
	}

	protected <T> ResponseEntity<T> createResponse(T data) {
		return ResponseEntity.ok(data);
	}
}
