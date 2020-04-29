package com.cg.model;

public class SBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU details= SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
		
	
	

}
