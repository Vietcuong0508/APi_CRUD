package com.example.apiwcrud.service;

import com.example.apiwcrud.model.Tblclass;
import com.example.apiwcrud.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{
    @Autowired
    ClassRepository classRepository;

    @Override
    public void save(Tblclass tblclass) {
        classRepository.save(tblclass);
    }

    @Override
    public void delete(Integer id) {
        classRepository.deleteById(id);
    }

    @Override
    public Tblclass findById(Integer id) {
        return classRepository.findById(id).get();
    }

    @Override
    public List<Tblclass> findAll() {
        return classRepository.findAll();
    }

    @Override
    public List<Tblclass> findAllByNameContainsIgnoreCase(String name) {
        return classRepository.findAllByNameContainsIgnoreCase(name);
    }
}
