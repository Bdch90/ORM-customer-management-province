package codegym.province.service.impl;

import codegym.province.model.Customer;
import codegym.province.model.Province;
import codegym.province.repository.CustomerRepository;
import codegym.province.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(Long id)
    {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer)
    {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id)
    {
        customerRepository.delete(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstname, pageable);
    }
}
