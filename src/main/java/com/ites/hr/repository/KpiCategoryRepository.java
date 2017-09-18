package com.ites.hr.repository;

import com.ites.hr.model.KpiCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KpiCategoryRepository extends JpaRepository<KpiCategory, Integer> {

    KpiCategory save(KpiCategory kpiCategory);

    List<KpiCategory> findAll();
}
