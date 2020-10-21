#Logstash安装与启动

```
注意:安装Logstash需要先安装JDK。
```

### 1.下载Logstash
   https://www.elastic.co/cn/downloads/logstash

### 2.下载完成后执行以下命令解压：
```
tar -xzvf logstash-7.9.2.tar.gz
```

### 3.编辑配置文件,把一些测试数据导入ES，如下:
```
input {
  file {
    path => "/home/hadoop/lib/data/movies.csv"
    start_position => "beginning"
    sincedb_path => "/dev/null"
  }
}
filter {
  csv {
    separator => ","
    columns => ["id","content","genre"]
  }

  mutate {
    split => { "genre" => "|" }
    remove_field => ["path", "host","@timestamp","message"]
  }

  mutate {

    split => ["content", "("]
    add_field => { "title" => "%{[content][0]}"}
    add_field => { "year" => "%{[content][1]}"}
  }

  mutate {
    convert => {
      "year" => "integer"
    }
    strip => ["title"]
    remove_field => ["path", "host","@timestamp","message","content"]
  }
}
output {
   elasticsearch {
     hosts => "http://192.168.216.128:9200"
     index => "movies"
     document_id => "%{id}"
   }
  stdout {}
}

```

### 4.启动Logstash,执行如下命令,控制台打印下面日志。
```shell script
cd logstash-7.2.0
bin/logstash -f config/logstash.conf
```
### 5.数据导入成功，查看ES里面是否有数据
