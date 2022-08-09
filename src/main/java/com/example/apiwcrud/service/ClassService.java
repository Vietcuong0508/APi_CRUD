package com.example.apiwcrud.service;

import com.example.apiwcrud.model.Tblclass;

import java.util.List;

public interface ClassService {
    public void save(Tblclass user);
    public void delete(Integer id);
    public Tblclass findById(Integer id);
    public List<Tblclass> findAll();
    public List<Tblclass> findAllByNameContainsIgnoreCase(String name);
}