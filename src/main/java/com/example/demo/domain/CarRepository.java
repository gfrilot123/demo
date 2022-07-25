// Step 2 Create the interface that provides CRUD functionality
package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
    
}
