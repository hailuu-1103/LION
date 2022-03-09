USE [master]
GO
/****** Object:  Database [Doggo]    Script Date: 11/9/2021 11:50:00 PM ******/
CREATE DATABASE [Doggo]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Doggo', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Doggo.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Doggo_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Doggo_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Doggo] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Doggo].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Doggo] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Doggo] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Doggo] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Doggo] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Doggo] SET ARITHABORT OFF 
GO
ALTER DATABASE [Doggo] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Doggo] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Doggo] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Doggo] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Doggo] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Doggo] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Doggo] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Doggo] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Doggo] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Doggo] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Doggo] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Doggo] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Doggo] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Doggo] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Doggo] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Doggo] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Doggo] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Doggo] SET RECOVERY FULL 
GO
ALTER DATABASE [Doggo] SET  MULTI_USER 
GO
ALTER DATABASE [Doggo] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Doggo] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Doggo] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Doggo] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Doggo] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Doggo] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'Doggo', N'ON'
GO
ALTER DATABASE [Doggo] SET QUERY_STORE = OFF
GO
USE [Doggo]
GO
/****** Object:  Table [dbo].[account]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[account](
	[username] [varchar](50) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[role] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[cart]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cart](
	[img] [varchar](100) NULL,
	[username] [varchar](50) NOT NULL,
	[dogID] [char](10) NOT NULL,
	[sex] [char](5) NOT NULL,
	[quantity] [int] NULL,
	[price] [float] NULL,
	[payment] [float] NULL,
	[colour] [char](10) NULL,
 CONSTRAINT [PK_cart] PRIMARY KEY CLUSTERED 
(
	[username] ASC,
	[dogID] ASC,
	[sex] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[customer]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[customer](
	[username] [varchar](50) NOT NULL,
	[email] [varchar](50) NULL,
	[address] [varchar](100) NULL,
	[phone] [varchar](15) NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[dog]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dog](
	[dogID] [char](10) NOT NULL,
	[dogName] [varchar](50) NULL,
	[sex] [varchar](5) NULL,
	[price] [float] NULL,
	[descript] [text] NULL,
	[supplier] [varchar](10) NULL,
	[img] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[dogID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[orderDetails]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orderDetails](
	[orderID] [int] NOT NULL,
	[dogID] [char](10) NOT NULL,
	[sex] [char](5) NOT NULL,
	[price] [float] NULL,
	[quantity] [int] NULL,
	[total] [float] NULL,
 CONSTRAINT [PK_orderDetails] PRIMARY KEY CLUSTERED 
(
	[orderID] ASC,
	[dogID] ASC,
	[sex] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[orders]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orders](
	[orderID] [int] IDENTITY(1,1) NOT NULL,
	[orderDate] [date] NULL,
	[shipDate] [date] NULL,
	[username] [varchar](50) NULL,
	[payment] [float] NULL,
	[shipping] [float] NULL,
	[total] [float] NULL,
	[status] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[orderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[storage]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[storage](
	[dogID] [char](10) NOT NULL,
	[sex] [char](5) NOT NULL,
	[num_left] [int] NULL,
	[inDate] [date] NULL,
 CONSTRAINT [PK_storage] PRIMARY KEY CLUSTERED 
(
	[dogID] ASC,
	[sex] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[account]  WITH CHECK ADD  CONSTRAINT [FK_username] FOREIGN KEY([username])
REFERENCES [dbo].[customer] ([username])
GO
ALTER TABLE [dbo].[account] CHECK CONSTRAINT [FK_username]
GO
ALTER TABLE [dbo].[cart]  WITH CHECK ADD  CONSTRAINT [FK_user] FOREIGN KEY([username])
REFERENCES [dbo].[customer] ([username])
GO
ALTER TABLE [dbo].[cart] CHECK CONSTRAINT [FK_user]
GO
ALTER TABLE [dbo].[orderDetails]  WITH CHECK ADD FOREIGN KEY([dogID])
REFERENCES [dbo].[dog] ([dogID])
GO
ALTER TABLE [dbo].[orderDetails]  WITH CHECK ADD FOREIGN KEY([orderID])
REFERENCES [dbo].[orders] ([orderID])
GO
ALTER TABLE [dbo].[orders]  WITH CHECK ADD FOREIGN KEY([username])
REFERENCES [dbo].[customer] ([username])
GO
ALTER TABLE [dbo].[storage]  WITH CHECK ADD  CONSTRAINT [FK_storage_dog] FOREIGN KEY([dogID])
REFERENCES [dbo].[dog] ([dogID])
GO
ALTER TABLE [dbo].[storage] CHECK CONSTRAINT [FK_storage_dog]
GO
/****** Object:  StoredProcedure [dbo].[PyPlotMatplotlib]    Script Date: 11/9/2021 11:50:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[PyPlotMatplotlib]
AS
BEGIN
    SET NOCOUNT ON;
    DECLARE @query nvarchar(max) =
    N'SELECT cast(tipped as int) as tipped, tip_amount, fare_amount FROM [dbo].[nyctaxi_sample]'
    EXECUTE sp_execute_external_script
    @language = N'Python',
    @script = N'
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import pandas as pd
import pickle

fig_handle = plt.figure()
plt.hist(InputDataSet.orderID)
plt.xlabel("Tipped")
plt.ylabel("Counts")
plt.title("Histogram, Tipped")
plot0 = pd.DataFrame(data =[pickle.dumps(fig_handle)], columns =["plot"])
plt.clf()

plt.hist(InputDataSet.orderDate)
plt.xlabel("Tip amount ($)")
plt.ylabel("Counts")
plt.title("Histogram, Tip amount")
plot1 = pd.DataFrame(data =[pickle.dumps(fig_handle)], columns =["plot"])
plt.clf()

plt.hist(InputDataSet.orderID)
plt.xlabel("Fare amount ($)")
plt.ylabel("Counts")
plt.title("Histogram, Fare amount")
plot2 = pd.DataFrame(data =[pickle.dumps(fig_handle)], columns =["plot"])
plt.clf()

plt.scatter( InputDataSet.orderID, InputDataSet.orderDate)
plt.xlabel("Fare Amount ($)")
plt.ylabel("Tip Amount ($)")
plt.title("Tip amount by Fare amount")
plot3 = pd.DataFrame(data =[pickle.dumps(fig_handle)], columns =["plot"])
plt.clf()

OutputDataSet = plot0.append(plot1, ignore_index=True).append(plot2, ignore_index=True).append(plot3, ignore_index=True)
',
@input_data_1 = @query
WITH RESULT SETS ((plot varbinary(max)))
END
GO
USE [master]
GO
ALTER DATABASE [Doggo] SET  READ_WRITE 
GO
