package entity;

public enum Material {
	Gold("金牌"),
	Silver("银牌"),
	Bronze("铜牌");
	
	public String _material;
	
	private Material(String str) {_material=str;}

	/**
	 * 获取材质名称
	 * @return String
	 */
	public String getMaterial() {return _material;}
}
