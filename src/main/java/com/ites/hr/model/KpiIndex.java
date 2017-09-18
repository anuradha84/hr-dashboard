package com.ites.hr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Anuradha on 9/17/2017.
 */
@Entity
@Table(name = "kpiindices")
@JsonIgnoreProperties({"indexId","category"})
public class KpiIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "indexid")
    private Integer indexId;

    @Column(name = "index")
    private String index;

    @Column(name = "value")
    private Double value;

    @Column(name="state")
    private Integer state;

    @ManyToOne
    @JoinColumn (name = "categid")
    private KpiCategory category;

//    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "indexId")
//    private Set<KpiTaskIndex> kpiTaskIndex;


    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public KpiCategory getCategory() {
        return category;
    }

    public void setCategory(KpiCategory category) {
        this.category = category;
    }

//    public Set<KpiTaskIndex> getKpiTaskIndex() {
//        return kpiTaskIndex;
//    }
//
//    public void setKpiTaskIndex(Set<KpiTaskIndex> kpiTaskIndex) {
//        this.kpiTaskIndex = kpiTaskIndex;
//    }
}
