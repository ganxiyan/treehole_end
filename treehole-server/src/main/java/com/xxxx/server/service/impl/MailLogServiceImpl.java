package com.xxxx.server.service.impl;

//import com.xxxx.pojo.MailLog;
//import com.xxxx.mapper.MailLogMapper;
import com.xxxx.server.pojo.MailLog;
import com.xxxx.server.service.IMailLogService;
//import com.xxxx.service.IMailLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.server.mapper.MailLogMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2022-03-29
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
