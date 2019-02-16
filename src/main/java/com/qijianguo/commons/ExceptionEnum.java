package com.qijianguo.commons;

/**
 * @author Administrator
 */
public enum ExceptionEnum implements IExceptionEnum {
    /**
     *  * 正确的请求返回正确的结果
     *  
     */
    _200(200, "请求成功"),

    /**
     *  * 表示资源被正确的创建。比如说，我们 POST 用户名、密码正确创建了一个用户就可以返回 201。
     *  
     */
    _201(201, "资源被正确的创建"),
    /**
     *  * 请求是正确的，但是结果正在处理中，没法返回对应的结果。比如说，我们请求一个需要大量计算的结果，但是并没有计算结束时，可以返回这个，这时候客户端可以通过轮询等机制继续请求。
     *  
     */
    _202(202, "结果正在处理中"),

    /**
     *  * 请求的代理服务器修改了源服务器返回的 200 中的内容，一般用不到。比如说，我们通过代理服务器向服务器 A 请求用户信息，服务器 A 正常响应，但代理服务器命中了缓存并返回了自己的缓存内容，这时候它返回 203 告诉我们这部分信息不一定是最新的，我们可以自行判断并处理。
     *  
     */
    _203(203, "返回缓存内容"),

    /**
     *  * 请求正确，但是没有需要返回的内容。比如说，我们请求删除某个用户，删除成功可以返回 204。
     *  
     */
    _204(204, "请求成功，但是没有需要返回的内容"),

    /**
     *  * 类似 204，但是要求请求者重置视图，一般也用不到。比如说，我们请求删除某个用户，服务器返回 205的话，我们就刷新现在的用户列表。
     *  
     */
    _205(205, "请求成功，重新请求获取最新内容"),
    /**
     *  * 请求成功，但根据请求头只返回了部分内容。比如说，我们下载一部片，共有 10部分，我们把请求也分成了 10次（防止一次请求过大），这时候服务器就可以返回 206并在其头部告诉我们这是哪一部分，然后再根据这个信息进行拼装。
     *  
     */

    _206(206, "请求成功，只返回了部分内容"),
    /**
     *  * 请求成功，但结果有多种选择。比如说，我们下载一部片，服务器有 avi、mp4 等格式，这时候可以返回 300，并在 body里告知有哪些格式，然后用户可以根据这些格式再次请求。
     *  
     */
    _300(300, "请求成功，根据返回内容选择"),
    /**
     *  * 请求成功，但是资源被永久转移。比如说，我们要下载葫芦娃，但是由于旧的存储服务商涨价了，现在要使用新的存储服务了，要去新地址下载，这时候可以返回 301，并在 header的 Location中告知新的地址，以后也应当到这个地址下载。
     *  
     */
    _301(301, "请求成功，但是资源被永久转移"),
    /**
     *  * 请求成功，但是资源被临时转移了。和 301不同的是， 除非是 HEAD请求，否则新地址的信息应当在 body中返回，并且资源只是临时转移，以后不应当通过新地址来下载。
     *  
     */
    _302(302, "请求成功，但是资源被临时转移"),
    /**
     *  * 类似 302， 但要求使用 GET 来访问新的地址来获取资源。
     *  
     */
    _303(303, "请求成功，GET来访问新的地址来获取资源"),
    /**
     *  * 请求的资源并没有被修改过。比如说，我们发送请求想看看 5.20后的情侣信息，服务器查询没有新的情侣信息产生，这时候可以返回 304，然后客户端可以继续用旧的数据。
     *  
     */
    _304(304, "请求成功，请求的资源并没有被修改过"),
    /**
     *  * 请求的资源必须通过代理访问。比如说，我们想请求服务器 A 上新的 iPhone 的信息，但是需要通过代理服务器才能访问， 如果直接请求了服务器 A，没有经过代理服务器，这时候服务器 A 就可以返回 305从而告诉我们应当访问代理服务器。
     *  
     */
    _305(305, "请求成功，请求的资源必须通过代理访问"),
    /**
     *  * 不用了
     *  
     */
    _306(306, "请求成功，不用了"),
    /**
     *  * 类似 302，但要求使用原有的请求方式来通过新地址获取资源。
     *  
     */
    _307(307, "请求成功，使用原有的请求方式来通过新地址获取资源"),
    /**
     *  * 类似 301，但要求使用原有的请求方式来通过新地址获取资源。
     *  
     */
    _308(308, "请求成功，使用原有的请求方式来通过新地址获取资源"),
    /**
     *  * 请求出现错误，比如请求头不对等，所有不想明确区分的客户端请求出错都可以返回 400。
     *  
     */
    _400(400, "请求出现错误"),
    /**
     *  * 没有提供认证信息。比如说， 请求的时候没有带上 Token 等。
     *  
     */
    _401(401, "没有提供认证信息"),
    /**
     *  * 为将来的需要所保留的状态码
     *  
     */

    _402(402, "为将来的需要所保留的状态码"),
    /**
     *  * 请求的资源不允许访问。比如说， 你使用普通用户的 Token 去请求管理员才能访问的资源。
     *  
     */
    _403(403, "请求的资源不允许访问"),
    /**
     *  * 请求的内容不存在
     *  
     */
    _404(404, "请求的内容不存在"),
    /**
     *  * 请求的方法不允许使用。比如说， 服务器只实现了 PATCH 了局部更新资源，并没有实现 PUT来替换资源， 而我们使用了 PUT，这时候服务器可以返回 405 来告知并没有实现对 PUT 的相关处理。
     *  
     */

    _405(405, "请求的方法不允许使用"),
    /**
     *  * 请求的资源并不符合要求。比如说， 我们 header 里请求 JSON 格式的数据， 但是服务器只有 XML 格式的数据，这时候可以返回 406告知。
     *  
     */

    _406(406, "请求的资源并不符合要求"),
    /**
     *  * 类似 401，但是要求必须去同代理服务器进行认证。
     *  
     */
    _407(407, "必须去同代理服务器进行认证"),
    /**
     *  * 客户端请求超时。我们想 POST\创建一个用户，虽然建立了连接，但是网络不好，服务器在规定时间内没有得到我们的请求信息，这时候服务器可以返回 408告诉我们超时了。然后我们可以重新发送请求。
     *  
     */
    _408(408, "客户端请求超时"),
    /**
     *  * 请求冲突。比如说，服务器要求不同用户不能重名，服务器已经有了一个名叫小伟的用户，这时候我们又想创建一个名叫小伟的用户，服务器可以返回 409，告诉我们冲突了，也可以在 body 中明确告知是什么冲突了。
     *  
     */_409(409, "请求冲突"),
    /**
     *  * 请求资源曾经存在，但现在不存在了。比如说，我们下载葫芦娃，但是因为版权被删了，下载不了了，这时候服务器返回 410，告诉我们洗洗早点睡。
     *  
     */_410(410, "请求冲突"),
    /**
     *  * 没有提供请求资源的长度。比如说，我们下载葫芦娃，服务器只允许我们分部分下载，我们如果不告诉服务器我们要下载哪部分，服务器就返回 411警告我们。
     *  
     */_411(411, "没有提供请求资源的长度"),
    /**
     *  * 请求的资源不符合请求头中的 IF-*的某些条件。比如说，我们下载葫芦娃，然后在请求头告知服务器要 5.20后更新过的，服务器没有，于是返回了 412。
     *  
     */_412(412, "请求的资源不符合请求头中的IF-*的某些条件"),
    /**
     *  * 请求体过大。比如说，服务器要求上传文件不能超过 5M， 但是我们 POST 了 10M，这时候就返回 413。
     *  
     */_413(413, "请求体过大"),
    /**
     *  * 请求的 URI 太长了。比如说， 我们提供了太多的 Query 参数，以至于超过了服务器的限制，这时候可以返回 414。
     *  
     */
    _414(414, "请求的 URI 太长了"),
    /**
     *  * 不支持的媒体类型。比如说， 我们上传了一张七娃的 GIF 动图， 而服务器只允许你上传 PNG 图片，这时候就返回 415。
     *  
     */
    _415(415, "不支持的媒体类型"),
    /**
     *  * 请求的区间无效。比如说，我们分部分下载时请求葫芦娃的 10分钟到 12分钟的内容，但是这部葫芦娃只有 1分钟的内容，这时候就返回 416。
     *  
     */
    _416(416, "请求的区间无效"),
    /**
     *  * 预期错误。指服务器没法满足我们在请求头里的 Expect 相关的信息。
     *  
     */
    _417(417, "预期错误"),
    /**
     *  * 不需要的状态码
     *  
     */
    _418(418, "不需要的状态码"),
    /**
     *  * 服务器错误。没法明确定义的服务器错误都可以返回这个。
     *  
     */
    _500(500, "服务器错误"),
    /**
     *  * 请求还没有被实现。比如说，我们请求一个接口来自动拒绝项目经理的要求，但是这个接口只是美好的想象，并没有被实现，这时候可以返回 501。
     *  
     */
    _501(501, "请求还没有被实现"),
    /**
     *  * 网关错误。比如说，我们向服务器 A 请求下载葫芦娃，但是 A 其实只是一个代理服务器，他得向 B 请求葫芦娃，但是不知道为啥 B 不理他或者给他错误，这时候哦可以 A 返回 502 用来表示 B 这家伙傲娇了。
     *  
     */
    _502(502, "网关错误"),
    /**
     *  * 服务暂时不可用。比如说，服务器正好在更新代码重启。
     *  
     */
    _503(503, "服务暂时不可用"),
    /**
     *  * 类似 502， 但是这时候是 B 不理 A，超时了 。
     *  
     */
    _504(504, "服务暂时不可用"),
    /**
     *  * 请求的 HTTP 版本不支持。比如说， 现在强行根据 HTTP 1000来请求。;
     *  
     */
    _505(505, "服务暂时不可用");
    /**
     *  * 状态码
     *  
     */
    private Integer code;
    /**
     *  * 提示信息
     *  
     */
    private String message;
    /**
     *  * 构造函数
     *  *
     *  * @param code状态码
     *  * @param message 提示信息
     *  
     */
    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    /**
     *  * 获取状态码
     *  *
     *  * @return 状态码
     *  
     */
    @Override


    public Integer getCode() {
        return this.code;
    }

    /**
     *  * 获取提示信息
     *  *
     *  * @return 提示信息
     *  
     */
    @Override


    public String getMessage() {
        return this.message;
    }
}