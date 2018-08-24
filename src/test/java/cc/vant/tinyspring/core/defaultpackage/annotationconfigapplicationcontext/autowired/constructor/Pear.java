package cc.vant.tinyspring.core.defaultpackage.annotationconfigapplicationcontext.autowired.constructor;

import cc.vant.tinyspring.core.annotations.Autowired;
import cc.vant.tinyspring.core.annotations.Bean;
import cc.vant.tinyspring.core.defaultpackage.annotationconfigapplicationcontext.autowired.Apple;

/**
 * @author Vant
 * @version 2018/8/10 下午 11:34
 */
@Bean
public class Pear {

    private Apple apple;

    @Autowired
    public Pear(Apple apple) {
        this.apple = apple;
    }

    public Apple getApple() {
        return apple;
    }
}