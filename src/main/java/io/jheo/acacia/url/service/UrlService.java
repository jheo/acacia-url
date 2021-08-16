package io.jheo.acacia.url.service;

import io.jheo.acacia.url.persistence.repo.UrlRepository;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }


}
