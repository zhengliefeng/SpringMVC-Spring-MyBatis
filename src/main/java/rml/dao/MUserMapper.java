package rml.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rml.model.MUser;

@Repository
@Transactional
public interface MUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(MUser record);

    int insertSelective(MUser record);

    MUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);
    
    List<MUser> getAll();
}