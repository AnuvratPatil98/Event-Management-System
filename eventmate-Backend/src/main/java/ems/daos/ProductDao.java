package ems.daos;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.entities.Product;
import ems.entities.Seller;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> findBySeller(Seller sellerId,Sort sort);
	List<Product> findByPcatAndSubcat(String pcat,String subcat,Sort sort);
}
