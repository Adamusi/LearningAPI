package com.Enum;


import org.apache.commons.lang3.StringUtils;

/**
 * @Author: liqs
 * @Description: changeState枚举
 * @DateTime: 2021/9/1 16:34
 **/
public enum ChangeStateEnum {
	ADD("0", "add"), //设立
	ADJUST("2", "adjust"), //调整
	MERGE("3", "merge"), //合并
	SPLIT("4", "split"), //拆分
	REVOKE("5", "revoke"), //撤销
	UNREVOKE("6", "unrevoke"), //启用
    TRANSFER("7", "transfer"), //转移
	RENAME("9", "rename"); //改名

	private String code;
	private String name;

	ChangeStateEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	ChangeStateEnum() {
	}

	public static ChangeStateEnum getNameByCode(String code)throws Exception {
		if (StringUtils.isEmpty(code)) {
			throw new Exception("变更类型为null");
		}
		for (ChangeStateEnum enums : ChangeStateEnum.values()) {
			if (enums.getCode().equals(code)) {
				return enums;
			}
		}
		throw new Exception("变更类型与枚举不符");
	}


}
