package com.uisftech.websocket.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@RestController
@RequestMapping("/api/ws")
public class WebSocketController {
	
	@Autowired
	ServerEndpointExporter server;
	
	public WebSocketController(ServerEndpointExporter server) {
		super();
		this.server = server;
	}

	/**
     * 群发消息内容
     * @param message
     * @return
     */
    @GetMapping("/sendAll")
    public String sendAllMessage(@RequestParam(required=true) String message){
        try {
            WebSocketServer.BroadCastInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }
    
    /**
     * 指定会话ID发消息
     * @param message 消息内容
     * @param id 连接会话ID
     * @return
     */
    @GetMapping("/sendOne")
    public String sendOneMessage(@RequestParam(required=true) String message,@RequestParam(required=true) String id){
        try {
            WebSocketServer.SendMessage(message,id);
            
            server.getClass();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
