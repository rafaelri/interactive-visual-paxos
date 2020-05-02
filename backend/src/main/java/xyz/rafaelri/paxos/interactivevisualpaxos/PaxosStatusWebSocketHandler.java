package xyz.rafaelri.paxos.interactivevisualpaxos;

import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;

@Component
public class PaxosStatusWebSocketHandler extends TextWebSocketHandler {
        List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

        public void handleTextMessage(WebSocketSession session, TextMessage message) {
                for (WebSocketSession webSocketSession : sessions) {
                        try {
                                webSocketSession.sendMessage(message);
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
		}
        }

        public void afterConnectionEstablished(WebSocketSession session) throws Exception {
                sessions.add(session);
        }

}