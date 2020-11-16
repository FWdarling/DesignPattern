package bridge.entity;

public enum Material {
	Gold("金牌"),
	Silver("银牌"),
	Bronze("铜牌");
	
	public String _material;
	
	private Material(String str) {_material=str;}
	
	public String getMaterial() {return _material;}
}
