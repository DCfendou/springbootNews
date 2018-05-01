package com.yangkun.metas;

public enum Type {
	
	TEXT,
	HTML,
	WIKI;
	
	public String getName(){
		return this.name();
	}
	
	public int getOrdinal(){
		return this.ordinal();
	}
}
