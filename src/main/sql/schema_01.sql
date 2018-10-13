#######针对在职员工

人事管理：

姓名
性别
工号
部门
年龄
电话
学历
家庭住址
家庭人员
紧急联系电话
邮箱
身份证
入职时间
工作地区/门店
户籍

#######登陆表
id
姓名
电话
邮箱
头像
openid
密码(md5)
注册时间
更改时间
状态

#######个人详细信息表
id(唯一主键)
真实姓名(不能为空)
身份证号码(不能为空)
性别(默认为空)
生日
图片url(可能用于存放上传上来的证件图片，保留字段，默认为空)
户籍住址(默认为空)
家庭成员
学历
紧急联系电话
注册日期
更新日期
active(状态)
登陆id ->外键(登陆表)
混合索引(真实姓名，身份证号码)

#######工作相关的信息
id
姓名
工号
父工号(直接上级工号)
部门
性别
生日
入职时间
工作地区/门店
注册时间
更改时间
状态
登陆id ->外键(登陆表)

#############第一阶段################

#######打卡签到

id
工号
签到时间
签到地点
签退时间
签退地点
工作相关的信息id->外键(工作相关的信息)
注册时间
更改时间
状态




#############数据库建表##############

-- 删除数据库
drop database yto;

-- 创建数据库
create database yto;

-- 使用数据库
use yto;

-- 创建登陆表
create table yto_login(
	login_id bigint AUTO_INCREMENT primary key COMMENT '登陆id', 
	login_username varchar(32) NOT NULL COMMENT '登陆用户名',
	login_password varchar(50) NOT NULL COMMENT '登陆密码md5值',
	login_phone_number varchar(16) NOT NULL COMMENT '登陆手机号',
	login_email varchar(32) COMMENT '邮箱',
	wechat_openid varchar(40) NOT NULL COMMENT '微信openid',
	header_url varchar(128) NOT NULL COMMENT '用户头像',
	user_type int NOT NULL default 2 COMMENT '用户类型 1表示普通用户 2表示员工 -1表示注销',
	create_time DATETIME NOT NULL COMMENT '用户成功创建时间',
	update_time DATETIME NOT NULL COMMENT '用户最后更新时间',
	index idx_phone_number(login_phone_number), 
	index idx_openid(wechat_openid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登陆表';

-- 创建员工详细信息表
create table staff_detail(
	detail_id bigint AUTO_INCREMENT primary key COMMENT '详细信息id',
	real_name varchar(32) NOT NULL COMMENT '真实姓名',
	id_card_number varchar(32) NOT NULL COMMENT '身份证号码',
	sex tinyint(1) default null COMMENT '性别 0 男 1 女',
	birth DATE default null COMMENT '生日',
	address varchar(128) default null COMMENT '户籍住址',
	img_url varchar(500) default null COMMENT '图像url',
	members varchar(128) default null COMMENT '家庭成员',
	education varchar(128) default null COMMENT '学历',
	emer_phone varchar(128) default null COMMENT '紧急联系电话',
	create_time DATETIME NOT NULL COMMENT '详细信息创建时间',
	update_time DATETIME NOT NULL COMMENT '详细信息最后更新时间',
	active int default 0 COMMENT '0 表示为认证 1 表示认证通过 -1 表示认证失败',
	login_id bigint COMMENT '登陆id , 一般不会加外键约束', 
	index idx_login_id(login_id),
	unique index idx_name_card(real_name , id_card_number)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工详细信息表';

-- 工作相关的信息
create table work_info(
	work_id bigint AUTO_INCREMENT primary key COMMENT '工作相关信息id',
	name varchar(32) NOT NULL COMMENT '真实姓名',
	num varchar(32) NOT NULL COMMENT '工号',
	parent_num varchar(32) NOT NULL COMMENT '直接上级工号',
	department varchar(32) default NULL COMMENT '所属部门',
	sex tinyint(1) default null COMMENT '性别 0 男 1 女',
	birth DATE default null COMMENT '生日',
	join_time DATETIME NOT NULL COMMENT '入职时间',
	work_place varchar(64) default null COMMENT '工作地区/门店',
	create_time DATETIME NOT NULL COMMENT '创建时间',
	update_time DATETIME NOT NULL COMMENT '最后更新时间',
	active int default 0 COMMENT '0 表示为认证 1 表示认证通过 -1 表示认证失败',
	login_id bigint COMMENT '登陆id , 一般不会加外键约束', 
	index idx_login_id(login_id),
	index idx_num(num),
	index idx_parent_num(parent_num),
	index idx_work_place(work_place)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工作相关的信息表';

#############第一阶段################














