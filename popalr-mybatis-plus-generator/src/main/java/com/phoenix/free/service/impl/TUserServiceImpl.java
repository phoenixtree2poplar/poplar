package com.phoenix.free.service.impl;

import com.phoenix.free.entity.TUser;
import com.phoenix.free.mapper.TUserMapper;
import com.phoenix.free.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author phoenix
 * @since 2020-02-20
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
