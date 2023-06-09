package ra.dao;

import ra.model.Customer;

import java.util.List;

public interface ICustomerDao {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
