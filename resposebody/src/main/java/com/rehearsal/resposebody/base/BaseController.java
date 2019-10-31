package com.rehearsal.resposebody.base;

import com.baomidou.mybatisplus.plugins.Page;
import com.rehearsal.resposebody.utils.HttpCode;
import com.rehearsal.resposebody.utils.InstanceUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description baseController
 * @date 2019-08-20 11:29
 */
public class BaseController {

    protected ResponseEntity<ModelMap> setSuccessResponse(ModelMap modelMap) {
        return setSuccessResponse(modelMap, null);
    }

    protected ResponseEntity<ModelMap> setSuccessResponse(ModelMap modelMap, Object data) {
        return setSuccessResponse(modelMap, HttpCode.OK, data);
    }

    protected ResponseEntity<ModelMap> setResponse(ModelMap modelMap, HttpCode code) {
        return setSuccessResponse(modelMap, code, null);
    }

    protected ResponseEntity<ModelMap> setSuccessResponse(ModelMap modelMap, HttpCode code, Object data) {
        Map<String, Object> map = InstanceUtil.newLinkedHashMap();
        map.putAll(modelMap);
        modelMap.clear();
        for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            if (!key.startsWith("org.springframework.validation.BindingResult") && !key.equals("void")) {
                modelMap.put(key, map.get(key));
            }
        }
        if (data != null) {
            if (data instanceof Page) {
                Page<?> page = (Page<?>) data;
                modelMap.put("data", page.getRecords());
                modelMap.put("current", page.getCurrent());
                modelMap.put("size", page.getSize());
                modelMap.put("pages", page.getPages());
                modelMap.put("total", page.getTotal());
                modelMap.put("iTotalRecords", page.getTotal());
                modelMap.put("iTotalDisplayRecords", page.getTotal());
            } else if (data instanceof List<?>) {
                modelMap.put("data", data);
                modelMap.put("iTotalRecords", ((List<?>) data).size());
                modelMap.put("iTotalDisplayRecords", ((List<?>) data).size());
            } else {


                modelMap.put("data", data);
            }
        }
        modelMap.put("httpCode", code.getValue());
        modelMap.put("msg", code.msg());
        modelMap.put("timestamp", System.currentTimeMillis());

        return ResponseEntity.ok(modelMap);
    }
}
