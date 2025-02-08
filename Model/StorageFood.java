package Model;
import java.util.ArrayList;

public class StorageFood {
    private ArrayList<Food> foodList = new ArrayList<>();

    public StorageFood() {
        foodList.add(new FreshFood(256145, 1, 1, 2024));
        foodList.add(new CannedFood(521980, 1, 11, 2025));
        foodList.add(new CannedFood(688914, 22, 5, 2020));
        foodList.add(new PickledFood(946174, 19, 10, 2030));
        foodList.add(new CannedFood(759250, 26, 11, 2029));
        foodList.add(new FreshFood(640265, 15, 7, 2016));
        foodList.add(new FreshFood(586668, 2, 3, 2030));
        foodList.add(new FreshFood(732432, 13, 4, 2020));
        foodList.add(new PickledFood(703178, 15, 2, 2015));
        foodList.add(new CannedFood(637861, 11, 1, 2026));
        foodList.add(new CannedFood(400461, 17, 6, 2021));
        foodList.add(new FreshFood(365253, 17, 1, 2027));
        foodList.add(new CannedFood(269899, 9, 6, 2030));
        foodList.add(new FreshFood(960507, 26, 1, 2016));
        foodList.add(new FreshFood(402284, 27, 5, 2024));
        foodList.add(new PickledFood(199433, 20, 12, 2030));
        foodList.add(new CannedFood(799141, 11, 12, 2028));
        foodList.add(new FreshFood(962691, 23, 3, 2029));
        foodList.add(new PickledFood(731276, 20, 8, 2027));
        foodList.add(new PickledFood(342226, 7, 4, 2028));
        foodList.add(new PickledFood(244258, 8, 9, 2025));
        foodList.add(new PickledFood(147688, 6, 1, 2015));
        foodList.add(new PickledFood(283181, 11, 11, 2020));
        foodList.add(new FreshFood(272861, 10, 9, 2020));
        foodList.add(new PickledFood(570181, 28, 1, 2016));
        foodList.add(new CannedFood(985297, 20, 10, 2017));
        foodList.add(new CannedFood(433179, 14, 10, 2023));
        foodList.add(new CannedFood(541575, 10, 3, 2028));
        foodList.add(new CannedFood(422617, 16, 8, 2024));
        foodList.add(new CannedFood(276205, 9, 10, 2027));
        foodList.add(new CannedFood(769829, 5, 9, 2016));
        foodList.add(new CannedFood(943758, 7, 5, 2017));
        foodList.add(new CannedFood(983151, 24, 1, 2029));
        foodList.add(new FreshFood(933403, 18, 4, 2025));
        foodList.add(new CannedFood(819773, 20, 11, 2024));
        foodList.add(new CannedFood(179356, 1, 5, 2025));
        foodList.add(new PickledFood(775655, 3, 1, 2030));
        foodList.add(new FreshFood(756846, 17, 3, 2015));
        foodList.add(new CannedFood(605912, 26, 8, 2016));
        foodList.add(new CannedFood(661786, 11, 8, 2020));
        foodList.add(new PickledFood(100768, 4, 2, 2015));
        foodList.add(new PickledFood(495732, 8, 2, 2028));
        foodList.add(new PickledFood(314438, 12, 4, 2026));
        foodList.add(new PickledFood(721371, 28, 3, 2028));
        foodList.add(new FreshFood(827814, 6, 2, 2017));
        foodList.add(new CannedFood(550331, 12, 7, 2026));
        foodList.add(new FreshFood(280066, 25, 3, 2017));
        foodList.add(new FreshFood(646508, 14, 2, 2018));
        foodList.add(new CannedFood(238234, 2, 9, 2020));
        foodList.add(new CannedFood(464983, 6, 10, 2020));
    }

    public ArrayList getList(){
        return foodList;
    }
}
