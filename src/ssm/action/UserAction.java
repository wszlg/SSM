package ssm.action;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.mapper.StudentMapper;
import ssm.po.Student;
import ssm.po.StudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * <p>Title: UserAction</p>
 * <p>Description:用户管理 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2014-12-18下午5:16:31
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private StudentMapper mapper;



	@RequestMapping("/queryUser")
	@ResponseBody
	public List<Student> queryUser(Model model, Integer id) throws Exception{
		Map map = new HashMap();
		map.put("name","sdsa");


		List<Student> list = mapper.selectByExample(null);

		JSONArray json = JSONArray.fromObject(list);


		System.out.println(json);

		return list;
	}

	@RequestMapping("/addUser")
	@ResponseBody
	public String  addUser(String name){
		Student student = new Student();
		student.setName(name);
		mapper.insert(student);
		return "success";

	}

	@RequestMapping("/addUserui")
	public String addUserUi(){

		return "adduse";
	}

	@RequestMapping("register")
	@ResponseBody
	public Map register(){

		Map map = new HashMap();

		map.put("23","sdd");

		return map;

	}

	@RequestMapping("login")
	@ResponseBody
	public Map login(String name){

		Map map = new HashMap();

		StudentExample example = new StudentExample();
		StudentExample.Criteria criteria =example.createCriteria();
		criteria.andNameEqualTo(name);
		List<Student> list = mapper.selectByExample(example);
		if (list!=null && list.size() >0){

		}

		map.put("result",1);
		map.put("data",list.get(0));
		return map;
	}

}






































