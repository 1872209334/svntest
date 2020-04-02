package com.qf.controller.api.fire;

import com.alibaba.fastjson.JSONObject;
import com.qf.common.JwtConfig;
import com.qf.common.systemLog.SystemHistoryAnnotation;
import com.qf.model.admin.HixentUser;
import com.qf.model.fire.HixentArcPeopleStatistical;
import com.qf.model.fire.HixentArcSiteDetailDao;
import com.qf.service.admin.HixentUserService;
import com.qf.service.fire.HixentArcAlarmLogService;
import com.qf.service.fire.HixentArcGarbageService;
import com.qf.service.fire.HixentArcSiteDetailService;
import com.qf.service.fire.HixentArcZipperInfoService;
import com.qf.util.JwtUtil;
import com.qf.util.RedisUtil;
import com.qf.util.ReturnUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * author zhangjun
 * 站点详情控制器
 */
@RestController
@RequestMapping("/api/site/detail")
public class ApiSiteDetailController {

	@Autowired
	private HixentArcAlarmLogService hixentArcAlarmLogService;

	@Autowired
	private HixentUserService hixentUserService;

	@Autowired
	private JwtConfig jwtConfig;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private HixentArcZipperInfoService hixentArcZipperInfoService;

	@Autowired
	private HixentArcGarbageService hixentArcGarbageService;

	@Autowired
    private HixentArcSiteDetailService hixentArcSiteDetailService;

	@Resource
	private RedisUtil redisUtil;


    /**
     * 查询人流统计列表 author zhangjun
     */
    @SystemHistoryAnnotation(opration = "查询站点详情")
    @PostMapping(value = "/selectSiteDetail")
    public ModelMap selectSiteDetail(String siteCode) {
        try {
            // 获取用户信息
            // HixentAppUser userinfo = (HixentAppUser)
            // SecurityUtils.getSubject().getPrincipal();
            ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                    .getRequestAttributes();
            HttpServletRequest request = requestAttributes.getRequest();
            String auth = request.getHeader(jwtConfig.getJwtHeader());
            auth = auth.substring(7, auth.length());
            Claims claims = jwtUtil.parseJWT(auth, jwtConfig.getSecret());
            String userId = claims.getId();
            String[] userArr = userId.split("_");
            if (!userArr[0].equals("admin")) {
                return ReturnUtil.Error("已退出，请重新登录！");
            }
            HixentUser userinfo = hixentUserService.findByUserId(userArr[1]);
            if (userinfo == null) {
                return ReturnUtil.Error("已退出，请重新登录！");
            }
            String areaId = (String) redisUtil.get("areaId_" + userinfo.getUid());
            String provinceId = (String) redisUtil.get("provinceId_" + userinfo.getUid());
            int areaIdInt = Integer.parseInt(areaId);
            int provinceIdInt = Integer.parseInt(provinceId);
            String bid = userinfo.getBid();
            String[] siteCordArr = bid.split(",");

			JSONObject json = new JSONObject();
            HixentArcSiteDetailDao hixentArcSiteDetailDao = new HixentArcSiteDetailDao();
            hixentArcSiteDetailDao.setSiteCode(siteCode);
            hixentArcSiteDetailDao.setSiteName(hixentArcSiteDetailService.selectSiteName(siteCode));
            hixentArcSiteDetailDao.setDeviceSum(hixentArcSiteDetailService.selectDeviceSum(siteCode));
            hixentArcSiteDetailDao.setPhoneNumber(hixentArcSiteDetailService.selectPhoneNumber(siteCode));
            hixentArcSiteDetailDao.setKitchenGarbage(hixentArcSiteDetailService.selectKindsOfGarbage(siteCode,"1"));
            hixentArcSiteDetailDao.setRecyclableGarbage(hixentArcSiteDetailService.selectKindsOfGarbage(siteCode,"2"));
            hixentArcSiteDetailDao.setOtherGarbage(hixentArcSiteDetailService.selectKindsOfGarbage(siteCode,"3"));
            hixentArcSiteDetailDao.setHarmfulGarbage(hixentArcSiteDetailService.selectKindsOfGarbage(siteCode,"4"));
			json.put("hixentArcSiteDetailDao", hixentArcSiteDetailDao);
			return ReturnUtil.Success("获取站点详情成功！", json);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


}