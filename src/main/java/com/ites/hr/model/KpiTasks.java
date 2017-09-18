package com.ites.hr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Anuradha on 9/17/2017.
 */
@Entity
@Table(name="kpitasks")
@JsonIgnoreProperties
public class KpiTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskid")
    private Integer taskId;

    @Column(name = "taskno")
    private Integer taskNo;

    @Column(name="taskname")
    private String taskName;

    @Column(name = "estassigndate")
    private Date estimatedAssignDate;

    @Column(name = "estduedate")
    private Date estimatedDueDate;

    @Column(name="points")
    private Double points;

    @Column(name="comments")
    private String comments;

    @Column (name="state")
    private Integer state;

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "taskId")
    private Set<KpiTaskIndex> kpiTaskIndex;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(Integer taskNo) {
        this.taskNo = taskNo;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getEstimatedAssignDate() {
        return estimatedAssignDate;
    }

    public void setEstimatedAssignDate(Date estimatedAssignDate) {
        this.estimatedAssignDate = estimatedAssignDate;
    }

    public Date getEstimatedDueDate() {
        return estimatedDueDate;
    }

    public void setEstimatedDueDate(Date estimatedDueDate) {
        this.estimatedDueDate = estimatedDueDate;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Set<KpiTaskIndex> getKpiTaskIndex() {
        return kpiTaskIndex;
    }

    public void setKpiTaskIndex(Set<KpiTaskIndex> kpiTaskIndex) {
        this.kpiTaskIndex = kpiTaskIndex;
    }
}
