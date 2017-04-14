package com.edp.serviceI.functionChangeHis;

import com.edp.serviceI.dto.FunctionChangeHisDto;

/**
 * Created by Administrator on 2016/5/25.
 */
public interface FunctionChangeHisServiceI {

    FunctionChangeHisDto  queryFunctionChangeHisList(FunctionChangeHisDto condition);
    FunctionChangeHisDto   findFunctionChangeHisById(int id);
    FunctionChangeHisDto   findFunctionChangeHisListByFuncId(String funcId);
    FunctionChangeHisDto   saveFunctionChangeHis(FunctionChangeHisDto saveDto);
    FunctionChangeHisDto   updateFunctionChangeHis(FunctionChangeHisDto updateDto);
    FunctionChangeHisDto   deleteFunctionChangeHisById(int id);
    FunctionChangeHisDto   deleteFunctionChangeHisByFuncId(String funcId);


}
