package cn.gyyx.elves.supervisor.business;

import java.util.Map;

/**
 * @ClassName: SupervisorService
 * @Description: supervisor对外提供mq接口服务
 */
public interface SupervisorBusiness {

    /**
     * @Title: appAuthInfo
     * @Description: 获取app信息和app绑定agent数据
     * @param params
     * @throws Exception 设定文件
     * @return Map<String,Object>    返回类型
     */
    public Map<String, Object> appAuthInfo(Map<String, Object> params);

    /**
     * @Title: getAppInfoByAuth
     * @Description: 根据auth_id查询auth_key
     * @param params
     * @return
     * @throws Exception 设定文件
     * @return Map<String,Object>    返回类型
     */
    public Map<String, Object> getAuthKey(Map<String, Object> params);

    /**
     * @Title: validateAuth
     * @Description: 权限验证
     * @param params
     * @throws Exception 设定文件
     * @return Map<String,Object>    返回类型
     */
    public Map<String, Object> validateAuth(Map<String, Object> params);

    /**
     * @Title: appInfo
     * @Description: 根据auth_id查询对应的app信息
     * @param params
     * @throws Exception 设定文件
     * @return Map<String,Object>    返回类型
     */
    public Map<String, Object> appInfo(Map<String, Object> params);

    /**
     * @Title: appInfo
     * @Description: 所有app信息
     * @param params
     * @throws Exception 设定文件
     * @return Map<String,Object>    返回类型
     */
    public Map<String, Object> appAllInfo(Map<String, Object> params);

    /**
     * @Title: agentList
     * @Description: 根据auth_id查询可运行的agentList
     * @param params
     * @throws Exception 设定文件
     * @return Map<String,Object>    返回类型
     */
    public Map<String, Object> agentList(Map<String, Object> params);
}
