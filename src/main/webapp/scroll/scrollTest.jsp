<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/scroll/js/jquery-1.9.1.min.js"></script>
<style type="text/css">
        .one,.two{height:200px;background-color:red;}
        .two{background-color:yellow;}
        .main{height:200px;overflow:auto;}
    </style>
</head>
<body>
  <div  id="latestNews" style="overflow: hidden; height: 156px; width: 330px;">
      <div id="newsOne">
          <li><a href="NewsDetails.aspx?id=592" target="_blank">常用的服装陈列之9种方法</a></li>
          <li><a href="NewsDetails.aspx?id=591" target="_blank">内衣加盟选址六技巧</a></li>
          <li><a href="NewsDetails.aspx?id=589" target="_blank">成功分享：亮湾湾饰品店的八大陈列心得</a></li>
          <li><a href="NewsDetails.aspx?id=588" target="_blank">内衣店接手店铺时应该注意的问题</a></li>
          <li><a href="NewsDetails.aspx?id=587" target="_blank">三种开女士内衣店的人气店址推荐</a></li>
          <li><a href="NewsDetails.aspx?id=586" target="_blank">内衣店接手店铺时应该注意的问题</a></li>
          <li><a href="NewsDetails.aspx?id=585" target="_blank">门店销售点睛：内衣店的试衣间</a></li>
      </div>
      
      <div id="newsTwo" style="overflow: hidden; height: 156px;" >
      </div>
  </div>
   <script type='text/javascript'>
       // 第一种滚动：
/*  */
　　  				var newsOne = document.getElementById("newsOne");
                    var newsTwo = document.getElementById("newsTwo");
                    var latestNews = document.getElementById("latestNews");

                    newsTwo.innerHTML = newsOne.innerHTML;
                    //offsetHeight:返回元素(可见部分)的高度，以像素为单位。这是非标准的但却得到很好支持的属性。
                    //scrollHeight 当一个元素拥有滚动条时（比如由于 CSS 的 overflow 属性）。
                    function newsScroll() {
                        if ((latestNews.scrollHeight - latestNews.offsetHeight) <= latestNews.scrollTop)
                            latestNews.scrollTop = 0;
                        else
                            latestNews.scrollTop = latestNews.scrollTop + 1;
                    }
                    setInterval(newsScroll, 80); 

                    /*  */
                    
/* 
//第二种滚动：（需要设置latestNews的style：position:absolute;）
 var newsOne = document.getElementById("newsOne");
                    var newsTwo = document.getElementById("newsTwo");
                    var latestNews = document.getElementById("latestNews");

                    newsTwo.innerHTML = newsOne.innerHTML;
                    function newsScroll() {
                        if (newsTwo.offsetTop - latestNews.scrollTop <= 0)
                            latestNews.scrollTop -= newsOne.offsetHeight;
                        else
                            latestNews.scrollTop = latestNews.scrollTop + 3;
                    }
                    setInterval(newsScroll, 300);


                    */
   </script>
</body>
</html>
