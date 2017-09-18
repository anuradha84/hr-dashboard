package com.ites.hr.service.impl;

import com.ites.hr.model.KpiCategory;
import com.ites.hr.repository.KpiCategoryRepository;
import com.ites.hr.service.KpiCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KpiCategoryServiceImpl implements KpiCategoryService {

    @Autowired
    KpiCategoryRepository kpiCategoryRepository;

    @Override
    public KpiCategory save(KpiCategory kpiCategory){
        return kpiCategoryRepository.save(kpiCategory);
    }

    @Override
    public List<KpiCategory> findAll(){
        return  kpiCategoryRepository.findAll();
    }
}
