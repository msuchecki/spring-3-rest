package org.rest.spring.rest;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: msuchecki
 * Date: 3/25/13
 * Time: 5:49 PM
 */
public class CallSession implements Serializable {

    private Long callSessionId;

    private Long agentId;

    private Long caseId;

    private String contactNumber;

    private Date startTime;

    public Long getCallSessionId() {
        return callSessionId;
    }

    public void setCallSessionId(Long callSessionId) {
        this.callSessionId = callSessionId;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
