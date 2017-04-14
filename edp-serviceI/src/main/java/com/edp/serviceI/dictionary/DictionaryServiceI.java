package com.edp.serviceI.dictionary;

import java.util.List;

import com.edp.serviceI.dto.DictionaryDto;



public interface DictionaryServiceI {
	public void addDictionary(DictionaryDto dto);
	public void deleteDictionary(int id);
	public DictionaryDto updateDictionary(DictionaryDto dto);
	public DictionaryDto findDictionaryDtoById(int id);
	public List<DictionaryDto>findAll();
    public DictionaryDto getAllDictionary(DictionaryDto dto);
    public DictionaryDto selectDictionaryById(int id);
}
