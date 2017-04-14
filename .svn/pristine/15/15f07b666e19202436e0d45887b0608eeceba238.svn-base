/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.edp.admin.rest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.ActivitiException;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.edp.common.constant.Constants;
import com.edp.serviceI.dto.ControlDto;
import com.edp.serviceI.dto.CtableDto;
import com.edp.serviceI.dto.RequestmentDto;
import com.edp.serviceI.functionInfo.FunctionInfoServiceI;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;

/**
 * @author Tijs Rademakers
 */
@RestController
public class ModelSaveRestResource implements ModelDataJsonConstants {
  
  protected static final Logger LOGGER = LoggerFactory.getLogger(ModelSaveRestResource.class);

  @Autowired
  private RepositoryService repositoryService;
  
  @Autowired
  private FunctionInfoServiceI functionInfoServiceI;
  
  private ObjectMapper objectMapper = new ObjectMapper();
  
  private Gson gson = new Gson();
  
  @RequestMapping(value="/xxx/model/{modelId}/save", method = RequestMethod.PUT)
  @ResponseStatus(value = HttpStatus.OK)
  public void saveModel(@PathVariable String modelId, @RequestBody MultiValueMap<String, String> values,HttpSession session) {
    try {
      
      Model model = repositoryService.getModel(modelId);
      if(model.getVersion() == 0){
    	  ObjectNode modelJson = (ObjectNode) objectMapper.readTree(model.getMetaInfo());
    	  
    	  modelJson.put(MODEL_NAME, values.getFirst("name"));
    	  modelJson.put(MODEL_DESCRIPTION, values.getFirst("description"));
    	  model.setMetaInfo(modelJson.toString());
    	  model.setName(values.getFirst("name"));
    	  
    	  repositoryService.saveModel(model);
    	  
    	  repositoryService.addModelEditorSource(model.getId(), values.getFirst("json_xml").getBytes("utf-8"));
    	  
    	  InputStream svgStream = new ByteArrayInputStream(values.getFirst("svg_xml").getBytes("utf-8"));
    	  TranscoderInput input = new TranscoderInput(svgStream);
    	  
    	  PNGTranscoder transcoder = new PNGTranscoder();
    	  // Setup output
    	  ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    	  TranscoderOutput output = new TranscoderOutput(outStream);
    	  
    	  // Do the transformation
    	  transcoder.transcode(input, output);
    	  final byte[] result = outStream.toByteArray();
    	  repositoryService.addModelEditorSourceExtra(model.getId(), result);
    	  
    	  String json = values.getFirst("json_xml");
    	  JSONArray childShapes = JSON.parseObject(json).getJSONArray("childShapes");
    	  for (int i = 0; i < childShapes.size(); i++) {
    		  String resourceId = childShapes.getJSONObject(i).get("resourceId").toString();
    		  JSONObject properties = childShapes.getJSONObject(i).getJSONObject("properties");
    		  if(properties != null){
    			  if(properties.containsKey("belongtofunction")){
    				  if(!"".equals(properties.get("belongtofunction"))){
    					  JSONObject belongtofunction = properties.getJSONObject("belongtofunction");
    					  String id = belongtofunction.get("id").toString();
    					  addFcName(id,model.getKey(),resourceId);
    				  }
    			  }
    			  if(properties.containsKey("belongtotable")){
    				  if(properties.containsKey("ifrelevance")){
    					  String ifr = properties.get("ifrelevance").toString();
    					  if(ifr.equals("true")){
    						  if(!"".equals(properties.get("belongtotable"))){
    							  JSONObject belongtotable = properties.getJSONObject("belongtotable");
    							  String ids = belongtotable.get("id").toString();
//    							  saveFuncColumn(resourceId,model.getKey(), ids);
    						  }
    					  }
    				  }else{
    					  if(!"".equals(properties.get("belongtotable"))){
    						  JSONObject belongtotable = properties.getJSONObject("belongtotable");
    						  String ids = belongtotable.get("id").toString();
//    						  saveFuncColumn(resourceId,model.getKey(), ids);
    					  }
    				  }
    			  }
    		  }
    	  }
    	  outStream.close();
      }else{
    	  copyModel(model.getId(), values, session);
      }
      
    } catch (Exception e) {
      LOGGER.error("淇濆瓨寮傚父锛岃鑱旂郴绠＄悊鍛橈紒", e);
      throw new ActivitiException("Error saving model", e);
    }
  }
  
  /**
   * 保存场景和功能的关联关系
   * @param dto
   * @param type
   * @param session
   */
  public void addFcName(String id,String sceneId, String resourceId){
		if(!"".equals(id)){
			functionInfoServiceI.addFuncitonByScene(id, sceneId, resourceId);
		}
  }
  
  /**
   * 娣诲姞鍏宠仈鏁版嵁搴�
   * @param control_id
   * @param value
   */
//  public void saveFuncColumn(String control_id,String funcId,String value){       
//	  CtableDto[] req=getDTOArray(value,CtableDto.class);
//	  funcId=functionInfoServiceI.findFuncIdByChildren(funcId);
//	  functionInfoServiceI.delFuncColumn(control_id,funcId);
//  	   for(int i=0;i<req.length;i++){
//  		   for(int j=0;j<req[i].getChildren().size();j++){
//  			  functionInfoServiceI.saveFuncColumn(control_id,req[i].getId(),req[i].getChildren().get(j).getId(),funcId);
//  		   }
//  	   }
//  }
//  
  public static CtableDto[] getDTOArray(String jsonString, Class clazz){           
      JSONArray array = JSONArray.parseArray(jsonString);    
      CtableDto[] obj = new CtableDto[array.size()];        
      for(int i = 0; i < array.size(); i++){        
          JSONObject jsonObject = array.getJSONObject(i);      
          obj[i] = (CtableDto)JSONObject.toJavaObject(jsonObject, clazz);
      }        
      return obj;        
  }      
  

	/**
	 * 璋冩暣娴佺▼缂栬緫椤甸潰骞舵煡璇㈠洖鏄炬祦绋�
	 * @param id
	 * @param request
	 * @param response
	 */
	public void copyModel(String id, MultiValueMap<String, String> values, HttpSession session) {  
		try {    
			//鏌ヨmodel淇℃伅
			Model modelData = repositoryService.createModelQuery().modelId(id).singleResult();
			JsonNode editorNode = new ObjectMapper().readTree(repositoryService.getModelEditorSource(modelData.getId())); 
			byte[] bytes = repositoryService.getModelEditorSourceExtra(modelData.getId());
			//鍒涘缓鏂扮殑娴佺▼妯″瀷
			Model newModel = repositoryService.newModel();
			newModel.setCategory(modelData.getCategory());
			newModel.setDeploymentId(modelData.getDeploymentId());
			newModel.setKey(modelData.getKey());
			newModel.setMetaInfo(modelData.getMetaInfo());
			newModel.setName(modelData.getName());
			newModel.setTenantId(modelData.getTenantId());
			newModel.setVersion(0);
			repositoryService.saveModel(newModel);    
			
			repositoryService.addModelEditorSource(newModel.getId(), values.getFirst("json_xml").getBytes("utf-8"));
			InputStream svgStream = new ByteArrayInputStream(values.getFirst("svg_xml").getBytes("utf-8"));
	    	TranscoderInput input = new TranscoderInput(svgStream);
	    	  
	    	PNGTranscoder transcoder = new PNGTranscoder();
	    	// Setup output
	    	ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	    	TranscoderOutput output = new TranscoderOutput(outStream);
	    	  
	        // Do the transformation
	    	transcoder.transcode(input, output);
	    	final byte[] result = outStream.toByteArray();
	    	repositoryService.addModelEditorSourceExtra(newModel.getId(), result);
	        
	        String json = values.getFirst("json_xml");
	    	  JSONArray childShapes = JSON.parseObject(json).getJSONArray("childShapes");
	    	  for (int i = 0; i < childShapes.size(); i++) {
	    		  String resourceId = childShapes.getJSONObject(i).get("resourceId").toString();
	    		  JSONObject properties = childShapes.getJSONObject(i).getJSONObject("properties");
	    		  if(properties != null){
	    			  if(properties.containsKey("belongtofunction")){
	    				  if(!"".equals(properties.get("belongtofunction"))){
	    					  JSONObject belongtofunction = properties.getJSONObject("belongtofunction");
	    					  String beid = belongtofunction.get("id").toString();
	    					  String type = belongtofunction.get("type").toString();
	    					  addFcName(beid,modelData.getKey(),resourceId);
	    				  }
	    			  }
	    			  if(properties.containsKey("belongtotable")){
	    				  if(properties.containsKey("ifrelevance")){
	    					  String ifr = properties.get("ifrelevance").toString();
	    					  if(ifr.equals("true")){
	    						  if(!"".equals(properties.get("belongtotable"))){
	    							  JSONObject belongtotable = properties.getJSONObject("belongtotable");
	    							  String ids = belongtotable.get("id").toString();
//	    							  saveFuncColumn(resourceId,modelData.getKey(), ids);
	    						  }
	    					  }
	    				  }else{
	    					  if(!"".equals(properties.get("belongtotable"))){
	    						  JSONObject belongtotable = properties.getJSONObject("belongtotable");
	    						  String ids = belongtotable.get("id").toString();
//	    						  saveFuncColumn(resourceId,modelData.getKey(), ids);
	    					  }
	    				  }
	    			  }
	    		  }
	    	  }
		      
		} catch (Exception e) {    
			e.getStackTrace();  
		}   
	} 
  
}
