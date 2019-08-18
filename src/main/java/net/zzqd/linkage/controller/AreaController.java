package net.zzqd.linkage.controller;

import net.zzqd.linkage.entity.Area;
import net.zzqd.linkage.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zqnh
 * @date 2019/8/17 on 21:05.
 */
@Controller
@RequestMapping("/areas/")
public class AreaController
{

    @Autowired
    private AreaService areaService;

    @RequestMapping("index")
    public String getIndex()
    {
        return "linkage";
    }

    @RequestMapping("getProvince")
    @ResponseBody
    public List<Area> getProvince(HttpServletRequest request, HttpServletResponse response, Model model, Area area)
    {
        List<Area> list = areaService.getProvince();
        model.addAttribute("data",list);
        return list;
    }

    //获得行政区域二级city
    @RequestMapping("getCity")
    @ResponseBody
    public List<Area> getCity(@RequestParam(value = "regionParentId") Integer regionParentId , HttpServletRequest request, HttpServletResponse response, Model model, Area area)
    {
        List<Area> list = areaService.getCity(regionParentId);
        model.addAttribute("data",list);
        return list;
    }

    //获得行政区域三级area
    @RequestMapping("getArea")
    @ResponseBody
    public List<Area> getArea(@RequestParam(value = "regionParentId") Integer regionParentId , HttpServletRequest request, HttpServletResponse response, Model model, Area area)
    {
        List<Area> list = areaService.getArea(regionParentId);
        model.addAttribute("data",list);
        return list;
    }
}
