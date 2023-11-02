package com.example.webSocket.Handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

public class WebSocketHandler extends TextWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("Success to connect with web socket");
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage textMessage) {
        System.out.println("Received message" + textMessage.getPayload());

        try {
            TextMessage outputMessage = new TextMessage("Send message : contents = " + textMessage.getPayload());
            session.sendMessage(outputMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("WebSocket is closed");
    }


}
