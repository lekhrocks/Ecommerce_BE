package com.demo.ecommerce.repository;

import com.demo.ecommerce.model.Cart;
import com.demo.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);

    //void deleteByUser(User user);
}
