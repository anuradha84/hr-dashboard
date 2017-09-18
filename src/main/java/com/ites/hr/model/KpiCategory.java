package com.ites.hr.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Anuradha on 9/17/2017.
 */
@Entity
@Table(name="kpicategory")
public class KpiCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="categid")
    private Integer categId;

    @Column(name="categno")
    private Integer categNo;

    @Column(name = "category")
    private String category;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "category" )
    private Set<KpiIndex> kpiIndices;

    public Integer getCategId() {
        return categId;
    }

    public void setCategId(Integer categId) {
        this.categId = categId;
    }

    public Integer getCategNo() {
        return categNo;
    }

    public void setCategNo(Integer categNo) {
        this.categNo = categNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<KpiIndex> getKpiIndices() {
        return kpiIndices;
    }

    public void setKpiIndices(Set<KpiIndex> kpiIndices) {
        this.kpiIndices = kpiIndices;
    }
}
