package io.jheo.acacia.url.persistence.repo;

import io.jheo.acacia.url.persistence.entity.Url;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UrlRepository extends ReactiveCrudRepository<Url, Integer> {

}
