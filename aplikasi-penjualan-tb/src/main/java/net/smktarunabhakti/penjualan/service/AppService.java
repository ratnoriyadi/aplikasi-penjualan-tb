package net.smktarunabhakti.penjualan.service;


import java.awt.print.Pageable;

import org.springframework.data.domain.Page;

import net.smktarunabhakti.penjualan.domain.Barang;

public interface AppService {
	
	void saveBarang(Barang b);
	
	void deleteBarang(Barang b);
	
	Page<Barang> searchSemuaBarang
		(Pageable p);
	
	Barang searchBarangById(String id);
	
	Long countSemuaBarang();
	
}
