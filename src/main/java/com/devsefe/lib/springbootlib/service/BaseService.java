package com.devsefe.lib.springbootlib.service;

import com.devsefe.lib.springbootlib.core.ProcessResult;
import com.devsefe.lib.springbootlib.repository.BaseRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public abstract class BaseService<T extends Serializable> {

    private BaseRepository repository;

    protected BaseService (BaseRepository baseRepository) {
        repository = baseRepository;
    }

    protected final ProcessResult insert(T entity) {

        ProcessResult result = new ProcessResult();
        try {

            result = validateAlter(entity);
            if (!result.isSucceeded())
                return result;

            result.setSucceeded(repository.saveAndFlush(entity));
        } catch (Exception ex)  {
            result.setSysError(ex);
        }

        return result;
    }

    protected final ProcessResult update(T entity) {

        ProcessResult result = new ProcessResult();
        try {

            result = validateAlter(entity);
            if (!result.isSucceeded())
                return result;

            result.setSucceeded(repository.saveAndFlush(entity));
        } catch (Exception ex)  {
            result.setSysError(ex);
        }

        return result;
    }

    protected final ProcessResult delete(T entity) {

        ProcessResult result = new ProcessResult();
        try {

            result = validateDelete(entity);
            if (!result.isSucceeded())
                return result;

            result.setSucceeded(null);
        } catch (Exception ex)  {
            result.setSysError(ex);
        }

        return result;
    }

    protected ProcessResult validateAlter(T entity) {
        return new ProcessResult();
    }

    protected ProcessResult validateDelete(T entity) {
        return new ProcessResult();
    }

}