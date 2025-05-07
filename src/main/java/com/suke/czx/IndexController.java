
package com.suke.czx;

@RestController
public class IndexController {

  @RequestMapping("/")
  public String index(){
    return "success";
  }
}
