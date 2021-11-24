package com.example.springBootCrud.repository;

import com.example.springBootCrud.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {

}
