## 2017年3月22日 周三
##  刘宜博 刘甜甜

CREATE TABLE HELP_INFO(
  id INT AUTO_INCREMENT PRIMARY KEY ,#编号
  category INT,                        #种类
  content VARCHAR(255),                #内容
  destination_from VARCHAR(100),      #目的地(从)
  destination_to VARCHAR(100),        #目的地(去)
  tip FLOAT ,                           #悬赏金额
  accepter_id INT ,                     #接单人编号
  deadline TIMESTAMP,                   #最迟完成时间
  state_num INT                         #状态码
)
  ## 状态码:
  ##  0 . 未接单 未完成 未评价
  ##  1 . 接单 未完成 未评价
  ##  2 . 接单 完成 未评价
  ##  3 . 接单 完成 评价
  
  
  ## 2017年3月30日 周四
  ##  version 2
  ##   刘宜博
  ##  添加了创建人id,需要人数字段
  
  CREATE TABLE `help_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `destination_from` varchar(100) DEFAULT NULL,
  `destination_to` varchar(100) DEFAULT NULL,
  `tip` float DEFAULT NULL,
  `accepter_id` int(11) DEFAULT NULL,
  `deadline` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `state_num` int(11) DEFAULT NULL,
  `need_person` int(11) DEFAULT NULL,
  `creator_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8