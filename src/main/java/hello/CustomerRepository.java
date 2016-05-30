package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by liuhua on 16-5-30.
 */
public interface CustomerRepository  extends CrudRepository<Customer,Long>{
    List<Customer> findByLastName(String lastName);
}
