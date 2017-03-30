## 2017��3��22�� ����
##  ���˲� ������

CREATE TABLE HELP_INFO(
  id INT AUTO_INCREMENT PRIMARY KEY ,#���
  category INT,                        #����
  content VARCHAR(255),                #����
  destination_from VARCHAR(100),      #Ŀ�ĵ�(��)
  destination_to VARCHAR(100),        #Ŀ�ĵ�(ȥ)
  tip FLOAT ,                           #���ͽ��
  accepter_id INT ,                     #�ӵ��˱��
  deadline TIMESTAMP,                   #������ʱ��
  state_num INT                         #״̬��
)
  ## ״̬��:
  ##  0 . δ�ӵ� δ��� δ����
  ##  1 . �ӵ� δ��� δ����
  ##  2 . �ӵ� ��� δ����
  ##  3 . �ӵ� ��� ����
  
  
  ## 2017��3��30�� ����
  ##  version 2
  ##   ���˲�
  ##  ����˴�����id,��Ҫ�����ֶ�
  
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