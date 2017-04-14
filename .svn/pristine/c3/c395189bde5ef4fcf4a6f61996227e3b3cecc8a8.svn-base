package com.edp.serviceI.taskTrace;

import com.edp.serviceI.dto.TaskInfoDto;
import com.edp.serviceI.dto.TaskTraceDto;

/**
 * 工单操作轨迹服务接口
 * Created by changer on 2016/7/20.
 */
public interface TaskTraceServiceI {

    /**
     * 查询所有的工单操作轨迹
     * @return
     */
    TaskTraceDto   queryAllTaskTracesByCondition(TaskTraceDto condition);

    /**
     * 根据工单编号查询所有的工单操作轨迹
     * @param taskId
     * @return
     */
    TaskTraceDto   queryTaskTracesByTaskId(String taskId);


    /**
     * 根据主键查询工单操作轨迹
     * @param id
     * @return
     */
    TaskTraceDto   findTaskTraceByPrimaryKey(int id);

    /**
     * 保存工单轨迹
     * @param taskTrace
     * @return
     */
    TaskTraceDto   saveTaskTrace(TaskTraceDto taskTrace);

    /**
     * 更新工单轨迹
     * @param taskTrace
     * @return
     */
    TaskTraceDto    updateTaskTrace(TaskTraceDto taskTrace);

    /**
     * 根据主键删除工单轨迹
     * @param id
     * @return
     */
    TaskTraceDto    deleteTaskTraceByPrimaryKey(int id);

    /**
     * 根据工单编号删除操作轨迹
     * @param taskId
     * @return
     */
    TaskTraceDto    deleteTaskTraceByTaskId(String taskId);

    /**
     * 查询工单下所有的延时操作
     * @return
     */
    TaskTraceDto   queryTaskTracesForDelayByTaskId(String taskId);

    /**
     * 查询工单下所有的工单转移操作
     * @return
     */
    TaskTraceDto   queryTaskTracesForOwnerChangeByTaskId(String taskId);

    /**
     * 查询工单下所有的状态流转轨迹
     * @return
     */
    TaskTraceDto    queryTaskTracesForStateChangeByTaskId(String taskId);
    
    /**
     * 生成前台工单附件
     * @param taskInfo
     * @return
     */
    void addFaceTask(String tree,TaskInfoDto taskInfo,String productId,Integer version);

    /**
     * 生成后台工单附件
     * @param taskInfo
     * @return
     */
	void addConnotationTask(String tree, TaskInfoDto taskInfo,String productId,Integer version);
}
