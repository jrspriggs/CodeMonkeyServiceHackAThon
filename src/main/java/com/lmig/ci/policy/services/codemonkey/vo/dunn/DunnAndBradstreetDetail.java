package com.lmig.ci.policy.services.codemonkey.vo.dunn;

import java.util.ArrayList;
import java.util.List;

public class DunnAndBradstreetDetail {
	public DunnAndBradstreetOtherUrl otherURLs;
	public DunnAndBradstreetUkSpecs ukSpecs;
	public String bankName;
	public String marketingPreScreenScore;
	public DunnAndBradstreetPhone phones;
	public String nonMarketableCompany;
	public String parentName;
	public List<DunnAndBradstreetLocation> locations;
	public String yearFounded;
	public String duns;
	public DunnAndBradstreetKeyNumbersHistory keyNumbersHistory;
	public String ultimateParentName;
	public String legalStatus;
	public String companyType;
	public String historicalText;
	public DunnAndBradstreetIndustries industries;
	public List<DunnAndBradstreetDba> dbaNames;
	public String legalStructureDescription;
	public String companyId;
	public List<DunnAndBradstreetRank> rankings;
	public String manufacturingIndicator;
	public String minorityOwned;
	public String ownershipYear;
	public DunnAndBradstreetOfficial topExecutives;
	public String ethnicity;
	public String accountingFirm;
	public String historicalIndicator;
	public String ultimateDomesticParentName;
	public String vat;
	public String spaceAtAddress;
	public DunnAndBradstreetKeyFinancials keyFinancials;
	public String numberOfPCs;
	public List<DunnAndBradstreetPrimaryUrl> primaryURLs;
	public String legalStructureCode;
	public String ultimateDomesticParent;
	public String smallBusinessIndicator;
	public String subsidiaryStatus;
	public String foreignTrades;
	public String spaceAtAddressUnitOfMeasurement;
	public DunnAndBradstreetStocks stocks;
	public String spaceAtAddressAccuracy;
	public String ultimateParentDuns;
	public String name;
	public String locationType;
	public String fullDescription;
	public String fein;
	public String currencyType;
	public String franchiseOperationType;
	public String synopsis;
	public String parentDuns;
	public String womenOwned;
	public String crn;
	public String ownedOrLeased;	
	
	public DunnAndBradstreetDetail() {
		this.locations = new ArrayList<DunnAndBradstreetLocation>();
		this.dbaNames = new ArrayList<DunnAndBradstreetDba>();
		this.rankings = new ArrayList<DunnAndBradstreetRank>();
		this.primaryURLs = new ArrayList<DunnAndBradstreetPrimaryUrl>();
	}
}
