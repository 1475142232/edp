package com.edp.admin.taskInfo;

import com.edp.admin.common.BaseController;
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.TaskInfoDto;
import com.edp.serviceI.dto.TreeInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.taskInfo.TaskInfoServiceI;
import com.edp.serviceI.tree.TreeServiceI;
import com.edp.serviceI.user.UserServiceI;
import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 工单控制类
 * Created by changer on 2016/7/21.
 */
@Controller
@RequestMapping("/TaskInfoController")
public class TaskInfoController extends BaseController {


    @Resource
    private TaskInfoServiceI taskInfoServiceI;
	@Autowired
	private UserServiceI userServiceI;
	@Autowired
	private TreeServiceI treeServiceI;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskInfoController.class);

	private Gson gson = new Gson();



    /**
     * 工单添加
     * @param taskInfo
     * @return
     */
    @RequestMapping(value = "/addTaskInfo.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String addTaskInfo(TaskInfoDto taskInfo,String type,HttpSession session){
		//获取系统时间
    	String id = SequenceManage.getSequence("");
		Date today = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		taskInfo.setTaskCreateTime(sdf.format(today));
		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
		taskInfo.setId(id);
		if(taskInfo.getTaskOwner()=="" || taskInfo.getTaskOwner()==null){
			taskInfo.setTaskState("03");
		}else{
			taskInfo.setTaskState("02");
		}
		if(!"".equals(type) && "1".equals(type)){
			taskInfo.setTaskState("00");
		}
    	taskInfoServiceI.addTaskInfo(taskInfo);
    	if(taskInfo.getTaskType().equals("02")){
    		List<TreeInfoDto> typeTree = treeServiceI.findTreeByType(taskInfo.getProductId(),"2");
    		TreeInfoDto treeDto=new TreeInfoDto();
    		treeDto.setId(id);
    		treeDto.setTreeName(taskInfo.getTaskName());
    		treeDto.setTreeDesc(taskInfo.getTaskSpec());
    		treeDto.setTreeCreat(user.getId());
    		treeDto.setTreeCreattime(sdf.format(today));
    		treeDto.setTreeId(taskInfo.getProductId());
    		treeDto.setTaskId(id);
    		treeDto.setTreeState("01");
    		treeDto.setTreeType("6");
    		treeDto.setTreeParent(typeTree.get(0).getId());
    		treeServiceI.addTreeNode(treeDto);
    	}else if(taskInfo.getTaskType().equals("03")){
    		List<TreeInfoDto> typeTree = treeServiceI.findTreeByType(taskInfo.getProductId(),"4");
    		TreeInfoDto treeDto=new TreeInfoDto();
    		treeDto.setId(id);
    		treeDto.setTreeName(taskInfo.getTaskName());
    		treeDto.setTreeDesc(taskInfo.getTaskSpec());
    		treeDto.setTreeCreat(user.getId());
    		treeDto.setTreeCreattime(sdf.format(today));
    		treeDto.setTreeId(taskInfo.getProductId());
    		treeDto.setTaskId(id);
    		treeDto.setTreeState("01");
    		treeDto.setTreeType("7");
    		treeDto.setTreeParent(typeTree.get(0).getId());
    		treeServiceI.addTreeNode(treeDto);
    	}
        return gson.toJson("0000");
    }
    
    /**
     * 工单修改
     * @param taskInfo
     * @return
     */
    @RequestMapping(value = "/editTaskInfo.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String editTaskInfo(TaskInfoDto taskInfo){
  		//获取系统时间
  		Date today = new Date();
  		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  		taskInfo.setTaskLastModifiedTime(sdf.format(today));
  		if(!"".equals(taskInfo.getTaskState()) && taskInfo.getTaskState()!=null){
  		    if(taskInfo.getTaskState().equals("04")){
  			    SimpleDateFormat sss=new SimpleDateFormat("MM/dd/yyyy");
  			    taskInfo.setRealTime(sss.format(today));
  			    TreeInfoDto treeDto=new TreeInfoDto();
  			    treeDto.setId(taskInfo.getId());
  			    treeDto.setTreeState("01");
  			    treeServiceI.editTreeNode(treeDto);  			      
  		    }else if(taskInfo.getTaskState().equals("01")){
  			    SimpleDateFormat sss=new SimpleDateFormat("MM/dd/yyyy");
  			    taskInfo.setRealTime(sss.format(today));
  			    TreeInfoDto treeDto=new TreeInfoDto();
  			    treeDto.setId(taskInfo.getId());
  			    treeDto.setTreeState("01");
  			    treeServiceI.editTreeNode(treeDto);  
  		    	List<String> ids = taskInfoServiceI.findFunctionIdByScene(taskInfo.getId());
  			    if(ids.size()!=0){
  			    	taskInfoServiceI.editTaskState(ids);
  			    }		  
  		    }
  		}
      	taskInfoServiceI.editTaskInfo(taskInfo);
      	if(!"".equals(taskInfo.getTaskType()) && taskInfo.getTaskType()!=null){
      		if(taskInfo.getTaskType().equals("02")){
      			TreeInfoDto treeDto=new TreeInfoDto();
        		treeDto.setId(taskInfo.getId());
        		treeDto.setTreeName(taskInfo.getTaskName());
        		treeDto.setTreeDesc(taskInfo.getTaskSpec());
        		treeServiceI.editTreeNode(treeDto);
      		}else if(taskInfo.getTaskType().equals("03")){
      			TreeInfoDto treeDto=new TreeInfoDto();
        		treeDto.setId(taskInfo.getId());
        		treeDto.setTreeName(taskInfo.getTaskName());
        		treeDto.setTreeDesc(taskInfo.getTaskSpec());
        		treeServiceI.editTreeNode(treeDto);
      		}
      	}
      	if(!"".equals(taskInfo.getTaskState()) && taskInfo.getTaskState()!=null){
      		if(taskInfo.getTaskState().equals("00")){
      			TreeInfoDto treeDto=new TreeInfoDto();
        		treeDto.setId(taskInfo.getId());
        		treeDto.setTreeState("00");
        		treeServiceI.editTreeNode(treeDto);
      		}
      	}
        return gson.toJson("0000");
      }
    
    /**
     *  查询工单
     *  @param taskInfo
     *  @return
     */
    @RequestMapping(value = "/findTaskInfoByUserId.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String findTaskInfoByUserId(Integer userId,String teamId,HttpSession session){
    	List<List<TaskInfoDto>> taskInfoDto =  new ArrayList<List<TaskInfoDto>>();
    	if("".equals(userId) || userId==null){
    	    UserInfoDto user=(UserInfoDto)session.getAttribute("user");
    	    userId = user.getId();
    	    String role=userServiceI.findRoleById(teamId, userId);
    	    taskInfoDto=taskInfoServiceI.findTaskInfoByUserId(userId,role);
    	}else{
    		taskInfoDto = taskInfoServiceI.findTaskInfoByUTId(userId,teamId);
    	}
    	
        return gson.toJson(taskInfoDto);
    }

    
    /**
     * 查询日历工单
     */
    @RequestMapping(value = "/findTaskInfoByTime.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String findTaskInfoByTime(HttpSession session){
    	UserInfoDto user=(UserInfoDto)session.getAttribute("user");
    	List<TaskInfoDto> taskInfo=taskInfoServiceI.findTaskInfoByTime(user.getId());
    	return gson.toJson(taskInfo);
    }
   /**
    * 根据日期查询工单
    * 2016/9/19
    * 
    */
    @RequestMapping(value = "/findTaskInfoByDate.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String findTaskInfoByDate(String date,HttpSession session){
    	UserInfoDto user=(UserInfoDto)session.getAttribute("user");
    	List<List<TaskInfoDto>> taskInfoDto = taskInfoServiceI.findTaskInfoByDate(date,user.getId());
    	return gson.toJson(taskInfoDto);
    }
    /**
     * 根据状态查询工单
     */
    @RequestMapping(value = "/findTaskInfoByType.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String findTaskInfoByType(TaskInfoDto dto){
    	List<TaskInfoDto> taskInfo=taskInfoServiceI.findTaskInfo(dto);
    	return gson.toJson(taskInfo);
    }
    
    /**
     * 根据id查询工单
     */
    @RequestMapping(value = "/findTaskInfoById.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String findTaskInfoById(String id){
    	TaskInfoDto dto = taskInfoServiceI.findTaskInfoById(id);
    	if(!"".equals(dto.getTaskOwner()) && dto.getTaskOwner()!=null){
    	   dto.setUserName(userServiceI.findUserById(dto.getTaskOwner()));
    	}
    	return gson.toJson(dto);
    }
    /**
     * 工单统计 
     * 2016/9/19 
     * zhang_cancan
     */
    @RequestMapping(value = "/countTask",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String countTask(TaskInfoDto dto,String type){
    	List<Integer> count = taskInfoServiceI.countTask(dto,type);
    	return gson.toJson(count);
    }
    /**
     * 根据项目id查询工单
     * 2016/9/20
     * zhang_cancan
     */
    @RequestMapping(value = "/findTaskInfoByProductId.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String findTaskInfoByProductId(String productId){
    	List<TaskInfoDto> taskInfo=taskInfoServiceI.findTaskInfoByProductId(productId);
    	return gson.toJson(taskInfo);
    }
    /**
     * 根据项目id和时间查询工单
     * 2016/9/20
     * zhang_cancan
     */
    @RequestMapping(value = "/findTaskInfoByProductIdAndDate.action",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String findTaskInfoByProductIdAndDate(String productId,String date){
    	List<List<TaskInfoDto>> taskInfo=taskInfoServiceI.findTaskInfoByProductIdAndDate(productId,date);
    	return gson.toJson(taskInfo);
    }
}
