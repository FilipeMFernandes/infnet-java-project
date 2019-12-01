package com.project.infnet.javaproject.Repository;

import com.project.infnet.javaproject.domain.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends CrudRepository<Provider,Long> {
}
