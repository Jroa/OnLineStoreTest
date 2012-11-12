package org.joedayz.corespringtest.service.impl;

import java.util.List;

import org.joedayz.corespringtest.dao.ProductDao;
import org.joedayz.corespringtest.model.Category;
import org.joedayz.corespringtest.model.Product;
import org.joedayz.corespringtest.service.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagerImpl implements ProductManager{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getProductsList(Product product) {
		List<Product> productos = this.productDao.getProductsList(product);
		return productos;
	}

	@Override
	public Product getProductById(Integer idProduct) {
		Product producto = this.productDao.getProductById(idProduct);
		return producto;
	}

	@Override
	public void saveProduct(Product product) {
		this.productDao.saveProduct(product);
	}

	@Override
	public void deleteProduct(Integer idProduct) {
		this.productDao.deleteProduct(idProduct);
	}

	@Override
	public List<Category> getCategoriesTypesList() {
		List<Category> categorias = this.productDao.getCategoriesTypesList();
		return categorias;
	}

	@Override
	public boolean isRepeatDescription(String name, Integer idProduct) {
		boolean isRepetido = this.productDao.isRepeatDescription(name, idProduct);
		return isRepetido;
	}

}
