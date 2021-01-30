package com.cecot.bigdata.dummy.entity;

import java.util.Date;


public class Customer implements java.io.Serializable {
	
	private static final long serialVersionUid = 1L;
	
	
	private int idClient;
	private String nomClient;
	private String cognomClient;
	private int TelefonClient = 406000000;
	private static final String dirrecioClient = "Direcció client";
	private Date dataAlta;
	private Date dataBaixa;
	private int motiuBaixa;
	private int numCompres;
	private int canalComunicacio;
	
	/**
	 *Getters & Setters
	 */
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getCognomClient() {
		return cognomClient;
	}
	public void setCognomClient(String cognomClient) {
		this.cognomClient = cognomClient;
	}
	public int getTelefonClient() {
		return TelefonClient;
	}
	public void setTelefonClient(int telefonClient) {
		TelefonClient = telefonClient;
	}
	public Date getDataAlta() {
		return dataAlta;
	}
	public void setDataAlta(Date dataAlta) {
		this.dataAlta = dataAlta;
	}
	public Date getDataBaixa() {
		return dataBaixa;
	}
	public void setDataBaixa(Date dataBaixa) {
		this.dataBaixa = dataBaixa;
	}
	public int getMotiuBaixa() {
		return motiuBaixa;
	}
	public void setMotiuBaixa(int motiuBaixa) {
		this.motiuBaixa = motiuBaixa;
	}
	public int getNumCompres() {
		return numCompres;
	}
	public void setNumCompres(int numCompres) {
		this.numCompres = numCompres;
	}
	public int getCanalComunicacio() {
		return canalComunicacio;
	}
	public void setCanalComunicacio(int canalComunicacio) {
		this.canalComunicacio = canalComunicacio;
	}
	public static long getSerialversionuid() {
		return serialVersionUid;
	}
	public static String getDirrecioclient() {
		return dirrecioClient;
	}
	
	/**
	 * Constructor
	 */
	public Customer() {
		super();
	}
	
	public Customer(int idClient, String nomClient, String cognomClient, int telefonClient, Date dataAlta,
			Date dataBaixa, int motiuBaixa, int numCompres, int canalComunicacio) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.cognomClient = cognomClient;
		TelefonClient = telefonClient;
		this.dataAlta = dataAlta;
		this.dataBaixa = dataBaixa;
		this.motiuBaixa = motiuBaixa;
		this.numCompres = numCompres;
		this.canalComunicacio = canalComunicacio;
	}
}
