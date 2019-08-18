package net.zzqd.linkage.entity;

/**
 * @author zqnh
 * @date 2019/8/17 on 21:13.
 */
public class Area
{
    private Integer id;             //表自增id
    private Integer parentId;       //父级id
    private Integer regionId;       //区域id
    private Integer regionParentId; //区域的父级
    private String regionName;      //区域名字
    private Integer regionType;     //区域类型1（直辖市及省会城市及特别行政区），2（地级市），3（区、县）。
    private String zipCode;         //
    private String quhao;           //区号
    private Integer status;         //状态

    public Area()
    {
    }

    public Area(Integer id, Integer parentId, Integer regionId, Integer regionParentId, String regionName, Integer regionType, String zipCode, String quhao, Integer status)
    {
        this.id = id;
        this.parentId = parentId;
        this.regionId = regionId;
        this.regionParentId = regionParentId;
        this.regionName = regionName;
        this.regionType = regionType;
        this.zipCode = zipCode;
        this.quhao = quhao;
        this.status = status;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getParentId()
    {
        return parentId;
    }

    public void setParentId(Integer parentId)
    {
        this.parentId = parentId;
    }

    public Integer getRegionId()
    {
        return regionId;
    }

    public void setRegionId(Integer regionId)
    {
        this.regionId = regionId;
    }

    public Integer getRegionParentId()
    {
        return regionParentId;
    }

    public void setRegionParentId(Integer regionParentId)
    {
        this.regionParentId = regionParentId;
    }

    public String getRegionName()
    {
        return regionName;
    }

    public void setRegionName(String regionName)
    {
        this.regionName = regionName;
    }

    public Integer getRegionType()
    {
        return regionType;
    }

    public void setRegionType(Integer regionType)
    {
        this.regionType = regionType;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getQuhao()
    {
        return quhao;
    }

    public void setQuhao(String quhao)
    {
        this.quhao = quhao;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }
}
