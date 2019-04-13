package cms;

import java.util.Map;
import java.util.TreeMap;

public class ListCustomer {
    private static Map<Integer,Customer> customerMaps;

    public static void createCustomer(){
        customerMaps=new TreeMap<>();
        customerMaps.put(1,new Customer("Truong Phuong Nam","12/10/2019","Ha Giang","../src/list1.jpg"));
        customerMaps.put(2,new Customer("Truong Phuong Nam2","12/10/2019","Ha Giang","../row/list2.jpg"));
        customerMaps.put(3,new Customer("Truong Phuong Nam3","12/10/2019","Ha Giang","../row/list3.jpg"));
    }
    public static Customer getCustomer(int key){
        return customerMaps.get(key);
    }
}
