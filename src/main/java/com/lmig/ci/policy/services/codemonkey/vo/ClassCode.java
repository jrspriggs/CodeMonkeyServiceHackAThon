package com.lmig.ci.policy.services.codemonkey.vo;

public class ClassCode {
	private String riskStateAb;
	private String policyTypeCd;
	private String productTypeCd;
	private String internalCd;
	private String seqNo;
	private String writtenDate;
	private String endDate;
	private String ratingId;
	private String textId;
	private String classCd;
	private String programId;
	private String replacementId;
	private String glInternalCd;
	private String glClsCd;
	private String sicCd;
	private String defaultLimit;
	private String tivLimit;
	private String premBasisTxt;
	private String inclProducts;
	private String displayTextId;
	private String roleCdBusGrpCd;
	private String pkgTypeId;
	private String classMessageId;
	private String description;
	
	public String getRiskStateAb() {
		return riskStateAb;
	}
	public void setRiskStateAb(String riskStateAb) {
		this.riskStateAb = riskStateAb;
	}
	public String getPolicyTypeCd() {
		return policyTypeCd;
	}
	public void setPolicyTypeCd(String policyTypeCd) {
		this.policyTypeCd = policyTypeCd;
	}
	public String getProductTypeCd() {
		return productTypeCd;
	}
	public void setProductTypeCd(String productTypeCd) {
		this.productTypeCd = productTypeCd;
	}
	public String getInternalCd() {
		return internalCd;
	}
	public void setInternalCd(String internalCd) {
		this.internalCd = internalCd;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getWrittenDate() {
		return writtenDate;
	}
	public void setWrittenDate(String writtenDate) {
		this.writtenDate = writtenDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public String getTextId() {
		return textId;
	}
	public void setTextId(String textId) {
		this.textId = textId;
	}
	public String getClassCd() {
		return classCd;
	}
	public void setClassCd(String classCd) {
		this.classCd = classCd;
	}
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public String getReplacementId() {
		return replacementId;
	}
	public void setReplacementId(String replacementId) {
		this.replacementId = replacementId;
	}
	public String getGlInternalCd() {
		return glInternalCd;
	}
	public void setGlInternalCd(String glInternalCd) {
		this.glInternalCd = glInternalCd;
	}
	public String getGlClsCd() {
		return glClsCd;
	}
	public void setGlClsCd(String glClsCd) {
		this.glClsCd = glClsCd;
	}
	public String getSicCd() {
		return sicCd;
	}
	public void setSicCd(String sicCd) {
		this.sicCd = sicCd;
	}
	public String getDefaultLimit() {
		return defaultLimit;
	}
	public void setDefaultLimit(String defaultLimit) {
		this.defaultLimit = defaultLimit;
	}
	public String getTivLimit() {
		return tivLimit;
	}
	public void setTivLimit(String tivLimit) {
		this.tivLimit = tivLimit;
	}
	public String getPremBasisTxt() {
		return premBasisTxt;
	}
	public void setPremBasisTxt(String premBasisTxt) {
		this.premBasisTxt = premBasisTxt;
	}
	public String getInclProducts() {
		return inclProducts;
	}
	public void setInclProducts(String inclProducts) {
		this.inclProducts = inclProducts;
	}
	public String getDisplayTextId() {
		return displayTextId;
	}
	public void setDisplayTextId(String displayTextId) {
		this.displayTextId = displayTextId;
	}
	public String getRoleCdBusGrpCd() {
		return roleCdBusGrpCd;
	}
	public void setRoleCdBusGrpCd(String roleCdBusGrpCd) {
		this.roleCdBusGrpCd = roleCdBusGrpCd;
	}
	public String getPkgTypeId() {
		return pkgTypeId;
	}
	public void setPkgTypeId(String pkgTypeId) {
		this.pkgTypeId = pkgTypeId;
	}
	public String getClassMessageId() {
		return classMessageId;
	}
	public void setClassMessageId(String classMessageId) {
		this.classMessageId = classMessageId;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public String getJson() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("{\"classCode\": {");
//		sb.append("\"riskStateAb\": \"" + this.riskStateAb + "\", ");
//		sb.append("\"policyTypeCd\": \"" + this.policyTypeCd + "\", ");
//		sb.append("\"productTypeCd\": \"" + this.productTypeCd + "\", ");
//		sb.append("\"internalCd\": \"" + this.internalCd + "\", ");
//		sb.append("\"seqNo\": \"" + this.seqNo + "\", ");
//		sb.append("\"writtenDate\": \"" + this.writtenDate + "\", ");
//		sb.append("\"endDate\": \"" + this.endDate + "\", ");
//		sb.append("\"ratingId\": \"" + this.ratingId + "\", ");
//		sb.append("\"textId\": \"" + this.textId + "\", ");
//		sb.append("\"classCd\": \"" + this.classCd + "\", ");
//		sb.append("\"programId\": \"" + this.programId + "\", ");
//		sb.append("\"replacementId\": \"" + this.replacementId + "\", ");
//		sb.append("\"glInternalCd\": \"" + this.glInternalCd + "\", ");
//		sb.append("\"glClsCd\": \"" + this.glClsCd + "\", ");
//		sb.append("\"sicCd\": \"" + this.sicCd + "\", ");
//		sb.append("\"defaultLimit\": \"" + this.defaultLimit + "\", ");
//		sb.append("\"tivLimit\": \"" + this.tivLimit + "\", ");
//		sb.append("\"premBasisTxt\": \"" + this.premBasisTxt + "\", ");
//		sb.append("\"inclProducts\": \"" + this.inclProducts + "\", ");
//		sb.append("\"displayTextId\": \"" + this.displayTextId + "\", ");
//		sb.append("\"roleCdBusGrpCd\": \"" + this.roleCdBusGrpCd + "\", ");
//		sb.append("\"pkgTypeId\": \"" + this.pkgTypeId + "\", ");
//		sb.append("\"classMessageId\": \"" + this.classMessageId + "\", ");
//		sb.append("\"description\": \"" + this.description + "\", ");
//		sb.append("}}");
//	
//		return sb.toString();
//	}
	
}
