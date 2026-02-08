package com.aqueapp.aqueapp_service.controller;

import com.aqueapp.aqueapp_service.model.Ads;
import com.aqueapp.aqueapp_service.service.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ads")
public class AdsController {

    @Autowired
    private AdsService adsService;

    @PostMapping
    public ResponseEntity<Ads>createAds(@RequestBody Ads ads){
        Ads savedAds = adsService.saveAds(ads);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAds);
    }

    @GetMapping
    public List<Ads> getAllAds(){
        return adsService.getAllAds();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ads> getAds(@PathVariable Long adsId){
        Ads ads = adsService.getAdsById(adsId);
        return ads != null ? ResponseEntity.ok(ads) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ads> updateAds(@PathVariable Long adsId, @RequestBody Ads ads){
        ads.setId(adsId);
        Ads updateAds = adsService.saveAds(ads);
        return ResponseEntity.ok(updateAds);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAds(@PathVariable Long adsId){
        adsService.deleteAds(adsId);
        return ResponseEntity.noContent().build();
    }



}
