package com.apple.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/Apple")
public class RestController {
    @Autowired
    Products pd;

    @GetMapping("/get")
    public Products GetInfo() throws IOException {
       /* pd.setProd_id(123);
        pd.setProd_name("India");*/
        /*File file = new File("C:\\Softwares\\continents.json");
        FileInputStream fis = new FileInputStream(file);
        int br = fis.read();*/


        return pd;
    }

    @GetMapping("/put/{id}/{name}")
    public void setInfo(@PathVariable("id") int id, @PathVariable("name") String name) {
        pd.setProd_id(pd.getProd_id()+id);
        pd.setProd_name(pd.getProd_name()+name);
    }

    @PostMapping("/post")
    public Products setInfoDate(@RequestBody Products ps) {
        pd = ps;

        return ps;
    }
    @PutMapping("/put1")
    public Products updateInfoData(@RequestBody Products ps1) {
        pd.setProd_id(pd.getProd_id()+ps1.getProd_id());
        pd.setProd_name(pd.getProd_name()+ps1.getProd_name());
        return pd;
    }
    @DeleteMapping("/delete/{id}")
    public Products deleteInfo(@PathVariable int id) {
        pd = new Products();
        return pd;
    }
}