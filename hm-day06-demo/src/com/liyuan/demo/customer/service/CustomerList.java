package com.liyuan.demo.customer.service;

import com.liyuan.demo.customer.bean.Customer;

/**
 * @author liyuan_start
 * @create 2022-06-18 1:01
 */
public class CustomerList {
    //设定一个数组，用来接收客户信息
    private Customer[] customers;
    //数组中的有值的客户数
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 创建新的客户信息
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {

        if(total>=customers.length){
            return false;
        }
        //将新值加入到数组中，并给总和 total+1
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust) {

        if(index < 0 || index >= total){
            return false;
        }

        customers[index] = cust;
        return true;

    }

    /**
     * 删除指定的客户信息
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index) {

        if(index<0 || index>= total){
            return false;
        }

        for (int i = index; i < total -1 ; i++) {
            customers[i] = customers[i+1];
        }
        customers[--total] = null;

        return true;
    }

    /**
     *获取所有的客户信息
     * @return
     */
    public Customer[] getAllCustomers() {

        Customer[] allCust = new Customer[total];
        for (int i = 0; i < total; i++) {
            allCust[i] = customers[i];
        }
        return allCust;
    }

    /**
     * 获取存储的客户的数量
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if(index<0 || index>= total){
            return null;
        }
        return customers[index];
    }
}
