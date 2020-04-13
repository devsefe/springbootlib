package com.devsefe.lib.springbootlib.repository;

import com.devsefe.lib.springbootlib.core.ProcessResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

   /* ProcessResult db_insert(T entity);

    ProcessResult db_update(T entity);

    ProcessResult db_delete(T entity);*/
}
