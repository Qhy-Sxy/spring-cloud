package com.aaa.mapper;

import com.aaa.entity.providerDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 16:04
 */
@Mapper
public interface ProviderMapper {
    List<providerDB> selectProvider();
}
