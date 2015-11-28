package com.imoc.kq;

import java.util.Comparator;

public class TableK implements Comparable<TableK>, Comparator<TableK> {
	private int			id;
	private Enum<HuiK>	hus;
	private String		daxiao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Enum<HuiK> getHus() {
		return hus;
	}

	public void setHus(Enum<HuiK> hus) {
		this.hus = hus;
	}

	public String getDaxiao() {
		return daxiao;
	}

	public void setDaxiao(String daxiao) {
		this.daxiao = daxiao;
	}

	@Override
	public String toString() {
		return hus + daxiao;
	}

	@Override
	public int compareTo(TableK o) {
		if (o.getId() == this.getId()) {
			if (this.getHus().name().equals(HuiK.黑桃)) {
				return 1;
			} else if (this.getHus().name().equals(HuiK.红桃) && !o.getHus().name().equals(HuiK.黑桃)) {
				return 1;
			} else if (this.getHus().name().equals(HuiK.梅花) && o.getHus().name().equals(HuiK.方块)) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return this.getId() - o.getId();
		}
	}

	public TableK() {
		super();
	}

	public TableK(Enum<HuiK> hus, String daxiao) {
		super();
		this.hus = hus;
		this.daxiao = daxiao;
	}

	public TableK(int id, Enum<HuiK> hus, String daxiao) {
		super();
		this.id = id;
		this.hus = hus;
		this.daxiao = daxiao;
	}

	@Override
	public int compare(TableK o2, TableK o) {
		if (o.getId() == o2.getId()) {
			if (o2.getHus().name().equals(HuiK.黑桃)) {
				return 1;
			} else if (o2.getHus().name().equals(HuiK.红桃) && !o.getHus().name().equals(HuiK.黑桃)) {
				return 1;
			} else if (o2.getHus().name().equals(HuiK.梅花) && o.getHus().name().equals(HuiK.方块)) {
				return 1;
			} else {
				return -1;
			}
		}
		return o2.getId() - o.getId();
	}
}
