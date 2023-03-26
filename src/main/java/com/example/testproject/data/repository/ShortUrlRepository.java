package com.example.testproject.data.repository;

import com.example.testproject.data.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    ShortUrl findByUrl(String url);

    ShortUrl findByOrgUrl(String originalUrl);

}
