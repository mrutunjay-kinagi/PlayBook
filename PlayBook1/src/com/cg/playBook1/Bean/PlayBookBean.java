package com.cg.playBook1.Bean;

public class PlayBookBean {
String eMail;
@Override
public String toString() {
	return "PlayBookBean [eMail=" + eMail + ", pass=" + pass + ", cnfrmPass=" + cnfrmPass + ", functionality1="
			+ functionality1 + ", functionality2=" + functionality2 + "]";
}
String pass;
String cnfrmPass;
String functionality1;
String functionality2;
public String getFunctionality1() {
	return functionality1;
}
public void setFunctionality1(String functionality1) {
	this.functionality1 = functionality1;
}
public String getFunctionality2() {
	return functionality2;
}
public void setFunctionality2(String functionality2) {
	this.functionality2 = functionality2;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getCnfrmPass() {
	return cnfrmPass;
}
public void setCnfrmPass(String cnfrmPass) {
	this.cnfrmPass = cnfrmPass;
}
}
