package com.aaa.service;

import com.aaa.entity.providerDB;

import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 16:02
 */
public interface ProviderService {
    List<providerDB> selectProvider();
}
