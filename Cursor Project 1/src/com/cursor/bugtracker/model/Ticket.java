package com.cursor.bugtracker.model;

import java.util.List;
import java.util.UUID;

public class Ticket {

    private String ticketId;
    private String name;
    private String description;
    private List<String> assigneeList;
    private String reporter;
    private Status status;
    private Priority priority;
    private long estimatedTime;
    private long spentTime;

    public Ticket(String ticketId, String name, String description, List<String> assigneeList, String reporter, Status status, Priority priority, long estimatedTime, long spentTime) {
        this.ticketId = ticketId;
        this.name = name;
        this.description = description;
        this.assigneeList = assigneeList;
        this.reporter = reporter;
        this.status = status;
        this.priority = priority;
        this.estimatedTime = estimatedTime; // time in seconds
        this.spentTime = spentTime; // time in seconds
    }

    public Ticket(String name, String description, List<String> assigneeList, String reporter, Status status, Priority priority, long estimatedTime, long spentTime) {
        this.name = name;
        this.description = description;
        this.assigneeList = assigneeList;
        this.reporter = reporter;
        this.status = status;
        this.priority = priority;
        this.estimatedTime = estimatedTime;
        this.spentTime = spentTime;
    }

    public Ticket(String name) {
        this.ticketId = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAssigneeList() {
        return assigneeList;
    }

    public void setAssigneeList(List<String> assigneeList) {
        this.assigneeList = assigneeList;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public long getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(long estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public long getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(long spentTime) {
        this.spentTime = spentTime;
    }
}