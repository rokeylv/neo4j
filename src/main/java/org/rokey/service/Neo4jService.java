package org.rokey.service;

import org.rokey.dao.UserRepository;
import org.rokey.entity.UserNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018-12-28 08:49
 * @Description:
 */
@Service
public class Neo4jService {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private UserRelationRepository userRelationRepository;

    public int addUser(UserNode userNode) {
        userRepository.addUserNodeList(userNode.getName(), userNode.getAge());
        return 1;
    }
    public List<UserNode> getUserNodeList() {
        return userRepository.getUserNodeList();
    }

}
