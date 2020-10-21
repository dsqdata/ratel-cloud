#Kibana安装与启动

### 1.安装Kibana前先安装ElasticSearch。

### 2.下载Kibana,下载地址：
https://www.elastic.co/cn/downloads/kibana

### 3.下载完成后执行下面命令进行解压
```
tar -xzvf kibana-7.9.2-linux-x86_64
```
### 4.解压完成后修改Kibana的配置文件，如下:
```shell script
cd kibana-7.9.2-linux-x86_64
vi config/kibana.yml 
#端口
server.port: 5601
#服务Ip
server.host: "192.168.216.128"
#服务名
server.name: "kibana"
#ES地址
elasticsearch.hosts: ["http://192.168.216.128:9200"]
```
### 5.配置完成，先启动ES,再启动Kibana。
```shell script
#启动ES
cd elasticsearch-7.9.2
bin/elasticsearch
#成功后启动Kibana
kibana-7.9.2-linux-x86_64/bin/kibana
```
### 6.Kibana启动成功，在浏览器输入http://192.168.216.128:5601/,可以看到Kibana界面。
