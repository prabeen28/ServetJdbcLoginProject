package com.easylearnjava.loginproject;

public class DataComparision {
	public boolean validateInput(String userName, String password) {
		DataStorage ds=new DataStorage();
		String passwordFromDB = ds.getUserPassword(userName);
		if(passwordFromDB!=null) {
			if(passwordFromDB.equals(password)) {
				return true;
			}
			return false;	
			}
		return false;
		}
		
	}
