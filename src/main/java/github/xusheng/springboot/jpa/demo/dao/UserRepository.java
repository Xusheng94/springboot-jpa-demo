package github.xusheng.springboot.jpa.demo.dao;

import github.xusheng.springboot.jpa.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-03-12 13:54
 * @Version 1.0
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Integer> , JpaSpecificationExecutor<User> {
    //自定义repository。手写sql
    @Query(value = "update user set name=?1 where id=?4",nativeQuery = true)   //占位符传值形式
    @Modifying
    int updateById(String name,int id);

    @Query(value = "from User u where u.username =:username")   //SPEL表达式
    List<User> findUser(@Param("username")String username);// 参数username 映射到数据库字段username


}
