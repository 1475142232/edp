package com.edp.serviceI.planTasks;

import com.edp.serviceI.dto.PlanTasksDto;

import java.util.List;

/**
 * Created by changer on 16/8/4.
 */
public interface PlanTasksServiceI {
    PlanTasksDto queryAllPlanTasksByCondition(PlanTasksDto condition);
    PlanTasksDto findTaskInfoByprimaryKey(int id);
    PlanTasksDto savePlanTaskInfo(PlanTasksDto planTasks);
    PlanTasksDto savePlanTaskInfosByPatch(List<PlanTasksDto> planTasks);
    PlanTasksDto updatePlanTaskInfo(PlanTasksDto planTasks);
    PlanTasksDto deletePlantaskByPrimaryKey(int id);
    PlanTasksDto deletePlantaskByPatch(String ids);
}
