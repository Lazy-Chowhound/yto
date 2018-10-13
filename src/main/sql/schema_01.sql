#######�����ְԱ��

���¹���

����
�Ա�
����
����
����
�绰
ѧ��
��ͥסַ
��ͥ��Ա
������ϵ�绰
����
���֤
��ְʱ��
��������/�ŵ�
����

#######��½��
id
����
�绰
����
ͷ��
openid
����(md5)
ע��ʱ��
����ʱ��
״̬

#######������ϸ��Ϣ��
id(Ψһ����)
��ʵ����(����Ϊ��)
���֤����(����Ϊ��)
�Ա�(Ĭ��Ϊ��)
����
ͼƬurl(�������ڴ���ϴ�������֤��ͼƬ�������ֶΣ�Ĭ��Ϊ��)
����סַ(Ĭ��Ϊ��)
��ͥ��Ա
ѧ��
������ϵ�绰
ע������
��������
active(״̬)
��½id ->���(��½��)
�������(��ʵ���������֤����)

#######������ص���Ϣ
id
����
����
������(ֱ���ϼ�����)
����
�Ա�
����
��ְʱ��
��������/�ŵ�
ע��ʱ��
����ʱ��
״̬
��½id ->���(��½��)

#############��һ�׶�################

#######��ǩ��

id
����
ǩ��ʱ��
ǩ���ص�
ǩ��ʱ��
ǩ�˵ص�
������ص���Ϣid->���(������ص���Ϣ)
ע��ʱ��
����ʱ��
״̬




#############���ݿ⽨��##############

-- ɾ�����ݿ�
drop database yto;

-- �������ݿ�
create database yto;

-- ʹ�����ݿ�
use yto;

-- ������½��
create table yto_login(
	login_id bigint AUTO_INCREMENT primary key COMMENT '��½id', 
	login_username varchar(32) NOT NULL COMMENT '��½�û���',
	login_password varchar(50) NOT NULL COMMENT '��½����md5ֵ',
	login_phone_number varchar(16) NOT NULL COMMENT '��½�ֻ���',
	login_email varchar(32) COMMENT '����',
	wechat_openid varchar(40) NOT NULL COMMENT '΢��openid',
	header_url varchar(128) NOT NULL COMMENT '�û�ͷ��',
	user_type int NOT NULL default 2 COMMENT '�û����� 1��ʾ��ͨ�û� 2��ʾԱ�� -1��ʾע��',
	create_time DATETIME NOT NULL COMMENT '�û��ɹ�����ʱ��',
	update_time DATETIME NOT NULL COMMENT '�û�������ʱ��',
	index idx_phone_number(login_phone_number), 
	index idx_openid(wechat_openid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��½��';

-- ����Ա����ϸ��Ϣ��
create table staff_detail(
	detail_id bigint AUTO_INCREMENT primary key COMMENT '��ϸ��Ϣid',
	real_name varchar(32) NOT NULL COMMENT '��ʵ����',
	id_card_number varchar(32) NOT NULL COMMENT '���֤����',
	sex tinyint(1) default null COMMENT '�Ա� 0 �� 1 Ů',
	birth DATE default null COMMENT '����',
	address varchar(128) default null COMMENT '����סַ',
	img_url varchar(500) default null COMMENT 'ͼ��url',
	members varchar(128) default null COMMENT '��ͥ��Ա',
	education varchar(128) default null COMMENT 'ѧ��',
	emer_phone varchar(128) default null COMMENT '������ϵ�绰',
	create_time DATETIME NOT NULL COMMENT '��ϸ��Ϣ����ʱ��',
	update_time DATETIME NOT NULL COMMENT '��ϸ��Ϣ������ʱ��',
	active int default 0 COMMENT '0 ��ʾΪ��֤ 1 ��ʾ��֤ͨ�� -1 ��ʾ��֤ʧ��',
	login_id bigint COMMENT '��½id , һ�㲻������Լ��', 
	index idx_login_id(login_id),
	unique index idx_name_card(real_name , id_card_number)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ա����ϸ��Ϣ��';

-- ������ص���Ϣ
create table work_info(
	work_id bigint AUTO_INCREMENT primary key COMMENT '���������Ϣid',
	name varchar(32) NOT NULL COMMENT '��ʵ����',
	num varchar(32) NOT NULL COMMENT '����',
	parent_num varchar(32) NOT NULL COMMENT 'ֱ���ϼ�����',
	department varchar(32) default NULL COMMENT '��������',
	sex tinyint(1) default null COMMENT '�Ա� 0 �� 1 Ů',
	birth DATE default null COMMENT '����',
	join_time DATETIME NOT NULL COMMENT '��ְʱ��',
	work_place varchar(64) default null COMMENT '��������/�ŵ�',
	create_time DATETIME NOT NULL COMMENT '����ʱ��',
	update_time DATETIME NOT NULL COMMENT '������ʱ��',
	active int default 0 COMMENT '0 ��ʾΪ��֤ 1 ��ʾ��֤ͨ�� -1 ��ʾ��֤ʧ��',
	login_id bigint COMMENT '��½id , һ�㲻������Լ��', 
	index idx_login_id(login_id),
	index idx_num(num),
	index idx_parent_num(parent_num),
	index idx_work_place(work_place)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='������ص���Ϣ��';

#############��һ�׶�################














