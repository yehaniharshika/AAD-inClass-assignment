package lk.ijse.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.constrast.GoodFood;

public class Mahesh{
    private GoodFood goodFood;

    @PostConstruct
    public void init(){
        goodFood.likeFood();
    }
}
