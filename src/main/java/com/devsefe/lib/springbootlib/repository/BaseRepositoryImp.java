package com.devsefe.lib.springbootlib.repository;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class BaseRepositoryImp<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID> implements BaseRepository<T,ID> {

    private EntityManager entityManager;

    public BaseRepositoryImp(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    // Custom codes here...
}
