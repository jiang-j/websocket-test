package com.jiangj.websocket_test.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created by jiangjian on 2018/7/19.
 */
@Controller
public class SendAllController {

    @Autowired
    private WebSocketServer webSocketServer;

    @RequestMapping("/sendAll")
    @ResponseBody
    public String sendAll(@RequestParam(name = "message",required = true) String message) throws IOException {
        webSocketServer.sendInfo(message);
        return "send success!";
    }
}
