package com.apple.demo;

import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;

@Component
public class Products {
    private int prod_id;
    private String prod_name;
  //  private Byte flag;
    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

   /* public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }
*/
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
}
