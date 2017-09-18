package com.ites.hr.service;

import com.ites.hr.model.KpiIndex;

import java.util.List;


public interface KpiIndiceService {

    public List<KpiIndex> getKpiIndices();
    public KpiIndex save(KpiIndex kpiIndex);


}
