package com.yzt.logic.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.yzt.logic.mj.domain.Action;
import com.yzt.logic.mj.domain.Player;
import com.yzt.logic.mj.domain.RoomResp;
import com.yzt.logic.util.JudegHu.checkHu.Hulib;
import com.yzt.logic.util.JudegHu.checkHu.TableMgr;
import com.yzt.logic.util.redis.RedisUtil;

/**
 * 
 * @author wsw_007
 *
 */
public class MahjongUtils {
	public static final Log logger = LogFactory.getLog(MahjongUtils.class);

	static {
		// 加载胡的可能
		TableMgr.getInstance().load();
	}

	public static void main(String[] args) {
		// 设置玩家手牌信息
		// List<Integer> currentMjList = new ArrayList<Integer>();
		// int x=0;
		// System.out.println(Integer.valueOf(x)!=null);
		// currentMjList.add(1);
		// List<Integer> faPai = faPai(currentMjList, 1);
		// System.out.println(faPai);
		// boolean a=false;
		// boolean b=true;
		// boolean c=false;
		// boolean d=false;
		// if(a || b || c || d){
		// System.out.println("false");
		// }
		// Random r = new Random();
		//
		// int nextInt = r.nextInt(7);
		// System.out.println(nextInt);
		// List<Integer> list = new ArrayList<Integer>();
		// list.add(1);
		// list.add(2);
		// if (list.contains(2)) {
		// System.out.println("-");
		// }
		// // currentMjList.add(2);
		// // currentMjList.add(3);
		// Integer huLeiXingScore=0;
		// List<Integer> huInfoList = new ArrayList<Integer>(); // 获取玩家的胡的类型
		// huInfoList.add(Cnst.QIDUI);
		// huInfoList.add(Cnst.TUIDAOHU);
		// huInfoList.add(Cnst.QINGYISE);
		// for (Integer integer : huInfoList) {
		// if(huLeiXingScore==0){
		// huLeiXingScore=Cnst.huScoreMap.get(integer);
		// }else{
		// huLeiXingScore*=Cnst.huScoreMap.get(integer);
		// }
		// }
		// System.out.println(huLeiXingScore);
		// Integer x=null;
		// System.out.println(x.equals(3));
		// currentMjList.add(4);
		// currentMjList.add(6);
		// currentMjList.add(7);
		// currentMjList.add(8);
		// currentMjList.add(9);
		// currentMjList.add(10);
		// currentMjList.add(10);
		// currentMjList.add(11);
		// currentMjList.add(12);
		// List<Integer> chi =
		// MahjongUtils.getPaiListFromAction(42,Cnst.PLAYER_ACTION_CHI);
		// Integer lastChuPai = 10;
		// MahjongUtils.removePai(chi, lastChuPai,1);
		// // 移除手牌中需要配合组成动作的牌
		// MahjongUtils.removeList(currentMjList, chi);
		// System.out.println(currentMjList);
		// currentMjList.add(6);
		// currentMjList.add(12);
		// currentMjList.add(13);
		// currentMjList.add(15);
		// currentMjList.add(16);
		// currentMjList.add(30);
		// currentMjList.add(30);
		// currentMjList.add(31);
		// currentMjList.add(32);
		// currentMjList.add(33);
		// List<Long> nowPlayerIds=new ArrayList<Long>();
		// List<Player> actionPlayers=new ArrayList<Player>();
		//
		// Player p1=new Player();
		// p1.setUserId(111l);
		// p1.setPosition(1);
		// Player p2=new Player();
		// p2.setUserId(112l);
		// p2.setPosition(2);
		// Player p3=new Player();
		// p3.setUserId(113l);
		// p3.setPosition(3);
		// Player p4=new Player();
		// p4.setUserId(114l);
		// p4.setPosition(4);
		// actionPlayers.add(p1);
		// actionPlayers.add(p2);
		// // actionPlayers.add(p3);
		// // actionPlayers.add(p4);
		// Integer position=3;
		// getNowPositionByOrder(nowPlayerIds, actionPlayers, position);
		// for (Long x : nowPlayerIds) {
		// System.out.println(x);
		// }
		// System.out.println(getKaiPaiFromHunPai(34));

		// List<Integer> c = new ArrayList<Integer>();
		// c.add(1);
		// c.add(30);
		// removeList(currentMjList, c);
		// for (Integer integer : currentMjList) {
		// System.out.println(integer);
		// }
		// 设置玩家信息
		// Player player = new Player();
		// player.setCurrentMjList(currentMjList);
		// removePai(player, 16);
		// for (Integer integer : currentMjList) {
		// System.out.println(integer);
		// }
		// // 设置房间信息
		// RoomResp room = new RoomResp();
		// room.setRuleDaiHun(1);
		// room.setHunPai(32);
		// //1:检测长毛
		// List<Action> actionList =new ArrayList<Action>();
		// Action ac1= new Action();
		// ac1.setType(6);
		// Action ac2= new Action();
		// ac2.setType(7);
		// actionList.add(ac1);
		// actionList.add(ac2);
		// player.setActionList(actionList);
		// List<Integer> checkChangMao = checkChangMao(player, 34);
		// System.out.println();

		// 2:检测吃
		// List<Integer> checkChi = checkChi(player, room,14);
		// for (Integer integer : checkChi) {
		// System.out.println(integer);
		//
		// }
		// 3:检测通过吃动作获取动作集合
		// List<Integer> chiListFromAction = getChiListFromAction(55);
		// for (Integer integer : chiListFromAction) {
		// System.out.println(integer);
		// }
		// 4：检测
		// List<Long> n=new ArrayList<Long>(3);
		// Long[] playerIds=new Long[4];
		// playerIds[0]=111l;
		// playerIds[1]=222l;
		// playerIds[2]=333l;
		// playerIds[3]=666l;
		// Integer position=4;
		// List<Long> guoUserIds=new ArrayList<Long>();
		// guoUserIds.add(111l);
		// guoUserIds.add(222l);
		// guoUserIds.add(333l);
		// guoUserIds.add(666l);
		// List<Long> nowPositionByOrder = getNowPositionByOrder(n, playerIds,
		// position, guoUserIds);
		// for (Long long1 : nowPositionByOrder) {
		// System.out.println(long1);
		// }
		// some
		// List<Long> userIds=new ArrayList<Long>();
		// userIds.add(1111l);
		// userIds.add(1112l);
		// userIds.add(1113l);
		// userIds.add(1114l);
		// userIds.remove(1111l);
		// for (Long long1 : userIds) {
		// System.out.println(long1);
		// }
		// System.out.println("some");
		// System.out.println(-2%9);
		// System.out.println(18%9);
		// System.out.println(10%9);
		int[] sho = { 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		if (Hulib.getInstance().get_hu_info(sho, 34, 34)) {
			System.out.println("嘿嘿");
		} else {
			System.out.println("哈哈");
		}
	}

	/**
	 * 获得所需要的牌型(干里干) 并打乱牌型
	 * 
	 * @return
	 */
	public static List<Integer> getPais() {
		// 1-9万 ,10-18饼,19-27条,28-31 东南西北,32-34 中发白
		ArrayList<Integer> pais = new ArrayList<Integer>();
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i <= 34; i++) {
				if (i <= 28 || i == 32) {
					pais.add(i);
				}
			}
		}
		// 2.洗牌
		Collections.shuffle(pais);
		return pais;
	}

	/**
	 * 
	 * @param mahjongs
	 *            房间内剩余麻将的组合
	 * @param num
	 *            发的张数
	 * @return
	 */
	public static List<Integer> faPai(List<Integer> mahjongs, Integer num) {
		// 房间必须有牌，且牌的数量必须大于要发的牌数
		if (mahjongs == null || num == null || mahjongs.size() < num) {
			return null;
		}
		// ArrayList
		// rrayList内部是使用可増长数组实现的，所以是用get和set方法是花费常数时间的，但是如果插入元素和删除元素，除非插入和删除的位置都在表末尾，否则代码开销会很大，因为里面需要数组的移动。
		List<Integer> result = new ArrayList<>();
		for (int i = mahjongs.size() - 1; i >= 0; i--) {
			result.add(mahjongs.get(i));
			mahjongs.remove(i);
			num--;
			if (num == 0) {
				break;
			}
		}
		return result;
	}

	/**
	 * 给手牌排序
	 * 
	 * @param pais
	 * @return
	 */
	public static List<Integer> paiXu(List<Integer> pais) {
		Collections.sort(pais);
		return pais;
	}

	/**
	 * 检测玩家是否胡 没有动作拍说明是自摸，手牌数量为3n+2 有动作拍说明是别人出牌或者抢杠胡，手牌为3n+1 --有刻, 有幺九
	 * 
	 * @param currentPlayer
	 * @param room
	 * @param dongZuoPai
	 * @param chuMoType
	 * @return
	 */
	private static Boolean checkHu(Player currentPlayer, RoomResp room, Integer dongZuoPai) {
		// 胡牌规则
		List<Integer> currentMjList = currentPlayer.getCurrentMjList();
		List<Integer> newList = getNewList(currentMjList, dongZuoPai);
		int[] shouPaiArr = getArrFromList(newList);

		// 1:七对
		if (newList.size() == 14) {// 七对的手牌数量必须满足14张
			if (checkQiDui(shouPaiArr)) {
				return true;
			}
		}
		// 对于普通
		// 2.1：必须有19(风和字牌可以顶)--这个检测不需要绝,因为绝前提是手中有3张相同的牌
		Boolean hasYiJiu = false;
		// 2.3：必须有刻牌
		Boolean hasKe = false;

		// 2.4：必须开门
		Boolean isKaiMen = false;
		// 选了缺门,不需要开门
		if (room.getQueMen().equals(1)) {// 可以缺门
			isKaiMen = true;
		}
		// 为了检测能否飘
		boolean hasChi = false;
		// 3.1 检测已经有的动作牌
		List<Action> actionList = currentPlayer.getActionList();
		if (actionList != null && actionList.size() > 0) {
			for (Action action : actionList) {
				Integer type = action.getType();
				Integer actionId = action.getActionId();
				Integer extra = action.getExtra();
				if (type.equals(1)) {// 吃
					hasChi = true;
					isKaiMen = true;
					if (actionId == 35 || actionId == 41 || actionId == 42 || actionId == 48 || actionId == 49 || actionId == 55) {
						hasYiJiu = true;
					}
				} else if (type.equals(5)) {// 暗杠不算开门
					hasKe = true;
					if (extra == 32) {// 红中
						hasYiJiu = true;
					} else {
						int paiNum = extra % 9;
						if (paiNum == 1 || paiNum == 0) {
							hasYiJiu = true;
						}
					}
				} else {
					isKaiMen = true;
					hasKe = true;
					if (extra == 32) {// 红中
						hasYiJiu = true;
					} else {
						int paiNum = extra % 9;
						if (paiNum == 1 || paiNum == 0) {
							hasYiJiu = true;
						}
					}
				}
			}
		}

		if (!hasChi) {
			if (checkPengHu(shouPaiArr)) {
				return true;
			} else {
				return false;
			}
		}
		if (!hasYiJiu) {
			// 3.2 检测手牌
			if (shouPaiArr[32] > 0) {
				hasYiJiu = true;
				if (!hasYiJiu) {
					if (shouPaiArr[0] > 0 || shouPaiArr[8] > 0 || shouPaiArr[9] > 0 || shouPaiArr[17] > 0 || shouPaiArr[18] > 0 || shouPaiArr[26] > 0) {
						hasYiJiu = true;
					}
				}
			}
		}
		// 之所以先不加刻牌判断,是因为手中可能有刻牌
		if (!hasYiJiu || !isKaiMen) {
			return false;
		}
		// 检测手牌能否胡
		Boolean hu = false;
		if (hasKe) {
			if (Hulib.getInstance().get_hu_info(shouPaiArr, 34, 34)) {
				return true;
			}
		} else {
			for (int i = 0; i < shouPaiArr.length; i++) {
				if (shouPaiArr[i] >= 3) {// 这张牌不需要混顶
					int j = shouPaiArr[i];// 移除了3张顶混牌
					shouPaiArr[i] = j - 3;
					// 给混牌加上数量
					hu = Hulib.getInstance().get_hu_info(shouPaiArr, 34, 34);
					if (hu) {
						return true;
					} else {
						shouPaiArr[i] = j;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 检测七对
	 * 
	 * @param shouPaiArr
	 * @param hunNum
	 * @param room
	 * @return
	 */
	private static boolean checkQiDui(int[] shouPaiArr) {
		for (int i = 0; i < shouPaiArr.length; i++) {
			if (shouPaiArr[i] == 1 || shouPaiArr[i] == 3) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * 检测玩家动作 ，分为出牌检测和摸牌检测 出牌,必须是出去手中的牌 摸牌,指摸剩下牌库里的牌
	 * 如果是自动执行的动作，那么不给过选项,前端判断没有过的时候,自动201接口执行动作
	 * 
	 * @param players
	 * @param currentPlayer
	 * @param action
	 * @param room
	 * @param extraPai
	 */
	public static Player checkActions(List<Player> players, Player currentPlayer, RoomResp room, Integer chuMoType, Integer dongZuoPai) {
		if (room.getState() == null || room.getState() != Cnst.ROOM_STATE_GAMIING) {
			logger.error("房间状态有无");
			return null;
		}
		// 定义要返回的动作玩家
		Player actionPlayer = null;
		if (chuMoType == Cnst.CHECK_TYPE_MO) {// 摸牌检测---前面动作牌传的null
			actionPlayer = currentPlayer;
			// 获取当前玩家动作
			List<Integer> currentActions = currentPlayer.getCurrentActions();
			// 为了判断玩家的优先级
			List<Integer> currentActionLevers = currentPlayer.getCurrentActionLevers();
			if (currentActions == null) {
				currentActions = new ArrayList<Integer>();
			}
			if (currentActionLevers == null) {
				currentActionLevers = new ArrayList<Integer>();
			}
			// 每次检测动作之前，将要检测的玩家清空
			currentActions.clear();
			currentActionLevers.clear();
			if (currentPlayer.getCanHu()) {
				if (checkHu(currentPlayer, room, dongZuoPai)) {// 胡
					// 胡的动作是500
					currentActions.add(Cnst.HU_ACTION);// 500
				}
			}
			// 检测玩家的碰杠和暗杠
			// 剩下4张的时候只有碰碰胡才可以检测杠
			List<Integer> gangList = checkGang(currentPlayer, room, dongZuoPai, chuMoType);
			if (gangList != null) {
				currentActions.addAll(gangList);
			}
			// 如果摸牌玩家没有任何动作
			if (currentActions.size() == 0) {
				// 将该玩家的动作设置成出牌
				currentActions.add(Cnst.CHU_ACTION);
			} else {
				currentActions.add(Cnst.GUO_ACTION);
			}
		} else if (chuMoType == Cnst.CHECK_TYPE_CHU) {// 出牌检测
			// 每次出牌检测重置此集合
			List<Long> nowPlayerIds = room.getNowPlayerIds();
			if (nowPlayerIds == null) {
				nowPlayerIds = new ArrayList<Long>(3);
			} else {// 清空上次检测的数据
				nowPlayerIds.clear();
			}
			room.setNowPlayerIds(nowPlayerIds);
			// 获取当前玩家的位置
			Integer position = currentPlayer.getPosition();
			// 定义下一个玩家
			Player nextPlayer = null;
			// 获取下家玩家的位置
			Integer nextPlayerPosition = getNextPlayerPosition(position);
			// 获取归0的人
			// 设置一个存储玩家位置的集合，目的是根据位置获取nowPlayerIds;
			List<Player> actionPlayers = new ArrayList<Player>(3);
			// 定义要检测的玩家
			Player needCheckplayer = null;

			// 获取房间玩家集合
			// Long[] playerIds = room.getPlayerIds();
			for (Player p : players) {
				Long playerId = p.getUserId();
				if (playerId == null) {
					System.err.println("玩家丢失");
					continue;
				}
				if (playerId.equals(currentPlayer.getUserId())) {// 不检测出牌玩家
					continue;
				} else {// 检测剩下3个玩家的动作
					needCheckplayer = p;
					// 获取当前玩家动作
					List<Integer> currentActions = needCheckplayer.getCurrentActions();
					// 为了判断玩家的优先级
					List<Integer> currentActionLevers = needCheckplayer.getCurrentActionLevers();
					if (currentActions == null) {
						currentActions = new ArrayList<Integer>();
					}
					if (currentActionLevers == null) {
						currentActionLevers = new ArrayList<Integer>();
					}
					currentActions.clear();
					currentActionLevers.clear();
					// 检测胡
					int needCheckPaiSize = needCheckplayer.getCurrentMjList().size();
					if (needCheckplayer.getCanHu()) {
						if (checkHu(needCheckplayer, room, dongZuoPai)) {// 胡
							// 胡的动作是500
							currentActions.add(Cnst.HU_ACTION);// 500
							currentActionLevers.add(Cnst.ACTION_TYPE_HU);
						}
					}
					// 检测杠
					List<Integer> gangList = checkGang(needCheckplayer, room, dongZuoPai, chuMoType);
					if (gangList != null) {
						currentActions.addAll(gangList);
						currentActionLevers.add(Cnst.ACTION_TYPE_DIANGANG);
					}
					List<Integer> pengGangList = null;
					boolean isNextPlayer=false;
					if (needCheckplayer.getPosition().equals(nextPlayerPosition)) {
						// 给下一个玩家赋值
						isNextPlayer=true;
						nextPlayer = needCheckplayer;
					}
					
					if (needCheckPaiSize > 4) {
						pengGangList = checkPeng(needCheckplayer, dongZuoPai, room);
						if (pengGangList != null) {
							currentActions.addAll(pengGangList);
							currentActionLevers.add(Cnst.ACTION_TYPE_PENG);
						}
						// 检测是不是下家
						if (isNextPlayer) {
							// 检测吃
							List<Integer> chiActionsList = checkChi(needCheckplayer, room, dongZuoPai);
							if (chiActionsList != null) {
								currentActions.addAll(chiActionsList);
								currentActionLevers.add(Cnst.ACTION_TYPE_CHI);
							}
						}
					}
					// 如果玩家没有动作
					if (currentActionLevers.size() != 0) {// 有动作
						currentActions.add(Cnst.GUO_ACTION);
						actionPlayers.add(needCheckplayer);
					}
				}
			}

			if (actionPlayers.size() == 0) {// 说明都没动作，那么下个玩家就是动作玩家--动作是摸牌
				actionPlayer = nextPlayer;
				List<Integer> currentActions = nextPlayer.getCurrentActions();
				currentActions.add(Cnst.MO_ACTION);
				RedisUtil.updateRedisData(null, nextPlayer);
			} else {// 有动作的玩家至少有1人
					// 根据有动作的玩家集合,获取一个按照位置优先级的玩家集合
				getNowPositionByOrder(nowPlayerIds, actionPlayers, position);
				for (Player p : actionPlayers) {
					RedisUtil.updateRedisData(null, p);
				}
				actionPlayer = getFirstActionPlayer(nowPlayerIds, players, room);
				room.setNowPlayerIds(nowPlayerIds);
			}
		} else if (chuMoType == Cnst.CHECK_TYPE_HAILAO) {// 海劳阶段
			actionPlayer = currentPlayer;
			// 获取当前玩家动作
			List<Integer> currentActions = currentPlayer.getCurrentActions();
			if (currentActions == null) {
				currentActions = new ArrayList<Integer>();
			}
			// 每次检测动作之前，将要检测的玩家清空
			currentActions.clear();
			// 检测海捞摸牌的玩家是否能胡
			if (currentPlayer.getCanHu() && checkHu(currentPlayer, room, dongZuoPai)) {// 胡
				// 胡的动作是500
				currentActions.add(Cnst.HU_ACTION);// 500
			} else {
				// 不胡的话,将下一个玩家的状态设置为摸牌
				Integer nextPlayerPosition = getNextPlayerPosition(currentPlayer.getPosition());
				for (Player p : players) {
					if (p.getPosition().equals(nextPlayerPosition)) {
						actionPlayer = p;
						List<Integer> currentActions2 = actionPlayer.getCurrentActions();
						if (currentActions2 == null) {
							currentActions2 = new ArrayList<Integer>();
						}
						currentActions2.clear();
						currentActions2.add(Cnst.MO_ACTION);
						break;
					}
				}
			}
		} else {// 抢杠胡 --检测其他三家会不会胡
				// 每次出牌检测重置此集合
			List<Long> nowPlayerIds = room.getNowPlayerIds();
			if (nowPlayerIds == null) {
				nowPlayerIds = new ArrayList<Long>(3);
			} else {// 清空上次检测的数据
				nowPlayerIds.clear();
			}
			room.setNowPlayerIds(nowPlayerIds);
			// 获取当前玩家的位置
			Integer position = currentPlayer.getPosition();
			// 设置一个存储玩家位置的集合，目的是根据位置获取nowPlayerIds;
			List<Player> actionPlayers = new ArrayList<Player>(3);
			// 定义要检测的玩家
			Player needCheckplayer = null;

			// 获取房间玩家集合
			for (Player p : players) {
				Long playerId = p.getUserId();
				if (playerId == null) {
					System.err.println("玩家丢失");
					continue;
				}
				if (playerId.equals(currentPlayer.getUserId())) {// 不检测执行碰杠玩家
					continue;
				} else {// 检测剩下3个玩家的胡动作
					needCheckplayer = p;
					// 获取当前玩家动作
					List<Integer> currentActions = needCheckplayer.getCurrentActions();
					// 为了判断玩家的优先级
					List<Integer> currentActionLevers = needCheckplayer.getCurrentActionLevers();
					if (currentActions == null) {
						currentActions = new ArrayList<Integer>();
					}
					if (currentActionLevers == null) {
						currentActionLevers = new ArrayList<Integer>();
					}
					currentActions.clear();
					currentActionLevers.clear();
					// 检测胡
					if (needCheckplayer.getCanHu()) {
						if (checkHu(needCheckplayer, room, dongZuoPai)) {// 胡
							// 胡的动作是500
							currentActions.add(Cnst.HU_ACTION);// 500
							currentActionLevers.add(Cnst.ACTION_TYPE_HU);
						}
					}
					// 如果玩家没有动作
					if (currentActionLevers.size() != 0) {// 有胡动作
						currentActions.add(Cnst.GUO_ACTION);
						actionPlayers.add(needCheckplayer);
						room.setCurrentActions(currentActions);
					}
				}
			}

			if (actionPlayers.size() != 0) {// 有动作的玩家至少有1人
				// 根据有动作的玩家集合,获取一个按照位置优先级的玩家集合
				getNowPositionByOrder(nowPlayerIds, actionPlayers, position);
				actionPlayer = getFirstActionPlayer(nowPlayerIds, players, room);
				room.setNowPlayerIds(nowPlayerIds);
			}
		}
		if (actionPlayer != null) {// 抢杠胡阶段ac
			room.setCurrentActions(actionPlayer.getCurrentActions());
		}
		return actionPlayer;
	}

	/**
	 * 按照顺序动作玩家的集合
	 * 
	 * @param nowPlayerIds
	 * @param actionPlayers
	 * @param position
	 */
	private static void getNowPositionByOrder(List<Long> nowPlayerIds, List<Player> actionPlayers, Integer position) {
		Long[] arr = new Long[3];
		for (Player player : actionPlayers) {
			int x = (player.getPosition() - position + 4) % 4 - 1;
			arr[x] = player.getUserId();
		}
		for (Long long1 : arr) {
			if (long1 != null) {
				nowPlayerIds.add(long1);
			}
		}
	}

	/**
	 * --注意,此方法检测是玩家至少为1 获取优先级最高的玩家
	 * 
	 * @param currentPlayer
	 * @param players
	 * @param room
	 * @param room
	 * @return
	 */
	public static Player getFirstActionPlayer(List<Long> nowPlayerIds, List<Player> players, RoomResp room) {
		List<Player> needCheck = new ArrayList<Player>(4);
		// 按照顺序优先级获取所有玩家集合
		for (Long long1 : nowPlayerIds) {
			for (Player p : players) {
				if (p.getUserId().equals(long1)) {
					needCheck.add(p);
				}
			}
		}
		// 将优先级最高的设置为第一个玩家
		Player firstPlayer = needCheck.get(0);
		// 如果有动作的只有一个人,那么返回此人
		if (needCheck.size() == 1) {
			return firstPlayer;
		}
		// 按照优先级来显示
		Integer firstPlayerAction = firstPlayer.getCurrentActionLevers().get(0);
		Integer otherPlayerAction = 0;
		for (int i = 1; i < needCheck.size(); i++) {
			otherPlayerAction = needCheck.get(i).getCurrentActionLevers().get(0);
			if (firstPlayerAction < otherPlayerAction) {
				firstPlayer = needCheck.get(i);
				firstPlayerAction = needCheck.get(i).getCurrentActionLevers().get(0);
			}
		}
		return firstPlayer;

	}

	/**
	 * --能出的牌肯定不是混牌 检测能否碰 --因为旋风杠可以杠混，导致之后混牌可以打出，如过别人出的是混,自己的混排不能显示碰
	 * 
	 * @param currentPlayer
	 * @param room
	 * @param dongZuoPai
	 * @param room
	 * @return
	 */
	private static List<Integer> checkPeng(Player currentPlayer, Integer dongZuoPai, RoomResp room) {

		// 获取手牌
		List<Integer> currentMjList = currentPlayer.getCurrentMjList();
		// 获取手牌数组集合
		int[] shouPaiArr = getArrFromList(currentMjList);
		// 定义碰杠的集合
		List<Integer> pengGangActionList = new ArrayList<Integer>(2);
		// 检测杠--有杠就有碰
		// 没有杠,检测碰
		if (shouPaiArr[dongZuoPai - 1] >= 2) {// 如果有大于两张这样的牌,添加碰和杠的动作
			pengGangActionList.add(getActionFromPai(dongZuoPai, Cnst.PLAYER_ACTION_PENG));
			return pengGangActionList;
		}
		return null;
	}

	/**
	 * 
	 * 检测玩家吃
	 * 
	 * @param needCheckplayer
	 * @param room
	 * @param dongZuoPai
	 * @return
	 */
	private static List<Integer> checkChi(Player needCheckplayer, RoomResp room, Integer dongZuoPai) {
		// 玩家手牌为4张时,只能碰(构成碰碰胡的话)或者杠
		List<Integer> currentMjList = needCheckplayer.getCurrentMjList();
		List<Integer> chiActionList = null;
		if (dongZuoPai >= 28) {// 风和字牌不检测
			return null;
		} else {// 万饼条检测
			List<Integer> newList = getNewList(currentMjList, null);
			int[] shouPaiArr = getArrFromList(newList);
			chiActionList = new ArrayList<Integer>(3);
			if (dongZuoPai % 9 == 1) {// 1
				// 是否有大1的 和大2的
				if (shouPaiArr[dongZuoPai] > 0 && shouPaiArr[dongZuoPai + 1] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai + 1, Cnst.PLAYER_ACTION_CHI));
				}
			} else if (dongZuoPai % 9 == 2) {// 2
				// 是否有小1的 和大1的
				if (shouPaiArr[dongZuoPai - 2] > 0 && shouPaiArr[dongZuoPai] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai, Cnst.PLAYER_ACTION_CHI));
				}
				// 是否有大1的 和大2的
				if (shouPaiArr[dongZuoPai] > 0 && shouPaiArr[dongZuoPai + 1] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai + 1, Cnst.PLAYER_ACTION_CHI));
				}
			} else if (dongZuoPai % 9 == 8) {// 8
				// 是否有小2的 和小1的
				if (shouPaiArr[dongZuoPai - 3] > 0 && shouPaiArr[dongZuoPai - 2] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai - 1, Cnst.PLAYER_ACTION_CHI));
				}
				// 是否有小1的 和大1的
				if (shouPaiArr[dongZuoPai - 2] > 0 && shouPaiArr[dongZuoPai] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai, Cnst.PLAYER_ACTION_CHI));
				}
			} else if (dongZuoPai % 9 == 0) {// 9
				// 是否有小2的 和小1的
				if (shouPaiArr[dongZuoPai - 3] > 0 && shouPaiArr[dongZuoPai - 2] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai - 1, Cnst.PLAYER_ACTION_CHI));
				}
			} else {// 3--7
					// 是否有小2的 和小1的
				if (shouPaiArr[dongZuoPai - 3] > 0 && shouPaiArr[dongZuoPai - 2] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai - 1, Cnst.PLAYER_ACTION_CHI));
				}
				// 是否有小1的 和大1的
				if (shouPaiArr[dongZuoPai - 2] > 0 && shouPaiArr[dongZuoPai] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai, Cnst.PLAYER_ACTION_CHI));
				}
				// 是否有大1的 和大2的
				if (shouPaiArr[dongZuoPai] > 0 && shouPaiArr[dongZuoPai + 1] > 0) {
					chiActionList.add(getActionFromPai(dongZuoPai + 1, Cnst.PLAYER_ACTION_CHI));
				}
			}

		}
		if (chiActionList == null) {
			return null;
		} else {
			return chiActionList.size() > 0 ? chiActionList : null;
		}
	}

	/**
	 * 能进入此方法肯定可以进行碰杠和暗杠 检测玩家的杠
	 * 
	 * @param currentPlayer
	 * @param room
	 * @param dongZuoPai
	 * @param chuMoType
	 * @return 没有为null
	 */
	private static List<Integer> checkGang(Player currentPlayer, RoomResp room, Integer dongZuoPai, Integer chuMoType) {
		// 如果有动作,会自动加入并且排序 -- 出牌的时候传的null,动作拍的时候也不会传
		List<Integer> newList = getNewList(currentPlayer.getCurrentMjList(), null);
		// 手牌的数组形式
		int[] shouPaiArr = null;
		// 有4个杠就能死他了=.=!!
		Integer action = null;
		List<Integer> gangList = new ArrayList<Integer>(4);
		// 现在混排可以杠
		shouPaiArr = getArrFromList(newList);
		// 获取玩家的动作集合
		List<Action> actionList = currentPlayer.getActionList();
		if (chuMoType.equals(Cnst.CHECK_TYPE_MO)) {// 摸牌检测 --多检测一个碰杠
			// 检测碰里面的杠
			if (actionList != null && actionList.size() > 0) {
				for (Action ac : actionList) {
					// 如果是碰，检测手牌和碰的牌
					if (ac.getType().equals(2)) {
						if (shouPaiArr[ac.getExtra() - 1] == 1) {
							action = getActionFromPai(ac.getExtra(), Cnst.PLAYER_ACTION_GANG);
							gangList.add(action);
						}
					}
				}
			}
			// 手中4张为杠
			for (int i = 0; i < shouPaiArr.length; i++) {
				if (shouPaiArr[i] == 4) {
					action = getActionFromPai(i + 1, Cnst.PLAYER_ACTION_GANG);
					gangList.add(action);
				}
			}
		} else if (chuMoType.equals(Cnst.CHECK_TYPE_CHU)) {// 手中有三张
			// 手中3张为杠 ,且和出的牌一样
			if (shouPaiArr[dongZuoPai - 1] == 3) {
				action = getActionFromPai(dongZuoPai, Cnst.PLAYER_ACTION_GANG);
				gangList.add(action);
			}
		}
		return gangList.size() > 0 ? gangList : null;
	}

	/**
	 * 通过动作寻找牌
	 * 
	 * @param action
	 *            动作
	 * @param dongZuo
	 *            吃或者碰或者杠
	 * @return
	 */
	public static List<Integer> getPaiListFromAction(Integer action, Integer dongZuo) {
		List<Integer> actionList = new ArrayList<Integer>(4);
		if (dongZuo.equals(Cnst.PLAYER_ACTION_CHI)) {
			if (action <= 41) {// 万
				actionList.add(action - 34);
				actionList.add(action - 33);
				actionList.add(action - 32);
			} else if (action >= 49) {// 条
				actionList.add(action - 30);
				actionList.add(action - 29);
				actionList.add(action - 28);
			} else {// 饼
				actionList.add(action - 32);
				actionList.add(action - 31);
				actionList.add(action - 30);
			}
		} else if (dongZuo.equals(Cnst.PLAYER_ACTION_PENG)) {// 并没有用到
			actionList.add(action - 56);
			actionList.add(action - 56);
			actionList.add(action - 56);
		} else if (dongZuo.equals(Cnst.PLAYER_ACTION_GANG)) {
			actionList.add(action - 90);
			actionList.add(action - 90);
			actionList.add(action - 90);
			actionList.add(action - 90);

		}
		return actionList;
	}

	/**
	 * 获取下一个玩家的位置
	 * 
	 * @param position
	 * @return
	 */
	public static Integer getNextPlayerPosition(Integer position) {
		Integer nextPlayerPosition = null;
		if (position == 4) {
			nextPlayerPosition = 1;
		} else {
			nextPlayerPosition = position + 1;
		}
		return nextPlayerPosition;
	}

	/**
	 * 将手牌转换成数组
	 * 
	 * @param newList
	 * @return
	 */
	private static int[] getArrFromList(List<Integer> newList) {
		int[] shouPaiArr = new int[34];
		for (Integer integer : newList) {
			int x = shouPaiArr[integer - 1] + 1;
			shouPaiArr[integer - 1] = x;
		}
		return shouPaiArr;
	}

	/**
	 * 
	 * @param pai
	 *            (引发动作的牌;吃的话,放中间的那张牌;长毛的传能长毛的牌)
	 * @param action
	 *            吃,碰,杠,长毛
	 * @return
	 */
	public static Integer getActionFromPai(Integer pai, Integer dongZuo) {
		Integer action = null;
		if (dongZuo == Cnst.PLAYER_ACTION_CHI) {// 吃
			// 因为传递的时中间那张牌,所以根据中间牌找动作
			if (pai / 9 == 0) {// 万
				action = pai + 33;
			} else if (pai / 9 == 1) {// 饼
				action = pai + 31;
			} else if (pai / 9 == 2) {// 条
				action = pai + 29;
			}
		} else if (dongZuo == Cnst.PLAYER_ACTION_PENG) {// 碰
			action = pai + 56;
		} else if (dongZuo == Cnst.PLAYER_ACTION_GANG) {// 杠
			action = pai + 90;
		}
		return action;
	}

	/**
	 * 获取新的手牌集合(排好序的)
	 * 
	 * @param currentMjList
	 * @param dongZuoPai
	 * @return
	 */
	private static List<Integer> getNewList(List<Integer> currentMjList, Integer dongZuoPai) {
		List<Integer> newList = new ArrayList<Integer>(currentMjList.size() + 1);
		for (Integer pai : currentMjList) {
			newList.add(pai);
		}
		if (dongZuoPai != null) {
			newList.add(dongZuoPai);
		}
		Collections.sort(newList);
		return newList;
	}

	/**
	 * 移除手牌
	 * 
	 * @param list
	 * @param action
	 */
	public static void removePai(List<Integer> list, Integer pai, int needRemovenum) {
		int num = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) == pai) {
				num++;
				list.remove(i);
				if (num == needRemovenum) {
					break;
				}
			}
		}
	}

	/**
	 * 移除出牌玩家的出牌集合
	 * 
	 * @param chuUserId
	 * @param players
	 */
	public static void removeCPG(Long chuUserId, List<Player> players) {
		for (Player player : players) {
			if (player.getUserId().equals(chuUserId)) {
				List<Integer> chuList = player.getChuList();
				chuList.remove(chuList.size() - 1);
			}
		}

	}

	/**
	 * currentMjList中移除集合needRemoveList
	 * 
	 * @param currentMjList
	 * @param chi
	 */
	public static void removeList(List<Integer> currentMjList, List<Integer> needRemoveList) {
		for (int j = needRemoveList.size() - 1; j >= 0; j--) {
			for (int i = currentMjList.size() - 1; i >= 0; i--) {
				if (needRemoveList.get(j) == currentMjList.get(i)) {
					currentMjList.remove(i);
					break;
				}
			}
		}
	}

	/**
	 * 查找currentMjList中num张pai
	 * 
	 * @param currentMjList
	 * @param pai
	 * @return
	 */
	public static Integer containMany(List<Integer> currentMjList, Integer pai) {
		Integer num = 0;
		for (Integer integer : currentMjList) {
			if (pai == integer) {
				num++;
			}
		}
		return num;
	}

	/**
	 * 返回玩家胡的类型 --
	 * 
	 * @param players
	 * @param winPlayer2
	 * @param room
	 * @return
	 */
	public static List<Integer> checkHuInfo(Player winPlayer, RoomResp room) {
		// 获取胡的类型的集合
		List<Integer> huInfoList = winPlayer.getShowList();
		// 获取赢得人的手牌
		List<Integer> currentMjList = winPlayer.getCurrentMjList();
		// 排序
		List<Integer> newList = getNewList(currentMjList, null);
		paiXu(newList);
		int[] shouPaiArr = getArrFromList(newList);

		// 1:七对
		if (newList.size() == 14) {// 七对的手牌数量必须满足14张
			if (checkQiDui(shouPaiArr)) {
				huInfoList.add(Cnst.QIDUI);
			}
		}

		// 对于普通
		// 2.1：必须有19(风和字牌可以顶)--这个检测不需要绝,因为绝前提是手中有3张相同的牌
		Boolean hasYiJiu = false;
		// 为了检测能否飘
		boolean hasChi = false;
		Set<Integer> huaSe = new HashSet<Integer>();
		// 3.1 检测已经有的动作牌
		List<Action> actionList = winPlayer.getActionList();
		if (actionList != null && actionList.size() > 0) {
			for (Action action : actionList) {
				Integer type = action.getType();
				Integer actionId = action.getActionId();
				Integer extra = action.getExtra();
				// 清一色
				if (extra < 32) {
					huaSe.add((extra - 1) / 9);
				}

				if (type.equals(1)) {// 吃
					hasChi = true;
					if (actionId == 35 || actionId == 41 || actionId == 42 || actionId == 48 || actionId == 49 || actionId == 55) {
						hasYiJiu = true;
					}
				} else {
					if (extra == 32) {// 红中
						hasYiJiu = true;
					} else {
						int paiNum = extra % 9;
						if (paiNum == 1 || paiNum == 0) {
							hasYiJiu = true;
						}
					}
				}
			}
		}
		// 3.2 检测手牌--带混的话也已经移除掉了
		for (int i = 0; i < shouPaiArr.length; i++) {
			// 有这张牌
			if (shouPaiArr[i] > 0) {
				// 处理幺九
				if (i < 27) {
					if ((i + 1) % 9 == 1 || (i + 1) % 9 == 0) {
						hasYiJiu = true;
					}
					// 处理三色
					if (i < 9) {
						huaSe.add(0);
					} else if (i < 18) {
						huaSe.add(1);
					} else if (i < 27) {
						huaSe.add(2);
					}
				} else {
					// 中发白可以定19,可以顶刻
					hasYiJiu = true;
				}
			}
		}
		// 没有吃，并且不是七小对
		if (!hasChi && huInfoList.size() == 0) {
			if (checkPengHu(shouPaiArr)) {
				if(hasYiJiu){
					huInfoList.add(Cnst.DAPIAO);
				}else{
					huInfoList.add(Cnst.PIAOHU);
				}
			}
		}
		//不是七对和飘
		if(huInfoList.size()==0){
			boolean isJia=true;
			int num = 0;
			for(int i=1;i<=32;i++){
				shouPaiArr[i-1]++;
				if (Hulib.getInstance().get_hu_info(shouPaiArr, 34, 34)) {
					num++;
					if (num>1) {
						shouPaiArr[i-1]--;
						break;
					}
				}
				shouPaiArr[i-1]--;
			}
			
			if (num!=1) {
				isJia =false;
			}
			//满足夹胡条件，检测是不是真的夹胡
			if(isJia){
				if(checkKaBianDiao(winPlayer, room,hasYiJiu)){
					isJia=true;
					huInfoList.add(Cnst.JIAHU);
				}
			}
			//不是夹胡,就是平胡
			if(!isJia){
				huInfoList.add(Cnst.PINGHU);
			}
		}
		
		// 检测清一色
		if (huaSe.size() == 1) {
			huInfoList.add(Cnst.QINGYISE);
		}

		// 新规定,推倒胡要是满足清一色 也要计算清一色
		return huInfoList;
	}

	
	/**
	 * 返回一个新的集合
	 * @param old
	 * @return
	 */
	public static List<Integer> getNewList(List<Integer> old) {
		List<Integer> newList = new ArrayList<Integer>();
		if (old != null && old.size() > 0) {
			for (Integer pai : old) {
				newList.add( pai );
			}
		}
		return newList;
	}
	
	
	
	/**
	 * 
	 * @param winPlayer
	 * @param room
	 * @param isGuaDaFeng 
	 * @return  0不是夹胡   2边胡 3  吊胡      4卡胡 5无1胡1
	 */
	public static Boolean checkKaBianDiao(Player winPlayer,RoomResp room,boolean hasYiJiu) {
		List<Integer> currentMjList = winPlayer.getCurrentMjList();
		List<Integer> newList = getNewList(currentMjList);
		int size = newList.size();
		Integer dongZuoPai = newList.get(size-1);
		//移除这张牌剩下的牌集合
		newList.remove(size-1);
		//获取手牌的数组集合
		int[] shouPaiArr=new int[34];
		for (Integer integer : newList) {
			 int i = shouPaiArr[integer-1];
			 shouPaiArr[integer-1]=i+1;
		}
		//检测吊
		if(shouPaiArr[dongZuoPai-1]!=0){
			int dongZuoNum = shouPaiArr[dongZuoPai-1];
			shouPaiArr[dongZuoPai-1]=dongZuoNum-1;
			if(Hulib.getInstance().get_hu_info(shouPaiArr, 34, 34)){
				return true;
			}
			//没胡,加回来
			shouPaiArr[dongZuoPai-1]=dongZuoNum;
		}
		//最后那张不能是红中
		if(dongZuoPai!=32){
			//定义动作牌的数子大小
			int dongZuoPaiNum=dongZuoPai%9;
			//检测卡
			//动作牌不能是1和9 ----1,9怎么卡？
			if(dongZuoPaiNum!=1 && dongZuoPaiNum!=0){
				//看比它小1
				int smallOneNum = shouPaiArr[dongZuoPai-2];
				//看比它大1
				//看比它大1和小1的是否存在
				int bigOneNum = shouPaiArr[dongZuoPai];
				if(smallOneNum>0 &&  bigOneNum>0){
					shouPaiArr[dongZuoPai-2]=smallOneNum-1;
					shouPaiArr[dongZuoPai]=bigOneNum-1;
					if(Hulib.getInstance().get_hu_info(shouPaiArr, 34, 34)){
						return true;
					}
					//没胡,加回来
					shouPaiArr[dongZuoPai-2]=smallOneNum;
					shouPaiArr[dongZuoPai]=bigOneNum;
				}
			}
			//检测边  --动作牌是3或者7
			if(dongZuoPaiNum==3){
				//查看比它小2的
				int smallTwoNum = shouPaiArr[dongZuoPai-3];
				//查看比它小1的
				int smallOneNum = shouPaiArr[dongZuoPai-2];
				//看比它小2和小1的是否存在
				if(smallTwoNum>0 && smallOneNum>0){
					shouPaiArr[dongZuoPai-3]=smallTwoNum-1;
					shouPaiArr[dongZuoPai-2]=smallOneNum-1;
					if(Hulib.getInstance().get_hu_info(shouPaiArr, 34, 34)){
						return true;
					}
					//没胡,加回来
					shouPaiArr[dongZuoPai-3]=smallTwoNum;
					shouPaiArr[dongZuoPai-2]=smallOneNum;
				}
			}else if(dongZuoPaiNum==7){
				//查看比它大1的
				int bigOneNum = shouPaiArr[dongZuoPai];
				//查看比它大2的
				int bigTwoNum = shouPaiArr[dongZuoPai+1];
				//看比它大1和大2的是否存在
				if(bigOneNum>0 && bigTwoNum>0){
					shouPaiArr[dongZuoPai]=bigOneNum-1;
					shouPaiArr[dongZuoPai+1]=bigTwoNum-1;
					if(Hulib.getInstance().get_hu_info(shouPaiArr, 34, 34)){
						return true;
					}
					//没胡,加回来
					shouPaiArr[dongZuoPai]=bigOneNum;
					shouPaiArr[dongZuoPai+1]=bigTwoNum;
				}
			}
			//检测特殊： 无一胡一或者无九胡九,如果胡 1,4 但是没1,9(1,9必须存在才胡),那么也算
			//动作牌必须是1或者9
			if(!hasYiJiu){
				if(dongZuoPaiNum==1 || dongZuoPaiNum==0){
				//手牌里面必须没有1,9 和玩家的动作里面必须没有1和9
					//手牌里面没有1,9
					return true;
				}
			}
		}
		return false;
	}
	
	
	

	/**
	 * 检测是不是碰碰胡
	 * 
	 * @param winPlayer
	 * @param shouPaiArr
	 * @param hunNum
	 * @return
	 */
	private static boolean checkPengHu(int[] shouPaiArr) {
		int twoNum = 0;
		// 2： 剩下的牌必须组成砰砰
		for (int i : shouPaiArr) {
			if (i == 4 || i == 1) {
				return false;
			} else if (i == 2) {
				twoNum++;
			}
		}
		if (twoNum == 1) {
			return true;
		}
		return false;
	}


	/**
	 * 
	 * 流局结算和同意解散房间来结算玩家的杠分
	 * 如果是一饼，一条或者红中为大杠
	 * 明杠1  暗杠2  暗杠4
	 * @param players
	 * @param room
	 */
	public static void jiSuanGangScore(List<Player> players, RoomResp room) {
		for (Player player : players) {
			List<Action> actionList = player.getActionList();
			//庄家输赢分数翻倍
			boolean isZhuang=false;
			Long checkUserId = player.getUserId();
			if(checkUserId.equals(room.getZhuangId())){
				isZhuang=true;
			}
			if (actionList != null && actionList.size() > 0) {
				for (Action action : actionList) { // 3点杠 4碰杠 5暗杠,6风杠,7中发白杠,8长毛
					Integer type = action.getType();
					Integer extra;
					if (type.equals(3) || type.equals(4)) {//明杠
						int mingGangScore=1;
						extra = action.getExtra();
						Long toUserId = action.getToUserId();
						Player losePlayer=getPlayerFromUserId(players,toUserId);
						Boolean loseZhuang=false;
						if(!isZhuang){//检测输的人是不是庄
							if(player.getUserId().equals(room.getZhuangId())){
								loseZhuang=true;
							}
						}
						if(extra.equals(10) || extra.equals(19) || extra.equals(32) ){//如果是一饼，一条或者红中为大杠
							mingGangScore*=2;
						}
						if(isZhuang || loseZhuang){
							mingGangScore*=2;
						}
						player.setmGangScore(player.getmGangScore()+mingGangScore);
						losePlayer.setmGangScore(losePlayer.getmGangScore()-mingGangScore);
					} else if (type.equals(5)){// 暗杠
						extra = action.getExtra();
						int anGangScore=2;
						if(extra.equals(10) || extra.equals(19) || extra.equals(32) ){//如果是一饼，一条或者红中为大杠
							anGangScore*=2;
						}
						if(isZhuang ){
							anGangScore*=2;
							player.setaGangScore(player.getaGangScore()+anGangScore*3);
							for (Player player1 : players) {
								if(!player1.getUserId().equals(checkUserId)){
									player1.setaGangScore(player1.getaGangScore()-anGangScore);
									
								}
							}
						}else{
							player.setaGangScore(player.getaGangScore()+anGangScore*4);
							for (Player player1 : players) {
								if(!player1.getUserId().equals(checkUserId)){
									if(player1.getUserId().equals(room.getZhuangId())){
										player1.setaGangScore(player1.getaGangScore()-anGangScore*2);
									}else{
										player1.setaGangScore(player1.getaGangScore()-anGangScore);
									}
								}
							}
						}
					} 
				}
			}
		}
	}

	private static Player getPlayerFromUserId(List<Player> players, Long toUserId) {
		for (Player player : players) {
			if(player.getUserId().equals(toUserId)){
				return player;
			}
		}
		return null;
	}

	public static List<Integer> faPaiQiDui() {
		List<Integer> qiDuiPai = new ArrayList<Integer>();
		qiDuiPai.add(1);
		qiDuiPai.add(1);
		qiDuiPai.add(2);
		qiDuiPai.add(2);
		qiDuiPai.add(3);
		qiDuiPai.add(3);
		qiDuiPai.add(4);
		qiDuiPai.add(4);
		qiDuiPai.add(5);
		qiDuiPai.add(5);
		qiDuiPai.add(6);
		qiDuiPai.add(6);
		qiDuiPai.add(7);
		return qiDuiPai;
	}

	public static Integer getHuLeiXingScoreFromHuXingList(List<Integer> huInfoList) {
		Integer huLeiXingScore = 0;
		for (Integer integer : huInfoList) {
			if (huLeiXingScore == 0) {
				huLeiXingScore = Cnst.huScoreMap.get(integer);
			} else {
				huLeiXingScore *= Cnst.huScoreMap.get(integer);
			}
		}
		return huLeiXingScore;
	}

	public static List<Integer> faGang() {
		List<Integer> qiDuiPai = new ArrayList<Integer>();
		qiDuiPai.add(1);
		qiDuiPai.add(11);
		qiDuiPai.add(3);
		qiDuiPai.add(3);
		qiDuiPai.add(11);
		qiDuiPai.add(1);
		qiDuiPai.add(1);
		qiDuiPai.add(1);
		qiDuiPai.add(3);
		qiDuiPai.add(11);
		qiDuiPai.add(3);
		qiDuiPai.add(11);
		qiDuiPai.add(12);
		return qiDuiPai;
	}

	public static Integer randow() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 27; i <= 34; i++) {
			list.add(i);
		}
		Random r = new Random();
		int nextInt = r.nextInt(7);
		return list.get(nextInt);
	}
	/**
	 * 初始化玩家位置集合
	 * 
	 * @param maxPeople
	 * @return
	 */
	public static List<Integer> initPosition(int maxPeople) {
		List<Integer> positions = new ArrayList<Integer>();
		for (int i = 1; i <= maxPeople; i++) {
			positions.add(i);
		}
		return positions;
	}

}
