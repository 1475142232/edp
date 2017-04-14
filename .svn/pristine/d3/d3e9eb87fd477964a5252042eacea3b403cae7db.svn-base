package com.edp.serviceI.dto;

import com.edp.serviceI.common.BaseDto;

public class TaskInfoDto extends BaseDto{
	    private String id;

	    private String taskId;

	    private String taskName;

	    private String taskReceiveTime;

	    private String taskStartTime;

	    private String taskDoneTime;

	    private String taskState;

	    private String taskOwner;

	    private Integer taskEvalTime;

	    private Integer taskRealTime;

	    private String taskCreateTime;

	    private String taskLastModifiedTime;

	    private String taskType;

	    private String productId;

	    private String productName;

	    private Integer taskProgress;

	    private Integer taskVersion;

	    private Integer svnVersion;

	    private String fenceId;

	    private String realTime;

	    private String r3;

	    private String taskSpec;
	    
	    private Integer taskStarteYear;
	    
	    private Integer taskStarteMonth;
	    
	    private Integer taskStarteDay;
	    
	    private Integer taskDoneYear;
	    
	    private Integer taskDoneMonth;
	    
	    private Integer taskDoneDay;
	    
	    private Integer taskRealYear;
	    
	    private Integer taskRealMonth;
	    
	    private Integer taskRealDay;
	    
	    private String StateString;
	    
	    private String userName;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public String getTaskId() {
	        return taskId;
	    }

	    public void setTaskId(String taskId) {
	        this.taskId = taskId == null ? null : taskId.trim();
	    }

	    public String getTaskName() {
	        return taskName;
	    }

	    public void setTaskName(String taskName) {
	        this.taskName = taskName == null ? null : taskName.trim();
	    }

	    public String getTaskReceiveTime() {
	        return taskReceiveTime;
	    }

	    public void setTaskReceiveTime(String taskReceiveTime) {
	        this.taskReceiveTime = taskReceiveTime == null ? null : taskReceiveTime.trim();
	    }

	    public String getTaskStartTime() {
	        return taskStartTime;
	    }

	    public void setTaskStartTime(String taskStartTime) {
	        this.taskStartTime = taskStartTime == null ? null : taskStartTime.trim();
	        if(!"".equals(taskStartTime) && taskStartTime!=null){
	           String[] start = taskStartTime.split("/");
	           this.taskStarteYear=Integer.parseInt(start[2]);
	           this.taskStarteMonth=Integer.parseInt(start[0])-1;
	           this.taskStarteDay=Integer.parseInt(start[1]);
	        }
	    }

	    public String getTaskDoneTime() {
	        return taskDoneTime;
	    }

	    public void setTaskDoneTime(String taskDoneTime) {
	        this.taskDoneTime = taskDoneTime == null ? null : taskDoneTime.trim();
			if(!"".equals(taskDoneTime) && taskDoneTime!=null){
	            String[] done=taskDoneTime.split("/");
	            this.taskDoneYear=Integer.parseInt(done[2]);
	            this.taskDoneMonth=Integer.parseInt(done[0])-1;
	            this.taskDoneDay=Integer.parseInt(done[1]);
			}
	    }

	    public String getTaskState() {
	        return taskState;
	    }

	    public void setTaskState(String taskState) {
	        this.taskState = taskState == null ? null : taskState.trim();
	        if(taskState.equals("01")){
	        	this.StateString = "已完成";
	        }
            if(taskState.equals("02")){
            	this.StateString = "未完成";
	        }
            if(taskState.equals("04")){
            	this.StateString = "审核中";
            }
	    }

	    public String getTaskOwner() {
	        return taskOwner;
	    }

	    public void setTaskOwner(String taskOwner) {
	        this.taskOwner = taskOwner == null ? null : taskOwner.trim();
	    }

	    public Integer getTaskEvalTime() {
	        return taskEvalTime;
	    }

	    public void setTaskEvalTime(Integer taskEvalTime) {
	        this.taskEvalTime = taskEvalTime;
	    }

	    public Integer getTaskRealTime() {
	        return taskRealTime;
	    }

	    public void setTaskRealTime(Integer taskRealTime) {
	        this.taskRealTime = taskRealTime;
	    }

	    public String getTaskCreateTime() {
	        return taskCreateTime;
	    }

	    public void setTaskCreateTime(String taskCreateTime) {
	        this.taskCreateTime = taskCreateTime == null ? null : taskCreateTime.trim();
	    }

	    public String getTaskLastModifiedTime() {
	        return taskLastModifiedTime;
	    }

	    public void setTaskLastModifiedTime(String taskLastModifiedTime) {
	        this.taskLastModifiedTime = taskLastModifiedTime == null ? null : taskLastModifiedTime.trim();
	    }

	    public String getTaskType() {
	        return taskType;
	    }

	    public void setTaskType(String taskType) {
	        this.taskType = taskType == null ? null : taskType.trim();
	    }

	    public String getProductId() {
	        return productId;
	    }

	    public void setProductId(String productId) {
	        this.productId = productId == null ? null : productId.trim();
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName == null ? null : productName.trim();
	    }

	    public Integer getTaskProgress() {
	        return taskProgress;
	    }

	    public void setTaskProgress(Integer taskProgress) {
	        this.taskProgress = taskProgress;
	    }

	    public Integer getTaskVersion() {
	        return taskVersion;
	    }

	    public void setTaskVersion(Integer taskVersion) {
	        this.taskVersion = taskVersion;
	    }

	    public Integer getSvnVersion() {
	        return svnVersion;
	    }

	    public void setSvnVersion(Integer svnVersion) {
	        this.svnVersion = svnVersion;
	    }

	    public String getFenceId() {
	        return fenceId;
	    }

	    public void setFenceId(String fenceId) {
	        this.fenceId = fenceId == null ? null : fenceId.trim();
	    }

	    public String getR3() {
	        return r3;
	    }

	    public void setR3(String r3) {
	        this.r3 = r3 == null ? null : r3.trim();
	    }

	    public String getTaskSpec() {
	        return taskSpec;
	    }

	    public void setTaskSpec(String taskSpec) {
	        this.taskSpec = taskSpec == null ? null : taskSpec.trim();
	    }

		public Integer getTaskStarteYear() {
			return taskStarteYear;
		}

		public void setTaskStarteYear(Integer taskStarteYear) {
			this.taskStarteYear = taskStarteYear;
		}

		public Integer getTaskStarteMonth() {
			return taskStarteMonth;
		}

		public void setTaskStarteMonth(Integer taskStarteMonth) {
			this.taskStarteMonth = taskStarteMonth;
		}

		public Integer getTaskStarteDay() {
			return taskStarteDay;
		}

		public void setTaskStarteDay(Integer taskStarteDay) {
			this.taskStarteDay = taskStarteDay;
		}

		public Integer getTaskDoneYear() {
			return taskDoneYear;
		}

		public void setTaskDoneYear(Integer taskDoneYear) {
			this.taskDoneYear = taskDoneYear;
		}

		public Integer getTaskDoneMonth() {
			return taskDoneMonth;
		}

		public void setTaskDoneMonth(Integer taskDoneMonth) {
			this.taskDoneMonth = taskDoneMonth;
		}

		public Integer getTaskDoneDay() {
			return taskDoneDay;
		}

		public void setTaskDoneDay(Integer taskDoneDay) {
			this.taskDoneDay = taskDoneDay;
		}

		public String getRealTime() {
			return realTime;
		}

		public void setRealTime(String realTime) {
			this.realTime = realTime;
			if(!"".equals(realTime) && realTime!=null){
	           String[] start = realTime.split("/");
	           this.taskRealYear=Integer.parseInt(start[2]);
	           this.taskRealMonth=Integer.parseInt(start[0])-1;
	           this.taskRealDay=Integer.parseInt(start[1]);
			}
		}

		public Integer getTaskRealYear() {
			return taskRealYear;
		}

		public void setTaskRealYear(Integer taskRealYear) {
			this.taskRealYear = taskRealYear;
		}

		public Integer getTaskRealMonth() {
			return taskRealMonth;
		}

		public void setTaskRealMonth(Integer taskRealMonth) {
			this.taskRealMonth = taskRealMonth;
		}

		public Integer getTaskRealDay() {
			return taskRealDay;
		}

		public void setTaskRealDay(Integer taskRealDay) {
			this.taskRealDay = taskRealDay;
		}

		public String getStateString() {
			return StateString;
		}

		public void setStateString(String stateString) {
			StateString = stateString;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

	    
	    
}