package com.devsefe.lib.springbootlib.test;

import com.devsefe.lib.springbootlib.core.ProcessResult;
import com.devsefe.lib.springbootlib.service.BaseService;
import com.devsefe.lib.springbootlib.service.IService;

public final class TestService extends BaseService<TestEntity>  implements IService<TestEntity> {

    private TestRepository repository;

    protected TestService(TestRepository testRepository) {
        super(testRepository);
        repository = testRepository;
    }

    @Override
    public ProcessResult insert(TestEntity entity) {
        return super.db_insert(entity);
    }

    @Override
    public ProcessResult update(TestEntity entity) {
        return null;
    }

    @Override
    public ProcessResult delete(TestEntity entity) {
        return null;
    }

    @Override
    protected ProcessResult validateAlter(TestEntity entity) {
        return super.validateAlter(entity);
    }

    @Override
    protected ProcessResult validateDelete(TestEntity entity) {
        return super.validateDelete(entity);
    }
}
