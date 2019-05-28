package com.apap.ta.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "jenis_pemeriksaan")
public class JenisPemeriksaanModel implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@NotNull
    @Size(max = 255)
    @Column(name = "nama", nullable = false)
    private String nama;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_supplies", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private LabSuppliesModel supplies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public LabSuppliesModel getSupplies() {
		return supplies;
	}

	public void setSupplies(LabSuppliesModel supplies) {
		this.supplies = supplies;
	}
	
	
}
