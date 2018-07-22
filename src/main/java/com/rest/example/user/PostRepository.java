package com.rest.example.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Omkar Shivadekar
 * Date : 21-Jul-2018
 * Time : 8:09:48 PM
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> 
{

}
