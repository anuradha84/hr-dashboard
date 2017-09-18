package com.ites.hr.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * Created by Muthu-PC on 9/17/2017.
 */
@Entity
@Table(name="kpitaskindex")
public class KpiTaskIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskindexid")
    private Integer taskindexid;

    @ManyToOne
    @JoinColumn(name = "taskid")
    private  KpiTasks taskId;

//    @JoinColumn(name="indexid")
//    private  KpiIndex indexId;

    public Integer getTaskindexid() {
        return taskindexid;
    }

    public void setTaskindexid(Integer taskindexid) {
        this.taskindexid = taskindexid;
    }

    public KpiTasks getTaskId() {
        return taskId;
    }

    public void setTaskId(KpiTasks taskId) {
        this.taskId = taskId;
    }

//    public KpiIndex getIndexId() {
//        return indexId;
//    }
//
//    public void setIndexId(KpiIndex indexId) {
//        this.indexId = indexId;
//    }
}
