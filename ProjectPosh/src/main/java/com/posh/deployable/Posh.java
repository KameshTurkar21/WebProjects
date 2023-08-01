package com.posh.deployable;

public class Posh {
	private int mobile;
	private String leadId;
	private String clusterName;
	private String clusterCity;
	private String leadCity;
	private String createdAt;
	private String updatedAt;
	private int assignToCrId;
	private String crName;
	private int garageId;
	private String garageName;
	private String statusName;
	private String sourceName;
	private String leadType;
	private String arrivalMode;
	private String pickupDate;
	private String pickupTime;
	private String followupDate;
	private String followupTime;
	private String subStatus;
	private int leadPaymentStatus;
	private int isPrepaid;
	private String firstAssigned;
	private String crFirstCalled;
	private int responseTimeMinutes;
	private int orderId;
	private String convertedOrder;
	private int orderType;
	private int orderStatus;
	private String channel;
	private String fleetName;
	private String pickToday;
	private String assignedToday;
	private String actionableToday;
	private int newLeadToday;

	// Getters and Setters for each field
	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getLeadId() {
		return leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	@Override
	public String toString() {
		return "Posh [mobile=" + mobile + ", leadId=" + leadId + ", clusterName=" + clusterName + ", clusterCity="
				+ clusterCity + ", leadCity=" + leadCity + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", assignToCrId=" + assignToCrId + ", crName=" + crName + ", garageId=" + garageId + ", garageName="
				+ garageName + ", statusName=" + statusName + ", sourceName=" + sourceName + ", leadType=" + leadType
				+ ", arrivalMode=" + arrivalMode + ", pickupDate=" + pickupDate + ", pickupTime=" + pickupTime
				+ ", followupDate=" + followupDate + ", followupTime=" + followupTime + ", subStatus=" + subStatus
				+ ", leadPaymentStatus=" + leadPaymentStatus + ", isPrepaid=" + isPrepaid + ", firstAssigned="
				+ firstAssigned + ", crFirstCalled=" + crFirstCalled + ", responseTimeMinutes=" + responseTimeMinutes
				+ ", orderId=" + orderId + ", convertedOrder=" + convertedOrder + ", orderType=" + orderType
				+ ", orderStatus=" + orderStatus + ", channel=" + channel + ", fleetName=" + fleetName + ", pickToday="
				+ pickToday + ", assignedToday=" + assignedToday + ", actionableToday=" + actionableToday
				+ ", newLeadToday=" + newLeadToday + "]";
	}

	// Add getters and setters for other fields similarly

}
