package com.edp.serviceI.dto;

import com.edp.serviceI.common.BaseDto;

public class ReqChangeInfoDto extends BaseDto{
    private Integer id;

    private String functionId;

    private String functionName;

    private String functionSpec;

    private String functionEnName;

    private String reason;

    private String content;

    private String impact;

    private String applyor;

    private String applyTime;

    private String verifyor;

    private String verifyTime;

    private String varifyResult;

    private String verifySpec;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId == null ? null : functionId.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public String getFunctionSpec() {
        return functionSpec;
    }

    public void setFunctionSpec(String functionSpec) {
        this.functionSpec = functionSpec == null ? null : functionSpec.trim();
    }

    public String getFunctionEnName() {
        return functionEnName;
    }

    public void setFunctionEnName(String functionEnName) {
        this.functionEnName = functionEnName == null ? null : functionEnName.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact == null ? null : impact.trim();
    }

    public String getApplyor() {
        return applyor;
    }

    public void setApplyor(String applyor) {
        this.applyor = applyor == null ? null : applyor.trim();
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public String getVerifyor() {
        return verifyor;
    }

    public void setVerifyor(String verifyor) {
        this.verifyor = verifyor == null ? null : verifyor.trim();
    }

    public String getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(String verifyTime) {
        this.verifyTime = verifyTime == null ? null : verifyTime.trim();
    }

    public String getVarifyResult() {
        return varifyResult;
    }

    public void setVarifyResult(String varifyResult) {
        this.varifyResult = varifyResult == null ? null : varifyResult.trim();
    }

    public String getVerifySpec() {
        return verifySpec;
    }

    public void setVerifySpec(String verifySpec) {
        this.verifySpec = verifySpec == null ? null : verifySpec.trim();
    }
}