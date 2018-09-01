/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2017
 */

package com.yzt.logic.mj.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class Room implements java.io.Serializable {

	private Long id;
	private Integer roomId;
	private Long createId;
	private String createTime;
	private Integer isPlaying;
	private Long userId1;
	private Long userId2;
	private Long userId3;
	private Long userId4;
	private Integer circleNum; // 圈数
	private Integer clubId;// 俱乐部id
	private String ip;// 当前房间所在服务器的ip
	private Integer scoreType;// 计分方式：1点炮三家付；2点炮包三家
	//游戏规则
	private Integer roomType;// 房间模式，房主模式1；自由模式2
	private Integer playerNum;// 人数：2/3/4
	private Integer queMen;// 	缺门胡 1：可以缺门 2不能缺门
	private Integer fengDingFen;// 封顶分： 32 64 128



	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Room == false)
			return false;
		if (this == obj)
			return true;
		Room other = (Room) obj;
		return new EqualsBuilder().append(getId(), other.getId()).isEquals();
	}

	public Long getUserId1() {
		return userId1;
	}

	public void setUserId1(Long userId1) {
		this.userId1 = userId1;
	}

	public Long getUserId2() {
		return userId2;
	}

	public void setUserId2(Long userId2) {
		this.userId2 = userId2;
	}

	public Long getUserId3() {
		return userId3;
	}

	public void setUserId3(Long userId3) {
		this.userId3 = userId3;
	}

	public Long getUserId4() {
		return userId4;
	}

	public void setUserId4(Long userId4) {
		this.userId4 = userId4;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Long getCreateId() {
		return createId;
	}

	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getIsPlaying() {
		return isPlaying;
	}

	public void setIsPlaying(Integer isPlaying) {
		this.isPlaying = isPlaying;
	}

	public Integer getRoomType() {
		return roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

	public Integer getCircleNum() {
		return circleNum;
	}

	public void setCircleNum(Integer circleNum) {
		this.circleNum = circleNum;
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getScoreType() {
		return scoreType;
	}

	public void setScoreType(Integer scoreType) {
		this.scoreType = scoreType;
	}

	public Integer getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(Integer playerNum) {
		this.playerNum = playerNum;
	}

	public Integer getQueMen() {
		return queMen;
	}

	public void setQueMen(Integer queMen) {
		this.queMen = queMen;
	}

	public Integer getFengDingFen() {
		return fengDingFen;
	}

	public void setFengDingFen(Integer fengDingFen) {
		this.fengDingFen = fengDingFen;
	}
	

}
