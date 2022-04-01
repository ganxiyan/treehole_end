package com.xxxx.server.mapper;

//import com.xxxx.pojo.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.Employee;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoubin
 * @since 2022-03-29
 */
@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {

}
