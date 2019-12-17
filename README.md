# websocket
1.java -jar websocket.jar --server.port=8080
2.地址：http://127.0.0.1:8080/index.html
3.地址：http://127.0.0.1:8080/sample.html
4.在postman或浏览器中打开：`127.0.0.1:8080/api/ws/sendOne?message=hello how are you?&id=3`,中`id`为`session`的`ID`值。
5.给所有节点发送信息：`127.0.0.1:8080/api/ws/sendAll?message=hello`
