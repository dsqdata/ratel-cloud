#ElasticSearch安装与启动

```
注意:ES7.0后自带jdk,所以说本机上没有安装jdk也能运行。
```

### 1.从官网地址下载对应自己电脑的最新版，地址：
https://www.elastic.co/downloads/elasticsearch

### 2.下载到安装包elasticsearch-7.9.2-linux-x86_64.tar.gz，执行下面命令解压。
```
tar -zxvf elasticsearch-7.9.2-linux-x86_64.tar.gz
```
解压完成后生成elasticsearch-7.9.2，进入文件夹，执行启动命令，如下:
```
cd elasticsearch-7.9.2
vi config/elasticsearch.yml
```
参考参数如下:
```shell script
#集群名称
cluster.name: my-application
#节点名称 
node.name: node-1 
#存放数据目录，先创建/home/hadoop/data目录
path.data: /home/hadoop/data
#存放日志目录
path.logs: /home/hadoop/logs
#允许任何ip访问
network.host: 0.0.0.0
#端口
http.port: 9200
#主合格节点引导集群
cluster.initial_master_nodes: ["node-1"]
```
执行启动命令:
```shell script
bin/elasticsearch
```
### 3.启动成功后，执行curl http://localhost:9200/或者在浏览器输入地址http://localhost:9200/：，查看ES信息，结果如下:
```
{
  "name" : "node0",
  "cluster_name" : "hadoop",
  "cluster_uuid" : "ZqG62TggSEmJl4W2SrxWuw",
  "version" : {
    "number" : "7.2.0",
    "build_flavor" : "default",
    "build_type" : "tar",
    "build_hash" : "508c38a",
    "build_date" : "2019-06-20T15:54:18.811730Z",
    "build_snapshot" : false,
    "lucene_version" : "8.0.0",
    "minimum_wire_compatibility_version" : "6.8.0",
    "minimum_index_compatibility_version" : "6.0.0-beta1"
  },
  "tagline" : "You Know, for Search"
}
```

### 4.ES已经安装完成，下面安装一个ES插件，执行下面命令:
```shell script
cd elasticsearch-7.2.0
//安装插件
bin/elasticsearch-plugin install analysis-icu
//查看插件
bin/elasticsearch-plugin list
//查看安装的插件
GET http://localhost:9200/_cat/plugins?v
```

