package com.etiko.model;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zlecenia {

@Id
private int id;
		
		private int idWykrojnika;
		private int szerokoscSurowca;
		private int priorytet;
		private int iloscEtykiet;
		private int gilza;
		private String numerEtykiety;
		private String nazwaKlienta;
		private String nazwaEtykiety;
		private String maszyna;
		private String rodzajSurowca;
		private String wystawil;
		private String[] kolory;
		private Date dataWysylki;
		
		
		public Zlecenia() {}
		
		public Zlecenia(int id, int idWykrojnika, int szerokoscSurowca, int priorytet, int iloscEtykiet, int gilza,
				String numerEtykiety, String nazwaKlienta, String nazwaEtykiety, String maszyna, String rodzajSurowca,
				String wystawil, String[] kolory, Date dataWysylki) {
			super();
			this.id = id;
			this.idWykrojnika = idWykrojnika;
			this.szerokoscSurowca = szerokoscSurowca;
			this.priorytet = priorytet;
			this.iloscEtykiet = iloscEtykiet;
			this.gilza = gilza;
			this.numerEtykiety = numerEtykiety;
			this.nazwaKlienta = nazwaKlienta;
			this.nazwaEtykiety = nazwaEtykiety;
			this.maszyna = maszyna;
			this.rodzajSurowca = rodzajSurowca;
			this.wystawil = wystawil;
			this.kolory = kolory;
			this.dataWysylki = dataWysylki;
		}
		@Override
		public String toString() {
			return "Zlecenia [id=" + id + ", idWykrojnika=" + idWykrojnika + ", szerokoscSurowca=" + szerokoscSurowca
					+ ", priorytet=" + priorytet + ", iloscEtykiet=" + iloscEtykiet + ", gilza=" + gilza
					+ ", numerEtykiety=" + numerEtykiety + ", nazwaKlienta=" + nazwaKlienta + ", nazwaEtykiety="
					+ nazwaEtykiety + ", maszyna=" + maszyna + ", rodzajSurowca=" + rodzajSurowca + ", wystawil="
					+ wystawil + ", kolory=" + Arrays.toString(kolory) + ", dataWysylki=" + dataWysylki + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getIdWykrojnika() {
			return idWykrojnika;
		}
		public void setIdWykrojnika(int idWykrojnika) {
			this.idWykrojnika = idWykrojnika;
		}
		public int getSzerokoscSurowca() {
			return szerokoscSurowca;
		}
		public void setSzerokoscSurowca(int szerokoscSurowca) {
			this.szerokoscSurowca = szerokoscSurowca;
		}
		public int getPriorytet() {
			return priorytet;
		}
		public void setPriorytet(int priorytet) {
			this.priorytet = priorytet;
		}
		public int getIloscEtykiet() {
			return iloscEtykiet;
		}
		public void setIloscEtykiet(int iloscEtykiet) {
			this.iloscEtykiet = iloscEtykiet;
		}
		public int getGilza() {
			return gilza;
		}
		public void setGilza(int gilza) {
			this.gilza = gilza;
		}
		public String getNumerEtykiety() {
			return numerEtykiety;
		}
		public void setNumerEtykiety(String numerEtykiety) {
			this.numerEtykiety = numerEtykiety;
		}
		public String getNazwaKlienta() {
			return nazwaKlienta;
		}
		public void setNazwaKlienta(String nazwaKlienta) {
			this.nazwaKlienta = nazwaKlienta;
		}
		public String getNazwaEtykiety() {
			return nazwaEtykiety;
		}
		public void setNazwaEtykiety(String nazwaEtykiety) {
			this.nazwaEtykiety = nazwaEtykiety;
		}
		public String getMaszyna() {
			return maszyna;
		}
		public void setMaszyna(String maszyna) {
			this.maszyna = maszyna;
		}
		public String getRodzajSurowca() {
			return rodzajSurowca;
		}
		public void setRodzajSurowca(String rodzajSurowca) {
			this.rodzajSurowca = rodzajSurowca;
		}
		public String getWystawil() {
			return wystawil;
		}
		public void setWystawil(String wystawil) {
			this.wystawil = wystawil;
		}
		public String[] getKolory() {
			return kolory;
		}
		public void setKolory(String[] kolory) {
			this.kolory = kolory;
		}
		public Date getDataWysylki() {
			return dataWysylki;
		}
		public void setDataWysylki(Date dataWysylki) {
			this.dataWysylki = dataWysylki;
		}
	
		
	
		
	
}
