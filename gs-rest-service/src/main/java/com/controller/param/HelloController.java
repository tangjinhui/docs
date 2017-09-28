package com.controller.param;
//package com.controller.name;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//@ComponentScan
//public class HelloController {
//    @RequestMapping("/hello")
//    public ModelAndView hello() {
//        ModelAndView mv = new ModelAndView("hello");
//        return mv;
//    }
//
////    public static void main(String[] args) {
////        //1===============================测试截取==============================1
////        String str = "[1,3,4]";
////        String[] split = str.replace("[", "").replace("]", "").replace(" ", "").split(",");
////        StringBuilder bigDataProducts = new StringBuilder();
////        for (String string : split) {
////            if (bigDataProducts.length() > 0) {
////                bigDataProducts.append("-");
////            }
////            bigDataProducts.append(string);
////        }
////        System.out.println(bigDataProducts.toString());
////        //1===============================测试截取==============================1
////        //2===============================测试Integer的最大存储==============================2start
////        System.out.println(Integer.MAX_VALUE);
////        //2===============================测试Integer的最大存储==============================2end
////        //3===============================测试通用实例化map==============================3start
////        Map<Long, Object> newInstance = CommonUtils.newInstanceMap();
////        newInstance.put(1L, "1");
////        newInstance.put(2L, "2");
////        newInstance.put(3L, "3");
////        newInstance.put(4L, "4");
////        Map<String, Object> newInstanceMap = CommonUtils.newInstanceMap();
////        newInstanceMap.put("1", "1");
////        newInstanceMap.put("2", "2");
////        newInstanceMap.put("3", "3");
////        newInstanceMap.put("4", "4");
////        System.out.println(newInstance);
////        System.out.println(newInstanceMap);
////        //3===============================测试通用实例化map==============================3start
////
////    }
//}
