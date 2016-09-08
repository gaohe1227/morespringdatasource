package com.demo.model;

public class Group  implements java.io.Serializable  {
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    private String id;// 小组主键
    private String name;// 小组名称
    private String deptid;// 小组所属社区Id
    private String gdesc;// 小组说明
    private Integer num;// 小组人数 
    private String groupUserid;// 组长id
    private String groupUserName;// 组长名称
    private Integer activeNum; // 活动数
    private Integer resourceNum; // 资源数
    private Integer projectNum; // 项目数
    private Integer courseNum; // 课程数
    private Integer weikeNum; // 微课数
    private Integer huatiNum; // 话题数
    private Integer homeworkNum; // 作业书
    private Integer cepingNum; // 测评数
    private String loginname;
    private String groupManager;

    private String groupImg;// 组图片

    private String groupxd;// 学段
    private String groupnj;// 年级
    private String groupxk;// 学科
    private String groupxdname;// 学段
    private String groupnjname;// 年级
    private String groupxkname;// 学科
    private String schoolname;// 学校名称
    private int usertype = 2;// 人员属性0：管理员，1：副管理员，2：成员
    private boolean applyType;// 当前用户在当前群组中是否已经提交申请，如果是返回true，否则返回false
    private String remark1;
    private String remark2;
    private String remark3;

    private Integer resourceCheckStatus = 1; //资源审核状态,默认是通过审核状态
    
    
    
    public Integer getResourceCheckStatus() {
		return resourceCheckStatus;
	}

	public void setResourceCheckStatus(Integer resourceCheckStatus) {
		this.resourceCheckStatus = resourceCheckStatus;
	}

	public String getGroupUserid() {
	return groupUserid;
    }

    public void setGroupUserid(String groupUserid) {
	this.groupUserid = groupUserid;
    }

    public String getGroupUserName() {
	return groupUserName;
    }

    public void setGroupUserName(String groupUserName) {
	this.groupUserName = groupUserName;
    }



    public int getUsertype() {
	return usertype;
    }

    public void setUsertype(int usertype) {
	this.usertype = usertype;
    }

    /**
     * 判断当前信息是否是管理员
     * 
     * @return 如果是返回true，否则返回false
     */
    public boolean userIsManager() {
	if (usertype == 0 || usertype == 1) {
	    return true;
	} else {
	    return false;
	}
    }

    public boolean isApplyType() {
	return applyType;
    }

    public void setApplyType(boolean applyType) {
	this.applyType = applyType;
    }

    public Group() {

    }

    
    public String getSchoolname() {
	return schoolname;
    }

    public void setSchoolname(String schoolname) {
	this.schoolname = schoolname;
    }

    public String getGroupxdname() {
	return groupxdname;
    }

    public void setGroupxdname(String groupxdname) {
	this.groupxdname = groupxdname;
    }

    public String getGroupnjname() {
	return groupnjname;
    }

    public void setGroupnjname(String groupnjname) {
	this.groupnjname = groupnjname;
    }

    public String getGroupxkname() {
	return groupxkname;
    }

    public void setGroupxkname(String groupxkname) {
	this.groupxkname = groupxkname;
    }

    public String getRemark1() {
	return remark1;
    }

    public void setRemark1(String remark1) {
	this.remark1 = remark1;
    }

    public String getRemark2() {
	return remark2;
    }

    public void setRemark2(String remark2) {
	this.remark2 = remark2;
    }

    public String getRemark3() {
	return remark3;
    }

    public void setRemark3(String remark3) {
	this.remark3 = remark3;
    }

    public String getGroupxd() {
	return groupxd;
    }

    public void setGroupxd(String groupxd) {
	this.groupxd = groupxd;
    }

    public String getGroupnj() {
	return groupnj;
    }

    public void setGroupnj(String groupnj) {
	this.groupnj = groupnj;
    }

    public String getGroupxk() {
	return groupxk;
    }

    public void setGroupxk(String groupxk) {
	this.groupxk = groupxk;
    }

    public String getGroupImg() {
	return groupImg;
    }

    public void setGroupImg(String groupImg) {
	this.groupImg = groupImg;
    }

    public String getGroupManager() {
	return groupManager;
    }

    public void setGroupManager(String groupManager) {
	this.groupManager = groupManager;
    }

    public String getLoginname() {
	return loginname;
    }

    public void setLoginname(String loginname) {
	this.loginname = loginname;
    }

    public Integer getHuatiNum() {
	return huatiNum;
    }

    public void setHuatiNum(Integer huatiNum) {
	this.huatiNum = huatiNum;
    }

    public Integer getHomeworkNum() {
	return homeworkNum;
    }

    public void setHomeworkNum(Integer homeworkNum) {
	this.homeworkNum = homeworkNum;
    }

    public Integer getCepingNum() {
	return cepingNum;
    }

    public void setCepingNum(Integer cepingNum) {
	this.cepingNum = cepingNum;
    }

    public Integer getActiveNum() {
	return activeNum;
    }

    public void setActiveNum(Integer activeNum) {
	this.activeNum = activeNum;
    }

    public Integer getResourceNum() {
	return resourceNum;
    }

    public void setResourceNum(Integer resourceNum) {
	this.resourceNum = resourceNum;
    }

    public Integer getProjectNum() {
	return projectNum;
    }

    public void setProjectNum(Integer projectNum) {
	this.projectNum = projectNum;
    }

    public Integer getCourseNum() {
	return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
	this.courseNum = courseNum;
    }

    public Integer getWeikeNum() {
	return weikeNum;
    }

    public void setWeikeNum(Integer weikeNum) {
	this.weikeNum = weikeNum;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDeptid() {
	return deptid;
    }

    public void setDeptid(String deptid) {
	this.deptid = deptid;
    }

    public String getGdesc() {
	return gdesc;
    }

    public void setGdesc(String gdesc) {
	this.gdesc = gdesc;
    }

  

    public Integer getNum() {
	return num;
    }

    public void setNum(Integer num) {
	this.num = num;
    }

 

}
