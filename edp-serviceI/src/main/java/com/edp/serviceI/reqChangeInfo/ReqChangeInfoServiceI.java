package com.edp.serviceI.reqChangeInfo;

import com.edp.serviceI.dto.ReqChangeInfoDto;

/**
 * 服务类
 * Created by change on 2016/5/25.
 */
public interface ReqChangeInfoServiceI {

    ReqChangeInfoDto queryReqChangeInfoList(ReqChangeInfoDto condition);
    ReqChangeInfoDto saveReqChangeInfo(ReqChangeInfoDto saveDto);
    ReqChangeInfoDto updateReqChangeInfo(ReqChangeInfoDto updateDto);
    ReqChangeInfoDto findReqChangeInfoById(int id);

    ReqChangeInfoDto findLastestReqChangeInfoByRefId(String refId);
    ReqChangeInfoDto deleteReqChangeInfoById(int id);
    ReqChangeInfoDto deleteReqChangeInfoByFuncId(String funcId);
}
