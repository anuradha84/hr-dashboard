package com.ites.hr.repository;

import com.ites.hr.model.KpiIndex;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KpiIndiceRepository extends JpaRepository<KpiIndex, Integer>{

    KpiIndex save(KpiIndex kpiIndex);

    List<KpiIndex> findAll();
}
