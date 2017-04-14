package com.edp.dao.domain;

public class BytearrayInfoPo {
    private Integer id;

    private String fileName;

    private String fileType;

    private Integer fileVersion;

    private String fileTargetid;

    private String fileCreateTime;

    private String fileCreator;

    private String fileLastModifiedBy;

    private String fileLastModifiedTime;

    private byte[] fileBytes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public Integer getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(Integer fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getFileTargetid() {
        return fileTargetid;
    }

    public void setFileTargetid(String fileTargetid) {
        this.fileTargetid = fileTargetid == null ? null : fileTargetid.trim();
    }

    public String getFileCreateTime() {
        return fileCreateTime;
    }

    public void setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime == null ? null : fileCreateTime.trim();
    }

    public String getFileCreator() {
        return fileCreator;
    }

    public void setFileCreator(String fileCreator) {
        this.fileCreator = fileCreator == null ? null : fileCreator.trim();
    }

    public String getFileLastModifiedBy() {
        return fileLastModifiedBy;
    }

    public void setFileLastModifiedBy(String fileLastModifiedBy) {
        this.fileLastModifiedBy = fileLastModifiedBy == null ? null : fileLastModifiedBy.trim();
    }

    public String getFileLastModifiedTime() {
        return fileLastModifiedTime;
    }

    public void setFileLastModifiedTime(String fileLastModifiedTime) {
        this.fileLastModifiedTime = fileLastModifiedTime == null ? null : fileLastModifiedTime.trim();
    }

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }
}