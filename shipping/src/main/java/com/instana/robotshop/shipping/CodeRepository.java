package com.instana.robotshop.shipping;


import org.springframework.data.repository.PagingAndSortingRepository;

public interface CodeRepository extends PagingAndSortingRepository<Code, Long> {

    // The findAll() method is inherited from CrudRepository and does not need to be redefined.

    Code findById(long id);
}
