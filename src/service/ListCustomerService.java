package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListCustomerService implements IListCustomersService{
    private static Map<Integer, Customer> customerMaps;

    @Override
    public void createCustomer(){
        customerMaps=new TreeMap<>();
        customerMaps.put(1,new Customer("Truong Phuong Nam","12/10/2019","Ha Giang","../src/list1.jpg"));
        customerMaps.put(2,new Customer("Truong Phuong Nam2","12/10/2019","Ha Giang","../src/list2.jpg"));
        customerMaps.put(3,new Customer("Truong Phuong Nam3","12/10/2019","Ha Giang","../src/list3.jpg"));
    }

    @Override
    public List <Customer> findAll(){
        return new ArrayList<>(customerMaps.values());
    }
}
