package com.edp.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.beans.BeanCopier;


/**
 * 专门用于数据类型的映射
 * 
 * @author Keifer
 */
public final class BeanCopyUtils {
    private static Logger logger = LoggerFactory.getLogger(BeanCopyUtils.class);

    private BeanCopyUtils() {
    }

    static {
        ConvertUtils.register(new Converter() {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            @SuppressWarnings("rawtypes")
            public Object convert(Class type, Object value) {
                if (value == null) {
                    return null;
                }
                if (type.equals(Date.class)) {
                    try {
                        return sf.parse(value.toString());
                    } catch (ParseException e) {
                        logger.error(e.getMessage(),e);
                    }
                }
                return null;
            }
        }, Date.class);
    }

    /**
     * <转换单个对象> 此方法采用apache的BeanUtils实现，此类支持类型不匹配时自动转换<br/>
     * 建议：如果有些类型需要自动转换并且赋值的情况下，请使用此方法，性能一般。
     * 
     * @param sourceObj
     *            要进行转换的源数据对象
     * @param clazz
     *            要转换成的目标对象的Class类型
     * @return 返回转换后的对象
     * @param <T> type
     * @param <D> type
     */
    public static <T, D> T populateTbyDByApache(D sourceObj, Class<T> clazz) {
        if (sourceObj == null) {
            return null;
        }
        T t = null;
        try {
            t = (T) clazz.newInstance();
            BeanUtils.copyProperties(t, sourceObj);
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
            logger.error("populateTbyDByApache",e);
        }

        return t;
    }

    /**
     * <转换list对象> 此方法采用apache的BeanUtils实现，此类支持类型不匹配时自动转换<br/>
     * 建议：如果有些类型需要自动转换并且赋值的情况下，请使用此方法，性能一般。
     * 
     * @param sourceObjs
     *            要进行转换的源数据对象
     * @param clazz
     *            要转换成的目标对象的Class类型
     * @return 返回转换后的List对象集合
     * @param <T> type
     * @param <D> type
     */
    public static <T, D> List<T> populateTListbyDListByApache(List<D> sourceObjs, Class<T> clazz) {
        if (sourceObjs == null){
            return new ArrayList<T>();
        }
            
        int len = sourceObjs.size();
        List<T> ts = new ArrayList<T>(len);
        T t = null;
        for (int i = 0; i < len; i++) {
            D d = sourceObjs.get(i);
            t = populateTbyDByApache(d, clazz);
            ts.add(t);
        }
        return ts;
    }

    /**
     * <转换单个对象> 此方法采用spring的BeanUtils实现，不支持类型自动转换,仅copy部分属性<br/>
     * 建议：如果能够预知不需要类型转换的情况下，请使用此方法，性能较好。
     * 
     * @param sourceObj
     *            要进行转换的源数据对象
     * @param clazz
     *            要转换成的目标对象的Class类型
     * @return 返回转换后的对象
     * @param <T> type
     * @param <D> type
     */
    public static <T, D> T populateTbyDBySpring(D sourceObj, Class<T> clazz) {
        if (sourceObj == null) {
            return null;
        }
        T t = null;
        try {
            t = (T) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            logger.error("populateTbyDBySpring",e);
        }
        org.springframework.beans.BeanUtils.copyProperties(sourceObj, t);
        return t;
    }

    /**
     * <转换list对象> 此方法采用spring的BeanUtils实现，不支持类型自动转换,仅copy部分属性<br/>
     * 建议：如果能够预知不需要类型转换的情况下，请使用此方法，性能较好。
     * 
     * @param sourceObjs
     *            要进行转换的源数据对象
     * @param clazz
     *            要转换成的目标对象的Class类型
     * @return 返回转换后的List对象集合
     * @param <T> type
     * @param <D> type
     */
    public static <T, D> List<T> populateTListbyDListBySpring(List<D> sourceObjs, Class<T> clazz) {
        if (sourceObjs == null) {
            return new ArrayList<T>();
        }
        int len = sourceObjs.size();
        List<T> ts = new ArrayList<T>(len);
        T t = null;
        for (int i = 0; i < len; i++) {
            D d = sourceObjs.get(i);
            t = populateTbyDBySpring(d, clazz);
            ts.add(t);
        }
        return ts;
    }

    private static Map<String, BeanCopier> beanCopierMap = new HashMap<String, BeanCopier>();

    /**
     * 
     * getBeanCopierObj:(beancopy). <br/>
     *
     * @author s1
     * @param sourceObj source
     * @param targetClazz target
     * @return BeanCopier 
     * @since JDK 1.6
     */
    public static BeanCopier getBeanCopierObj(Object sourceObj, Class<?> targetClazz) {
        String key = generateMapKey(sourceObj, targetClazz);
        if (beanCopierMap.containsKey(key)) {
            return beanCopierMap.get(key);
        }
        BeanCopier beanCopier = BeanCopier.create(sourceObj.getClass(), targetClazz, false);
        beanCopierMap.put(key, beanCopier);
        return beanCopier;
    }

    private static String generateMapKey(Object sourceObj, Class<?> targetClazz) {
        return sourceObj.getClass().toString() + targetClazz;
    }

    /**
     * <转换单个对象> 此方法采用cglib的BeanCopier实现，不支持类型自动转换,不copy任何属性<br/>
     * 建议：如果能够预知不需要类型转换的情况下，请使用此方法，性能最优。
     * 注意：对于getter/setter方法不匹配的情况下，此方法会抛出异常，不copy任何属性。
     * 
     * @param sourceObj
     *            要进行转换的源数据对象
     * @param clazz
     *            要转换成的目标对象的Class类型
     * @return 返回转换后的对象
     * @param <T> type
     * @param <D> type
     */
    public static <T, D> T populateTbyDByCglib(D sourceObj, Class<T> clazz) {
        if (sourceObj == null) {
            return null;
        }
        T t = null;
        try {
            t = (T) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            logger.error("populateTbyDByCglib",e);
        }
        BeanCopier beanCopier = getBeanCopierObj(sourceObj, clazz);
        beanCopier.copy(sourceObj, t, null);
        return t;
    }

    /**
     * <转换List对象> 此方法采用cglib的BeanCopier实现，不支持类型自动转换,如果出现类型不匹配的话，不copy任何属性<br/>
     * 建议：如果能够预知不需要类型转换的情况下，请使用此方法，性能最优。
     * 注意：对于getter/setter方法不匹配的情况下，此方法会抛出异常，不copy任何属性。
     *           
     * @param clazz
     *            要转换成的目标对象的Class类型
     * @return 返回转换后的对象
     * @param <T> type
     * @param <D> type
     * @param sourceObjs 要进行转换的源数据对象
     */
    public static <T, D> List<T> populateTListbyDListByCglib(List<D> sourceObjs, Class<T> clazz) {
        if (sourceObjs == null) {
            return new ArrayList<T>();
        }
        int len = sourceObjs.size();
        List<T> ts = new ArrayList<T>(len);
        T t = null;
        BeanCopier beanCopier = getBeanCopierObj(sourceObjs.get(0), clazz);
        try {
            for (int i = 0; i < len; i++) {
                D d = sourceObjs.get(i);
                t = (T) clazz.newInstance();
                beanCopier.copy(d, t, null);
                ts.add(t);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            logger.error("populateTListbyDListByCglib",e);
        }
        return ts;
    }

    /**
     * apache实现。该方法用于实现扩展原有对象的属性值(即对原有对象的某些字段重新copy属性值)
     * @param <T> type
     * @param <D> type
     * @param sourceObj T
     * @param targetObj D
     * @return T
     */
    public static <T, D> T populateTbyDByApache(D sourceObj, T targetObj) {
        if (sourceObj == null) {
            return null;
        }
        try {
            BeanUtils.copyProperties(targetObj, sourceObj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            logger.error("populateTbyDByApache",e);
        }
        return targetObj;
    }

    /**
     * 
     * populateTbyDBySpring:Spring实现。该方法用于实现扩展原有对象的属性值(即对原有对象的某些字段重新copy属性值). <br/>
     * @author st-zd2671
     * @param sourceObj D
     * @param targetObj T
     * @param <T> type
     * @param <D> type
     * @return T 
     * @since JDK 1.6
     */
    public static <T, D> T populateTbyDBySpring(D sourceObj, T targetObj) {
        if (sourceObj == null) {
            return null;
        }
        org.springframework.beans.BeanUtils.copyProperties(sourceObj, targetObj);
        return targetObj;
    }

    /**
     * 
     * populateTbyDByCglib:(Cglib实现。该方法用于实现扩展原有对象的属性值(即对原有对象的某些字段重新copy属性值)). <br/>
     *
     * @author s
     * @param sourceObj source
     * @param targetObj target
     * @return populateTbyDByCglib
     * @param <T> type
     * @param <D> type
     * @since JDK 1.6
     */
    public static <T, D> T populateTbyDByCglib(D sourceObj, T targetObj) {
        if (sourceObj == null){
            return null;
        }
        BeanCopier beanCopier = getBeanCopierObj(sourceObj, targetObj.getClass());
        beanCopier.copy(sourceObj, targetObj, null);
        return targetObj;
    }

}