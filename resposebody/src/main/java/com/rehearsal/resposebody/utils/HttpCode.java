package com.rehearsal.resposebody.utils;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 返回的httpCode信息
 * @date 2019-08-20 10:49
 */
public enum HttpCode {

    /**
     * 200请求成功
     */
    OK(200),
    /**
     * 207频繁操作
     */
    MULTI_STATUS(207),
    /**
     * 303登录失败
     */
    LOGIN_FAIL(303),
    /**
     * 400请求参数出错
     */
    BAD_REQUEST(400),
    /**
     * 401没有登录
     */
    UNAUTHORIZED(401),
    /**
     * 403没有权限
     */
    FORBIDDEN(403),
    /**
     * 404找不到页面
     */
    NOT_FOUND(404),
    /**
     * 408请求超时
     */
    REQUEST_TIMEOUT(408),
    /**
     * 409发生冲突
     */
    CONFLICT(409),
    /**
     * 410已被删除
     */
    GONE(410),
    /**
     * 423已被锁定
     */
    LOCKED(423),
    /**
     * 缺失token
     */
    LOST_TOKEN(800),
    /**
     * token失效
     */
    TIME_OUT_TOKEN(801),
    /**
     * 500服务器出错
     */
    INTERNAL_SERVER_ERROR(500);

    private final Integer value;

    HttpCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public String msg() {
        return "国际化支持信息--文字--"+value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
