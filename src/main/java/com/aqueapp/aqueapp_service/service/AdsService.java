package com.aqueapp.aqueapp_service.service;

import com.aqueapp.aqueapp_service.model.Ads;
import com.aqueapp.aqueapp_service.repository.AdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdsService {

    @Autowired
    private AdsRepository adsRepository;

    public Ads saveAds(Ads ads) {
        return adsRepository.save(ads);
    }
    public List<Ads> getAllAds(){
        return adsRepository.findAll();
    }
    public Ads getAdsById(Long adsId){
        return adsRepository.findById(adsId).orElse(null);
    }
    public void deleteAds(Long adsId){
        adsRepository.deleteById(adsId);
    }
}
