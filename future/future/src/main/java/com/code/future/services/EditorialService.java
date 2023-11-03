package com.code.future.services;

import com.code.future.entities.Editorial;
import com.code.future.exceptions.MyException;
import com.code.future.repositories.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EditorialService {

    @Autowired
    EditorialRepository editorialRepository;

    @Transactional
    public void createEditorial(String name) throws MyException {
        validate(name);

        Editorial editorial = new Editorial();

        editorial.setName(name);

        editorialRepository.save(editorial);
    }

    public List<Editorial> getEditorials(){
        List<Editorial> editorials = new ArrayList<>();

        editorials = editorialRepository.findAll();

        return editorials;
    }

    public void updateEditorial(String id, String name) throws MyException {

        validate(name);

        Optional<Editorial> resp = editorialRepository.findById(id);

        if (resp.isEmpty()){
            return;
        }

        Editorial editorial = resp.get();
        editorial.setName(name);

        editorialRepository.save(editorial);
    }

    private void validate(String name) throws MyException {
        if (name == null || name.isEmpty()){
            throw new MyException("Can not be null");
        }
    }

}
