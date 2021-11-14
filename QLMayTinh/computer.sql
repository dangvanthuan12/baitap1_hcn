create database ComputerManager

go
use ComputerManager
create table tblPhonghoc
(
	msPhong nvarchar(10) primary key,
	tenPhong nvarchar(50),
	toaNha nvarchar(50),
	tangLau int check(tangLau>0 and tangLau<=15)
);
go
create table tblMaytinh
(
	msMay nvarchar(10) primary key,
	CPU nvarchar(100),
	HardDisk nvarchar(100),
	RAM nvarchar(100),
	VGA nvarchar(100),
	Monitor nvarchar(100),	
	msPhong nvarchar(10) constraint fk_PH_MT foreign key references tblPhonghoc(msPhong) on delete cascade on update cascade,	
);

--insert RECORD
--tblPhonghoc
insert into tblPhonghoc values('H2.1','Ph�ng H2.01','Nh� H',2);
insert into tblPhonghoc values('H2.2','Ph�ng H2.02','Nh� H',2);
insert into tblPhonghoc values('H3.1','Ph�ng H3.01','Nh� H',3);
insert into tblPhonghoc values('H3.2','Ph�ng H3.01','Nh� H',3);
insert into tblPhonghoc values('X4.3','Ph�ng X4.03','Nh� X',4);
insert into tblPhonghoc values('H5.1','Ph�ng H5.01','Nh� H',5);
insert into tblPhonghoc values('H5.2','Ph�ng H5.02','Nh� H',5);
--tblMaytinh
insert into tblMaytinh values('01','Intel P4 3.2 GB','120GB','1024 MB','onboard','Samsung','H2.1');
insert into tblMaytinh values('02','AMD K7 3200+','160GB','2048 MB','Ati','Sony LCD 15"','H2.1');
insert into tblMaytinh values('03','Intel P5 6.4 GB','240GB','2048 MB','onboard','Dell','H2.1');
insert into tblMaytinh values('04','Intel P4 3.2 GB','120GB','1024 MB','onboard','Samsung','H2.2');
insert into tblMaytinh values('05','AMD K7 3200+','160GB','2048 MB','Ati','Sony LCD 15"','H2.2');
insert into tblMaytinh values('06','Intel P5 6.4 GB','240GB','2048 MB','onboard','Dell','H2.2');
insert into tblMaytinh values('07','Intel P4 3.2 GB','120GB','1024 MB','onboard','Samsung','H5.1');
insert into tblMaytinh values('08','AMD K7 3200+','160GB','2048 MB','Ati','Sony LCD 15"','H5.1');
insert into tblMaytinh values('09','Intel P5 6.4 GB','240GB','2048 MB','onboard','Dell','H5.1');

