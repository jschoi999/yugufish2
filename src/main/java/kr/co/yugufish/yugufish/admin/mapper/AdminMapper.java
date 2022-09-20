package kr.co.yugufish.yugufish.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.yugufish.yugufish.admin.model.AdminVo;

@Mapper
public interface AdminMapper {

    public AdminVo adminLogin(AdminVo adminVo);
    
}
