# webSocket-example-java

## Enviroiment
 - JDK 19 
 - Spring-boot framework

### frontend
- Use JS for creating WS connection.
const socket = new WebSocket("ws://localhost:8080/test");
This line create connecion with backend.
/test will set as path on backend.

to send message use 
socket.send(message);

Js has syntax for websocket as below.


**Open**

addEventListener("open", (event) => {});

onopen = (event) => {};


**Message**

addEventListener("message", (event) => {});

onmessage = (event) => {};


**error**

addEventListener("error", (event) => {});

onerror = (event) => {};


**close**

addEventListener("close", (event) => {});

onclose = (event) => {};

### Backend
Minimam implments are 
- WebSocketConfigration
- WebSocketHandler

Implment "implements WebSocketConfigurer" and @overide them.
registory.addHandler(new WebSocketHandler(), "/test").setAllowedOrigins("*");
This use path above.
*This webSokectHandler() is not Interface from Spring boot, you need to create class by yourself.

This WebSocketHandler **"extends TextWebSocketHandler"** to write about what message you write on console.


