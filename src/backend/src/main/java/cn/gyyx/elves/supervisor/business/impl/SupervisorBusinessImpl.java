package cn.gyyx.elves.supervisor.business.impl;

import cn.gyyx.elves.supervisor.business.SupervisorBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class SupervisorBusinessImpl implements SupervisorBusiness {

    protected final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public Map<String, Object> appAuthInfo(Map<String, Object> params){
        return null;
    }

    @Override
    public Map<String, Object> getAuthKey(Map<String, Object> params){
        return null;
    }

    @Override
    public Map<String, Object> validateAuth(Map<String, Object> params){
        return null;
    }

    @Override
    public Map<String, Object> appInfo(Map<String, Object> params){
        return null;
    }

    @Override
    public Map<String, Object> appAllInfo(Map<String, Object> params){
        return null;
    }

    @Override
    public Map<String, Object> agentList(Map<String, Object> params){
        return null;
    }

}
