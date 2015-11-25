package com.imoc.peo;

/***********************************************************************
 * Module:  Amail.java
 * Author:  zhaocc
 * Purpose: Defines the Class Amail
 ***********************************************************************/
/** @pdOid a6cd09a7-73af-4a53-bee5-7adc19efbe6d */
public class Amail extends People {
	/** @pdOid 1b787cb8-ed27-4f9b-a8a1-d18f84ef3b9f */
	@Override
	public int say() {
		System.out.println("说英语");
		return 0;
	}
}