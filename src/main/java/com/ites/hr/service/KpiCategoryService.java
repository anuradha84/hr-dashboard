package com.ites.hr.service;

import com.ites.hr.model.KpiCategory;

import java.util.List;

public interface KpiCategoryService {

    public KpiCategory save(KpiCategory kpiCategory);
    public List<KpiCategory> findAll();
}
