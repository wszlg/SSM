package ssm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.mapper.ControlMapper;
import ssm.po.Control;
import ssm.po.ControlExample;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zlg on 2017/7/8.下午3:17
 * 用途 ：
 * 日期 ：
 */


@Controller
@RequestMapping("/control")
public class ControlAction {


    @Autowired
    private ControlMapper controlMapper;


    @RequestMapping("getAllControll")
    @ResponseBody
    public List getAllControl(){

//        ControlExample example = new ControlExample();
        List<Control> list = controlMapper.selectByExample(null);

        return list;
    }



    @RequestMapping("edit")
    @ResponseBody
    public Map editControl(String identifiler,String open, String display){

        Map map = new HashMap();

        ControlExample example = new ControlExample();
        ControlExample.Criteria criteria = example.createCriteria();
        criteria.andIdentifilerEqualTo(identifiler);
        List<Control> list = controlMapper.selectByExample(example);
        Control control = list.get(0);
        control.setOpen(Integer.parseInt(open));
        control.setDisplay(Integer.parseInt(display));
        controlMapper.updateByPrimaryKeySelective(control);

        map.put("result",1);

        return map;



    }





















}
