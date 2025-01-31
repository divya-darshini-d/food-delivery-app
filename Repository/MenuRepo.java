package com.foodDelivery.project.Repo;

import com.foodDelivery.project.Model.menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MenuRepo extends JpaRepository<menu,Integer> {
}
