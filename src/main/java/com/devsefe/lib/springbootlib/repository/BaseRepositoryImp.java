package com.devsefe.lib.springbootlib.repository;

import com.devsefe.lib.springbootlib.core.ProcessResult;
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

    /*@Override
    public ProcessResult db_insert(T entity) {
        ProcessResult result = new ProcessResult();
        try {
            result.setSucceeded(saveAndFlush(entity));
        } catch (Exception ex)  {
            result.setSysError(ex);
        }
        return result;
    }

    @Override
    public ProcessResult db_update(T entity) {
        ProcessResult result = new ProcessResult();
        try {
            result.setSucceeded(saveAndFlush(entity));
        } catch (Exception ex)  {
            result.setSysError(ex);
        }
        return result;
    }

    @Override
    public ProcessResult db_delete(T entity) {
        ProcessResult result = new ProcessResult();
        try {
            delete(entity);
            result.setSucceeded(null);
        } catch (Exception ex)  {
            result.setSysError(ex);
        }
        return result;
    }*/
}
