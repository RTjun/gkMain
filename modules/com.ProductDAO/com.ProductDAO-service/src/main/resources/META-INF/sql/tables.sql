create table GK_Classify (
	ClassifyId LONG not null primary key,
	classifyName VARCHAR(75) null
);

create table GK_GKDetail (
	GKDetailId LONG not null primary key,
	GKnumber VARCHAR(75) null,
	norm VARCHAR(2000) null,
	GKName VARCHAR(2000) null,
	preOrder VARCHAR(75) null,
	GKComponent VARCHAR(75) null,
	freight VARCHAR(75) null,
	price INTEGER,
	team VARCHAR(75) null,
	remark VARCHAR(75) null,
	imageName VARCHAR(75) null,
	total INTEGER,
	classifyId VARCHAR(75) null
);

create table GK_GKImage (
	GKImageId LONG not null primary key,
	GKDetailId LONG,
	imageName VARCHAR(75) null,
	imageData TEXT null,
	mimeType VARCHAR(75) null
);

create table GK_Norm (
	NormId LONG not null primary key,
	normName VARCHAR(75) null
);