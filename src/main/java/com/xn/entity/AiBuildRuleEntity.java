package com.xn.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/22.
 */
@Document(collection = "ai_build_rule")
public class AiBuildRuleEntity implements Serializable{
    @Field(value="_id")
    private String id;
    @Field(value="rule_name")
    private String ruleName;
    @Field(value="rule_detail")
    private String ruleDetail;
    @Field(value="rule_type")
    private Integer ruleType;
    @Field(value="rule_replace")
    private String ruleReplace;
    @Field(value="rule_meta")
    private String ruleMeta;
    @Field(value="rule_result")
    private String ruleResult;
    @Field(value="company_id")
    private String companyId;
    @Field(value="create_time")
    private long createTime;
    @Field(value="update_time")
    private long updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleDetail() {
        return ruleDetail;
    }

    public void setRuleDetail(String ruleDetail) {
        this.ruleDetail = ruleDetail;
    }

    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public String getRuleReplace() {
        return ruleReplace;
    }

    public void setRuleReplace(String ruleReplace) {
        this.ruleReplace = ruleReplace;
    }

    public String getRuleMeta() {
        return ruleMeta;
    }

    public void setRuleMeta(String ruleMeta) {
        this.ruleMeta = ruleMeta;
    }

    public String getRuleResult() {
        return ruleResult;
    }

    public void setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public AiBuildRuleEntity() {
    }

    public AiBuildRuleEntity(String id, String ruleName, String ruleDetail, Integer ruleType, String ruleReplace, String ruleMeta, String ruleResult, String companyId, long createTime, long updateTime) {
        this.id = id;
        this.ruleName = ruleName;
        this.ruleDetail = ruleDetail;
        this.ruleType = ruleType;
        this.ruleReplace = ruleReplace;
        this.ruleMeta = ruleMeta;
        this.ruleResult = ruleResult;
        this.companyId = companyId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AiBuildRuleEntity{" +
                "id='" + id + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", ruleDetail='" + ruleDetail + '\'' +
                ", ruleType=" + ruleType +
                ", ruleReplace='" + ruleReplace + '\'' +
                ", ruleMeta='" + ruleMeta + '\'' +
                ", ruleResult='" + ruleResult + '\'' +
                ", companyId='" + companyId + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}