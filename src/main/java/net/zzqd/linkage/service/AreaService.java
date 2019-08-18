package net.zzqd.linkage.service;

import net.zzqd.linkage.dao.AreaMapper;
import net.zzqd.linkage.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zqnh
 * @date 2019/8/17 on 21:59.
 */
@Service
public class AreaService
{
    @Resource
    private AreaMapper areaMapper;

    public List<Area> getProvince()
    {
        return areaMapper.getProvince();
    }

    public List<Area> getCity(Integer regionParentId)
    {
        return areaMapper.getCity(regionParentId);
    }

    public List<Area> getArea(Integer regionParentId)
    {
        return areaMapper.getArea(regionParentId);
    }
}
