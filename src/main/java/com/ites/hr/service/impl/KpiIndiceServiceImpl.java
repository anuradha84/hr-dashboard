package com.ites.hr.service.impl;

import com.ites.hr.model.KpiIndex;
import com.ites.hr.repository.KpiIndiceRepository;
import com.ites.hr.service.KpiIndiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KpiIndiceServiceImpl implements KpiIndiceService {

    @Autowired
    KpiIndiceRepository kpiIndiceRepository;

    @Override
    public KpiIndex save(KpiIndex kpiIndex){
        return kpiIndiceRepository.save(kpiIndex);
    }

    @Override
    public List<KpiIndex> getKpiIndices(){
        return kpiIndiceRepository.findAll();
    }

}
