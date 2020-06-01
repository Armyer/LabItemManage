package com.edu.szu.csse.bean.weixin;

/**
 * 链接消息
 * 
 * @author Administrator
 *
 */
public class LinkMessage {

	/**
	 * 开发者微信号
	 */
	private String ToUserName;

	/**
	 * 发送方帐号（一个OpenID）
	 */
	private String FromUserName;

	/**
	 * 消息创建时间 （整型）
	 */
	private long CreateTime;

	/**
	 * link
	 */
	private String MsgType;

	/**
	 * 消息标题
	 */
	private String Title;

	/**
	 * 消息描述
	 */
	private String Description;

	/**
	 * 消息链接
	 */
	private String Url;

	/**
	 * 消息id，64位整型
	 */
	private String MsgId;

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		return "LinkMessage [ToUserName=" + ToUserName + ", FromUserName=" + FromUserName + ", CreateTime=" + CreateTime
				+ ", MsgType=" + MsgType + ", Title=" + Title + ", Description=" + Description + ", Url=" + Url
				+ ", MsgId=" + MsgId + "]";
	}

}
