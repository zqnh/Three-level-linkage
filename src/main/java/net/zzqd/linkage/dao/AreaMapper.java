package net.zzqd.linkage.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zqnh
 * @date 2019/8/17 on 22:00.
 */
public interface AreaMapper
{
    List getProvince();

    List getCity(@Param("regionParentId") Integer regionParentId);

    List getArea(@Param("regionParentId") Integer regionParentId);
}
