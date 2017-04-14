package com.edp.serviceI.moduleinfo;

import com.edp.serviceI.dto.ModuleInfoDto;
/**
 * 
 * @author wu_jianxing(吴建行)
 * 时间：2016.4.21
 *
 */
public interface ModuleInfoServiceI {
	public ModuleInfoDto getAllModules(ModuleInfoDto dto);
	public ModuleInfoDto getModuleById(String proId);
	public void addModule(ModuleInfoDto dto);
	public void updateModule(ModuleInfoDto dto);
	public void delModule(String proId);

}
