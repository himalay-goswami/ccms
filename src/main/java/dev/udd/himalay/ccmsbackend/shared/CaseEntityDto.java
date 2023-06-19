package dev.udd.himalay.ccmsbackend.shared;

public class CaseEntityDto{

    private int caseNumber;
    private String yearOfcase;
    private String applicants;
    private String defendants;
    private boolean isClosed;
    private String description;
    private boolean isCAFiled;
    private String finalDecisionDate;
    private String nextHearingDate;
    private String resolution;
    
    public int getCaseNumber() {
        return caseNumber;
    }
    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }
    public String getYearOfcase() {
        return yearOfcase;
    }
    public void setYearOfcase(String yearOfcase) {
        this.yearOfcase = yearOfcase;
    }
    public String getApplicants() {
        return applicants;
    }
    public void setApplicants(String applicants) {
        this.applicants = applicants;
    }
    public String getDefendants() {
        return defendants;
    }
    public void setDefendants(String defendants) {
        this.defendants = defendants;
    }
    public boolean isClosed() {
        return isClosed;
    }
    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCAFiled() {
        return isCAFiled;
    }
    public void setCAFiled(boolean isCAFiled) {
        this.isCAFiled = isCAFiled;
    }
    public String getFinalDecisionDate() {
        return finalDecisionDate;
    }
    public void setFinalDecisionDate(String finalDecisionDate) {
        this.finalDecisionDate = finalDecisionDate;
    }
    public String getNextHearingDate() {
        return nextHearingDate;
    }
    public void setNextHearingDate(String nextHearingDate) {
        this.nextHearingDate = nextHearingDate;
    }
    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    
}