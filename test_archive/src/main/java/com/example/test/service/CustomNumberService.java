package com.example.test.service;

import com.example.test.model.MyNumber;
import com.example.test.repository.CustomNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
public class CustomNumberService implements CrudListener<MyNumber> {

    private final CustomNumberRepository repository;

    @Autowired
    public CustomNumberService(CustomNumberRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<MyNumber> findAll() {
        return repository.findAll();
    }

    @Override
    public MyNumber add(MyNumber myNumber) {
        return repository.save(myNumber);
    }

    @Override
    public MyNumber update(MyNumber myNumber) {
        /*long newValue = customNumber.getValue();
        newValue++;
        customNumber.setValue(newValue);*/
        return repository.save(myNumber);
    }

    @Override
    public void delete(MyNumber myNumber) {
        repository.delete(myNumber);
    }
}
