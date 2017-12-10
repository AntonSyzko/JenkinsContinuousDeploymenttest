package com.example.jenkinscd;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

private Logger logger = LoggerFactory.getLogger(MainController.class);

  @RequestMapping("/indexpage")
  // @ResponseBody
  public String index() {
    logger.info(" accessing index page !!!");
    return "hello.html";
  }

}
