# springbootlib
Core operations library for spring boot

# Example implementation

1-Create your repository then extend it from **BaseRepository**

```
public interface TestRepository extends BaseRepository<TestEntity, Integer> {
}
```
2-Create your service then extend it from **BaseService**. After extending, implement service from **IService**.

```
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
```
