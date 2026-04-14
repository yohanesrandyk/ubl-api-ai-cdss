package id.yortech.api.cdss.repository;

import id.yortech.api.cdss.dto.DiseaseDTO;
import id.yortech.api.cdss.entity.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Long> {
//	Optional<Disease> findByCode(String code);
//
//	List<Disease> findByNameContainingIgnoreCase(String name);
//
//	@Query("SELECT d FROM Disease d JOIN d.symptoms s WHERE s.id = :symptomId")
//	List<Disease> findAllBySymptomId(@Param("symptomId") Long symptomId);
//
//	@Modifying
//	@Transactional
//	@Query("UPDATE Disease d SET d.description = :description WHERE d.code = :code")
//	int updateDescriptionByCode(@Param("code") String code, @Param("description") String description);
}