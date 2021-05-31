package com.hcl.onlinefood.OnlineFoodHibernate.controller;

import com.hcl.onlinefood.OnlineFoodHibernate.beans.Owner;
import com.hcl.onlinefood.OnlineFoodHibernate.beans.Restuarent;
import com.hcl.onlinefood.OnlineFoodHibernate.exception.UserInputException;
import com.hcl.onlinefood.OnlineFoodHibernate.service.RestuarntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v2")
public class Resturantcontroller {
    @Autowired
    private RestuarntService rs;


    @GetMapping("/displayonwer")
    public List<Owner> displayOwner() {
        List<Owner> ls = new ArrayList<Owner>();
        ls = rs.displayOwner();
        return ls;
    }


    @GetMapping("/display")
    public List<Restuarent> sayHello() {
        List<Restuarent> ls = new ArrayList<Restuarent>();
        ls = rs.displayResturants();
        return ls;
    }

    @PostMapping("/add")
    public ResponseEntity<Restuarent> saveUser(@RequestBody Restuarent resturant) throws UserInputException {

        return new ResponseEntity<Restuarent>(rs.addResturant1(resturant), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{res_id}")
    public ResponseEntity<Boolean> delRes(@PathVariable int res_id) throws UserInputException {

        return new ResponseEntity<Boolean>(rs.deleteResturant(res_id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Boolean> updateRes(@PathVariable int id, @RequestBody Restuarent resturant) throws UserInputException {

        return new ResponseEntity<Boolean>(rs.updateRestuarent(id, resturant), HttpStatus.OK);
    }

    @GetMapping("/getRes/{id}")
    public ResponseEntity<Restuarent> getEmpOnId(@PathVariable int id) throws UserInputException {
        return new ResponseEntity<Restuarent>(rs.searchRestuarnt(id), HttpStatus.OK);
    }

    @GetMapping("/searchByName/{resName}")
    public ResponseEntity<Restuarent> searchByResName(@PathVariable String resName) throws UserInputException {
        return new ResponseEntity<Restuarent>(rs.searchByResName(resName), HttpStatus.OK);
    }

    @GetMapping("/searchByRating/{resRating}")
    public ResponseEntity<List<Restuarent>> searchByResRating(@PathVariable double resRating) throws UserInputException {
        // List<Employee> empList=es.searchEmployee(id);
        return new ResponseEntity<List<Restuarent>>(rs.searchByResRating(resRating), HttpStatus.OK);
    }

    @GetMapping("/search/v3/{resRating}")
    public ResponseEntity<List<Restuarent>> searchByResRating1(@PathVariable double resRating) {
        return new ResponseEntity<List<Restuarent>>(rs.searchByResRating1(resRating), HttpStatus.OK);
    }

}