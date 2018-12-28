package org.rokey.dao;

import org.rokey.entity.UserNode;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018-12-27 18:00
 * @Description:
 */
@Component
public interface UserRepository extends Neo4jRepository<UserNode,Long> {

    @Query("MATCH (n:Person) RETURN n ")
    List<UserNode> getUserNodeList();

    @Query("create (n:Person{age:{age},name:{name}}) RETURN n ")
    List<UserNode> addUserNodeList(@Param("name") String name, @Param("age")int age);

}
