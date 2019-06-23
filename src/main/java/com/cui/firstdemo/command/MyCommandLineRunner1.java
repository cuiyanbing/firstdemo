package com.cui.firstdemo.command;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author cui
 * @since 创建时间：2019/6/20 19:12
 * 启动时，添加系统任务
 * Order注解描述执行顺序，数字越小越先执行
 */
//@Component
//@Order(1)
//public class MyCommandLineRunner1 implements CommandLineRunner {
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Runner1--->" + Arrays.toString(args));
//    }
//}

@Component
@Order(1)
class MyApplicationRunner1 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("1--nonOptionArgs--->" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String optionName : optionNames) {
            System.out.println("1--key:" + optionName + "; value: " + args.getOptionValues(optionName));
        }
    }
}

//@Component
//@Order(2)
//public class MyCommandLineRunner2 implements CommandLineRunner {
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Runner2--->" + Arrays.toString(args));
//    }
//}

@Component
@Order(2)
class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("2--nonOptionArgs--->" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String optionName : optionNames) {
            System.out.println("2--key:" + optionName + "; value: " + args.getOptionValues(optionName));
        }
    }
}
