package DAO;

/**
 * description: 数据访问对象接口
 * data: 11/13/20 22:54 PM
 * author: cjsmt
 */
public interface AnimalDao {
    /**
     * Get the Animal Data.
     * @return
     */
    public Animal getAnimal();

    /**
     * Update Animal Data.
     * @param animal
     */
    public void updateAnimal(Animal animal);
}
