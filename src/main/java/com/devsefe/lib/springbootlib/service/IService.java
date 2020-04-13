package com.devsefe.lib.springbootlib.service;

import com.devsefe.lib.springbootlib.core.ProcessResult;

public interface IService<T> {
    ProcessResult insert(T entity);

    ProcessResult update(T entity);

    ProcessResult delete(T entity);
}
