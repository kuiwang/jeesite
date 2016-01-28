/**
 * There are <a href="https://github.com/thinkgem/jeesite">JeeSite</a> code generation
 */
package com.thinkgem.jeesite.modules.oa.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.DictUtils;

/**
 * 请假Entity
 * 
 * @author liuj
 * @version 2013-04-05
 */
public class Leave extends DataEntity<Leave> {

    private static final long serialVersionUID = 1L;

    private Date createDateEnd;

    private Date createDateStart;

    private Date endTime; // 请假结束日期

    // 历史的流程实例
    private HistoricProcessInstance historicProcessInstance;

    private String ids;

    private String leaveType; // 假种

    // 流程定义
    private ProcessDefinition processDefinition;

    // 运行中的流程实例
    private ProcessInstance processInstance;

    private String processInstanceId; // 流程实例编号

    private Date realityEndTime; // 实际结束时间

    private Date realityStartTime; // 实际开始时间

    private String reason; // 请假原因

    private Date startTime; // 请假开始日期

    //-- 临时属性 --//
    // 流程任务
    private Task task;

    private Map<String, Object> variables;

    public Leave() {
        super();
    }

    public Leave(String id) {
        super();
    }

    public Date getCreateDateEnd() {
        return createDateEnd;
    }

    public Date getCreateDateStart() {
        return createDateStart;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getEndTime() {
        return endTime;
    }

    public HistoricProcessInstance getHistoricProcessInstance() {
        return historicProcessInstance;
    }

    public String getIds() {
        List<String> idList = Lists.newArrayList();
        if (org.apache.commons.lang3.StringUtils.isNotBlank(ids)) {
            String ss = ids.trim().replace("　", ",").replace(" ", ",").replace("，", ",")
                    .replace("'", "");
            for (String s : ss.split(",")) {
                //				if(s.matches("\\d*")) {
                idList.add("'" + s + "'");
                //				}
            }
        }
        return org.apache.commons.lang3.StringUtils.join(idList, ",");
    }

    public String getLeaveType() {
        return leaveType;
    }

    public String getLeaveTypeDictLabel() {
        return DictUtils.getDictLabel(leaveType, "oa_leave_type", "");
    }

    public ProcessDefinition getProcessDefinition() {
        return processDefinition;
    }

    public ProcessInstance getProcessInstance() {
        return processInstance;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getRealityEndTime() {
        return realityEndTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getRealityStartTime() {
        return realityStartTime;
    }

    @Length(min = 1, max = 255)
    public String getReason() {
        return reason;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getStartTime() {
        return startTime;
    }

    public Task getTask() {
        return task;
    }

    public User getUser() {
        return createBy;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setCreateDateEnd(Date createDateEnd) {
        this.createDateEnd = createDateEnd;
    }

    public void setCreateDateStart(Date createDateStart) {
        this.createDateStart = createDateStart;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setHistoricProcessInstance(HistoricProcessInstance historicProcessInstance) {
        this.historicProcessInstance = historicProcessInstance;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public void setProcessDefinition(ProcessDefinition processDefinition) {
        this.processDefinition = processDefinition;
    }

    public void setProcessInstance(ProcessInstance processInstance) {
        this.processInstance = processInstance;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public void setRealityEndTime(Date realityEndTime) {
        this.realityEndTime = realityEndTime;
    }

    public void setRealityStartTime(Date realityStartTime) {
        this.realityStartTime = realityStartTime;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setUser(User user) {
        this.createBy = user;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

}
