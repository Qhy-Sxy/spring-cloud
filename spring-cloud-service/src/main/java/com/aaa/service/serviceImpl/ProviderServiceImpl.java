package com.aaa.service.serviceImpl;

import com.aaa.entity.providerDB;
import com.aaa.mapper.ProviderMapper;
import com.aaa.service.ProviderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 16:03
 */
@Service
public class ProviderServiceImpl implements ProviderService
{
    @Resource
    ProviderMapper providerMapper;
    @Override
    public List<providerDB> selectProvider() {
        return providerMapper.selectProvider();
    }
}
