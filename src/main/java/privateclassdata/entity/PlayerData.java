package privateclassdata.entity;

//import java.io.Serializable;
public class PlayerData /*implements Serializable*/ {
	//运动员的基本信息
	private String _id;
	private String _name;
	private String _animalType;
	
	/**
	 * 无参构造函数
	 */
	public PlayerData(){
		this._id="Unknown";
		this._name="Unknown";
		this._animalType="Unknown";
		System.out.println("运动员信息类创建完毕");
	}
	
	/**
	 * 有参构造函数
	 * @param id-运动员Id;name-运动员姓名;animalType-运动员动物种类;
	 */
	public PlayerData(String id,String name,String animalType) {
		this();
		this._id=id;
		this._name=name;
		this._animalType=animalType;
	}
	
	/**
	 * 获取运动员id
	 * @return String playerId
	 */
	public String getPlayerId() {return _id;}
	
	/**
	 * 编辑设置运动员id
	 * @param id-重设定的运动员参数
	 */
	public void setPlayerId(String id) {
		this._id=id;
		System.out.println("运动员ID重新设置成功");
	}
	
	/**
	 * 获取运动员姓名
	 * @return String playerName
	 */
	public String getPlayerName() {return _name;}
	
	/**
	 * 编辑运动员姓名
	 * @param name 重设定的运动员姓名
	 */
	public void setPlayerName(String name) {
		this._name=name;
		System.out.println("运动员姓名重新设置成功");
	}
	
	/**
	 * 获取运动员动物类型
	 * @return animalType
	 */
	public String getPlayerType() {return _animalType;}
	
	/**
	 * 编辑运动员动物类型
	 * @param animalType-重设定的运动员动物类型
	 */
	public void setPlayerType(String animalType) {
		this._animalType=animalType;
		System.out.println("运动员动物类型重新设置成功");
	}
	
	/**
	 * 打印运动员信息
	 */
	public void printPlayerInfo() {
		System.out.println("运动员id:"+_id);
		System.out.println("运动员姓名:"+_name);
		System.out.println("运动员动物类型:"+_animalType);
	}
	
}
