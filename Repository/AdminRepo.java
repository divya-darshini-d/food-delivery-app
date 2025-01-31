package com.foodDelivery.project.Repo;

import com.foodDelivery.project.Model.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<admin, Integer> {
}
