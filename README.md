# springbootlib
Core operations library for spring boot

# Example implementation

1-Create your repository then extend it from **BaseRepository**

```java
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

    /**
    * from IService
    **/
    @Override
    public ProcessResult insert(TestEntity entity) {
        return super.db_insert(entity);
    }

    /**
    * from IService
    **/
    @Override
    public ProcessResult update(TestEntity entity) {
        return null;
    }

    /**
    * from IService
    **/
    @Override
    public ProcessResult delete(TestEntity entity) {
        return null;
    }

    /**
    * from base
    **/
    @Override
    protected ProcessResult validateAlter(TestEntity entity) {
        return super.validateAlter(entity);
    }

    /**
    * from base
    **/
    @Override
    protected ProcessResult validateDelete(TestEntity entity) {
        return super.validateDelete(entity);
    }
```
3-Update your main class
```
@Configuration
@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImp.class)
@EntityScan(basePackages = {"your package info for entity directory"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
```
4-Create your controller. Autowire service.
```
@RestController
@RequestMapping("/rest/users")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public User getUser() {
        return testService.#your_method_name#();
    }
}
```
