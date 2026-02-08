package com.aqueapp.aqueapp_service.repository;

import com.aqueapp.aqueapp_service.model.Ads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdsRepository  extends JpaRepository<Ads, Long> {
}
