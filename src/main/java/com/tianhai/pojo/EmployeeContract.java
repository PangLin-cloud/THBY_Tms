package com.tianhai.pojo;

public class EmployeeContract {
    private Integer id;

    private String contractType;

    private String partyA;

    private String partyB;

    private String addressFile;

    private String fileNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA == null ? null : partyA.trim();
    }

    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB == null ? null : partyB.trim();
    }

    public String getAddressFile() {
        return addressFile;
    }

    public void setAddressFile(String addressFile) {
        this.addressFile = addressFile == null ? null : addressFile.trim();
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber == null ? null : fileNumber.trim();
    }
}